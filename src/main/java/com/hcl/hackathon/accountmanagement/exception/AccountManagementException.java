package com.hcl.hackathon.accountmanagement.exception;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * The type Account management exception.
 */
@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
@Data
public class AccountManagementException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private int errorCode;
    private String errorMessage;

    /**
     * Instantiates a new Account management exception.
     *
     * @param errorCode    the error code
     * @param errorMessage the error message
     */
    public AccountManagementException(int errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
