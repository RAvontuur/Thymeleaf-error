package org.thymeleaf.sample.model;

import java.math.BigDecimal;

public class PriceElement{
    String currency;
    BigDecimal amount;

    public PriceElement(String currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
