package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * MaterialDemandSeries
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class MaterialDemandSeries {

  @JsonProperty("customerLocationId")
  private String customerLocationId;

  @JsonProperty("expectedSupplierLocationId")
  @Valid
  private List<String> expectedSupplierLocationId = null;

  @JsonProperty("demandCategoryId")
  private String demandCategoryId;

  @JsonProperty("demandSeriesValues")
  @Valid
  private List<MaterialDemandSeriesValue> demandSeriesValues = null;

  public MaterialDemandSeries customerLocationId(String customerLocationId) {
    this.customerLocationId = customerLocationId;
    return this;
  }

  /**
   * Get customerLocationId
   * @return customerLocationId
  */
  
  @Schema(name = "customerLocationId", required = false)
  public String getCustomerLocationId() {
    return customerLocationId;
  }

  public void setCustomerLocationId(String customerLocationId) {
    this.customerLocationId = customerLocationId;
  }

  public MaterialDemandSeries expectedSupplierLocationId(List<String> expectedSupplierLocationId) {
    this.expectedSupplierLocationId = expectedSupplierLocationId;
    return this;
  }

  public MaterialDemandSeries addExpectedSupplierLocationIdItem(String expectedSupplierLocationIdItem) {
    if (this.expectedSupplierLocationId == null) {
      this.expectedSupplierLocationId = new ArrayList<>();
    }
    this.expectedSupplierLocationId.add(expectedSupplierLocationIdItem);
    return this;
  }

  /**
   * Get expectedSupplierLocationId
   * @return expectedSupplierLocationId
  */
  
  @Schema(name = "expectedSupplierLocationId", required = false)
  public List<String> getExpectedSupplierLocationId() {
    return expectedSupplierLocationId;
  }

  public void setExpectedSupplierLocationId(List<String> expectedSupplierLocationId) {
    this.expectedSupplierLocationId = expectedSupplierLocationId;
  }

  public MaterialDemandSeries demandCategoryId(String demandCategoryId) {
    this.demandCategoryId = demandCategoryId;
    return this;
  }

  /**
   * Get demandCategoryId
   * @return demandCategoryId
  */
  
  @Schema(name = "demandCategoryId", required = false)
  public String getDemandCategoryId() {
    return demandCategoryId;
  }

  public void setDemandCategoryId(String demandCategoryId) {
    this.demandCategoryId = demandCategoryId;
  }

  public MaterialDemandSeries demandSeriesValues(List<MaterialDemandSeriesValue> demandSeriesValues) {
    this.demandSeriesValues = demandSeriesValues;
    return this;
  }

  public MaterialDemandSeries addDemandSeriesValuesItem(MaterialDemandSeriesValue demandSeriesValuesItem) {
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
    MaterialDemandSeries materialDemandSeries = (MaterialDemandSeries) o;
    return Objects.equals(this.customerLocationId, materialDemandSeries.customerLocationId) &&
        Objects.equals(this.expectedSupplierLocationId, materialDemandSeries.expectedSupplierLocationId) &&
        Objects.equals(this.demandCategoryId, materialDemandSeries.demandCategoryId) &&
        Objects.equals(this.demandSeriesValues, materialDemandSeries.demandSeriesValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerLocationId, expectedSupplierLocationId, demandCategoryId, demandSeriesValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialDemandSeries {\n");
    sb.append("    customerLocationId: ").append(toIndentedString(customerLocationId)).append("\n");
    sb.append("    expectedSupplierLocationId: ").append(toIndentedString(expectedSupplierLocationId)).append("\n");
    sb.append("    demandCategoryId: ").append(toIndentedString(demandCategoryId)).append("\n");
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

