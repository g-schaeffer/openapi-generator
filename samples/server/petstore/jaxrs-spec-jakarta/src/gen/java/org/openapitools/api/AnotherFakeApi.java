/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:47.452Z[UTC]
 */

package org.openapitools.api;

import org.openapitools.model.Client;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/another-fake/dummy")
@Api(description = "the another-fake API")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")

public class AnotherFakeApi {

    @PATCH
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "To test special tags", notes = "To test special tags and operation ID starting with number", response = Client.class, tags={ "$another-fake?" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Client.class)
    })
    public Response call123testSpecialTags(@Valid @NotNull Client body) {
        return Response.ok().entity("magic!").build();
    }
}
