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
 * CapacityResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CapacityResponse {

  @JsonProperty("actualCapacity")
  private BigDecimal actualCapacity;

  @JsonProperty("MaximumCapacity")
  private BigDecimal maximumCapacity;

  @JsonProperty("calendarWeek")
  private String calendarWeek;

  public CapacityResponse actualCapacity(BigDecimal actualCapacity) {
    this.actualCapacity = actualCapacity;
    return this;
  }

  /**
   * Get actualCapacity
   * @return actualCapacity
  */
  @Valid 
  @Schema(name = "actualCapacity", required = false)
  public BigDecimal getActualCapacity() {
    return actualCapacity;
  }

  public void setActualCapacity(BigDecimal actualCapacity) {
    this.actualCapacity = actualCapacity;
  }

  public CapacityResponse maximumCapacity(BigDecimal maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
    return this;
  }

  /**
   * Get maximumCapacity
   * @return maximumCapacity
  */
  @Valid 
  @Schema(name = "MaximumCapacity", required = false)
  public BigDecimal getMaximumCapacity() {
    return maximumCapacity;
  }

  public void setMaximumCapacity(BigDecimal maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
  }

  public CapacityResponse calendarWeek(String calendarWeek) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityResponse capacityResponse = (CapacityResponse) o;
    return Objects.equals(this.actualCapacity, capacityResponse.actualCapacity) &&
        Objects.equals(this.maximumCapacity, capacityResponse.maximumCapacity) &&
        Objects.equals(this.calendarWeek, capacityResponse.calendarWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualCapacity, maximumCapacity, calendarWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityResponse {\n");
    sb.append("    actualCapacity: ").append(toIndentedString(actualCapacity)).append("\n");
    sb.append("    maximumCapacity: ").append(toIndentedString(maximumCapacity)).append("\n");
    sb.append("    calendarWeek: ").append(toIndentedString(calendarWeek)).append("\n");
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

