package org.thymeleaf.sample.model;

public class PageElement{
    PriceElement prices;

    public PageElement(PriceElement prices) {
        this.prices = prices;
    }

    public PriceElement getPrices() {
        return prices;
    }

    public void setPrices(PriceElement prices) {
        this.prices = prices;
    }
}
