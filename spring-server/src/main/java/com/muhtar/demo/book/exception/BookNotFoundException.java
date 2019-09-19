package com.muhtar.demo.book.exception;

import com.muhtar.demo.common.exception.CustomException;
import org.springframework.http.HttpStatus;

public class BookNotFoundException extends CustomException {
    private static final String ERROR_CODE = "ERROR_BOOK_NOT_FOUND";
    private static final String ERROR_MESSAGE = "Book not found";

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.NOT_FOUND;
    }

    @Override
    public String getErrorCode() {
        return ERROR_CODE;
    }

    @Override
    public String getErrorMessage() {
        return ERROR_MESSAGE;
    }
}
