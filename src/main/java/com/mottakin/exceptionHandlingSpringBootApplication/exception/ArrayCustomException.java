package com.mottakin.exceptionHandlingSpringBootApplication.exception;

public class ArrayCustomException extends Exception{
    private static final String MESSAGE = "You can not access the index";

    public ArrayCustomException() {
        super(MESSAGE);
    }

}
