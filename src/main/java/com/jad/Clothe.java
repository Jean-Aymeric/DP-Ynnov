package com.jad;

import lombok.Getter;

@Getter
public class Clothe extends Article {
    private final int size;
    private final String color;

    public Clothe(final String name, final String code, final float price, final int size, final String color) {
        super(name, code, price);
        this.size = size;
        this.color = color;
    }

    @Override
    public void isDisplayed(final Displayer displayer) {
        displayer.display(this);
    }
}
