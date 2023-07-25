package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.CapacitiesDto;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.LinkedDemandSeries;
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
 * WeekBasedCapacityGroupRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class WeekBasedCapacityGroupRequest {

  @JsonProperty("unityOfMeasure")
  private String unityOfMeasure;

  @JsonProperty("linkedDemandSeries")
  @Valid
  private List<LinkedDemandSeries> linkedDemandSeries = null;

  @JsonProperty("supplier")
  private String supplier;

  @JsonProperty("name")
  private String name;

  @JsonProperty("supplierLocations")
  @Valid
  private List<String> supplierLocations = null;

  @JsonProperty("capacities")
  @Valid
  private List<CapacitiesDto> capacities = null;

  @JsonProperty("changedAt")
  private String changedAt;

  @JsonProperty("capacityGroupId")
  private String capacityGroupId;

  @JsonProperty("customer")
  private String customer;

  public WeekBasedCapacityGroupRequest unityOfMeasure(String unityOfMeasure) {
    this.unityOfMeasure = unityOfMeasure;
    return this;
  }

  /**
   * Get unityOfMeasure
   * @return unityOfMeasure
  */
  
  @Schema(name = "unityOfMeasure", required = false)
  public String getUnityOfMeasure() {
    return unityOfMeasure;
  }

  public void setUnityOfMeasure(String unityOfMeasure) {
    this.unityOfMeasure = unityOfMeasure;
  }

  public WeekBasedCapacityGroupRequest linkedDemandSeries(List<LinkedDemandSeries> linkedDemandSeries) {
    this.linkedDemandSeries = linkedDemandSeries;
    return this;
  }

  public WeekBasedCapacityGroupRequest addLinkedDemandSeriesItem(LinkedDemandSeries linkedDemandSeriesItem) {
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
  public List<LinkedDemandSeries> getLinkedDemandSeries() {
    return linkedDemandSeries;
  }

  public void setLinkedDemandSeries(List<LinkedDemandSeries> linkedDemandSeries) {
    this.linkedDemandSeries = linkedDemandSeries;
  }

  public WeekBasedCapacityGroupRequest supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

  /**
   * Get supplier
   * @return supplier
  */
  
  @Schema(name = "supplier", required = false)
  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public WeekBasedCapacityGroupRequest name(String name) {
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

  public WeekBasedCapacityGroupRequest supplierLocations(List<String> supplierLocations) {
    this.supplierLocations = supplierLocations;
    return this;
  }

  public WeekBasedCapacityGroupRequest addSupplierLocationsItem(String supplierLocationsItem) {
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
  
  @Schema(name = "supplierLocations", required = false)
  public List<String> getSupplierLocations() {
    return supplierLocations;
  }

  public void setSupplierLocations(List<String> supplierLocations) {
    this.supplierLocations = supplierLocations;
  }

  public WeekBasedCapacityGroupRequest capacities(List<CapacitiesDto> capacities) {
    this.capacities = capacities;
    return this;
  }

  public WeekBasedCapacityGroupRequest addCapacitiesItem(CapacitiesDto capacitiesItem) {
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
  public List<CapacitiesDto> getCapacities() {
    return capacities;
  }

  public void setCapacities(List<CapacitiesDto> capacities) {
    this.capacities = capacities;
  }

  public WeekBasedCapacityGroupRequest changedAt(String changedAt) {
    this.changedAt = changedAt;
    return this;
  }

  /**
   * Get changedAt
   * @return changedAt
  */
  
  @Schema(name = "changedAt", required = false)
  public String getChangedAt() {
    return changedAt;
  }

  public void setChangedAt(String changedAt) {
    this.changedAt = changedAt;
  }

  public WeekBasedCapacityGroupRequest capacityGroupId(String capacityGroupId) {
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

  public WeekBasedCapacityGroupRequest customer(String customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  
  @Schema(name = "customer", required = false)
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeekBasedCapacityGroupRequest weekBasedCapacityGroupRequest = (WeekBasedCapacityGroupRequest) o;
    return Objects.equals(this.unityOfMeasure, weekBasedCapacityGroupRequest.unityOfMeasure) &&
        Objects.equals(this.linkedDemandSeries, weekBasedCapacityGroupRequest.linkedDemandSeries) &&
        Objects.equals(this.supplier, weekBasedCapacityGroupRequest.supplier) &&
        Objects.equals(this.name, weekBasedCapacityGroupRequest.name) &&
        Objects.equals(this.supplierLocations, weekBasedCapacityGroupRequest.supplierLocations) &&
        Objects.equals(this.capacities, weekBasedCapacityGroupRequest.capacities) &&
        Objects.equals(this.changedAt, weekBasedCapacityGroupRequest.changedAt) &&
        Objects.equals(this.capacityGroupId, weekBasedCapacityGroupRequest.capacityGroupId) &&
        Objects.equals(this.customer, weekBasedCapacityGroupRequest.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unityOfMeasure, linkedDemandSeries, supplier, name, supplierLocations, capacities, changedAt, capacityGroupId, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekBasedCapacityGroupRequest {\n");
    sb.append("    unityOfMeasure: ").append(toIndentedString(unityOfMeasure)).append("\n");
    sb.append("    linkedDemandSeries: ").append(toIndentedString(linkedDemandSeries)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supplierLocations: ").append(toIndentedString(supplierLocations)).append("\n");
    sb.append("    capacities: ").append(toIndentedString(capacities)).append("\n");
    sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
    sb.append("    capacityGroupId: ").append(toIndentedString(capacityGroupId)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

