package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.CapacityResponse;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.CompanyDto;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.LinkedDemandSeriesResponse;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.UnitMeasure;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CapacityGroupResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CapacityGroupResponse {

  @JsonProperty("capacities")
  @Valid
  private List<CapacityResponse> capacities = null;

  @JsonProperty("supplierLocations")
  @Valid
  private List<CompanyDto> supplierLocations = null;

  @JsonProperty("customer")
  private CompanyDto customer;

  @JsonProperty("supplier")
  private CompanyDto supplier;

  @JsonProperty("capacityGroupId")
  private String capacityGroupId;

  @JsonProperty("linkedDemandSeries")
  @Valid
  private List<LinkedDemandSeriesResponse> linkedDemandSeries = null;

  @JsonProperty("unitOfMeasure")
  private UnitMeasure unitOfMeasure;

  @JsonProperty("changeAt")
  private String changeAt;

  @JsonProperty("name")
  private String name;

  public CapacityGroupResponse capacities(List<CapacityResponse> capacities) {
    this.capacities = capacities;
    return this;
  }

  public CapacityGroupResponse addCapacitiesItem(CapacityResponse capacitiesItem) {
    if (this.capacities == null) {
      this.capacities = new ArrayList<>();
    }
    this.capacities.add(capacitiesItem);
    return this;
  }

  /**
   * Get capacities
   * @return capacities
  */
  @Valid 
  @Schema(name = "capacities", required = false)
  public List<CapacityResponse> getCapacities() {
    return capacities;
  }

  public void setCapacities(List<CapacityResponse> capacities) {
    this.capacities = capacities;
  }

  public CapacityGroupResponse supplierLocations(List<CompanyDto> supplierLocations) {
    this.supplierLocations = supplierLocations;
    return this;
  }

  public CapacityGroupResponse addSupplierLocationsItem(CompanyDto supplierLocationsItem) {
    if (this.supplierLocations == null) {
      this.supplierLocations = new ArrayList<>();
    }
    this.supplierLocations.add(supplierLocationsItem);
    return this;
  }

  /**
   * Get supplierLocations
   * @return supplierLocations
  */
  @Valid 
  @Schema(name = "supplierLocations", required = false)
  public List<CompanyDto> getSupplierLocations() {
    return supplierLocations;
  }

  public void setSupplierLocations(List<CompanyDto> supplierLocations) {
    this.supplierLocations = supplierLocations;
  }

  public CapacityGroupResponse customer(CompanyDto customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @Valid 
  @Schema(name = "customer", required = false)
  public CompanyDto getCustomer() {
    return customer;
  }

  public void setCustomer(CompanyDto customer) {
    this.customer = customer;
  }

  public CapacityGroupResponse supplier(CompanyDto supplier) {
    this.supplier = supplier;
    return this;
  }

  /**
   * Get supplier
   * @return supplier
  */
  @Valid 
  @Schema(name = "supplier", required = false)
  public CompanyDto getSupplier() {
    return supplier;
  }

  public void setSupplier(CompanyDto supplier) {
    this.supplier = supplier;
  }

  public CapacityGroupResponse capacityGroupId(String capacityGroupId) {
    this.capacityGroupId = capacityGroupId;
    return this;
  }

  /**
   * Get capacityGroupId
   * @return capacityGroupId
  */
  
  @Schema(name = "capacityGroupId", required = false)
  public String getCapacityGroupId() {
    return capacityGroupId;
  }

  public void setCapacityGroupId(String capacityGroupId) {
    this.capacityGroupId = capacityGroupId;
  }

  public CapacityGroupResponse linkedDemandSeries(List<LinkedDemandSeriesResponse> linkedDemandSeries) {
    this.linkedDemandSeries = linkedDemandSeries;
    return this;
  }

  public CapacityGroupResponse addLinkedDemandSeriesItem(LinkedDemandSeriesResponse linkedDemandSeriesItem) {
    if (this.linkedDemandSeries == null) {
      this.linkedDemandSeries = new ArrayList<>();
    }
    this.linkedDemandSeries.add(linkedDemandSeriesItem);
    return this;
  }

  /**
   * Get linkedDemandSeries
   * @return linkedDemandSeries
  */
  @Valid 
  @Schema(name = "linkedDemandSeries", required = false)
  public List<LinkedDemandSeriesResponse> getLinkedDemandSeries() {
    return linkedDemandSeries;
  }

  public void setLinkedDemandSeries(List<LinkedDemandSeriesResponse> linkedDemandSeries) {
    this.linkedDemandSeries = linkedDemandSeries;
  }

  public CapacityGroupResponse unitOfMeasure(UnitMeasure unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * Get unitOfMeasure
   * @return unitOfMeasure
  */
  @Valid 
  @Schema(name = "unitOfMeasure", required = false)
  public UnitMeasure getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(UnitMeasure unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public CapacityGroupResponse changeAt(String changeAt) {
    this.changeAt = changeAt;
    return this;
  }

  /**
   * Get changeAt
   * @return changeAt
  */
  
  @Schema(name = "changeAt", required = false)
  public String getChangeAt() {
    return changeAt;
  }

  public void setChangeAt(String changeAt) {
    this.changeAt = changeAt;
  }

  public CapacityGroupResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityGroupResponse capacityGroupResponse = (CapacityGroupResponse) o;
    return Objects.equals(this.capacities, capacityGroupResponse.capacities) &&
        Objects.equals(this.supplierLocations, capacityGroupResponse.supplierLocations) &&
        Objects.equals(this.customer, capacityGroupResponse.customer) &&
        Objects.equals(this.supplier, capacityGroupResponse.supplier) &&
        Objects.equals(this.capacityGroupId, capacityGroupResponse.capacityGroupId) &&
        Objects.equals(this.linkedDemandSeries, capacityGroupResponse.linkedDemandSeries) &&
        Objects.equals(this.unitOfMeasure, capacityGroupResponse.unitOfMeasure) &&
        Objects.equals(this.changeAt, capacityGroupResponse.changeAt) &&
        Objects.equals(this.name, capacityGroupResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacities, supplierLocations, customer, supplier, capacityGroupId, linkedDemandSeries, unitOfMeasure, changeAt, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityGroupResponse {\n");
    sb.append("    capacities: ").append(toIndentedString(capacities)).append("\n");
    sb.append("    supplierLocations: ").append(toIndentedString(supplierLocations)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    capacityGroupId: ").append(toIndentedString(capacityGroupId)).append("\n");
    sb.append("    linkedDemandSeries: ").append(toIndentedString(linkedDemandSeries)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    changeAt: ").append(toIndentedString(changeAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

