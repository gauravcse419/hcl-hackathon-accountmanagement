package com.hcl.hackathon.accountmanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApplicantDetails {
    @JsonProperty("title")
    private String title;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private Double lastName;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("contactNo")
    private String contactNo;
    @JsonProperty("emailId")
    private String emailId;
}
