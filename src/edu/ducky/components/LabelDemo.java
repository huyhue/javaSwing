/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class LabelDemo extends JFrame{
    public LabelDemo(){
        this.setSize(400, 250);
        setVisible(true);//hien thi len, viet trong class hoac main deu duoc
        setLocation(500, 300);//vi tri frame o man hinh
        setResizable(false);//false: khong the thay doi kich thich man hinh
        JLabel label = new JLabel("Study Anh Share");  //day chu vao 
        add(label);
        
        label.setText("Viet Nam");
        label.setToolTipText("A beautiful country");//hien thi chu thich
        label.setForeground(Color.BLUE);//set mau
    }
    public static void main(String[] args) {
        LabelDemo labelDemo = new LabelDemo();
    }
    
}
