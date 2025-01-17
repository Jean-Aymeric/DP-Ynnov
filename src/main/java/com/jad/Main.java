package com.jad;

import com.jad.barnyard.*;
import com.jad.barnyard.behaviorfly.BehaviorFly;
import com.jad.barnyard.behaviorfly.DontFly;
import com.jad.barnyard.behaviorfly.FlyWithACapeLikeSuperMan;

public class Main {
    public static void main(String[] args) {
        Ducks ducks = new Ducks();
        PlasticDuck toto = new PlasticDuck("Toto");
        Alabio dede = new Alabio("Dédé");
        Mallard momo = new Mallard("Momo");
        PlasticDuck badDuck = new PlasticDuck("Darth Duck");

        ducks.add(dede);
        ducks.add(momo);
        ducks.add(toto);
        ducks.add(badDuck);

        ducks.flyAll();
        // Une fée vient voir Toto et lui offre une cape qui lui permet de voler désormais
        toto.setBehaviorFly(new FlyWithACapeLikeSuperMan());
        // Dédé s'est pété une aile
        dede.setBehaviorFly(new DontFly());
        ducks.flyAll();

        // Darth Duck vole la cape de Toto
        BehaviorFly temp = badDuck.getBehaviorFly();
        badDuck.setBehaviorFly(toto.getBehaviorFly());
        toto.setBehaviorFly(temp);
        ducks.flyAll();

        // Toto s'énerve
        toto.setBehaviorFly(new BehaviorFly() {
            @Override
            public String fly() {
                return "Je me transforme en super sayan !!!";
            }
        });

        ducks.add(new Duck("Super Duck", () -> "Je fais ce que je veux") {
        });

        ducks.flyAll();
    }
}