package com.example.demo.common.handler;

import com.example.demo.common.exception.CustomException;
import com.example.demo.common.response.CustomErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        FieldError fieldError = ex.getBindingResult().getFieldErrors().get(0);
        CustomErrorResponse error = new CustomErrorResponse();
        error.setMessage(fieldError.getField() + " " + fieldError.getDefaultMessage());
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setCode("ERROR_VALIDATION_" + fieldError.getField().toUpperCase());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<CustomErrorResponse> customExceptionHandle(CustomException ex, WebRequest request) {
        CustomErrorResponse errors = new CustomErrorResponse();
        errors.setMessage(ex.getErrorMessage());
        errors.setCode(ex.getErrorCode());
        errors.setStatus(ex.getStatusCode().value());
        return new ResponseEntity<>(errors, ex.getStatusCode());
    }
}
