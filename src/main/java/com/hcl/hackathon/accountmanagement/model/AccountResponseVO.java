package com.hcl.hackathon.accountmanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccountResponseVO {
    @JsonProperty("accountNo")
    private String accountNo;
    @JsonProperty("mortgageNo")
    private String mortgageNo;
    @JsonProperty("userId")
    private String userId;

}
