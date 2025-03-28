package com.jad;

import com.jad.weapon.Axe;
import com.jad.weapon.IWeapon;
import com.jad.weapon.decorator.BadQuality;
import com.jad.weapon.decorator.GoodQuality;

public class Main {
    public static void main(String[] args) {
        IWeapon sword = new Axe();
        System.out.println(sword.getName() + " : " + sword.getDamage());
        sword = new GoodQuality(new BadQuality(sword));
        System.out.println(sword.getName() + " : " + sword.getDamage());
    }
}