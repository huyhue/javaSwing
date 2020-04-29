/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDemo extends JFrame{
    public ImageDemo(){
        this.setSize(400, 250);
        setLocation(500, 300);
        setResizable(false);
        JLabel label = new JLabel();  
        add(label);
        label.setSize(350, 200);
        System.out.println("x: " + label.getSize().width + " y: " + label.getSize().height);
        setPicture(label, "anh.jpg");//file anh dat trong thu muc java
    }
    
    //hien thi kich thuoc day du cua anh
    public void setPicture(JLabel label, String filename){
        try {
            BufferedImage image = ImageIO.read(new File(filename));
            int x = label.getSize().width;
            int y = label.getSize().height;
            int ix = label.getWidth();
            int iy = label.getHeight();
            
            int dx = 0;
            int dy = 0;
            
            if(x / y > ix/iy){
                dy = y;
                dx = dy * ix / iy;
            }else{
                dx = x;
                dy = dx * iy / ix;
            }
            
//            ImageIcon icon = new ImageIcon("anh.jpg"));//no se hien thi 1 phan cua anh thoi
            ImageIcon icon = new ImageIcon(image.getScaledInstance(dx, dy, image.SCALE_SMOOTH));
            label.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ImageDemo imageDemo = new ImageDemo();
        imageDemo.setVisible(true);
    }
}
