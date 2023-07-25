/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package eclipse.tractusx.demand_capacity_mgmt_specification.api;

import java.util.List;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.WeekBasedMaterialDemandRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "WeekBasedMaterialDemand", description = "the WeekBasedMaterialDemand API")
public interface WeekBasedMaterialDemandApi {

    /**
     * POST /weekbasedmaterialdemand : weekBasedCapacityGroup
     *
     * @param weekBasedMaterialDemandRequestDto  (required)
     * @return weekBasedCapacityGroup endpoint (status code 200)
     */
    @Operation(
        operationId = "postWeekBasedMaterialDemand",
        summary = "weekBasedCapacityGroup",
        tags = { "weekBasedMaterialDemand" },
        responses = {
            @ApiResponse(responseCode = "200", description = "weekBasedCapacityGroup endpoint")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/weekbasedmaterialdemand",
        consumes = { "application/json" }
    )
    ResponseEntity<Void> postWeekBasedMaterialDemand(
        @Parameter(name = "WeekBasedMaterialDemandRequestDto", description = "", required = true) @Valid @RequestBody List<WeekBasedMaterialDemandRequestDto> weekBasedMaterialDemandRequestDto
    ) throws Exception;

}
