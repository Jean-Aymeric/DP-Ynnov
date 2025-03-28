package com.jad.weapon.decorator;

import com.jad.weapon.IWeapon;

public abstract class AbstractWeaponDecorator implements IWeapon {
    private final IWeapon weapon;

    public AbstractWeaponDecorator(final IWeapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public final String getName() {
        return this.weapon.getName() + this.getDecorateName();
    }

    abstract protected String getDecorateName();

    @Override
    public final int getDamage() {
        return this.weapon.getDamage() + this.decorateDamage();
    }

    abstract protected int decorateDamage();
}
