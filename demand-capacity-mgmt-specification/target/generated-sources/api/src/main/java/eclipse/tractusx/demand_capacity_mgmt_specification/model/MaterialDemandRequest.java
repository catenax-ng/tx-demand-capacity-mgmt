package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.MaterialDemandSeries;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MaterialDemandRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class MaterialDemandRequest {

  @JsonProperty("materialDescriptionCustomer")
  private String materialDescriptionCustomer;

  @JsonProperty("materialNumberCustomer")
  private String materialNumberCustomer;

  @JsonProperty("materialNumberSupplier")
  private String materialNumberSupplier;

  @JsonProperty("customerId")
  private String customerId;

  @JsonProperty("supplierId")
  private String supplierId;

  @JsonProperty("unitMeasureId")
  private String unitMeasureId;

  @JsonProperty("materialDemandSeries")
  private MaterialDemandSeries materialDemandSeries;

  public MaterialDemandRequest materialDescriptionCustomer(String materialDescriptionCustomer) {
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

  public MaterialDemandRequest materialNumberCustomer(String materialNumberCustomer) {
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

  public MaterialDemandRequest materialNumberSupplier(String materialNumberSupplier) {
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

  public MaterialDemandRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  
  @Schema(name = "customerId", required = false)
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public MaterialDemandRequest supplierId(String supplierId) {
    this.supplierId = supplierId;
    return this;
  }

  /**
   * Get supplierId
   * @return supplierId
  */
  
  @Schema(name = "supplierId", required = false)
  public String getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(String supplierId) {
    this.supplierId = supplierId;
  }

  public MaterialDemandRequest unitMeasureId(String unitMeasureId) {
    this.unitMeasureId = unitMeasureId;
    return this;
  }

  /**
   * Get unitMeasureId
   * @return unitMeasureId
  */
  
  @Schema(name = "unitMeasureId", required = false)
  public String getUnitMeasureId() {
    return unitMeasureId;
  }

  public void setUnitMeasureId(String unitMeasureId) {
    this.unitMeasureId = unitMeasureId;
  }

  public MaterialDemandRequest materialDemandSeries(MaterialDemandSeries materialDemandSeries) {
    this.materialDemandSeries = materialDemandSeries;
    return this;
  }

  /**
   * Get materialDemandSeries
   * @return materialDemandSeries
  */
  @Valid 
  @Schema(name = "materialDemandSeries", required = false)
  public MaterialDemandSeries getMaterialDemandSeries() {
    return materialDemandSeries;
  }

  public void setMaterialDemandSeries(MaterialDemandSeries materialDemandSeries) {
    this.materialDemandSeries = materialDemandSeries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialDemandRequest materialDemandRequest = (MaterialDemandRequest) o;
    return Objects.equals(this.materialDescriptionCustomer, materialDemandRequest.materialDescriptionCustomer) &&
        Objects.equals(this.materialNumberCustomer, materialDemandRequest.materialNumberCustomer) &&
        Objects.equals(this.materialNumberSupplier, materialDemandRequest.materialNumberSupplier) &&
        Objects.equals(this.customerId, materialDemandRequest.customerId) &&
        Objects.equals(this.supplierId, materialDemandRequest.supplierId) &&
        Objects.equals(this.unitMeasureId, materialDemandRequest.unitMeasureId) &&
        Objects.equals(this.materialDemandSeries, materialDemandRequest.materialDemandSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialDescriptionCustomer, materialNumberCustomer, materialNumberSupplier, customerId, supplierId, unitMeasureId, materialDemandSeries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialDemandRequest {\n");
    sb.append("    materialDescriptionCustomer: ").append(toIndentedString(materialDescriptionCustomer)).append("\n");
    sb.append("    materialNumberCustomer: ").append(toIndentedString(materialNumberCustomer)).append("\n");
    sb.append("    materialNumberSupplier: ").append(toIndentedString(materialNumberSupplier)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
    sb.append("    unitMeasureId: ").append(toIndentedString(unitMeasureId)).append("\n");
    sb.append("    materialDemandSeries: ").append(toIndentedString(materialDemandSeries)).append("\n");
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

