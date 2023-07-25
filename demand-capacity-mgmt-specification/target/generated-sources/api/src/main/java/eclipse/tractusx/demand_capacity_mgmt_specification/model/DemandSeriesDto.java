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
 * DemandSeriesDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DemandSeriesDto {

  @JsonProperty("demand")
  private String demand;

  @JsonProperty("calendarWeek")
  private String calendarWeek;

  public DemandSeriesDto demand(String demand) {
    this.demand = demand;
    return this;
  }

  /**
   * Get demand
   * @return demand
  */
  
  @Schema(name = "demand", required = false)
  public String getDemand() {
    return demand;
  }

  public void setDemand(String demand) {
    this.demand = demand;
  }

  public DemandSeriesDto calendarWeek(String calendarWeek) {
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
    DemandSeriesDto demandSeriesDto = (DemandSeriesDto) o;
    return Objects.equals(this.demand, demandSeriesDto.demand) &&
        Objects.equals(this.calendarWeek, demandSeriesDto.calendarWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demand, calendarWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandSeriesDto {\n");
    sb.append("    demand: ").append(toIndentedString(demand)).append("\n");
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

