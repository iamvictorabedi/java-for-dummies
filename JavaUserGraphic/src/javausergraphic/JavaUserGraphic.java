/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javausergraphic;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author victor
 */
public class JavaUserGraphic extends JFrame implements ActionListener {
     JLabel label = new JLabel();
     JButton button = new JButton();
     JButton button2 = new JButton();

    JavaUserGraphic()
    {
        label.setText("From zero to hero");
        add(label);
        setLayout(new FlowLayout());
        setTitle("Java for Dummies");
        setVisible(true);
        setSize(400,600);//size in pixels
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setText("make backgroud blue");
        button.addActionListener(this);
        add(button);
        
        
        button2.setText("make backgroud red");
        button2.addActionListener(this);
        button2.setActionCommand("red");
        add(button2);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
    String color = evt.getActionCommand();
    if(color.equals("red")){
        getContentPane().setBackground(Color.red);

    }else {
       getContentPane().setBackground(Color.blue);
    }    
    repaint();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaUserGraphic gui = new JavaUserGraphic();
    }
    
}
