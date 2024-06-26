package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectOperation extends JFrame {
    JPanel panel;
    JLabel operationLabel, nameLabel;
    JTextField nameText;
    JComboBox nameComboBox, operationComboBox;
    JButton nextButton;

    public SelectOperation() throws HeadlessException {
        setTitle("Select Operation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 350);
        setLocationRelativeTo(null);
        setVisible(true);

        panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints g = new GridBagConstraints();


        operationLabel = new JLabel("Operation:");
            g.gridx = 0;
            g.gridy = 1;
            g.gridwidth = 1;
            g.gridheight = 1;
        panel.add(operationLabel, g);


        nameLabel =  new JLabel("Name:");
            g.gridx = 0;
            g.gridy = 0;
            g.gridwidth = 1;
            g.gridheight = 1;
        panel.add(nameLabel, g);


        nameText = new JTextField();
            g.gridx = 1;
            g.gridy = 0;
            g.gridwidth = 2;
            g.gridheight = 1;
            g.fill = GridBagConstraints.HORIZONTAL;
            nameText.setColumns(10);
        panel.add(nameText, g);


        nameComboBox = new JComboBox();
            g.gridx = 3;
            g.gridy = 0;
            g.gridwidth = 2;
            g.gridheight = 1;
            g.fill = GridBagConstraints.HORIZONTAL;
        panel.add(nameComboBox, g);
        nameComboBox.addItem("User");
        nameComboBox.addItem("Device");


        operationComboBox = new JComboBox();
            g.gridx = 2;
            g.gridy = 1;
            g.gridwidth = 3;
            g.gridheight = 1;
            g.fill = GridBagConstraints.HORIZONTAL;
        panel.add(operationComboBox, g);
        operationComboBox.addItem("PC installation");
        operationComboBox.addItem("PC reinstallation");
        operationComboBox.addItem("PC for sale");
        operationComboBox.addItem("User");


        nextButton = new JButton("Next");
            g.gridx = 2;
            g.gridy = 2;
            g.gridwidth = 1;
            g.gridheight = 1;
        panel.add(nextButton, g);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                DBConnect dbConnect = null;
                Checklist newWindow = new Checklist(dbConnect);
                newWindow.setVisible(true);
            }
        });

        add(panel);
    }
}

