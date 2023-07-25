package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.CompanyDto;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.MaterialDemandSeriesResponse;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.UnitMeasure;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MaterialDemandResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class MaterialDemandResponse {

  @JsonProperty("materialDescriptionCustomer")
  private String materialDescriptionCustomer;

  @JsonProperty("materialNumberCustomer")
  private String materialNumberCustomer;

  @JsonProperty("materialNumberSupplier")
  private String materialNumberSupplier;

  @JsonProperty("customer")
  private CompanyDto customer;

  @JsonProperty("supplier")
  private CompanyDto supplier;

  @JsonProperty("unitMeasureId")
  private UnitMeasure unitMeasureId;

  @JsonProperty("changedAt")
  private String changedAt;

  @JsonProperty("demandSeries")
  private MaterialDemandSeriesResponse demandSeries;

  public MaterialDemandResponse materialDescriptionCustomer(String materialDescriptionCustomer) {
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

  public MaterialDemandResponse materialNumberCustomer(String materialNumberCustomer) {
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

  public MaterialDemandResponse materialNumberSupplier(String materialNumberSupplier) {
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

  public MaterialDemandResponse customer(CompanyDto customer) {
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

  public MaterialDemandResponse supplier(CompanyDto supplier) {
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

  public MaterialDemandResponse unitMeasureId(UnitMeasure unitMeasureId) {
    this.unitMeasureId = unitMeasureId;
    return this;
  }

  /**
   * Get unitMeasureId
   * @return unitMeasureId
  */
  @Valid 
  @Schema(name = "unitMeasureId", required = false)
  public UnitMeasure getUnitMeasureId() {
    return unitMeasureId;
  }

  public void setUnitMeasureId(UnitMeasure unitMeasureId) {
    this.unitMeasureId = unitMeasureId;
  }

  public MaterialDemandResponse changedAt(String changedAt) {
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

  public MaterialDemandResponse demandSeries(MaterialDemandSeriesResponse demandSeries) {
    this.demandSeries = demandSeries;
    return this;
  }

  /**
   * Get demandSeries
   * @return demandSeries
  */
  @Valid 
  @Schema(name = "demandSeries", required = false)
  public MaterialDemandSeriesResponse getDemandSeries() {
    return demandSeries;
  }

  public void setDemandSeries(MaterialDemandSeriesResponse demandSeries) {
    this.demandSeries = demandSeries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialDemandResponse materialDemandResponse = (MaterialDemandResponse) o;
    return Objects.equals(this.materialDescriptionCustomer, materialDemandResponse.materialDescriptionCustomer) &&
        Objects.equals(this.materialNumberCustomer, materialDemandResponse.materialNumberCustomer) &&
        Objects.equals(this.materialNumberSupplier, materialDemandResponse.materialNumberSupplier) &&
        Objects.equals(this.customer, materialDemandResponse.customer) &&
        Objects.equals(this.supplier, materialDemandResponse.supplier) &&
        Objects.equals(this.unitMeasureId, materialDemandResponse.unitMeasureId) &&
        Objects.equals(this.changedAt, materialDemandResponse.changedAt) &&
        Objects.equals(this.demandSeries, materialDemandResponse.demandSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialDescriptionCustomer, materialNumberCustomer, materialNumberSupplier, customer, supplier, unitMeasureId, changedAt, demandSeries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialDemandResponse {\n");
    sb.append("    materialDescriptionCustomer: ").append(toIndentedString(materialDescriptionCustomer)).append("\n");
    sb.append("    materialNumberCustomer: ").append(toIndentedString(materialNumberCustomer)).append("\n");
    sb.append("    materialNumberSupplier: ").append(toIndentedString(materialNumberSupplier)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    unitMeasureId: ").append(toIndentedString(unitMeasureId)).append("\n");
    sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
    sb.append("    demandSeries: ").append(toIndentedString(demandSeries)).append("\n");
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

