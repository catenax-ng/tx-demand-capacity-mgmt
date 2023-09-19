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

package org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.*;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.entities.converters.ListToStringConverter;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.entities.enums.CapacityGroupStatus;

@Entity
@Table(name = "capacity_group")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CapacityGroupEntity {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", updatable = false, name = "id")
    private UUID id;

    @Column(columnDefinition = "uuid", updatable = false, name = "capacity_group_id")
    private UUID capacityGroupId;

    @Column(name = "material_description_customer")
    private String materialDescriptionCustomer;

    @Column(name = "material_number_customer")
    private String materialNumberCustomer;

    @Column(name = "material_number_supplier")
    private String materialNumberSupplier;

    @Column(name = "changed_at", nullable = false)
    private LocalDateTime changedAt;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "ID")
    private CompanyEntity customerId;

    @OneToOne
    @JoinColumn(name = "supplier_id", referencedColumnName = "ID")
    private CompanyEntity supplierId;

    @OneToOne
    @JoinColumn(name = "unity_of_measure_id", referencedColumnName = "ID")
    private UnitMeasureEntity unitMeasure;

    @OneToMany(mappedBy = "capacityGroupEntity", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<CapacityTimeSeries> capacityTimeSeries;

    @OneToMany(mappedBy = "capacityGroupEntity", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<LinkedDemandSeries> linkedDemandSeries;

    @Column(name = "supplier_locations")
    @Convert(converter = ListToStringConverter.class)
    private List<String> supplierLocation;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private CapacityGroupStatus status;
}
