package com.jad;

import com.jad.adapter.Nuntius;
import com.jad.adapter.Popup;


public class Main {
    public static void main(String[] args) {
        Popup popup = new Nuntius();
        popup.show("Information", "Hello, World!");
        popup.warm("Warning", "Hello, World!");
        popup.alert("Error", "Hello, World!");
        if (popup.ask("Question", "Hello, World!")) {
            popup.show("Information", "You clicked on Yes!");
        } else {
            popup.show("Information", "You clicked on No!");
        }

//        Nuntius nuntius = new Nuntius();
//        String[] responsa = {"Yes", "No"};
//        String responsio = nuntius.rogare("Do you like Java?", responsa);
//        nuntius.ostendere("You answered: " + responsio, Nuntius.Typus.Notitia);
//        nuntius.ostendere("Warning", Nuntius.Typus.Monitus);
//        nuntius.ostendere("Error", Nuntius.Typus.Terrorem);

    }
}