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

import React, { useCallback, useContext, useMemo, useState } from 'react';
import { Button, Col, Form, OverlayTrigger, Row, Tooltip } from 'react-bootstrap';
import {
    FaCopy
} from 'react-icons/fa';
import { LuStarOff } from "react-icons/lu";
import { FavoritesContext } from "../../contexts/FavoritesContextProvider";
import {AddressBookFavoriteResponse, CompanyDtoFavoriteResponse} from '../../interfaces/favorite_interfaces';
import Pagination from '../common/Pagination';
interface FavoriteTableCompaniesProps {
    favaddressbook: AddressBookFavoriteResponse[];
}

const FavoriteTableCompanies: React.FC<FavoriteTableCompaniesProps> = ({ favaddressbook }) => {
    const [sortField, setSortField] = useState<string>('changedAt');
    const [sortOrder, setSortOrder] = useState<'asc' | 'desc'>('asc');
    const [currentPage, setCurrentPage] = useState<number>(1);
    const [eventsPerPage, setEventsPerPage] = useState<number>(5);

    const { deleteFavorite, fetchFavorites } = useContext(FavoritesContext)!;

    const handleSort = useCallback((field: string) => {
        setSortField(field);
        setSortOrder(prevOrder => (prevOrder === 'asc' ? 'desc' : 'asc') as 'asc' | 'desc');
    }, []);


    const sortedData = useMemo(() => {
        const sortedArray = [...favaddressbook].sort((a, b) => {
            let comparison = 0;
            // if (sortField === 'changedAt' && a.changedAt && b.changedAt) {
            //     const dateA = new Date(a.changedAt).getTime();
            //     const dateB = new Date(b.changedAt).getTime();
            //     comparison = dateB - dateA; // Most recent first
            // }
            if (sortField !== 'changedAt' && a[sortField as keyof AddressBookFavoriteResponse] && b[sortField as keyof AddressBookFavoriteResponse]) {
                const fieldA = a[sortField as keyof AddressBookFavoriteResponse];
                const fieldB = b[sortField as keyof AddressBookFavoriteResponse];
                comparison = fieldA.localeCompare(fieldB);
            }
            return sortOrder === 'asc' ? comparison : -comparison;
        });
        return sortedArray;
    }, [favaddressbook, sortField, sortOrder]);

    const indexOfLastEvent = currentPage * eventsPerPage;
    const indexOfFirstEvent = indexOfLastEvent - eventsPerPage;
    const currentEvents = sortedData.slice(indexOfFirstEvent, indexOfLastEvent);
    const totalPagesNum = Math.ceil(sortedData.length / eventsPerPage);

    const handleUnfavorite = useCallback(
        async (id: string) => {
            try {
                await deleteFavorite(id)
                fetchFavorites();
            } catch (error) {
                console.error('Error Unfavoriting:', error);
            }
        },
        [favaddressbook]
    );

    return (
        <>
            <div className='table-responsive table-overflow-control mt-2'>
                <table className="table table-striped table-hover">
                    <thead>
                    <tr>
                        <th></th>
                        <th></th>
                        <th> Address Book Name</th>
                        <th> Address Book Contact</th>
                        <th> Address Book Email</th>
                        <th> Address Book function</th>
                    </tr>
                    </thead>
                    <tbody>
                    {favaddressbook.map((addressBook, index) => (
                        <tr key={index}>
                            <td>
                                    <span className='inlinefav'>
                                        <LuStarOff
                                            opacity={0.7}
                                            color='red'
                                            onClick={() => handleUnfavorite(addressBook.companyId)}
                                            size={25}
                                        />
                                    </span>

                            </td>
                            <td>
                                <OverlayTrigger
                                    placement="top"
                                    overlay={<Tooltip id={`tooltip-copy-${addressBook.companyId}`}>{addressBook.companyId}</Tooltip>}>
                                    <Button
                                        variant="outline-info"
                                        onClick={() => {
                                            // Function to copy the internalId to the clipboard
                                            navigator.clipboard.writeText(addressBook.companyId.toString());
                                        }}
                                    ><FaCopy />
                                    </Button></OverlayTrigger>
                            </td>
                            <td>{addressBook.name}</td>
                            <td>{addressBook.contact}</td>
                            <td>{addressBook.email}</td>
                            <td>{addressBook.function}</td>
                        </tr>
                    ))}
                    </tbody>
                </table>
            </div>
            <div className="mt-2">
                <div className="row">
                    <Pagination
                        pages={totalPagesNum}
                        setCurrentPage={setCurrentPage}
                        currentItems={currentEvents}
                        items={sortedData}
                    />
                    <div className="col-sm">
                        <div className="float-end">
                            <Form>
                                <Form.Group as={Row} className="mb-3">
                                    <Form.Label column sm="6">
                                        Per Page:
                                    </Form.Label>
                                    <Col sm="6">
                                        <Form.Control
                                            type="number"
                                            aria-describedby="capacitygroupsPerPageInput"
                                            min={1}
                                            htmlSize={10}
                                            max={100}
                                            value={eventsPerPage}
                                            onChange={(e) => setEventsPerPage(Number(e.target.value))}
                                        />
                                    </Col>
                                </Form.Group>
                            </Form>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
};

export default FavoriteTableCompanies;



