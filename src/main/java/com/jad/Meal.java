package com.jad;

import lombok.Getter;

@Getter
public class Meal extends Article {
    private final int nbCalories;

    public Meal(final String name, final String code, final float price, final int nbCalories) {
        super(name, code, price);
        this.nbCalories = nbCalories;
    }

    @Override
    public void isDisplayed(final Displayer displayer) {
        displayer.display(this);
    }
}
