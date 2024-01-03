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
import {FcComboChart} from "react-icons/fc";
import { useUser } from "../../contexts/UserContext";
import CapacityGroupBottlenecks from "../capacitygroup/CapacityGroupBottlenecks";

function BottlenecksPage() {
    const { user } = useUser();

    return (
        <div className="bottlenecks-page">
            <br />
            <div className="container-xl">
                <div style={{ display: "flex" }}>
                    <FcComboChart size={35} />
                    <h3 className="icon-text-padding">Bottlenecks</h3>
                </div>
                <CapacityGroupBottlenecks />
            </div>
        </div>
    );
}

export default BottlenecksPage;
