package edu.ducky.components;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

public class PopupMenuDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPopupMenu popup = new JPopupMenu("Option");  //kich chuot phai se hien thi ra menu
        JMenuItem miCopy = new JMenuItem("Copy");
        JMenuItem miParse = new JMenuItem("Parse");
        JMenuItem miDelete = new JMenuItem("Delete");
        
        popup.add(miCopy);
        popup.add(miParse);
        popup.addSeparator();
        popup.add(miDelete);
        
        JTextArea area = new JTextArea();
        
        area.setComponentPopupMenu(popup);
        frame.add(area);
        frame.setSize(150,200);
        frame.setVisible(true);
    }
}
