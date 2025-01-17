package com.jad.barnyard;

import com.jad.barnyard.behaviorfly.DontFly;

public class PlasticDuck extends Duck {
    public PlasticDuck(final String name) {
        super(name, new DontFly());
    }
}
