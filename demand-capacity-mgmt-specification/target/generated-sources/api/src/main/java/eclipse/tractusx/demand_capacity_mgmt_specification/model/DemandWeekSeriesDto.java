package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.DemandSeriesCategoryDto;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.DemandSeriesDto;
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
 * DemandWeekSeriesDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DemandWeekSeriesDto {

  @JsonProperty("expectedSupplierLocation")
  private String expectedSupplierLocation;

  @JsonProperty("demands")
  @Valid
  private List<DemandSeriesDto> demands = null;

  @JsonProperty("customerLocation")
  private String customerLocation;

  @JsonProperty("demandCategory")
  private DemandSeriesCategoryDto demandCategory;

  public DemandWeekSeriesDto expectedSupplierLocation(String expectedSupplierLocation) {
    this.expectedSupplierLocation = expectedSupplierLocation;
    return this;
  }

  /**
   * Get expectedSupplierLocation
   * @return expectedSupplierLocation
  */
  
  @Schema(name = "expectedSupplierLocation", required = false)
  public String getExpectedSupplierLocation() {
    return expectedSupplierLocation;
  }

  public void setExpectedSupplierLocation(String expectedSupplierLocation) {
    this.expectedSupplierLocation = expectedSupplierLocation;
  }

  public DemandWeekSeriesDto demands(List<DemandSeriesDto> demands) {
    this.demands = demands;
    return this;
  }

  public DemandWeekSeriesDto addDemandsItem(DemandSeriesDto demandsItem) {
    if (this.demands == null) {
      this.demands = new ArrayList<>();
    }
    this.demands.add(demandsItem);
    return this;
  }

  /**
   * Get demands
   * @return demands
  */
  @Valid 
  @Schema(name = "demands", required = false)
  public List<DemandSeriesDto> getDemands() {
    return demands;
  }

  public void setDemands(List<DemandSeriesDto> demands) {
    this.demands = demands;
  }

  public DemandWeekSeriesDto customerLocation(String customerLocation) {
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

  public DemandWeekSeriesDto demandCategory(DemandSeriesCategoryDto demandCategory) {
    this.demandCategory = demandCategory;
    return this;
  }

  /**
   * Get demandCategory
   * @return demandCategory
  */
  @Valid 
  @Schema(name = "demandCategory", required = false)
  public DemandSeriesCategoryDto getDemandCategory() {
    return demandCategory;
  }

  public void setDemandCategory(DemandSeriesCategoryDto demandCategory) {
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
    DemandWeekSeriesDto demandWeekSeriesDto = (DemandWeekSeriesDto) o;
    return Objects.equals(this.expectedSupplierLocation, demandWeekSeriesDto.expectedSupplierLocation) &&
        Objects.equals(this.demands, demandWeekSeriesDto.demands) &&
        Objects.equals(this.customerLocation, demandWeekSeriesDto.customerLocation) &&
        Objects.equals(this.demandCategory, demandWeekSeriesDto.demandCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedSupplierLocation, demands, customerLocation, demandCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandWeekSeriesDto {\n");
    sb.append("    expectedSupplierLocation: ").append(toIndentedString(expectedSupplierLocation)).append("\n");
    sb.append("    demands: ").append(toIndentedString(demands)).append("\n");
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

