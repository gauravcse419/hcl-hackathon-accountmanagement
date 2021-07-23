package com.hcl.hackathon.accountmanagement.exception;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The type Bad request.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
@Data
public class BadRequest extends RuntimeException {
    private final int errorCode;
    private final String errorMessage;

    /**
     * Instantiates a new Bad request.
     *
     * @param errorCode    the error code
     * @param errorMessage the error message
     */
    public BadRequest(int errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
