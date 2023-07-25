package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CapacitiesDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CapacitiesDto {

  @JsonProperty("calendarWeek")
  private String calendarWeek;

  @JsonProperty("actualCapacity")
  private String actualCapacity;

  @JsonProperty("maximumCapacity")
  private String maximumCapacity;

  public CapacitiesDto calendarWeek(String calendarWeek) {
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

  public CapacitiesDto actualCapacity(String actualCapacity) {
    this.actualCapacity = actualCapacity;
    return this;
  }

  /**
   * Get actualCapacity
   * @return actualCapacity
  */
  
  @Schema(name = "actualCapacity", required = false)
  public String getActualCapacity() {
    return actualCapacity;
  }

  public void setActualCapacity(String actualCapacity) {
    this.actualCapacity = actualCapacity;
  }

  public CapacitiesDto maximumCapacity(String maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
    return this;
  }

  /**
   * Get maximumCapacity
   * @return maximumCapacity
  */
  
  @Schema(name = "maximumCapacity", required = false)
  public String getMaximumCapacity() {
    return maximumCapacity;
  }

  public void setMaximumCapacity(String maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacitiesDto capacitiesDto = (CapacitiesDto) o;
    return Objects.equals(this.calendarWeek, capacitiesDto.calendarWeek) &&
        Objects.equals(this.actualCapacity, capacitiesDto.actualCapacity) &&
        Objects.equals(this.maximumCapacity, capacitiesDto.maximumCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendarWeek, actualCapacity, maximumCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacitiesDto {\n");
    sb.append("    calendarWeek: ").append(toIndentedString(calendarWeek)).append("\n");
    sb.append("    actualCapacity: ").append(toIndentedString(actualCapacity)).append("\n");
    sb.append("    maximumCapacity: ").append(toIndentedString(maximumCapacity)).append("\n");
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

