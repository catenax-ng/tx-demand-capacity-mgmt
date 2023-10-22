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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "statuses")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id", unique = true)
    private UUID userID;

    @Column(name = "todos_count")
    private int todosCount;

    @Column(name = "status_improvement_count")
    private int statusImprovementCount;

    @Column(name = "status_degradation_count")
    private int statusDegradationCount;

    @Column(name = "general_count")
    private int generalCount;

    @Column(name = "over_all_todos_count")
    private int overAllTodosCount;

    @Column(name = "over_all_status_improvement_count")
    private int overAllStatusImprovementCount;

    @Column(name = "over_all_status_degradation_count")
    private int overAllStatusDegradationCount;

    @Column(name = "over_all_general_count")
    private int overAllGeneralCount;
}
