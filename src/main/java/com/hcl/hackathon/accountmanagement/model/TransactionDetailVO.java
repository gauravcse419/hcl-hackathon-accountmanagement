package com.hcl.hackathon.accountmanagement.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class TransactionDetailVO {

    @NotNull(message = "Account no is Mandatory")
    @Schema(description = "accountNo",
            example = "AB12345")
    String accountNo;

    @NotNull(message = "Transaction Type is Mandatory")
    @Schema(description = "Transaction Type",
            example = "Debit")
    String transactionType;

    @NotNull(message = "Amount is Mandatory")
    @Schema(description = "Amount",
            example = "1527.54")
    Double amount;

    @Schema(description = "description",
            example = "Paying Loan EMI")
    String description;


}
