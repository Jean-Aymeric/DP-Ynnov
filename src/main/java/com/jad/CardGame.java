package com.jad;

import lombok.Getter;

@Getter
public class CardGame extends BoardGame {
    private boolean collectible;

    public CardGame(final String name, final String code, final float price, final int nbPlayers,
                    final boolean collectible) {
        super(name, code, price, nbPlayers);
        this.collectible = collectible;
    }

    @Override
    public void isDisplayed(final Displayer displayer) {
        displayer.display(this);
    }
}
