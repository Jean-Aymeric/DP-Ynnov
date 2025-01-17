package com.jad.barnyard;

import com.jad.barnyard.behaviorfly.Fly;

public class Alabio extends Duck {
    public Alabio(final String name) {
        super(name, new Fly());
    }
}
