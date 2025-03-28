package com.jad;

import com.jad.weapon.Axe;
import com.jad.weapon.ProxyWeapon;
import com.jad.weapon.decorator.WeaponDecorator;

public class Main {
    public static void main(String[] args) {
        final ProxyWeapon sword = new ProxyWeapon(new Axe());

        System.out.println(sword.getName() + " : " + sword.getDamage());
        sword.decorate(WeaponDecorator.BadQuality);
        sword.decorate(WeaponDecorator.DrenchedInDragonBlood);
        sword.decorate(WeaponDecorator.Blessed);

        System.out.println(sword.getName() + " : " + sword.getDamage());
    }
}