package com.jad;

import lombok.Getter;

@Getter
public abstract class Article {
    private final String name;
    private final String code;
    private final float price;

    protected Article(final String name, final String code, final float price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public abstract void isDisplayed(Displayer displayer);
}
