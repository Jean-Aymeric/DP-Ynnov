package com.jad.weapon;

import com.jad.weapon.decorator.WeaponDecorator;

public class ProxyWeapon implements IWeapon {
    private IWeapon weapon;

    public ProxyWeapon(AbstractWeapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getName() {
        return this.weapon.getName();
    }

    @Override
    public int getDamage() {
        return this.weapon.getDamage();
    }

    public void decorate(WeaponDecorator decorator) {
        this.weapon = decorator.decorate(this.weapon);
    }
}
