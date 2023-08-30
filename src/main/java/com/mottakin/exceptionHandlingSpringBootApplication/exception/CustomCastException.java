package com.mottakin.exceptionHandlingSpringBootApplication.exception;

public class CustomCastException extends Exception{
    private static final String MESSAGE = "You can not cast obj to Person";

    public CustomCastException() {
        super(MESSAGE);
    }
}
