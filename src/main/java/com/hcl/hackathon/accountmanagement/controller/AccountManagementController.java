package com.hcl.hackathon.accountmanagement.controller;
import com.hcl.hackathon.accountmanagement.model.AccountDetailVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


/**
 * The type Account management controller.
 */
@RequestMapping("/api/v1")
@Tag(name = "account-management", description = "Account Management API")
@RestController
public class AccountManagementController {

    @Operation(summary = "Add a new Credit")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200, description = Credit created",
                    content = @Content(schema = @Schema(implementation = AccountDetailVO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "409", description = "Credit already exists")})
    @PostMapping(value = "/account", consumes = {"application/json"})
    public String createAccount(
            @Parameter(description = "Credit to add. Cannot null or empty.",
                    required = true, schema = @Schema(implementation = AccountDetailVO.class))
            @Valid @RequestBody AccountDetailVO accountDetailVO) {
        return null;
    }



}
