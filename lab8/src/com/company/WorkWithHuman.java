package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class WorkWithClassHuman {
    public void DrawWindow() {
        JFrame window = new JFrame("Lab8");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout gbl = new GridLayout(3, 1);
        window.setLayout(gbl);


        JTextArea result = new JTextArea();
        JButton showRes = new JButton("Output data");
        JButton set = new JButton("Setting");
        Human human = new Human();
        JButton addTel = new JButton("add object");

        window.getContentPane().add(set);
        window.getContentPane().add(showRes);
        window.getContentPane().add(addTel);
        window.getContentPane().add(result);
        window.getContentPane().add(human);

        window.setVisible(true);
        window.setSize(500, 300);


        set.addActionListener(new ActionListener() {
                                  public void actionPerformed(ActionEvent e) {
                                      human.DrawWindow();
                                  }
                              }

        );
        showRes.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent e) {
                                          window.getContentPane().remove(human);
                                          if (human.tel != null)
                                              window.getContentPane().remove(human.tel);

                                          window.getContentPane().repaint();
                                          window.getContentPane().add(human);

                                          if (human.tel != null)
                                              window.getContentPane().add(human.tel);
                                          result.setText(human.outputData());
                                      }
                                  }

        );
        addTel.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         human.addObject();
                                         human.tel.DrawWindow();
                                         result.setText("added the facility is first class");
                                     }
                                 }

        );

    }
}