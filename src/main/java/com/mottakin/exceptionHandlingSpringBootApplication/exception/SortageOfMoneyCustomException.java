package com.mottakin.exceptionHandlingSpringBootApplication.exception;

public class SortageOfMoneyCustomException extends Exception{
    private static final String MESSAGE = "You do not have enough money to widrow. ";

    public SortageOfMoneyCustomException() {
        super(MESSAGE);
    }

}
