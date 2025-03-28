package com.jad.weapon.decorator;

import com.jad.weapon.IWeapon;

public class DrenchedInDragonBlood extends AbstractWeaponDecorator {
    public DrenchedInDragonBlood(final IWeapon weapon) {
        super(weapon);
    }

    @Override
    protected String getDecorateName() {
        return " trempée dans le sang du dragon de la montagne de feu";
    }

    @Override
    protected int decorateDamage() {
        return 5;
    }
}
