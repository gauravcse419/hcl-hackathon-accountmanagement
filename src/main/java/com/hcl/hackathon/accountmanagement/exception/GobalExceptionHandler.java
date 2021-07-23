package com.hcl.hackathon.accountmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * The type Gobal exception handler.
 */
@RestControllerAdvice
public class GobalExceptionHandler {

    /**
     * Handle 404 error error response.
     *
     * @param e the e
     * @return the error response
     */
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorResponse handle404Error(ResourceNotFoundException e) {
        return new ErrorResponse(e.getErrorCode(), e.getErrorMessage());

    }

    /**
     * Handle 400 error error response.
     *
     * @param e the e
     * @return the error response
     */
    @ExceptionHandler(BadRequest.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResponse handle400Error(BadRequest e) {
        return new ErrorResponse(e.getErrorCode(), e.getErrorMessage());
    }


    /**
     * Handle 412 error error response.
     *
     * @param e the e
     * @return the error response
     */
    @ExceptionHandler(AccountManagementException.class)
    @ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
    @ResponseBody
    public ErrorResponse handle404Error(AccountManagementException e) {
        return new ErrorResponse(e.getErrorCode(), e.getErrorMessage());

    }

    /**
     * Handle 500 error error response.
     *
     * @return the error response
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorResponse handle500Error() {
        return new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Unable to process the request please try after some time");

    }
}
