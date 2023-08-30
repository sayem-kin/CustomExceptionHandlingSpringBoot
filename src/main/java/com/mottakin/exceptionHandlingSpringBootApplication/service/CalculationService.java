package com.mottakin.exceptionHandlingSpringBootApplication.service;

import com.mottakin.exceptionHandlingSpringBootApplication.exception.*;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {
    public Integer divide(Integer a, Integer b) throws ArithmeticException {
        return a / b;
    }

    public Integer subtract(Integer a, Integer b) throws CustomExceptionTwo {
        int result = a - b;
        if (result <= 0) {
            throw new CustomExceptionTwo();
        }
        return result;
    }
    public Integer oddNumber(Integer a, Integer b) throws OddNumberCustomException {
        int result = a - b;
        if (result%2 ==0) {
            throw new OddNumberCustomException();
        }
        return result;
    }
    public Integer enoughMoney(Integer a, Integer b) throws SortageOfMoneyCustomException {
        boolean s = (a<b);
        if (s) {
            throw new SortageOfMoneyCustomException();
        }
        return a-b;
    }
    public Integer customArray(Integer[] array, Integer index) throws ArrayCustomException {
        if (index < 0 || index >= array.length) {
            throw new ArrayCustomException();
        }
        return array[index];
    }

    public Person castToPerson(Object obj) throws CustomCastException {
        if (obj instanceof Person) {
            return (Person) obj;
        } else {
            throw new CustomCastException();
        }
    }
    public String getHumanNameById(int id) throws CustomNullPointerException{
        try {
            String name = null;
            return name.toUpperCase();
        } catch (NullPointerException e) {
            throw new CustomNullPointerException();
        }
    }




}

