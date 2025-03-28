package com.jad.weapon.decorator;

import com.jad.weapon.IWeapon;

public class Blessed extends AbstractWeaponDecorator {
    public Blessed(final IWeapon weapon) {
        super(weapon);
    }

    @Override
    protected String getDecorateName() {
        return " bénie ";
    }

    @Override
    protected int decorateDamage() {
        return 2;
    }
}
