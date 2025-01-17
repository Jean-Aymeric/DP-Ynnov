package com.jad.barnyard;

import com.jad.barnyard.behaviorfly.Fly;

public class Mallard extends Duck {
    public Mallard(final String name) {
        super(name, new Fly());
    }
}
