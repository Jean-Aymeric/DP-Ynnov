package com.jad.weapon;

public abstract class AbstractWeapon implements IWeapon {
    private String name;
    private int damage;

    public AbstractWeapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }
}
