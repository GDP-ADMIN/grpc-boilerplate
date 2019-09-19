package com.muhtar.demo.common.exception;

import org.springframework.http.HttpStatus;

public abstract class CustomException extends Exception {
    public abstract HttpStatus getStatusCode();
    public abstract String getErrorCode();
    public abstract String getErrorMessage();
}
