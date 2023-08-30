package com.mottakin.exceptionHandlingSpringBootApplication.exception;

public class CustomNullPointerException extends Exception {
    private static final String MESSAGE = "Custom Null Pointer Exception";

    public CustomNullPointerException() {
        super(MESSAGE);
    }
}
