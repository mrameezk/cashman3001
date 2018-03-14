package com.praticalsession.CashMan_3001.exceptions;

public class CurrencyCombinationException extends Exception {

    public CurrencyCombinationException(String message) {
        super(message);
    }

    public CurrencyCombinationException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
