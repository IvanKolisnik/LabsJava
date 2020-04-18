package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StartV1 {
    Telephone telephone;
    Phone phone;
    public  void StartProg()
    {
        JFrame window = new JFrame("Variant 1");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Елементи інтерфейсу:
        GridLayout gbl = new GridLayout(3,2);
        window.setLayout(gbl);

        String[] listConstr = {
                "Telephone(String a)",
                "Telephone(String a,int b)",
                "Phone(int a, int b, int c)",
                "Phone(int a, int b)"
        };
        JPanel pnl = new JPanel();
        JButton set = new JButton("Setting");
        JComboBox constr = new JComboBox(listConstr);
        JButton create = new JButton("Create");
        JTextArea result = new JTextArea();
        JButton showRes = new JButton("Output data");
        //Виведення елементів в вікно
        window.getContentPane().add(constr);
        window.getContentPane().add(create);
        window.getContentPane().add(showRes);
        window.getContentPane().add(result);
        window.getContentPane().add(set);
        //window.getContentPane().add(pnl);

        window.setVisible(true);
        window.setSize(500,300);

        create.addActionListener(new ActionListener()
                                 {
                                     public void actionPerformed(ActionEvent e)
                                     {
                                         if(telephone != null)
                                         {
                                             window.getContentPane().remove(telephone);
                                             telephone = null;
                                         }
                                         if(phone != null)
                                         {
                                             window.getContentPane().remove(phone);
                                             phone = null;

                                         }

                                         if ((String)constr.getSelectedItem() == "Telephone(String a)")
                                         {
                                             telephone = new Telephone("Nokia");
                                             window.getContentPane().repaint();
                                             window.getContentPane().add(telephone);
                                         }
                                         if ((String)constr.getSelectedItem() == "Telephone(String a,int b)")
                                         {
                                             telephone =  new Telephone("Nokia",143);
                                             window.getContentPane().repaint();
                                             window.getContentPane().add(telephone);
                                         }
                                         if ((String)constr.getSelectedItem() == "Phone(int a, int b, int c)")
                                         {
                                             phone =  new Phone(23,12,43);
                                             window.getContentPane().repaint();
                                             window.getContentPane().add(phone);
                                         }
                                         if ((String)constr.getSelectedItem() == "Phone(int a, int b)")
                                         {
                                             phone =  new Phone(12,23);
                                             window.getContentPane().repaint();
                                             window.getContentPane().add(phone);
                                         }
                                         result.setText("Create object");
                                     }
                                 }
        );
        set.addActionListener(new ActionListener()
                              {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      if(telephone != null)
                                      {
                                          telephone.DrawWindow();
                                      }
                                      if(phone != null)
                                      {
                                          phone.DrawWindow();
                                      }
                                  }
                              }
        );
        showRes.addActionListener(new ActionListener()
                                  {
                                      public void actionPerformed(ActionEvent e)
                                      {

                                          if(telephone != null)
                                          {
                                              window.getContentPane().repaint();
                                              window.getContentPane().add(telephone);
                                              result.setText(telephone.outputData());
                                          }
                                          if(phone != null)
                                          {
                                              window.getContentPane().repaint();
                                              window.getContentPane().add(phone);
                                              result.setText(phone.outputData());
                                          }
                                      }
                                  }
        );

    }
}
