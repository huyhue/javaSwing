package edu.ducky.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextFieldDemo extends JFrame implements ActionListener{
    
    private JTextField tfName;
    private JButton bHit;
    
    public TextFieldDemo(){
        setSize(400, 250);//rong, cao
        setLocation(500,300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tfName = new JTextField();
        add(tfName, "North",0);
        
        bHit = new JButton("Hit me");
        add(bHit, "South", 0);
        bHit.addActionListener(this);
    }
   
    public static void main(String[] args) {
        TextFieldDemo hello = new TextFieldDemo();
        hello.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bHit) {
            JOptionPane.showMessageDialog(null, tfName.getText());
            
//            tfName.setText("Study and Share blog");
        }
    }
    
}
