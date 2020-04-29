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

/**
 *
 * @author ASUS
 */
public class ButtonDemo extends JFrame{
     
    private JLabel label;
    public ButtonDemo(){
        this.setSize(400, 250);
        setLocation(500, 300);
        setResizable(false);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//do nang may
        label = new JLabel("Study and Share");  
        label.setSize(20, 50);
        add(label);
         JButton button = new JButton("Hit me");
         add(button, "North", 1);
         //thiet lap action co 2 cach
         button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Do something here
//                label.setText("Tutorials blog");  //se bi loi
                changeText();
                
            }
         });
    }
     public void changeText(){  //cach 1: set truc tiep
         label.setText("Tutorials blog");
     }
     public static void main(String[] args) {
        ButtonDemo buttonDemo = new ButtonDemo();
        buttonDemo.setVisible(true);
    }
}
