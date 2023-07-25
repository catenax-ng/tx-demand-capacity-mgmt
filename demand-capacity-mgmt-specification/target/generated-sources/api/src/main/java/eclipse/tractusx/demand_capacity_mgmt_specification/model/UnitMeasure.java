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
 * UnitMeasure
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UnitMeasure {

  @JsonProperty("id")
  private String id;

  @JsonProperty("codeValue")
  private String codeValue;

  @JsonProperty("displayValue")
  private String displayValue;

  public UnitMeasure id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UnitMeasure codeValue(String codeValue) {
    this.codeValue = codeValue;
    return this;
  }

  /**
   * Get codeValue
   * @return codeValue
  */
  
  @Schema(name = "codeValue", required = false)
  public String getCodeValue() {
    return codeValue;
  }

  public void setCodeValue(String codeValue) {
    this.codeValue = codeValue;
  }

  public UnitMeasure displayValue(String displayValue) {
    this.displayValue = displayValue;
    return this;
  }

  /**
   * Get displayValue
   * @return displayValue
  */
  
  @Schema(name = "displayValue", required = false)
  public String getDisplayValue() {
    return displayValue;
  }

  public void setDisplayValue(String displayValue) {
    this.displayValue = displayValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitMeasure unitMeasure = (UnitMeasure) o;
    return Objects.equals(this.id, unitMeasure.id) &&
        Objects.equals(this.codeValue, unitMeasure.codeValue) &&
        Objects.equals(this.displayValue, unitMeasure.displayValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codeValue, displayValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitMeasure {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codeValue: ").append(toIndentedString(codeValue)).append("\n");
    sb.append("    displayValue: ").append(toIndentedString(displayValue)).append("\n");
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

