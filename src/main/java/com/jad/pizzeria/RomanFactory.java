package com.jad.pizzeria;

import com.jad.pizzeria.pizza.Pizza;
import com.jad.pizzeria.pizza.Roman;

public class RomanFactory extends PizzaFactory {

    protected RomanFactory() {
        super("Romaine");
    }

    @Override
    public Pizza make() {
        return new Roman();
    }
}
