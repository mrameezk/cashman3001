package com.praticalsession.CashMan_3001.enumeration;

import com.praticalsession.CashMan_3001.interfaces.Money;

import java.math.BigDecimal;
import java.util.Currency;

import static com.praticalsession.CashMan_3001.util.Constants.AUD;

public enum Coin implements Money {
    TWENTY(AUD, 0.20),
    FIFTY(AUD, 0.50),
    FIVE(AUD, 0.05),
    TEN(AUD, 0.10),
    ONE(AUD, 1),
    TWO(AUD, 2);

    private Currency currency;
    private BigDecimal value;

    Coin(String currencyCode, double value) {
        this.currency = Currency.getInstance(currencyCode);
        this.value = BigDecimal.valueOf(value);
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
