package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.DemandCategoryDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LinkedDemandSeries
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class LinkedDemandSeries {

  @JsonProperty("materialNumberCustomer")
  private String materialNumberCustomer;

  @JsonProperty("materialNumberSupplier")
  private String materialNumberSupplier;

  @JsonProperty("customerLocation")
  private String customerLocation;

  @JsonProperty("demandCategory")
  private DemandCategoryDto demandCategory;

  public LinkedDemandSeries materialNumberCustomer(String materialNumberCustomer) {
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

  public LinkedDemandSeries materialNumberSupplier(String materialNumberSupplier) {
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

  public LinkedDemandSeries customerLocation(String customerLocation) {
    this.customerLocation = customerLocation;
    return this;
  }

  /**
   * Get customerLocation
   * @return customerLocation
  */
  
  @Schema(name = "customerLocation", required = false)
  public String getCustomerLocation() {
    return customerLocation;
  }

  public void setCustomerLocation(String customerLocation) {
    this.customerLocation = customerLocation;
  }

  public LinkedDemandSeries demandCategory(DemandCategoryDto demandCategory) {
    this.demandCategory = demandCategory;
    return this;
  }

  /**
   * Get demandCategory
   * @return demandCategory
  */
  @Valid 
  @Schema(name = "demandCategory", required = false)
  public DemandCategoryDto getDemandCategory() {
    return demandCategory;
  }

  public void setDemandCategory(DemandCategoryDto demandCategory) {
    this.demandCategory = demandCategory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedDemandSeries linkedDemandSeries = (LinkedDemandSeries) o;
    return Objects.equals(this.materialNumberCustomer, linkedDemandSeries.materialNumberCustomer) &&
        Objects.equals(this.materialNumberSupplier, linkedDemandSeries.materialNumberSupplier) &&
        Objects.equals(this.customerLocation, linkedDemandSeries.customerLocation) &&
        Objects.equals(this.demandCategory, linkedDemandSeries.demandCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialNumberCustomer, materialNumberSupplier, customerLocation, demandCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedDemandSeries {\n");
    sb.append("    materialNumberCustomer: ").append(toIndentedString(materialNumberCustomer)).append("\n");
    sb.append("    materialNumberSupplier: ").append(toIndentedString(materialNumberSupplier)).append("\n");
    sb.append("    customerLocation: ").append(toIndentedString(customerLocation)).append("\n");
    sb.append("    demandCategory: ").append(toIndentedString(demandCategory)).append("\n");
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

