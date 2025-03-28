package com.jad.weapon.decorator;

import com.jad.weapon.IWeapon;

public class BadQuality extends AbstractWeaponDecorator {
    public BadQuality(final IWeapon weapon) {
        super(weapon);
    }

    @Override
    protected String getDecorateName() {
        return " de mauvaise qualité";
    }

    @Override
    protected int decorateDamage() {
        return -1;
    }
}
