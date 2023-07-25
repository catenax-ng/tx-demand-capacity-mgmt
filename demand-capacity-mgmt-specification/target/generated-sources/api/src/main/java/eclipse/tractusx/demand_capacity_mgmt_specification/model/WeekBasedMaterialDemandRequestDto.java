package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.DemandWeekSeriesDto;
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
 * WeekBasedMaterialDemandRequestDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class WeekBasedMaterialDemandRequestDto {

  @JsonProperty("unityOfMeasure")
  private String unityOfMeasure;

  @JsonProperty("materialDescriptionCustomer")
  private String materialDescriptionCustomer;

  @JsonProperty("materialDemandId")
  private String materialDemandId;

  @JsonProperty("materialNumberSupplier")
  private String materialNumberSupplier;

  @JsonProperty("supplier")
  private String supplier;

  @JsonProperty("changedAt")
  private String changedAt;

  @JsonProperty("demandSeries")
  @Valid
  private List<DemandWeekSeriesDto> demandSeries = null;

  @JsonProperty("materialNumberCustomer")
  private String materialNumberCustomer;

  @JsonProperty("customer")
  private String customer;

  public WeekBasedMaterialDemandRequestDto unityOfMeasure(String unityOfMeasure) {
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

  public WeekBasedMaterialDemandRequestDto materialDescriptionCustomer(String materialDescriptionCustomer) {
    this.materialDescriptionCustomer = materialDescriptionCustomer;
    return this;
  }

  /**
   * Get materialDescriptionCustomer
   * @return materialDescriptionCustomer
  */
  
  @Schema(name = "materialDescriptionCustomer", required = false)
  public String getMaterialDescriptionCustomer() {
    return materialDescriptionCustomer;
  }

  public void setMaterialDescriptionCustomer(String materialDescriptionCustomer) {
    this.materialDescriptionCustomer = materialDescriptionCustomer;
  }

  public WeekBasedMaterialDemandRequestDto materialDemandId(String materialDemandId) {
    this.materialDemandId = materialDemandId;
    return this;
  }

  /**
   * Get materialDemandId
   * @return materialDemandId
  */
  
  @Schema(name = "materialDemandId", required = false)
  public String getMaterialDemandId() {
    return materialDemandId;
  }

  public void setMaterialDemandId(String materialDemandId) {
    this.materialDemandId = materialDemandId;
  }

  public WeekBasedMaterialDemandRequestDto materialNumberSupplier(String materialNumberSupplier) {
    this.materialNumberSupplier = materialNumberSupplier;
    return this;
  }

  /**
   * Get materialNumberSupplier
   * @return materialNumberSupplier
  */
  
  @Schema(name = "materialNumberSupplier", required = false)
  public String getMaterialNumberSupplier() {
    return materialNumberSupplier;
  }

  public void setMaterialNumberSupplier(String materialNumberSupplier) {
    this.materialNumberSupplier = materialNumberSupplier;
  }

  public WeekBasedMaterialDemandRequestDto supplier(String supplier) {
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

  public WeekBasedMaterialDemandRequestDto changedAt(String changedAt) {
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

  public WeekBasedMaterialDemandRequestDto demandSeries(List<DemandWeekSeriesDto> demandSeries) {
    this.demandSeries = demandSeries;
    return this;
  }

  public WeekBasedMaterialDemandRequestDto addDemandSeriesItem(DemandWeekSeriesDto demandSeriesItem) {
    if (this.demandSeries == null) {
      this.demandSeries = new ArrayList<>();
    }
    this.demandSeries.add(demandSeriesItem);
    return this;
  }

  /**
   * Get demandSeries
   * @return demandSeries
  */
  @Valid 
  @Schema(name = "demandSeries", required = false)
  public List<DemandWeekSeriesDto> getDemandSeries() {
    return demandSeries;
  }

  public void setDemandSeries(List<DemandWeekSeriesDto> demandSeries) {
    this.demandSeries = demandSeries;
  }

  public WeekBasedMaterialDemandRequestDto materialNumberCustomer(String materialNumberCustomer) {
    this.materialNumberCustomer = materialNumberCustomer;
    return this;
  }

  /**
   * Get materialNumberCustomer
   * @return materialNumberCustomer
  */
  
  @Schema(name = "materialNumberCustomer", required = false)
  public String getMaterialNumberCustomer() {
    return materialNumberCustomer;
  }

  public void setMaterialNumberCustomer(String materialNumberCustomer) {
    this.materialNumberCustomer = materialNumberCustomer;
  }

  public WeekBasedMaterialDemandRequestDto customer(String customer) {
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
    WeekBasedMaterialDemandRequestDto weekBasedMaterialDemandRequestDto = (WeekBasedMaterialDemandRequestDto) o;
    return Objects.equals(this.unityOfMeasure, weekBasedMaterialDemandRequestDto.unityOfMeasure) &&
        Objects.equals(this.materialDescriptionCustomer, weekBasedMaterialDemandRequestDto.materialDescriptionCustomer) &&
        Objects.equals(this.materialDemandId, weekBasedMaterialDemandRequestDto.materialDemandId) &&
        Objects.equals(this.materialNumberSupplier, weekBasedMaterialDemandRequestDto.materialNumberSupplier) &&
        Objects.equals(this.supplier, weekBasedMaterialDemandRequestDto.supplier) &&
        Objects.equals(this.changedAt, weekBasedMaterialDemandRequestDto.changedAt) &&
        Objects.equals(this.demandSeries, weekBasedMaterialDemandRequestDto.demandSeries) &&
        Objects.equals(this.materialNumberCustomer, weekBasedMaterialDemandRequestDto.materialNumberCustomer) &&
        Objects.equals(this.customer, weekBasedMaterialDemandRequestDto.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unityOfMeasure, materialDescriptionCustomer, materialDemandId, materialNumberSupplier, supplier, changedAt, demandSeries, materialNumberCustomer, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekBasedMaterialDemandRequestDto {\n");
    sb.append("    unityOfMeasure: ").append(toIndentedString(unityOfMeasure)).append("\n");
    sb.append("    materialDescriptionCustomer: ").append(toIndentedString(materialDescriptionCustomer)).append("\n");
    sb.append("    materialDemandId: ").append(toIndentedString(materialDemandId)).append("\n");
    sb.append("    materialNumberSupplier: ").append(toIndentedString(materialNumberSupplier)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
    sb.append("    demandSeries: ").append(toIndentedString(demandSeries)).append("\n");
    sb.append("    materialNumberCustomer: ").append(toIndentedString(materialNumberCustomer)).append("\n");
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

