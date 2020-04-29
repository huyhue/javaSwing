/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class MenuDemo implements ActionListener{
    
    private JMenuItem miOpen;
    private JMenuItem miNew;
    private JMenuItem miSave;
    private JMenuItem miExit;
    
    public static void main(String[] args) {
        new MenuDemo();
    }
    public MenuDemo(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();  //thanh menu
        frame.setJMenuBar(menuBar);
        
        JMenu file = new JMenu("File");   //tao cac thanh phan menu
        file.setMnemonic(KeyEvent.VK_F);  //thiet lap phim tat
        menuBar.add(file);
        
        miNew = new JMenuItem("New");  //tao thanh phan con cua file
        miNew.setMnemonic(KeyEvent.VK_N);
        miNew.addActionListener(this);   //tao ra mot su kien. this la implement, dat trong contructor ham main moi hieu
        file.add(miNew);
        
        miOpen = new JMenuItem("Open");  //tao thanh phan con cua file
        miOpen.setMnemonic(KeyEvent.VK_O);
        miOpen.addActionListener(this);
        file.add(miOpen);
        
        miSave = new JMenuItem("Save");  //tao thanh phan con cua file
        miSave.setMnemonic(KeyEvent.VK_S);
        miSave.addActionListener(this);
        file.add(miSave);
        
        file.addSeparator(); //duong ke ngang
        miExit = new JMenuItem("Exit");  //tao thanh phan con cua file
        miExit.setMnemonic(KeyEvent.VK_X);
        miExit.addActionListener(this);
        file.add(miExit);
        
        JMenu edit = new JMenu("Edit");   //tao cac thanh phan menu
        edit.setMnemonic(KeyEvent.VK_E);  //thiet lap phim tat
        menuBar.add(edit);
        
        JMenu mnuFind = new JMenu("Find");   
        mnuFind.setMnemonic(KeyEvent.VK_I);  
        edit.add(mnuFind);  // tao ra mui ten so ngang ra up va down
        
        JMenuItem miUp = new JMenuItem("Up");  
        miUp.setMnemonic(KeyEvent.VK_U);
        mnuFind.add(miUp);
        
        JMenuItem miDown = new JMenuItem("Down");  
        miDown.setMnemonic(KeyEvent.VK_D);
        mnuFind.add(miDown);
        
        frame.setSize(300,500);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem) e.getSource();
        if(item == miNew){
            //New event
            JOptionPane.showMessageDialog(null, "New is clicked");
        }
        if((JMenuItem) e.getSource() == miOpen){
            JOptionPane.showMessageDialog(null, "Open is clicked");
        }
        if(item == miSave){
            JOptionPane.showMessageDialog(null, "Save is clicked");
        }
        if(item == miExit){
            System.exit(0);
        }
        
        
    }
}
