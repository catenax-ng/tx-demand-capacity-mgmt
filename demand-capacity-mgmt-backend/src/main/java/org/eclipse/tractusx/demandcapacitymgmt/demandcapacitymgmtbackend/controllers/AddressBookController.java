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

package org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.controllers;

import eclipse.tractusx.demand_capacity_mgmt_specification.api.AddressBookApi;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.AddressBookRequest;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.AddressBookResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.entities.enums.Role;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.services.AddressBookService;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.utils.UserUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@AllArgsConstructor
public class AddressBookController implements AddressBookApi {

    private final AddressBookService service;
    private HttpServletRequest request;

    @Override
    public ResponseEntity<Void> deleteAddressBook(AddressBookRequest addressBookRequest) throws Exception {
        if(UserUtil.getUserRole(request).equals(Role.ADMIN)){
            service.deleteRecord(addressBookRequest);
            return ResponseEntity.status(201).build();
        }
        return ResponseEntity.status(401).build();

    }

    @Override
    public ResponseEntity<AddressBookResponse> getAddressBook(AddressBookRequest addressBookRequest) throws Exception {
        return ResponseEntity.status(200).body(service.getRecord(addressBookRequest));
    }

    @Override
    public ResponseEntity<List<AddressBookResponse>> getAllAddressBooks() throws Exception {
        return ResponseEntity.status(200).body(service.getRecords());
    }

    @Override
    public ResponseEntity<AddressBookResponse> postAddressBook(AddressBookRequest addressBookRequest) throws Exception {
        return ResponseEntity.status(200).body(service.postRecord(addressBookRequest));
    }
}
