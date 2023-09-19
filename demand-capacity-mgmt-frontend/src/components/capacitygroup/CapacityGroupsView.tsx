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

import React, { useContext, useState, useMemo } from 'react';
import { Form, Col, Row, Button, OverlayTrigger, Tooltip,Dropdown  } from 'react-bootstrap';
import { CapacityGroupContext } from '../../contexts/CapacityGroupsContextProvider';
import Pagination from '../common/Pagination';
import CapacityGroupsTable from './CapacityGroupsTable';
import Search from '../common/Search';
import '../../index.css';
import { FaCopy, FaEllipsisV, FaSearch } from 'react-icons/fa';

const CapacityGroupsList: React.FC = () => {
  // to do clean /const [selectedCapacityGroup, setSelectedCapacityGroup] = useState<CapacityGroup | null>(null);

  const { capacitygroups } = useContext(CapacityGroupContext)!;
  const [searchQuery, setSearchQuery] = useState('');
  const [currentPage, setCurrentPage] = useState(1);
  const [sortColumn, setSortColumn] = useState('');
  const [sortOrder, setSortOrder] = useState('');
  const [capacitygroupsPerPage, setcapacitygroupsPerPage] = useState(20); // Set the default value here

  const handleSort = (column: string) => {
    console.log('Sorting column:', column);
    if (sortColumn === column) {
      // If the same column is clicked again, toggle the sort order
      setSortOrder(sortOrder === 'asc' ? 'desc' : 'asc');
    } else {
      // If a different column is clicked, set it as the new sort column and default to ascending order
      setSortColumn(column);
      setSortOrder('asc');
    }
  };

  const filteredcapacitygroups = useMemo(() => {
    let sortedcapacitygroups = [...capacitygroups];

    if (searchQuery !== '') {
      sortedcapacitygroups = sortedcapacitygroups.filter((capacitygroup) =>
        capacitygroup.internalId.toString().includes(searchQuery.toLowerCase()) ||
        capacitygroup.name.toLowerCase().includes(searchQuery.toLowerCase()) ||
        capacitygroup.customerBPNL.toString().includes(searchQuery.toLowerCase()) ||
        capacitygroup.customerName.toString().includes(searchQuery.toLowerCase()) ||
        capacitygroup.supplierBNPL.toString().includes(searchQuery.toLowerCase()) ||
        capacitygroup.numberOfMaterials.toString().includes(searchQuery.toLowerCase()) ||
        capacitygroup.favoritedBy.toString().includes(searchQuery.toLowerCase()) ||
        capacitygroup.status.toString().includes(searchQuery.toLowerCase())
      );
    }

    if (sortColumn !== '') {
      sortedcapacitygroups.sort((a, b) => {
        const aValue = String(a[sortColumn]); // Convert to string
        const bValue = String(b[sortColumn]); // Convert to string

        return aValue.localeCompare(bValue, undefined, { sensitivity: 'base' });
      });

      if (sortOrder === 'desc') {
        // Reverse the array if the sort order is descending
        sortedcapacitygroups.reverse();
      }
    }

    return sortedcapacitygroups;
  }, [capacitygroups, searchQuery, sortColumn, sortOrder]);

  const slicedcapacitygroups = useMemo(() => {
    const indexOfLastCapacityGroup = currentPage * capacitygroupsPerPage;
    const indexOfFirstCapacityGroup = indexOfLastCapacityGroup - capacitygroupsPerPage;
    return filteredcapacitygroups.slice(indexOfFirstCapacityGroup, indexOfLastCapacityGroup);
  }, [filteredcapacitygroups, currentPage, capacitygroupsPerPage]);

  const totalPagesNum = useMemo(() => Math.ceil(filteredcapacitygroups.length / capacitygroupsPerPage), [
    filteredcapacitygroups,
    capacitygroupsPerPage,
  ]);

  const capacitygroupsItems = useMemo(
    () =>
      slicedcapacitygroups.map((capacitygroup) => (
        <tr key={capacitygroup.internalId}>
          <td>
            <Button href={`/details/${capacitygroup.internalId}`} target='new-tab' variant="outline-primary" >
              <div style={{ display: "flex", justifyContent: "center" }}>
                <FaSearch size={20} />
              </div>
            </Button>
          </td>
          <td>
            <OverlayTrigger
              placement="top"
              overlay={<Tooltip id={`tooltip-copy-${capacitygroup.internalId}`}>{capacitygroup.internalId}</Tooltip>}
            >
              <Button
                variant="outline-secondary"
                onClick={() => {
                  // Function to copy the internalId to the clipboard
                  navigator.clipboard.writeText(capacitygroup.internalId);
                }}
              >
                <FaCopy/>
              </Button>
            </OverlayTrigger>
          </td>
          <td>{capacitygroup.name}</td>
          <td>{capacitygroup.customerBPNL}</td>
          <td>{capacitygroup.customerName}</td>
          <td>{capacitygroup.supplierBNPL}</td>
          <td>{capacitygroup.numberOfMaterials}</td>
          <td>{capacitygroup.favoritedBy}</td>
          <td>
            {/* TODO Depending on status, this should be a different span*/}
            <span className="badge rounded-pill text-bg-success" id="tag-ok">OK</span>
            <span className="badge rounded-pill text-bg-warning" id="tag-warning">Warning</span>
            <span className="badge rounded-pill text-bg-danger" id="tag-danger">Danger</span>
          </td>
          <td>
            <Dropdown>
              <Dropdown.Toggle variant="light" id={`dropdown-menu-${capacitygroup.internalId}`}>
                <span ><FaEllipsisV/></span>
              </Dropdown.Toggle>
              <Dropdown.Menu>
                <Dropdown.Item href={`/details/${capacitygroup.internalId}`} target='new-tab'>Details</Dropdown.Item>
                <Dropdown.Item className="red-delete-item" >Delete (WIP)</Dropdown.Item>
              </Dropdown.Menu>
            </Dropdown>
          </td>
        </tr>
      )),
    [slicedcapacitygroups]
  );

  return (
    <>
      <div className="table-title">
        <div className="row">
          <div className="col-sm-6">
            <h2>Welcome USERID !</h2>
          </div>
          <div className="col-sm-6">
            <Search
              searchQuery={searchQuery}
              setSearchQuery={setSearchQuery}
            />
          </div>
        </div>
      </div>

      <CapacityGroupsTable
        sortColumn={sortColumn}
        sortOrder={sortOrder}
        handleSort={handleSort}
        capacitygroupsItems={capacitygroupsItems}
      />
      <div className="container">
        <div className="row">
          <Pagination
            pages={totalPagesNum}
            setCurrentPage={setCurrentPage}
            currentItems={slicedcapacitygroups}
            items={filteredcapacitygroups}
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
                      value={capacitygroupsPerPage}
                      onChange={(e) => setcapacitygroupsPerPage(Number(e.target.value))}
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

export default CapacityGroupsList;
