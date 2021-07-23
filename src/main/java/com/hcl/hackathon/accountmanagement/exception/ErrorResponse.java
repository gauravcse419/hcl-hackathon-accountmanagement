package com.hcl.hackathon.accountmanagement.exception;

import lombok.Data;

/**
 * The type Error response.
 */
@Data
public class ErrorResponse {
    private int errorCode;
    private String errorMessage;

    /**
     * Instantiates a new Error response.
     *
     * @param errorCode    the error code
     * @param errorMessage the error message
     */
    public ErrorResponse(int errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
