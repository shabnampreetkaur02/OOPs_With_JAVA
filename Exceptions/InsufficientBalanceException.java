package com.Bank.Exceptions;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message){
        super(message);
    }

}