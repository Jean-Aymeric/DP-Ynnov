package com.jad.pizzeria;

import com.jad.pizzeria.pizza.Pizza;

public abstract class PizzaFactory {
    private final String pizzaMadeName;

    protected PizzaFactory(final String pizzaMadeName) {
        this.pizzaMadeName = pizzaMadeName;
    }

    public abstract Pizza make();

    public boolean doYouMakeThis(final String pizzaMadeName) {
        return this.pizzaMadeName.equals(pizzaMadeName);
    }

    public String getPizzaMadeName() {
        return this.pizzaMadeName;
    }
}
