package com.jad.adapter;

public interface Popup {
    boolean ask(final String title, final String message);

    void show(final String title, final String message);

    void warm(final String title, final String message);

    void alert(final String title, final String message);
}
