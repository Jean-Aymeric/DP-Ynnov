package com.jad.pizzeria;

import com.jad.pizzeria.dessert.factory.CookieFactory;
import com.jad.pizzeria.dessert.factory.DonutFactory;
import com.jad.pizzeria.drink.factory.ColaFactory;
import com.jad.pizzeria.drink.factory.SparklingWaterFactory;
import com.jad.pizzeria.pizza.factory.FourCheesesFactory;
import com.jad.pizzeria.pizza.factory.NeapolitanFactory;
import com.jad.pizzeria.pizza.factory.RomanFactory;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private static Pizzeria instance = null;
    private final List<ProductFactory> pizzaFactories = new ArrayList<>();
    private final List<ProductFactory> dessertFactories = new ArrayList<>();
    private final List<ProductFactory> drinkFactories = new ArrayList<>();

    private Pizzeria() {
        this.pizzaFactories.add(new FourCheesesFactory());
        this.pizzaFactories.add(new NeapolitanFactory());
        this.pizzaFactories.add(new RomanFactory());

        this.drinkFactories.add(new ColaFactory());
        this.drinkFactories.add(new SparklingWaterFactory());

        this.dessertFactories.add(new CookieFactory());
        this.dessertFactories.add(new DonutFactory());
    }

    public static Pizzeria getInstance() {
        if (Pizzeria.instance == null) {
            Pizzeria.instance = new Pizzeria();
        }
        return Pizzeria.instance;
    }

    public Product make(String productName) {
        Product newProduct = this.makePizza(productName);
        if (newProduct != null) return newProduct;
        newProduct = this.makeDrink(productName);
        if (newProduct != null) return newProduct;
        newProduct = this.makeDessert(productName);
        if (newProduct != null) return newProduct;

        throw new RuntimeException();
    }

    public Product makePizza(final String productName) {
        return Pizzeria.make(productName, this.pizzaFactories);
    }

    public Product makeDrink(final String productName) {
        return Pizzeria.make(productName, this.drinkFactories);
    }

    public Product makeDessert(final String productName) {
        return Pizzeria.make(productName, this.dessertFactories);
    }

    private static Product make(final String productName, final List<? extends ProductFactory> factories) {
        for (ProductFactory factory : factories) {
            if (factory.getProductNameMade().equals(productName)) return factory.make();
        }
        return null;
    }

    public List<String> getMenu() {
        List<String> menu = new ArrayList<>();
        menu.addAll(this.getPizzaMenu());
        menu.addAll(this.getDrinkMenu());
        menu.addAll(this.getDessertMenu());
        return menu;
    }

    public List<String> getPizzaMenu() {
        return this.getMenu(this.pizzaFactories);
    }

    public List<String> getDrinkMenu() {
        return this.getMenu(this.drinkFactories);
    }

    public List<String> getDessertMenu() {
        return this.getMenu(this.dessertFactories);
    }

    private List<String> getMenu(final List<ProductFactory> productFactories) {
        List<String> menu = new ArrayList<>();
        for (ProductFactory productFactory : productFactories) {
            menu.add(productFactory.getProductNameMade());
        }
        return menu;
    }
}
