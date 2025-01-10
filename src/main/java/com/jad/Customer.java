package com.jad;

import com.jad.pizzeria.Pizzeria;

import java.util.List;
import java.util.Random;

public class Customer {
    public void eat(Pizzeria pizzeria) {
        List<String> menu = pizzeria.getMenu();

        System.out.println("Je commande " + pizzeria.make(menu.get(new Random().nextInt(menu.size()))));
    }
}
