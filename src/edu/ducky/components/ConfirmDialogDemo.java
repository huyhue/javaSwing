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
public class ConfirmDialogDemo extends JFrame{
    public ConfirmDialogDemo(){
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
                int click = JOptionPane.showConfirmDialog(null, "Is Ducky handsome ?");
                if(click == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Click Yes");
                }
                if(click == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Click No");
                }
                if(click == JOptionPane.CANCEL_OPTION){
                    JOptionPane.showMessageDialog(null, "Click Cancel");
                }
                if(click == JOptionPane.CLOSED_OPTION){
                    JOptionPane.showMessageDialog(null, "Click Closed");
                }
//                JOptionPane.showConfirmDialog(null, "Is Ducky handsome ?","Question",JOptionPane.YES_NO_OPTION);
            }
         });
    }
    
    public static void main(String[] args) {
        ConfirmDialogDemo com = new ConfirmDialogDemo();
        com.setVisible(true);
    }
}
