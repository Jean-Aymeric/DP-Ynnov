package com.jad.barnyard;

import java.util.ArrayList;

public class Ducks extends ArrayList<Duck> {
    public void flyAll() {
        for (Duck duck : this) {
            duck.fly();
        }
        System.out.println();
    }
}
