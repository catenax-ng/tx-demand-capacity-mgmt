package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.CompanyDto;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.DemandCategoryResponse;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.MaterialDemandSeriesValue;
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
 * MaterialDemandSeriesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class MaterialDemandSeriesResponse {

  @JsonProperty("customerLocation")
  private CompanyDto customerLocation;

  @JsonProperty("expectedSupplierLocation")
  @Valid
  private List<CompanyDto> expectedSupplierLocation = null;

  @JsonProperty("demandCategory")
  private DemandCategoryResponse demandCategory;

  @JsonProperty("demandSeriesValues")
  @Valid
  private List<MaterialDemandSeriesValue> demandSeriesValues = null;

  public MaterialDemandSeriesResponse customerLocation(CompanyDto customerLocation) {
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

  public MaterialDemandSeriesResponse expectedSupplierLocation(List<CompanyDto> expectedSupplierLocation) {
    this.expectedSupplierLocation = expectedSupplierLocation;
    return this;
  }

  public MaterialDemandSeriesResponse addExpectedSupplierLocationItem(CompanyDto expectedSupplierLocationItem) {
    if (this.expectedSupplierLocation == null) {
      this.expectedSupplierLocation = new ArrayList<>();
    }
    this.expectedSupplierLocation.add(expectedSupplierLocationItem);
    return this;
  }

  /**
   * Get expectedSupplierLocation
   * @return expectedSupplierLocation
  */
  @Valid 
  @Schema(name = "expectedSupplierLocation", required = false)
  public List<CompanyDto> getExpectedSupplierLocation() {
    return expectedSupplierLocation;
  }

  public void setExpectedSupplierLocation(List<CompanyDto> expectedSupplierLocation) {
    this.expectedSupplierLocation = expectedSupplierLocation;
  }

  public MaterialDemandSeriesResponse demandCategory(DemandCategoryResponse demandCategory) {
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

  public MaterialDemandSeriesResponse demandSeriesValues(List<MaterialDemandSeriesValue> demandSeriesValues) {
    this.demandSeriesValues = demandSeriesValues;
    return this;
  }

  public MaterialDemandSeriesResponse addDemandSeriesValuesItem(MaterialDemandSeriesValue demandSeriesValuesItem) {
    if (this.demandSeriesValues == null) {
      this.demandSeriesValues = new ArrayList<>();
    }
    this.demandSeriesValues.add(demandSeriesValuesItem);
    return this;
  }

  /**
   * Get demandSeriesValues
   * @return demandSeriesValues
  */
  @Valid 
  @Schema(name = "demandSeriesValues", required = false)
  public List<MaterialDemandSeriesValue> getDemandSeriesValues() {
    return demandSeriesValues;
  }

  public void setDemandSeriesValues(List<MaterialDemandSeriesValue> demandSeriesValues) {
    this.demandSeriesValues = demandSeriesValues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialDemandSeriesResponse materialDemandSeriesResponse = (MaterialDemandSeriesResponse) o;
    return Objects.equals(this.customerLocation, materialDemandSeriesResponse.customerLocation) &&
        Objects.equals(this.expectedSupplierLocation, materialDemandSeriesResponse.expectedSupplierLocation) &&
        Objects.equals(this.demandCategory, materialDemandSeriesResponse.demandCategory) &&
        Objects.equals(this.demandSeriesValues, materialDemandSeriesResponse.demandSeriesValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerLocation, expectedSupplierLocation, demandCategory, demandSeriesValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialDemandSeriesResponse {\n");
    sb.append("    customerLocation: ").append(toIndentedString(customerLocation)).append("\n");
    sb.append("    expectedSupplierLocation: ").append(toIndentedString(expectedSupplierLocation)).append("\n");
    sb.append("    demandCategory: ").append(toIndentedString(demandCategory)).append("\n");
    sb.append("    demandSeriesValues: ").append(toIndentedString(demandSeriesValues)).append("\n");
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

