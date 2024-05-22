/*Write Java AWT/Swing based program to display a GUI to accept username and password from
user. The GUI should contain the required UI elements and should have appropriate event
handling aspects. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class login extends JFrame implements ActionListener {
    JTextField t1;
    JPasswordField p1, p2;
    JButton b1;
    JLabel l1, l2, l3;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String us = t1.getText();
            char[] ps = p1.getPassword();
            char[] ps2 = p2.getPassword();
            if (ps.equals(ps2)) {
                JOptionPane.showMessageDialog(null, "Logged in succesfully");
            } else {
                JOptionPane.showMessageDialog(null, "Passwords do not match");
            }
        }

    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Login");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400, 400);
        JTextField t1;
        JPasswordField p1, p2;
        JButton b1;
        JLabel l1, l2, l3;
        l1 = new JLabel();
        l1.setText("User name: ");
        l1.setBounds(100, 100, 150, 20);
        f.add(l1);
        t1 = new JTextField();
        t1.setBounds(210, 100, 150, 20);
        f.add(t1);
        l2 = new JLabel();
        l2.setText("Password: ");
        l2.setBounds(100, 130, 150, 20);
        f.add(l2);
        l3 = new JLabel();
        l3.setText("Confirm Password: ");
        l3.setBounds(100, 160, 150, 20);
        f.add(l3);
        p1 = new JPasswordField();
        p1.setBounds(210, 130, 150, 20);
        p2 = new JPasswordField();
        p2.setBounds(210, 160, 150, 20);
        b1 = new JButton("Login");
        b1.setBounds(100, 200, 270, 30);
        f.add(p2);
        f.add(b1);
        f.add(p1);

        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1) {
                    String us = t1.getText();
                    char[] ps = p1.getPassword();
                    char[] ps2 = p2.getPassword();
                    String pass1 = new String(ps);
                    String pass2 = new String(ps2);
                    if (pass1.equals(pass2)) {
                        JOptionPane.showMessageDialog(null, "Logged in succesfully");
                    } else {
                        JOptionPane.showMessageDialog(null, "Passwords do not match");
                    }
                }

            }
        });
    }
}