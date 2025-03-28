package com.jad.weapon.decorator;

import com.jad.weapon.IWeapon;

public enum WeaponDecorator {

    GoodQuality(weapon -> new GoodQuality(weapon)),
    BadQuality(weapon -> new BadQuality(weapon)),
    DrenchedInDragonBlood(weapon -> new DrenchedInDragonBlood(weapon)),
    Blessed(weapon -> new Blessed(weapon));

    private final BehaviorDecorate behaviorDecorate;

    WeaponDecorator(final BehaviorDecorate behaviorDecorate) {
        this.behaviorDecorate = behaviorDecorate;
    }

    public IWeapon decorate(IWeapon weapon) {
        return this.behaviorDecorate.decorate(weapon);
    }

    private interface BehaviorDecorate {
        IWeapon decorate(IWeapon weapon);
    }
}
