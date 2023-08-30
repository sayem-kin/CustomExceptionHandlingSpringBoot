package com.mottakin.exceptionHandlingSpringBootApplication.controller;

import com.mottakin.exceptionHandlingSpringBootApplication.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({CustomExceptionTwo.class})
    public ResponseEntity<?> handleException() {
        return new ResponseEntity<>(new CustomExceptionTwo().getMessage(),HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({SortageOfMoneyCustomException.class})
    public ResponseEntity<?> handleExceptionTwo() {
        return new ResponseEntity<>(new SortageOfMoneyCustomException().getMessage(),HttpStatus.CREATED);
    }
    @ExceptionHandler({OddNumberCustomException.class})
    public ResponseEntity<?> handleExceptionOne() {
        return new ResponseEntity<>(new OddNumberCustomException().getMessage(),HttpStatus.CONTINUE);
    }

    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<?> handleArithmeticException() {
        return new ResponseEntity<>(new CustomException().getMessage(), HttpStatus.CONFLICT);
    }
    @ExceptionHandler({ArrayCustomException.class})
    public ResponseEntity<?> handleArrayException() {
        return new ResponseEntity<>(new ArrayCustomException().getMessage(), HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }
    @ExceptionHandler({CustomCastException.class})
    public ResponseEntity<?> handleCastException() {
        return new ResponseEntity<>(new CustomCastException().getMessage(), HttpStatus.ACCEPTED);
    }

    @ExceptionHandler({CustomNullPointerException.class})
    public ResponseEntity<?> handleNullException() {
        return new ResponseEntity<>(new CustomNullPointerException().getMessage(), HttpStatus.ALREADY_REPORTED);
    }
}
