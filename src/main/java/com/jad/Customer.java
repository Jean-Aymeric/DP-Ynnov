package com.jad;

import com.jad.pizzeria.Pizzeria;
import com.jad.pizzeria.Product;

import java.util.List;
import java.util.Random;

public class Customer {
    public void eat(Pizzeria pizzeria) {
        List<String> menu = pizzeria.getMenu();
        Product product = pizzeria.make(menu.get(new Random().nextInt(menu.size())));
        System.out.println("Je commande " + product);
    }
}
