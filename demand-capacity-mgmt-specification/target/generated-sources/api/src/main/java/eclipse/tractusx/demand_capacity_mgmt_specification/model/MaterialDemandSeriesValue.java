package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MaterialDemandSeriesValue
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class MaterialDemandSeriesValue {

  @JsonProperty("calendarWeek")
  private String calendarWeek;

  @JsonProperty("demand")
  private BigDecimal demand;

  public MaterialDemandSeriesValue calendarWeek(String calendarWeek) {
    this.calendarWeek = calendarWeek;
    return this;
  }

  /**
   * Get calendarWeek
   * @return calendarWeek
  */
  
  @Schema(name = "calendarWeek", required = false)
  public String getCalendarWeek() {
    return calendarWeek;
  }

  public void setCalendarWeek(String calendarWeek) {
    this.calendarWeek = calendarWeek;
  }

  public MaterialDemandSeriesValue demand(BigDecimal demand) {
    this.demand = demand;
    return this;
  }

  /**
   * Get demand
   * @return demand
  */
  @Valid 
  @Schema(name = "demand", required = false)
  public BigDecimal getDemand() {
    return demand;
  }

  public void setDemand(BigDecimal demand) {
    this.demand = demand;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialDemandSeriesValue materialDemandSeriesValue = (MaterialDemandSeriesValue) o;
    return Objects.equals(this.calendarWeek, materialDemandSeriesValue.calendarWeek) &&
        Objects.equals(this.demand, materialDemandSeriesValue.demand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendarWeek, demand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialDemandSeriesValue {\n");
    sb.append("    calendarWeek: ").append(toIndentedString(calendarWeek)).append("\n");
    sb.append("    demand: ").append(toIndentedString(demand)).append("\n");
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

