package com.jad.weapon.decorator;

import com.jad.weapon.IWeapon;

public class GoodQuality extends AbstractWeaponDecorator {
    public GoodQuality(final IWeapon weapon) {
        super(weapon);
    }

    @Override
    protected String getDecorateName() {
        return " de bonne qualité";
    }

    @Override
    protected int decorateDamage() {
        return +1;
    }
}
