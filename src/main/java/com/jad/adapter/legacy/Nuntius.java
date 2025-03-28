package com.jad.adapter.legacy;

import java.util.Scanner;

public class Nuntius {
    public String rogare(String quaestrio, String[] responsa) {
        System.out.println(quaestrio);
        Scanner scanner = new Scanner(System.in);
        String responsio = scanner.nextLine();
        for (String responsum : responsa) {
            if (responsum.equalsIgnoreCase(responsio)) {
                return responsum;
            }
        }
        return null;
    }

    public void ostendere(String textul, Typus typus) {
        switch (typus) {
            case Terrorem:
                System.err.println(textul);
                break;
            case Monitus:
                System.out.println(textul);
                break;
            case Notitia:
                System.out.println(textul);
                break;
        }
    }

    public enum Typus {
        Terrorem,
        Monitus,
        Notitia;
    }

}
