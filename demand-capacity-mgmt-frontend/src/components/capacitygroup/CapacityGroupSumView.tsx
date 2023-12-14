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

import React, { useContext, useEffect, useMemo, useRef, useState } from 'react';
import { OverlayTrigger, Tooltip } from 'react-bootstrap';
import '../../../src/index.css';
import { DemandCategoryContext } from '../../contexts/DemandCategoryProvider';

import { addDays, addMonths, addWeeks, format, getISOWeek, startOfMonth } from 'date-fns';
import { FaArrowDown, FaArrowRight } from 'react-icons/fa';
import { SingleCapacityGroup } from '../../interfaces/capacitygroup_interfaces';
import { DemandProp } from "../../interfaces/demand_interfaces";

interface WeeklyViewProps {
  capacityGroup: SingleCapacityGroup | null | undefined;
  materialDemands: DemandProp[] | null;
}


function getISOWeekMonday(year: number, isoWeek: number): Date {
  const january4 = new Date(year, 0, 4);
  const diff = (isoWeek - 1) * 7 + (1 - january4.getDay());
  return addDays(january4, diff);
}

function getWeeksInMonth(year: number, monthIndex: number): number[] {
  const firstDayOfMonth = startOfMonth(new Date(year, monthIndex));
  const nextMonth = startOfMonth(addMonths(firstDayOfMonth, 1));

  let weeks = [];
  let currentDay = firstDayOfMonth;

  while (currentDay < nextMonth) {
    weeks.push(getISOWeek(currentDay));
    currentDay = addWeeks(currentDay, 1);
  }

  return weeks;
}

const CapacityGroupSumView: React.FC<WeeklyViewProps> = ({ capacityGroup, materialDemands }) => {

  const { demandcategories } = useContext(DemandCategoryContext) || {};
  const currentYear = new Date().getFullYear();

  const monthsCurrentYear = Array.from({ length: 12 }, (_, monthIndex) => {
    const monthStart = new Date(currentYear, monthIndex, 1);
    const monthName = format(monthStart, 'MMM');
    const weeks = getWeeksInMonth(currentYear, monthIndex);


    return {
      name: monthName,
      year: currentYear,
      weeks: weeks,
      monthIndex: monthIndex,
    };
  });

  const monthsPreviousYear = Array.from({ length: 1 }, (_, monthIndex) => {
    const monthStart = new Date(currentYear - 1, monthIndex + 11, 1);
    const monthName = format(monthStart, 'MMM');
    const weeks = getWeeksInMonth(currentYear - 1, monthIndex + 11);

    return {
      name: monthName,
      year: currentYear - 1,
      weeks: weeks,
      monthIndex: monthIndex + 11,
    };
  });

  const monthsNextYear = Array.from({ length: 1 }, (_, monthIndex) => {
    const monthStart = new Date(currentYear + 1, monthIndex, 1);
    const monthName = format(monthStart, 'MMM');
    const weeks = getWeeksInMonth(currentYear + 1, monthIndex);

    return {
      name: monthName,
      year: currentYear + 1,
      weeks: weeks,
      monthIndex: monthIndex,
    };
  });

  const totalWeeksPreviousYear = monthsPreviousYear.reduce((total, month) => total + month.weeks.length, 0);
  const totalWeeksCurrentYear = monthsCurrentYear.reduce((total, month) => total + month.weeks.length, 0);
  const totalWeeksNextYear = monthsNextYear.reduce((total, month) => total + month.weeks.length, 0);


  //Mapping of categories
  const idToNumericIdMap: Record<string, number> = {};

  if (demandcategories) {
    demandcategories.forEach((category, index) => {
      idToNumericIdMap[category.id] = index;
    });
  }

  // Track which Demand.description rows are expanded
  const [expandedDemandRows, setExpandedDemandRows] = useState<Record<string, boolean>>({});

  // Function to toggle the expansion of a Demand.description row
  const toggleDemandRowExpansion = (demandId: string) => {
    setExpandedDemandRows((prevExpandedRows) => ({
      ...prevExpandedRows,
      [demandId]: !prevExpandedRows[demandId],
    }));
  };

  const demandSumsByWeek: Record<number, number> = {};
  const computedDemandSums: Record<number, number> = useMemo(() => {

    // Populate demandSumsByWeek
    if (capacityGroup && materialDemands) {
      materialDemands.forEach((demand) => {
        demand.demandSeries?.forEach((demandSeries) => {
          demandSeries.demandSeriesValues.forEach((demandSeriesValue) => {
            const week = getISOWeek(new Date(demandSeriesValue.calendarWeek));
            demandSumsByWeek[week] = (demandSumsByWeek[week] || 0) + demandSeriesValue.demand;
          });
        });
      });
    }

    const computedSums: Record<number, number> = {};

    for (const week in demandSumsByWeek) {
      computedSums[week] = 0;
      materialDemands?.forEach((demand) => {
        demand.demandSeries?.forEach((demandSeries) => {
          demandSeries.demandSeriesValues.forEach((demandSeriesValue) => {
            const seriesWeek = getISOWeek(new Date(demandSeriesValue.calendarWeek));
            if (seriesWeek.toString() === week) {
              computedSums[week] += demandSeriesValue.demand;
            }
          });
        });
      });
    }

    return computedSums;
  }, [capacityGroup, materialDemands]);


  const demandSums = useMemo(() => {


    // Populate demandSumsByWeek
    if (capacityGroup && materialDemands) {
      materialDemands.forEach((demand) => {
        demand.demandSeries?.forEach((demandSeries) => {
          demandSeries.demandSeriesValues.forEach((demandSeriesValue) => {
            const week = getISOWeek(new Date(demandSeriesValue.calendarWeek));
            demandSumsByWeek[week] = (demandSumsByWeek[week] || 0) + demandSeriesValue.demand;
          });
        });
      });
    }

    // Iterate over demandSumsByWeek to populate computedDemandSums
    for (const week in demandSumsByWeek) {
      computedDemandSums[week] = 0;
      materialDemands?.forEach((demand) => {
        demand.demandSeries?.forEach((demandSeries) => {
          demandSeries.demandSeriesValues.forEach((demandSeriesValue) => {
            const seriesWeek = getISOWeek(new Date(demandSeriesValue.calendarWeek));
            if (seriesWeek.toString() === week) {
              computedDemandSums[week] += demandSeriesValue.demand;
            }
          });
        });
      });
    }

    return computedDemandSums;
  }, [capacityGroup, materialDemands]);

  // Calculate demand sums for each demand name
  const demandSumsByDemandAndWeek: Record<string, Record<number, number>> = {};

  if (capacityGroup && materialDemands) {
    materialDemands.forEach((demand) => {
      const demandName = demand.materialDescriptionCustomer;
      demandSumsByDemandAndWeek[demandName] = {};

      demand.demandSeries?.forEach((demandSeries) => {
        demandSeries.demandSeriesValues.forEach((demandSeriesValue) => {
          const week = getISOWeek(new Date(demandSeriesValue.calendarWeek));
          const demandSum = demandSeriesValue.demand;
          demandSumsByDemandAndWeek[demandName][week] = (demandSumsByDemandAndWeek[demandName][week] || 0) + demandSum;
        });
      });
    });
  }

  /*To focus on the first value on the table*/
  const firstNonZeroDemandRef = useRef<HTMLTableDataCellElement>(null);

  useEffect(() => {
    let firstNonZeroDemandWeek: number | null = null;

    // Iterate over demandSums object to find the first non-zero demand week
    for (const week in demandSums) {
      if (demandSums[week] !== 0) {
        firstNonZeroDemandWeek = parseInt(week);
        break;
      }
    }

    if (firstNonZeroDemandWeek !== null) {
      const cellElement = document.getElementById(`cell-${firstNonZeroDemandWeek}`);

      // Check if the element exists before focusing
      if (cellElement && firstNonZeroDemandRef.current) {
        // Focus on the first non-zero demand sum cell
        cellElement.focus();
        cellElement.scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'center' });
      }
    }
  }, [demandSums]);

  // Batch update actualCapacityMap
  const actualCapacityMap: Record<number, number> = useMemo(() => {
    const capacityMap: Record<number, number> = {};
    if (capacityGroup && capacityGroup.capacities) {
      capacityGroup.capacities.forEach((capacity) => {
        const week = getISOWeek(new Date(capacity.calendarWeek));
        capacityMap[week] = capacity.actualCapacity;
      });
    }
    return capacityMap;
  }, [computedDemandSums]);


  // Calculate deltaMap directly based on demandSumsByWeek and actualCapacityMap
  const deltaMap: Record<number, Record<number, number>> = useMemo(() => {
    const calculatedDeltaMap: Record<number, Record<number, number>> = {};

    // Calculate deltas for the previous year
    monthsPreviousYear.forEach((month) => {
      calculatedDeltaMap[month.year] = calculatedDeltaMap[month.year] || {};
      month.weeks.forEach((week) => {
        calculatedDeltaMap[month.year][week] =
          (actualCapacityMap[week] || 0) - (computedDemandSums[week] || 0);
      });
    });

    // Calculate deltas for the current year
    monthsCurrentYear.forEach((month) => {
      calculatedDeltaMap[month.year] = calculatedDeltaMap[month.year] || {};
      month.weeks.forEach((week) => {
        calculatedDeltaMap[month.year][week] =
          (actualCapacityMap[week] || 0) - (computedDemandSums[week] || 0);
      });
    });

    // Calculate deltas for the next year
    monthsNextYear.forEach((month) => {
      calculatedDeltaMap[month.year] = calculatedDeltaMap[month.year] || {};
      month.weeks.forEach((week) => {
        calculatedDeltaMap[month.year][week] =
          (actualCapacityMap[week] || 0) - (computedDemandSums[week] || 0);
      });
    });

    return calculatedDeltaMap;
  }, [computedDemandSums]); // Empty dependency array ensures that this useMemo runs only once


  // Function to get the beginning and end dates of the week
  const getWeekDates = (year: number, month: string, week: number) => {
    const startDate = getISOWeekMonday(year, week);

    const endDate = new Date(startDate);
    endDate.setDate(endDate.getDate() + 6); // Assuming weeks end on Saturdays

    return {
      startDate: startDate.toDateString(),
      endDate: endDate.toDateString(),
    };
  };

  return (
    <div className='container'>
      <div className="table-container">
        <div className="container">
          <table className="vertical-table">
            <thead>
              <tr>
                <th className="empty-header-cell"></th>
                <th colSpan={totalWeeksPreviousYear} className="header-cell">
                  {currentYear - 1}
                </th>
                <th colSpan={totalWeeksCurrentYear} className="header-cell">
                  {currentYear}
                </th>
                <th colSpan={totalWeeksNextYear} className="header-cell">
                  {currentYear + 1}
                </th>
              </tr>
              <tr>
                <th className="empty-header-cell"></th>
                {monthsPreviousYear.map((month) => (
                  <th key={month.name + month.year} colSpan={month.weeks.length} className="header-cell">
                    {month.name}
                  </th>
                ))}
                {monthsCurrentYear.map((month) => (
                  <th key={month.name + month.year} colSpan={month.weeks.length} className="header-cell">
                    {month.name}
                  </th>
                ))}
                {monthsNextYear.map((month) => (
                  <th key={month.name + month.year} colSpan={month.weeks.length} className="header-cell">
                    {month.name}
                  </th>
                ))}
              </tr>
              <tr>
                <th className="empty-header-cell"></th>
                {monthsPreviousYear.map((month) =>
                  month.weeks.map((week) => (
                    <th key={month.name + week} className="header-cell week-header-cell">
                      <OverlayTrigger
                        placement="top"
                        overlay={
                          <Tooltip id={`week-tooltip-${month.year}-${week}`}>
                            {`Week ${week} - ${getWeekDates(month.year, month.name, week).startDate} to ${getWeekDates(
                              month.year,
                              month.name,
                              week
                            ).endDate}`}
                          </Tooltip>
                        }
                      >
                        <span>{week}</span>
                      </OverlayTrigger>
                    </th>
                  ))
                )}
                {monthsCurrentYear.map((month) =>
                  month.weeks.map((week) => (
                    <th key={month.name + week} className="header-cell week-header-cell">
                      <OverlayTrigger
                        placement="top"
                        overlay={
                          <Tooltip id={`week-tooltip-${month.year}-${week}`}>
                            {`Week ${week} - ${getWeekDates(month.year, month.name, week).startDate} to ${getWeekDates(
                              month.year,
                              month.name,
                              week
                            ).endDate}`}
                          </Tooltip>
                        }
                      >
                        <span>{week}</span>
                      </OverlayTrigger>
                    </th>
                  ))
                )}
                {monthsNextYear.map((month) =>
                  month.weeks.map((week) => (
                    <th key={month.name + week} className="header-cell week-header-cell">
                      <OverlayTrigger
                        placement="top"
                        overlay={
                          <Tooltip id={`week-tooltip-${month.year}-${week}`}>
                            {`Week ${week} - ${getWeekDates(month.year, month.name, week).startDate} to ${getWeekDates(
                              month.year,
                              month.name,
                              week
                            ).endDate}`}
                          </Tooltip>
                        }
                      >
                        <span>{week}</span>
                      </OverlayTrigger>
                    </th>
                  ))
                )}
              </tr>

              <tr>
                <th className="sticky-header-cell">
                  <div className="sticky-header-content" onClick={() => toggleDemandRowExpansion('total')}>
                    {expandedDemandRows['total'] ? <FaArrowDown /> : <FaArrowRight />} Demands (Sum)
                  </div>
                </th>
                {monthsPreviousYear.concat(monthsCurrentYear, monthsNextYear).map((month) =>
                  month.weeks.map((week) => (
                    <td
                      key={`demand-${week}`}
                      className={`data-cell ${demandSums[week] !== 0 ? 'non-zero-demand-cell' : ''}`}
                      // Assign an ID to each cell to identify it for focusing
                      id={`cell-${week}`}
                      // Use the created ref directly without the need for a ternary operator
                      ref={demandSums[week] !== 0 ? firstNonZeroDemandRef : undefined}
                    >
                      {demandSums[week] !== 0 ? demandSums[week] : '-'} {/*Todo Stylize */}
                    </td>
                  ))
                )}
              </tr>
              {expandedDemandRows['total'] && (
                <>
                  {capacityGroup &&
                    materialDemands &&
                    materialDemands.map((demand) => (
                      <React.Fragment key={`demand-row-${demand.id}`}>
                        <tr>
                          <th className="sticky-header-cell">
                            <div
                              className="sticky-header-content table-header-nested-text "
                              onClick={() => toggleDemandRowExpansion(demand.id)}
                            >
                              {expandedDemandRows[demand.id] ? <FaArrowDown /> : <FaArrowRight />} {demand.materialDescriptionCustomer}
                            </div>
                          </th>
                          {monthsPreviousYear.concat(monthsCurrentYear, monthsNextYear).map((month) =>
                            month.weeks.map((week) => {
                              const demandSum =
                                demandSumsByDemandAndWeek[demand.materialDescriptionCustomer]?.[week] || null;
                              return (
                                <td key={`demandSeries-${week}-${demand.id}`} className="data-cell">
                                  <strong>{demandSum !== null ? (demandSum || 0) : '-'}</strong>
                                </td>
                              );
                            })
                          )}
                        </tr>
                        {expandedDemandRows[demand.id] && (
                          <>
                            {demand.demandSeries?.map((demandSeries) => (
                              <React.Fragment key={`demandSeries-row-${demandSeries.demandCategory.id}`}>
                                <tr>
                                  <th className="sticky-header-cell">
                                    <div className="sticky-header-content table-header-nested-text-child">
                                      {demandSeries.demandCategory.demandCategoryName}
                                    </div>
                                  </th>
                                  {monthsPreviousYear.concat(monthsCurrentYear, monthsNextYear).map((month) =>
                                    month.weeks.map((week) => {
                                      const demandValue = demandSeries.demandSeriesValues.find(
                                        (demandValue) => getISOWeek(new Date(demandValue.calendarWeek)) === week
                                      );
                                      const demandSum = demandValue?.demand || null;
                                      return (
                                        <td key={`demandSeries-${week}-${demandSeries.demandCategory.id}`} className="data-cell">
                                          {demandSum !== null ? (demandSum || 0) : '-'}
                                        </td>
                                      );
                                    })
                                  )}
                                </tr>
                              </React.Fragment>
                            ))}
                          </>
                        )}
                      </React.Fragment>
                    ))}
                </>
              )}
              <tr>
                <th className="sticky-header-cell">
                  <div className="sticky-header-content">-</div>
                </th>
                {monthsPreviousYear.concat(monthsCurrentYear, monthsNextYear).map((month) =>
                  month.weeks.map((week) => (
                    <td key={`empty-${week}`} className="data-cell">
                      {' '}
                    </td>
                  ))
                )}
              </tr>
              <tr>
                <th className="sticky-header-cell">
                  <div className="sticky-header-content">Actual Capacity</div>
                </th>
                {monthsPreviousYear.concat(monthsCurrentYear, monthsNextYear).map((month) =>
                  month.weeks.map((week) => {
                    const matchingCapacity = capacityGroup?.capacities.find((capacity) => {
                      const capacityWeek = new Date(capacity.calendarWeek);
                      return getISOWeek(capacityWeek) === week;
                    });
                    const actualCapacity = matchingCapacity?.actualCapacity ?? '-';

                    return (
                      <td key={`actual-capacity-${week}`} className="data-cell">
                        {actualCapacity.toString()}
                      </td>
                    );
                  })
                )}
              </tr>
              <tr>
                <th className="sticky-header-cell">
                  <div className="sticky-header-content">Maximum Capacity</div>
                </th>
                {monthsPreviousYear.concat(monthsCurrentYear, monthsNextYear).map((month) =>
                  month.weeks.map((week) => {
                    const matchingCapacity = capacityGroup?.capacities.find((capacity) => {
                      const capacityWeek = new Date(capacity.calendarWeek);
                      return getISOWeek(capacityWeek) === week;
                    });
                    const maximumCapacity = matchingCapacity?.maximumCapacity ?? '-';

                    return (
                      <td key={`actual-capacity-${week}`} className="data-cell">
                        {maximumCapacity.toString()}
                      </td>
                    );
                  })
                )}
              </tr>
              <tr>
                <th className="sticky-header-cell">
                  <div className="sticky-header-content">-</div>
                </th>
                {monthsPreviousYear.concat(monthsCurrentYear, monthsNextYear).map((month) =>
                  month.weeks.map((week) => (
                    <td key={`empty-${week}`} className="data-cell">
                      {' '}
                    </td>
                  ))
                )}
              </tr>
              <tr>
                <th className="sticky-header-cell">
                  <div className="sticky-header-content">Delta</div>
                </th>
                {monthsPreviousYear.concat(monthsCurrentYear, monthsNextYear).map((month) =>
                  month.weeks.map((week) => (
                    <td
                      key={`delta-${month.year}-${week}`}
                      className={`data-cell ${deltaMap[month.year]?.[week] < 0 ? 'bg-light-red' : deltaMap[month.year]?.[week] > 0 ? 'bg-light-green' : ''}`}
                    >
                      {deltaMap[month.year][week] > 0 ? `+${deltaMap[month.year][week]}` : deltaMap[month.year][week]}
                    </td>
                  ))
                )}
              </tr>
            </thead>
          </table>
        </div>
      </div>
    </div>
  );
};


export default CapacityGroupSumView;