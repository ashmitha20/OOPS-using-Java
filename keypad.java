import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class keypad extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("TIC TAC TOE");
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        JButton b1, b2, b3, b4, b5, b6,b7,b8,b9;
        b1 = new JButton();
        b1.setBounds(100, 150, 30, 30);
        b1.addActionListener(this);
        b2 = new JButton();
        b2.setBounds(100, 180, 30, 30);
        b2.addActionListener(this);
        b3 = new JButton();
        b3.setBounds(100, 210, 30, 30);
        b3.addActionListener(this);
        b4 = new JButton();
        b4.setBounds(130, 150, 30, 30);
        b4.addActionListener(this);
        b5 = new JButton();
        b5.setBounds(130, 180, 30, 30);
        b5.addActionListener(this);
        b6 = new JButton();
        b6.setBounds(130, 210, 30, 30);
        b6.addActionListener(this);
        b7 = new JButton();
        b7.setBounds(160,150,30,30);
        b7.addActionListener(this);
        b8 = new JButton();
        b8.setBounds(160,180,30,30);
        b8.addActionListener(this);
        b9 = new JButton();
        b9.setBounds(160,210,30,30);
        b9.addActionListener(this);
        
        f.add(b9);
        f.add(b8);
        f.add(b7);
        f.add(b5);
        f.add(b6);
        f.add(b4);
        f.add(b2);
        f.add(b3);
        f.add(b1);

    }
    public void actionPerformed(ActionEvent e) {
        
    }
}
