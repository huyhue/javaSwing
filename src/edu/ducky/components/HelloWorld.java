/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class HelloWorld extends JFrame{
    public HelloWorld(){
        setSize(200, 150);//rong, cao
        setVisible(true);//hien thi len, viet trong class hoac main deu duoc
        JLabel label = new JLabel("Hello World");  //day chu vao 
        add(label);
    }
   
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
//        hello.setVisible(true);
    }
    
}
