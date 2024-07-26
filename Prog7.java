package javalab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prog7 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JButton b1 = new JButton("Alpha");
        JButton b2 = new JButton("Beta");
        
        b1.setBounds(200,100,70,30);
        b2.setBounds(200,200,70,30);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Alpha pressed");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	System.out.println("Alpha pressed");
            }
        });

        f.add(b1);
        f.add(b2);
        f.setSize(500,500);
        f.setLayout(null);

        f.setVisible(true);
    }
}
