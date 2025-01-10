package com.jad.pizzeria;

import com.jad.pizzeria.pizza.Neapolitan;
import com.jad.pizzeria.pizza.Pizza;

public class NeapolitanFactory extends PizzaFactory {

    protected NeapolitanFactory() {
        super("Napolitaine");
    }

    @Override
    public Pizza make() {
        return new Neapolitan();
    }
}
