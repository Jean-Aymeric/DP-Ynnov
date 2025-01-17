package com.jad.barnyard;

import com.jad.barnyard.behaviorfly.BehaviorFly;
import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Duck {
    private final String name;
    @Setter
    private BehaviorFly behaviorFly;

    public Duck(final String name, final BehaviorFly behaviorFly) {
        this.name = name;
        this.behaviorFly = behaviorFly;
    }

    public void fly() {
        System.out.println(this.name + " : " + this.behaviorFly.fly());
    }

}
