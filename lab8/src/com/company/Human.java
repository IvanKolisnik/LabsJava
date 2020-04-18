package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Human extends JPanel
{
    Telephone tel;
    int x = 10;
    int y = 10;
    int height = 50;
    int width = 50;

    public void paint (Graphics g)
    {
        g.drawOval(x, y, height, width);


    }

    void DrawWindow()
    {
        JFrame SetWin = new JFrame("Setting Human");
        GridLayout gbl = new GridLayout(5,2);
        SetWin.setLayout(gbl);
        SetWin.setLocation(0,350);

        JTextField  _x = new JTextField();
        JTextField  _y = new JTextField();
        JTextField  _h = new JTextField();
        JTextField  _w = new JTextField();
        JLabel L_x = new JLabel("X:");
        JLabel L_y = new JLabel("Y:");
        JLabel L_height = new JLabel("Height:");
        JLabel L_width = new JLabel("Width:");
        JButton apply = new JButton("Input data");
        JButton setTel = new JButton("Setting object Telephone");

        SetWin.getContentPane().add(L_x);
        SetWin.getContentPane().add(_x);
        SetWin.getContentPane().add(L_y);
        SetWin.getContentPane().add(_y);
        SetWin.getContentPane().add(L_height);
        SetWin.getContentPane().add(_h);
        SetWin.getContentPane().add(L_width);
        SetWin.getContentPane().add(_w);
        SetWin.getContentPane().add(apply);
        if (tel != null)
        {
            SetWin.getContentPane().add(setTel);
        }

        SetWin.setVisible(true);
        SetWin.setSize(600,300);


        apply.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        inputData(_x, _y, _h, _w);

                                    }
                                }
        );
        setTel.addActionListener(new ActionListener()
                                 {
                                     public void actionPerformed(ActionEvent e)
                                     {
                                         tel.DrawWindow();
                                     }
                                 }
        );
    }
    void inputData(JTextField a, JTextField b, JTextField c, JTextField d)
    {
        x = Integer.parseInt(a.getText());
        y = Integer.parseInt(b.getText());
        height = Integer.parseInt(c.getText());
        width = Integer.parseInt(d.getText());
    }

    String outputData()
    {
        String a = "x:"+x+"\n"+"y:"+y+"\n"+"height:"+height+"\n"+"width:"+width;
        return a;
    }

    void addObject()
    {
        tel = new Telephone("Alcatel");
    }
}