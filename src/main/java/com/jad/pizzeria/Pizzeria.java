package com.jad.pizzeria;

import com.jad.pizzeria.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private static Pizzeria instance = null;
    private final List<PizzaFactory> pizzaFactories = new ArrayList<>();

    private Pizzeria() {
        this.pizzaFactories.add(new FourCheeseFactory());
        this.pizzaFactories.add(new NeapolitanFactory());
        this.pizzaFactories.add(new RomanFactory());
    }

    public static Pizzeria getInstance() {
        if (Pizzeria.instance == null) {
            Pizzeria.instance = new Pizzeria();
        }
        return Pizzeria.instance;
    }

    public Pizza make(String pizzaName) {
        for (PizzaFactory pizzaFactory : this.pizzaFactories) {
            if (pizzaFactory.doYouMakeThis(pizzaName)) return pizzaFactory.make();
        }
        throw new RuntimeException();
    }

    public List<String> getMenu() {
        ArrayList<String> menu = new ArrayList<>();
        for (PizzaFactory pizzaFactory : this.pizzaFactories) {
            menu.add(pizzaFactory.getPizzaMadeName());
        }
        return menu;
    }
}
