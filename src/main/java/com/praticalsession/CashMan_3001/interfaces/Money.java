package com.praticalsession.CashMan_3001.interfaces;

import java.math.BigDecimal;
import java.util.Currency;

public interface Money {

    BigDecimal getValue();

    Currency getCurrency();

}
