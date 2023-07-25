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
 * DemandSeriesCategoryDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DemandSeriesCategoryDto {

  @JsonProperty("demandCategoryCode")
  private String demandCategoryCode;

  public DemandSeriesCategoryDto demandCategoryCode(String demandCategoryCode) {
    this.demandCategoryCode = demandCategoryCode;
    return this;
  }

  /**
   * Get demandCategoryCode
   * @return demandCategoryCode
  */
  
  @Schema(name = "demandCategoryCode", required = false)
  public String getDemandCategoryCode() {
    return demandCategoryCode;
  }

  public void setDemandCategoryCode(String demandCategoryCode) {
    this.demandCategoryCode = demandCategoryCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemandSeriesCategoryDto demandSeriesCategoryDto = (DemandSeriesCategoryDto) o;
    return Objects.equals(this.demandCategoryCode, demandSeriesCategoryDto.demandCategoryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demandCategoryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandSeriesCategoryDto {\n");
    sb.append("    demandCategoryCode: ").append(toIndentedString(demandCategoryCode)).append("\n");
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

