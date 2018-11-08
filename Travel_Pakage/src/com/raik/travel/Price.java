package com.raik.travel;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

/**
 * Created by Rea1 on 25.09.2018.
 */
public class Price {

    private BigDecimal cost;
    private Currency currency;

    public Price(BigDecimal cost) {
        this.cost = cost;
        this.currency = Currency.getInstance(Locale.US);
    }

    public Price(BigDecimal cost, Currency currency) {
        this.cost = cost;
        this.currency = currency;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
    
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


}
