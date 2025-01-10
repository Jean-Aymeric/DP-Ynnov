package com.jad.pizzeria;

import com.jad.pizzeria.pizza.FourCheeses;
import com.jad.pizzeria.pizza.Pizza;

public class FourCheeseFactory extends PizzaFactory {

    protected FourCheeseFactory() {
        super("4 Fromages");
    }

    @Override
    public Pizza make() {
        return new FourCheeses();
    }
}
