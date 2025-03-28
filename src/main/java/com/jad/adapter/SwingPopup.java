package com.jad.adapter;

import javax.swing.*;

public class SwingPopup implements Popup {
    @Override
    public boolean ask(final String title, final String message) {
        return new JOptionPane().showConfirmDialog(null,
                                                   message,
                                                   title,
                                                   javax.swing.JOptionPane.YES_NO_OPTION)
                == javax.swing.JOptionPane.YES_OPTION;
    }

    @Override
    public void show(final String title, final String message) {
        new JOptionPane().showMessageDialog(null, message, title, javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void warm(final String title, final String message) {
        new JOptionPane().showMessageDialog(null, message, title, javax.swing.JOptionPane.WARNING_MESSAGE);
    }

    @Override
    public void alert(final String title, final String message) {
        new JOptionPane().showMessageDialog(null, message, title, javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}
