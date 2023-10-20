/*
 * ******************************************************************************
 * Copyright (c) 2023 BMW AG
 * Copyright (c) 2023 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * *******************************************************************************
 */

SET search_path TO public;

CREATE TABLE IF NOT EXISTS status_object
(
    id uuid DEFAULT uuid_generate_v4() primary key,
    count int
);

CREATE TABLE IF NOT EXISTS statuses
(
    id uuid DEFAULT uuid_generate_v4() primary key,
    general_count int,
    over_all_general_count int,
    over_all_status_degradation_count int,
    over_all_status_improvement_count int,
    over_all_todos_count int,
    status_degradation_count int,
    status_improvement_count int,
    todos_count int
);