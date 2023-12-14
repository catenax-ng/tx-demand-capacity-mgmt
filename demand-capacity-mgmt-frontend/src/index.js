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

import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter as Router } from "react-router-dom";
import AppComponent from './components/dcm/AppComponent';
import AuthenticationComponent from './components/pages/AuthenticationPage';
import { UserProvider } from "./contexts/UserContext";
import './custom-bootstrap.scss';
import './index.css';
import { isAuthenticated } from './util/Auth';

const root = ReactDOM.createRoot(document.getElementById('root'));
function App() {
    const authenticated = isAuthenticated();
    return (
        <UserProvider>
            <Router>
                {authenticated ? <AppComponent /> : <AuthenticationComponent />}
            </Router>
        </UserProvider>
    );
}

root.render(
    <App />
);
