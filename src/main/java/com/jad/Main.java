package com.jad;

import com.jad.pizzeria.Pizzeria;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Pizzeria pizzeria = Pizzeria.getInstance();
        for (int i = 0; i < 10; i++) {
            customer.eat(pizzeria);
        }
    }
}