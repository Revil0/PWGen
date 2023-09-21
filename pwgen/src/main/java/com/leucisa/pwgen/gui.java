package com.leucisa.pwgen;
import javax.swing.*;
import java.awt.*;

class gui{
    public static void main(String args[]){
       JFrame frame = new JFrame("PWGen");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,500);
       
       JPanel panel = new JPanel();
       JLabel label = new JLabel("Enter password length up to 32");
       JTextField tf = new JTextField(32);
       JButton generate = new JButton("Generate Password");
       panel.add(label);
       panel.add(tf);
       panel.add(generate);

       JTextArea ta = new JTextArea();

       frame.getContentPane().add(BorderLayout.CENTER, panel);
       frame.getContentPane().add(BorderLayout.NORTH, ta);
       frame.setVisible(true);
    }
}