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

package org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.services;

import eclipse.tractusx.demand_capacity_mgmt_specification.model.WeekBasedMaterialDemandRequestDto;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.WeekBasedMaterialDemandResponseDto;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.entities.MaterialDemandEntity;

import java.util.List;

public interface WeekBasedMaterialService {
    void createWeekBasedMaterial(List<WeekBasedMaterialDemandRequestDto> weekBasedMaterialDemandRequestDto,String userID);
    void sendWeekBasedMaterial();
    void receiveWeekBasedMaterial();

    List<WeekBasedMaterialDemandResponseDto> getWeekBasedMaterialDemands();
    List<WeekBasedMaterialDemandResponseDto> getOldWeekBasedMaterialDemands();
    List<WeekBasedMaterialDemandResponseDto> getUpdatedWeekBasedMaterialDemands();
    WeekBasedMaterialDemandResponseDto updateWeekBasedMaterial(
        String id,
        WeekBasedMaterialDemandRequestDto weekBasedMaterialDemandRequestDto,
        String userID
    );

    void createWeekBasedMaterialRequestFromEntity(MaterialDemandEntity materialDemandEntity,String userID);
}
