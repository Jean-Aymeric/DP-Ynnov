package com.jad;

import lombok.Getter;

@Getter
public class BoardGame extends Article {
    private final int nbPlayers;

    public BoardGame(final String name, final String code, final float price, final int nbPlayers) {
        super(name, code, price);
        this.nbPlayers = nbPlayers;
    }

    @Override
    public void isDisplayed(final Displayer displayer) {
        displayer.display(this);
    }
}
