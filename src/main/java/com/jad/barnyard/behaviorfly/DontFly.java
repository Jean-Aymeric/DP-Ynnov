package com.jad.barnyard.behaviorfly;

public class DontFly implements BehaviorFly {
    @Override
    public String fly() {
        return "Je ne vole pas";
    }
}
