package com.hcl.hackathon.accountmanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmploymentDetail {
    @JsonProperty("title")
    private String employmentStatus;
    @JsonProperty("title")
    private Double occupation;
    @JsonProperty("title")
    private String contractType;
    @JsonProperty("title")
    private String startDate;
}
