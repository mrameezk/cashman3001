package com.praticalsession.CashMan_3001.enumeration;

import com.praticalsession.CashMan_3001.interfaces.Money;

import java.math.BigDecimal;
import java.util.Currency;

import static com.praticalsession.CashMan_3001.util.Constants.AUD;

public enum Note implements Money {
    HUNDRED(AUD, 100),
    FIFTY(AUD, 50),
    TWENTY(AUD, 20),
    TEN(AUD, 10),
    FIVE(AUD, 5);

    private Currency currency;
    private BigDecimal value;

    Note(String currencyCode, int value) {
        this.currency = Currency.getInstance(currencyCode);
        this.value = new BigDecimal(value);
    }

    public BigDecimal getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", getCurrency().getCurrencyCode(), getValue());
    }

}
