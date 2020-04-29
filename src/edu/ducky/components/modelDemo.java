package edu.ducky.components;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class modelDemo extends JFrame{
    
    public modelDemo(){
        setSize(400, 250);//rong, cao
        setLocation(500,300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    public static void main(String[] args) {
        modelDemo hello = new modelDemo();
        hello.setVisible(true);
    }
    
}
