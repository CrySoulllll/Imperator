package org.mephi.b23902.groupc.noheretics;

import javax.swing.*;

public class NoHeretics {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            View view = new View();
            new Controller(view);
            view.setVisible(true);
        });
    }
}

