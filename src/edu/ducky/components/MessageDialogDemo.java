/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class MessageDialogDemo extends JFrame{
    public MessageDialogDemo(){
         this.setSize(400, 250);
        setLocation(500, 300);
        setResizable(false);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//do nang may
        JLabel label = new JLabel("Message Demo");  
        label.setSize(20, 50);
        add(label);
         JButton button = new JButton("Hit me");
         add(button, "North", 1);
         button.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
//                 JOptionPane.showMessageDialog(null, "This is a message dialog");
//                 JOptionPane.showMessageDialog(null, "This is a message dialog","Title",JOptionPane.QUESTION_MESSAGE);
                String name="Ducky";
               JOptionPane.showMessageDialog(null, "Name: "+name,"Title",JOptionPane.QUESTION_MESSAGE);
                 System.out.println("Name: "+name);
            }
         });
    }
    
    public static void main(String[] args) {
        MessageDialogDemo me = new MessageDialogDemo();
        me.setVisible(true);
    }
}
