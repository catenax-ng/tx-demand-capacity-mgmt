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

import React, {useContext, useEffect, useState} from 'react';
import {Form, Button, Row, Col, Table, Toast} from 'react-bootstrap';
import {useUser} from "../../contexts/UserContext";
import { ThresholdsContext } from "../../contexts/ThresholdsContextProvider";
import {ThresholdProp} from "../../interfaces/Threshold_interfaces";


function ThresholdPage() {
    const { thresholds, fetchThresholds, updateThresholds } = useContext(ThresholdsContext)!;

    const [editableThresholds, setEditableThresholds] = useState<ThresholdProp[]>([]);
    const [showToast, setShowToast] = useState(false);

    useEffect(() => {
        setEditableThresholds(thresholds);
    }, [thresholds]);

    const handleCheckboxChange = (id: number) => {
        const updatedThresholds = editableThresholds.map(threshold => {
            if (threshold.id === id) {
                return { ...threshold, enabled: !threshold.enabled };
            }
            return threshold;
        });
        setEditableThresholds(updatedThresholds);
    };


    const handleSave = async (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault();

        const ruleRequests = editableThresholds.map(threshold => ({
            id: threshold.id,
            enabled: threshold.enabled
        }));

        try {
            await updateThresholds(ruleRequests);
            console.log('Thresholds saved:', ruleRequests);
            await fetchThresholds();
            setShowToast(true); // Show the toast on successful save
            setTimeout(() => setShowToast(false), 3000); // Hide the toast after 3 seconds
        } catch (error) {
            console.error('Error saving thresholds:', error);
        }
    };

    const sortedThresholds = [...editableThresholds].sort((a, b) => {
        return Number(a.percentage) - Number(b.percentage);
    });

    const chunkThresholds = (thresholds: ThresholdProp[], size: number): ThresholdProp[][] => {
        return thresholds.reduce((acc: ThresholdProp[][], val: ThresholdProp, i: number) => {
            let idx = Math.floor(i / size);
            let page = acc[idx] || (acc[idx] = []);
            page.push(val);
            return acc;
        }, []);
    }

    const chunkedThresholds = chunkThresholds(sortedThresholds, 4);


    return (
        <div>
            <h3>Threshold Config Settings</h3>
            <Form onSubmit={handleSave}>
                <Table striped bordered hover>
                    <tbody>
                    {chunkedThresholds.map((chunk, chunkIndex) => (
                        <tr key={chunkIndex}>
                            {chunk.map((threshold) => (
                                <td key={threshold.id}>
                                    <Form.Check
                                        type="checkbox"
                                        id={`threshold-${threshold.percentage}`}
                                        label={`${threshold.percentage} %`}
                                        checked={threshold.enabled}
                                        onChange={() => handleCheckboxChange(threshold.id)}
                                    />
                                </td>
                            ))}
                        </tr>
                    ))}
                    </tbody>
                </Table>
                <Button variant="primary" type="submit" className="mt-3">
                    Save
                </Button>
            </Form>

            {/* Toast Notification */}
            <Toast onClose={() => setShowToast(false)} show={showToast} delay={3000} autohide style={{ position: 'fixed', bottom: 20, right: 20 }}>
                <Toast.Header className="bg-success text-white">
                    <strong className="mr-auto">Success</strong>
                </Toast.Header>
                <Toast.Body>Thresholds updated successfully!</Toast.Body>
            </Toast>
        </div>
    );
}

export default ThresholdPage;