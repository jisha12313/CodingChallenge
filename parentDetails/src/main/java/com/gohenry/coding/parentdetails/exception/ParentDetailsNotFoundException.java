package com.gohenry.coding.parentdetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ParentDetailsNotFoundException extends RuntimeException {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ParentDetailsNotFoundException() {
        super();
    }

    public ParentDetailsNotFoundException(String message) {
        super(message);
    }

    public ParentDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}