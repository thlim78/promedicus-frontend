package com.promedicus.frontend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidURLException extends RuntimeException {

    public InvalidURLException(String message) {
        super(message);
    }

    public InvalidURLException(String message, Throwable cause) {
        super(message, cause);
    }
}
