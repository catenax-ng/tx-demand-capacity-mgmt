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

import React, {useState, useContext, useEffect} from 'react';
import { Tab, Tabs, ButtonGroup, Button, ToggleButton } from 'react-bootstrap';
import CapacityGroupChronogram from "./CapacityGroupChronogram";
import CapacityGroupSumView from "./CapacityGroupSumView";
import {useParams} from "react-router-dom";
import {CapacityGroupContext} from "../../contexts/CapacityGroupsContextProvider";
import {SingleCapacityGroup} from "../../interfaces/capacitygroup_interfaces";

function CapacityGroupDetailsPage() {
  const { id } = useParams();
  const context = useContext(CapacityGroupContext);

  if (!context) {
    throw new Error('CapacityGroupDetailsPage must be used within a CapacityGroupsProvider');
  }

  const { getCapacityGroupById } = context;

  const [editMode, setEditMode] = useState(false);
  const [savedChanges, setSavedChanges] = useState(false);
  const [activeTab, setActiveTab] = useState('overview');
  const [capacityGroup, setCapacityGroup] = useState<SingleCapacityGroup | null | undefined>(null);

  useEffect(() => {
    (async () => {
      try {
        const fetchedCapacityGroup = await getCapacityGroupById(id!);
        setCapacityGroup(fetchedCapacityGroup || null);
      } catch (error) {
        console.error('Failed to fetch capacity group:', error);
      }
    })();
  }, [id, getCapacityGroupById]);

  const handleSave = async () => {
    // Perform save operation here
    setEditMode(false);
    setSavedChanges(true);
    console.log(savedChanges);
  };

  const handleRevert = () => {
    // Revert changes here
    setEditMode(false);
    setSavedChanges(false);
  };


  return (
    <>
      <div className="container-xl">
        <br />
        <div className="row">
          <div className="col"></div>
          <div className="col-6 border d-flex align-items-center justify-content-center">
            {capacityGroup?.capacityGroupId} - {capacityGroup?.name}
          </div>
            <div className="col d-flex justify-content-end">
              <br />
              {activeTab === 'overview' && (
              <ButtonGroup className="mb-2 align-middle">
                <ToggleButton
                  id="toggle-edit"
                  type="checkbox"
                  variant="secondary"
                  name="edit"
                  value="0"
                  checked={editMode}
                  onChange={() => setEditMode(!editMode)}
                >
                  Edit
                </ToggleButton>
                <Button variant="secondary" name="save" onClick={handleSave}>
                  Save
                </Button>
                <Button variant="secondary" name="revert" onClick={handleRevert}>
                  Revert Changes
                </Button>
              </ButtonGroup>
                        )}
            </div>
        </div>
        <Tabs
          defaultActiveKey="overview"
          id="uncontrolled-tab-example"
          className="mb-3"
          activeKey={activeTab}
          onSelect={(tabKey) => {
            if (typeof tabKey === 'string') {
              setActiveTab(tabKey);
            }
          }}
        >
          <Tab eventKey="overview" title="Overview">
            <CapacityGroupSumView capacityGroup={capacityGroup}/>
            <CapacityGroupChronogram capacityGroup={capacityGroup} />
          </Tab>
          <Tab eventKey="materials" title="Materials">
            Materials Table here
          </Tab>
          <Tab eventKey="events" title="Events">
            Pre filtered event list here
          </Tab>
        </Tabs>
      </div>
    </>
  );
}

export default CapacityGroupDetailsPage;
