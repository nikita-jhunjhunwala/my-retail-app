package com.target.assessment.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class MyRetailApplicationException extends Exception {

    public MyRetailApplicationException(String message) {
        super(message);
    }

    public MyRetailApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
