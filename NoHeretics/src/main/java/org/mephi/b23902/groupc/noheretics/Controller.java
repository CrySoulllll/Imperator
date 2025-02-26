package org.mephi.b23902.groupc.noheretics;

import javax.swing.*;

public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;

        view.setAddButtonListener(e -> {
            Heretic newHeretic = DataGenerator.generateHeretic();
            view.addHeretic(newHeretic);
        });

        view.setViewButtonListener(e -> {
            Heretic selected = view.getSelectedHeretic();
            if (selected != null) {
                JOptionPane.showMessageDialog(view,
                        "Имя: " + selected.getName() +
                        "\nПреступления: " + selected.getCrimes() +
                        "\nПоследнее местоположение: " + selected.getLastSeen() +
                        "\nID: " + selected.getId() +
                        "\nУровень угрозы: " + selected.getThreatLevel(),
                        "Информация о еретике",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(view, "Выберите объект розыска!", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}

