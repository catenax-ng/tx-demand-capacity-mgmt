/*
 *  *******************************************************************************
 *  Copyright (c) 2023 BMW AG
 *  Copyright (c) 2023 Contributors to the Eclipse Foundation
 *
 *    See the NOTICE file(s) distributed with this work for additional
 *    information regarding copyright ownership.
 *
 *    This program and the accompanying materials are made available under the
 *    terms of the Apache License, Version 2.0 which is available at
 *    https://www.apache.org/licenses/LICENSE-2.0.
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *    License for the specific language governing permissions and limitations
 *    under the License.
 *
 *    SPDX-License-Identifier: Apache-2.0
 *    ********************************************************************************
 */

package org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.services.impl;

import eclipse.tractusx.demand_capacity_mgmt_specification.model.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.entities.MaterialDemandEntity;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.entities.WeekBasedMaterialDemandEntity;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.exceptions.BadRequestException;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.repositories.StatusesRepository;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.repositories.WeekBasedCapacityGroupRepository;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.repositories.WeekBasedMaterialDemandRepository;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.services.LinkDemandService;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.services.StatusesService;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.services.WeekBasedMaterialService;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.utils.DataConverterUtil;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.utils.UUIDUtil;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class WeekBasedMaterialServiceImpl implements WeekBasedMaterialService {

    private final WeekBasedMaterialDemandRepository weekBasedMaterialDemandRepository;

    private final LinkDemandService linkDemandService;

    private final StatusesRepository statusesRepository;
    private List<WeekBasedMaterialDemandResponseDto> oldWeekBasedMaterialDemands;
    private List<WeekBasedMaterialDemandResponseDto> newWeekBasedMaterialDemands;

    private final WeekBasedCapacityGroupRepository weekBasedCapacityGroupRepository;

    @Override
    public void createWeekBasedMaterial(List<WeekBasedMaterialDemandRequestDto> weekBasedMaterialDemandRequestDtoList) {
        oldWeekBasedMaterialDemands =
            DataConverterUtil.convertToWeekBasedMaterialDemandDtoList(weekBasedMaterialDemandRepository.findAll());
        weekBasedMaterialDemandRequestDtoList.forEach(
            weekBasedMaterialDemandRequestDto -> {
                validateFields(weekBasedMaterialDemandRequestDto);

                WeekBasedMaterialDemandEntity weekBasedMaterialDemand = convertEntity(
                    weekBasedMaterialDemandRequestDto.getWeekBasedMaterialDemandRequest()
                );
                weekBasedMaterialDemandRepository.save(weekBasedMaterialDemand);
            }
        );

        newWeekBasedMaterialDemands =
            DataConverterUtil.convertToWeekBasedMaterialDemandDtoList(weekBasedMaterialDemandRepository.findAll());
        updateStatus();
    }

    @Override
    public void sendWeekBasedMaterial() {}

    @Override
    public void receiveWeekBasedMaterial() {
        List<WeekBasedMaterialDemandEntity> weekBasedMaterialDemandEntities = weekBasedMaterialDemandRepository.getAllByViewed(
            false
        );
        //  updateStatus(); TODO: remove the comment when the EDC is ready
        linkDemandService.createLinkDemands(weekBasedMaterialDemandEntities);
    }

    @Override
    public List<WeekBasedMaterialDemandResponseDto> getWeekBasedMaterialDemands() {
        return DataConverterUtil.convertToWeekBasedMaterialDemandDtoList(weekBasedMaterialDemandRepository.findAll());
    }

    public void updateStatus() {
        List<WeekBasedCapacityGroupDtoResponse> oldWeekBasedCapacityGroups = DataConverterUtil.convertToWeekBasedCapacityGroupDtoList(
            weekBasedCapacityGroupRepository.findAll()
        );

        if (newWeekBasedMaterialDemands == null) {
            newWeekBasedMaterialDemands = List.of();
        }
        final StatusesService statusesService = new StatusesServiceImpl(
            statusesRepository,
            oldWeekBasedMaterialDemands,
            newWeekBasedMaterialDemands,
            oldWeekBasedCapacityGroups,
            oldWeekBasedCapacityGroups
        );
        statusesService.updateStatus();
    }

    @Override
    public WeekBasedMaterialDemandResponseDto updateWeekBasedMaterial(
        String id,
        WeekBasedMaterialDemandRequestDto weekBasedCapacityGroupRequest
    ) {
        oldWeekBasedMaterialDemands =
            DataConverterUtil.convertToWeekBasedMaterialDemandDtoList(weekBasedMaterialDemandRepository.findAll());
        WeekBasedMaterialDemandEntity weekBasedCapacityGroupEntity = convertWeekMaterialDemandToEntity(
            weekBasedCapacityGroupRequest
        );
        weekBasedCapacityGroupEntity.setId(UUID.fromString(id));
        weekBasedCapacityGroupEntity = weekBasedMaterialDemandRepository.save(weekBasedCapacityGroupEntity);
        newWeekBasedMaterialDemands =
            DataConverterUtil.convertToWeekBasedMaterialDemandDtoList(weekBasedMaterialDemandRepository.findAll());
        updateStatus();
        return convertToWeekBasedCapacityGroupDto(weekBasedCapacityGroupEntity);
    }

    private WeekBasedMaterialDemandEntity convertWeekMaterialDemandToEntity(
        WeekBasedMaterialDemandRequestDto weekBasedMaterialDemandRequestDto
    ) {
        WeekBasedMaterialDemandEntity weekBasedMaterialDemand = new WeekBasedMaterialDemandEntity();
        weekBasedMaterialDemand.setWeekBasedMaterialDemand(
            weekBasedMaterialDemandRequestDto.getWeekBasedMaterialDemandRequest()
        );
        weekBasedMaterialDemand.setViewed(weekBasedMaterialDemandRequestDto.getViewed());

        return weekBasedMaterialDemand;
    }

    @Override
    public List<WeekBasedMaterialDemandResponseDto> getOldWeekBasedMaterialDemands() {
        return oldWeekBasedMaterialDemands;
    }

    @Override
    public List<WeekBasedMaterialDemandResponseDto> getUpdatedWeekBasedMaterialDemands() {
        return newWeekBasedMaterialDemands;
    }

    private WeekBasedMaterialDemandResponseDto convertToWeekBasedCapacityGroupDto(
        WeekBasedMaterialDemandEntity weekBasedMaterialDemandEntity
    ) {
        WeekBasedMaterialDemandResponseDto responseDto = new WeekBasedMaterialDemandResponseDto();
        responseDto.setId(weekBasedMaterialDemandEntity.getId().toString());
        responseDto.setViewed(weekBasedMaterialDemandEntity.getViewed());
        responseDto.setWeekBasedMaterialDemandRequest(weekBasedMaterialDemandEntity.getWeekBasedMaterialDemand());

        return responseDto;
    }

    @Override
    public void createWeekBasedMaterialRequestFromEntity(MaterialDemandEntity materialDemandEntity) {
        List<DemandWeekSeriesDto> demandWeekSeriesDtoList = new LinkedList<>();

        materialDemandEntity
            .getDemandSeries()
            .forEach(
                demandSeries -> {
                    DemandWeekSeriesDto demandWeekSeriesDto = new DemandWeekSeriesDto();

                    demandWeekSeriesDto.setCustomerLocation(demandSeries.getCustomerLocation().getBpn());
                    demandWeekSeriesDto.setExpectedSupplierLocation(
                        demandSeries.getExpectedSupplierLocation().toString()
                    );

                    DemandSeriesCategoryDto demandSeriesCategoryDto = new DemandSeriesCategoryDto();
                    demandSeriesCategoryDto.setId(demandSeries.getDemandCategory().getId().toString());

                    demandWeekSeriesDto.setDemandCategory(demandSeriesCategoryDto);

                    List<DemandSeriesDto> demandSeriesDtos = demandSeries
                        .getDemandSeriesValues()
                        .stream()
                        .map(
                            demandSeriesValues -> {
                                DemandSeriesDto demandSeriesDto = new DemandSeriesDto();

                                demandSeriesDto.setCalendarWeek(demandSeriesValues.getCalendarWeek().toString());
                                demandSeriesValues.setDemand(demandSeriesValues.getDemand());

                                return demandSeriesDto;
                            }
                        )
                        .toList();

                    demandWeekSeriesDto.setDemands(demandSeriesDtos);

                    demandWeekSeriesDtoList.add(demandWeekSeriesDto);
                }
            );
        updateStatus();
    }

    private void validateFields(WeekBasedMaterialDemandRequestDto weekBasedMaterialDemandRequestDto) {
        //        if(weekBasedMaterialDemandRequestDto.getWeekBasedMaterialDemandRequest() != null){
        if (
            !UUIDUtil.checkValidUUID(
                weekBasedMaterialDemandRequestDto.getWeekBasedMaterialDemandRequest().getMaterialDemandId()
            )
        ) {
            throw new BadRequestException("not a valid ID");
        }

        weekBasedMaterialDemandRequestDto
            .getWeekBasedMaterialDemandRequest()
            .getDemandSeries()
            .forEach(
                demandWeekSeriesDto ->
                    demandWeekSeriesDto
                        .getDemands()
                        .forEach(
                            demandSeriesDto -> {
                                if (!DataConverterUtil.itsMonday(demandSeriesDto.getCalendarWeek())) {
                                    throw new BadRequestException("not a valid date");
                                }
                            }
                        )
            );
    }

    private WeekBasedMaterialDemandEntity convertEntity(WeekBasedMaterialDemandRequest weekBasedMaterialDemandRequest) {
        return WeekBasedMaterialDemandEntity
            .builder()
            .id(UUID.randomUUID())
            .weekBasedMaterialDemand(weekBasedMaterialDemandRequest)
            .viewed(false)
            .build();
    }
}
