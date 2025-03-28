package com.jad.adapter;

public class Nuntius implements Popup {
    private com.jad.adapter.legacy.Nuntius nuntius = new com.jad.adapter.legacy.Nuntius();

    @Override
    public boolean ask(final String title, final String message) {
        return this.nuntius.rogare(title, new String[]{"Yes", "No"}).equalsIgnoreCase("Yes");
    }

    @Override
    public void show(final String title, final String message) {
        this.nuntius.ostendere(message, com.jad.adapter.legacy.Nuntius.Typus.Notitia);
    }

    @Override
    public void warm(final String title, final String message) {
        this.nuntius.ostendere(message, com.jad.adapter.legacy.Nuntius.Typus.Monitus);
    }

    @Override
    public void alert(final String title, final String message) {
        this.nuntius.ostendere(message, com.jad.adapter.legacy.Nuntius.Typus.Terrorem);
    }
}
