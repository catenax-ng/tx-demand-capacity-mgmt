package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.CompanyDto;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.DemandCategoryResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LinkedDemandSeriesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class LinkedDemandSeriesResponse {

  @JsonProperty("demandCategory")
  private DemandCategoryResponse demandCategory;

  @JsonProperty("customerLocation")
  private CompanyDto customerLocation;

  @JsonProperty("materialNumberSupplier")
  private String materialNumberSupplier;

  @JsonProperty("materialNumberCustomer")
  private String materialNumberCustomer;

  public LinkedDemandSeriesResponse demandCategory(DemandCategoryResponse demandCategory) {
    this.demandCategory = demandCategory;
    return this;
  }

  /**
   * Get demandCategory
   * @return demandCategory
  */
  @Valid 
  @Schema(name = "demandCategory", required = false)
  public DemandCategoryResponse getDemandCategory() {
    return demandCategory;
  }

  public void setDemandCategory(DemandCategoryResponse demandCategory) {
    this.demandCategory = demandCategory;
  }

  public LinkedDemandSeriesResponse customerLocation(CompanyDto customerLocation) {
    this.customerLocation = customerLocation;
    return this;
  }

  /**
   * Get customerLocation
   * @return customerLocation
  */
  @Valid 
  @Schema(name = "customerLocation", required = false)
  public CompanyDto getCustomerLocation() {
    return customerLocation;
  }

  public void setCustomerLocation(CompanyDto customerLocation) {
    this.customerLocation = customerLocation;
  }

  public LinkedDemandSeriesResponse materialNumberSupplier(String materialNumberSupplier) {
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

  public LinkedDemandSeriesResponse materialNumberCustomer(String materialNumberCustomer) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedDemandSeriesResponse linkedDemandSeriesResponse = (LinkedDemandSeriesResponse) o;
    return Objects.equals(this.demandCategory, linkedDemandSeriesResponse.demandCategory) &&
        Objects.equals(this.customerLocation, linkedDemandSeriesResponse.customerLocation) &&
        Objects.equals(this.materialNumberSupplier, linkedDemandSeriesResponse.materialNumberSupplier) &&
        Objects.equals(this.materialNumberCustomer, linkedDemandSeriesResponse.materialNumberCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demandCategory, customerLocation, materialNumberSupplier, materialNumberCustomer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedDemandSeriesResponse {\n");
    sb.append("    demandCategory: ").append(toIndentedString(demandCategory)).append("\n");
    sb.append("    customerLocation: ").append(toIndentedString(customerLocation)).append("\n");
    sb.append("    materialNumberSupplier: ").append(toIndentedString(materialNumberSupplier)).append("\n");
    sb.append("    materialNumberCustomer: ").append(toIndentedString(materialNumberCustomer)).append("\n");
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

