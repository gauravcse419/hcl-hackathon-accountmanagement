package com.hcl.hackathon.accountmanagement.exception;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * The type Resource not found exception.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
@Data
public class ResourceNotFoundException extends RuntimeException {
    private final int errorCode;
    private final String errorMessage;

    /**
     * Instantiates a new Resource not found exception.
     *
     * @param errorCode    the error code
     * @param errorMessage the error message
     */
    public ResourceNotFoundException(int errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
