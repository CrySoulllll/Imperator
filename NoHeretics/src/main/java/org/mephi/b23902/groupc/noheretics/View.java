package org.mephi.b23902.groupc.noheretics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private DefaultListModel<Heretic> listModel;
    private JList<Heretic> hereticList;
    private JButton addButton;
    private JButton viewButton;

    public View() {
        setTitle("Розыск еретиков");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        hereticList = new JList<>(listModel);
        add(new JScrollPane(hereticList), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Добавить объект розыска");
        viewButton = new JButton("Просмотреть информацию");
        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void addHeretic(Heretic heretic) {
        listModel.addElement(heretic);
    }

    public Heretic getSelectedHeretic() {
        return hereticList.getSelectedValue();
    }

    public void setAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void setViewButtonListener(ActionListener listener) {
        viewButton.addActionListener(listener);
    }
}
