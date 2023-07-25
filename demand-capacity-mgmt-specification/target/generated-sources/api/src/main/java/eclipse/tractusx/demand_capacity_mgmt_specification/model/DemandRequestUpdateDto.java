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
 * DemandRequestUpdateDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DemandRequestUpdateDto {

  @JsonProperty("actualDemand")
  private BigDecimal actualDemand;

  public DemandRequestUpdateDto actualDemand(BigDecimal actualDemand) {
    this.actualDemand = actualDemand;
    return this;
  }

  /**
   * Get actualDemand
   * @return actualDemand
  */
  @Valid 
  @Schema(name = "actualDemand", required = false)
  public BigDecimal getActualDemand() {
    return actualDemand;
  }

  public void setActualDemand(BigDecimal actualDemand) {
    this.actualDemand = actualDemand;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemandRequestUpdateDto demandRequestUpdateDto = (DemandRequestUpdateDto) o;
    return Objects.equals(this.actualDemand, demandRequestUpdateDto.actualDemand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualDemand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandRequestUpdateDto {\n");
    sb.append("    actualDemand: ").append(toIndentedString(actualDemand)).append("\n");
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

