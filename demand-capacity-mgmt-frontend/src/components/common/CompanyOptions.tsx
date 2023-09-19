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

import React, { useContext } from 'react';
import { CompanyContext } from '../../contexts/CompanyContextProvider';

interface CompanyOptionsProps {
  selectedCompanyName: string;
}

const CompanyOptions: React.FC<CompanyOptionsProps> = ({ selectedCompanyName }) => {
  const companiesContextData = useContext(CompanyContext);
  const { companies } = companiesContextData || {};

  // Use the companies array to fill the <select> options
  return (
    <>
      <option disabled={true} value="">
        --Choose an option--
      </option>
      {companies &&
        companies.map((company) => (
          <option key={company.id} value={company.id} selected={company.companyName === selectedCompanyName}>
            {company.companyName}
          </option>
        ))}
    </>
  );
};

export default CompanyOptions;
