package Electricity;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;


public class About extends JFrame implements ActionListener {
    String s;

    public About() {

        setLayout(null);
        setBounds(410, 120, 550, 600);

        JLabel l1 = new JLabel("About Project");
        l1.setBounds(200, 10, 180, 80);
        l1.setForeground(Color.red);
        Font f = new Font("RALEWAY", Font.BOLD, 18);
        l1.setFont(f);


        s = "                                     About Projects          \n  "
                + "\n Electricity Billing System is a software-based application developed \n in Java programming language." +
                "\n The project aims at serving the department of electricity\n by computerizing the billing system. "
                + "\n It mainly focuses on the calculation of Units consumed during the "
                + "\n specified time and the money to be paid to electricity offices. "
                + "\n This computerized system will make the overall billing system easy, "
                + "\n accessible, comfortable and effective for consumers.\n\n"
        ;

        TextArea t1 = new TextArea(s, 10, 50, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 510, 300);
        Font f1 = new Font("RALEWAY", Font.BOLD, 14);
        t1.setFont(f1);

        JButton b1 = new JButton("Exit");
        b1.setBounds(205, 420, 120, 40);
        b1.addActionListener(this);
        Font f2 = new Font("RALEWAY", Font.BOLD, 12);
        b1.setFont(f2);

        add(l1);
        add(b1);
        add(t1);

    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }

}

