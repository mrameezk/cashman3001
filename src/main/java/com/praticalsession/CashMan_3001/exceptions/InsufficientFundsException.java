package com.praticalsession.CashMan_3001.exceptions;

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
