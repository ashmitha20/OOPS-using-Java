/*Create a GUI with Textboxes for getting EMP id, name, BasicPay, DA,HRA from user and a Button with text "Save. On clicking Save button, write it to the file in the following format." */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class exam1 implements ActionListener {
    static JFrame f;
    static JTextField t1, t2, t3, t4, t5, t6;
    static JLabel l1, l2, l3, l4, l5, l6;
    static JButton b1, b2;

    // Inside actionPerformed method
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String s = t1.getText();
            String s1 = t2.getText();
            String s2 = t3.getText();
            String s3 = t4.getText();
            String s4 = t5.getText();

            try {
                FileWriter fw = new FileWriter("Details.txt");

                fw.write("\n=============================================");
                fw.write("\nEmpID\t\tName\t\tBasicPay\t\tDA\t\tHRA");
                fw.write("\n=============================================");
                fw.write("\n" + s + "\t\t" + s1 + "\t\t" + s2 + "\t\t" + s3 + "\t\t" + s4);

                fw.close();
            } catch (IOException ex) {
                System.out.println("File Not Found");
            }
        }
        if (e.getSource() == b2) {
            try {
                int basicPay = Integer.parseInt(t3.getText().trim());
                int da = Integer.parseInt(t4.getText().trim());
                int hra = Integer.parseInt(t5.getText().trim());

                int total = basicPay + da + hra;
                t6.setText(String.valueOf(total));
            } catch (NumberFormatException ex) {
                t6.setText("Invalid input");
            }
        }

    }

    public static void main(String[] args) {
        f = new JFrame("Employee Details");
        l1 = new JLabel();
        l1.setText("Emp ID: ");
        l1.setBounds(100, 100, 150, 30);
        f.add(l1);
        l2 = new JLabel();
        l2.setText("Name: ");
        l2.setBounds(100, 130, 150, 30);
        f.add(l2);
        l3 = new JLabel();
        l3.setText("Basic Pay: ");
        l3.setBounds(100, 160, 150, 30);
        f.add(l3);
        l4 = new JLabel();
        l4.setText("DA: ");
        l4.setBounds(100, 190, 150, 30);
        f.add(l4);
        l5 = new JLabel();
        l5.setText("HRA: ");
        l5.setBounds(100, 220, 150, 30);
        f.add(l5);
        l6 = new JLabel();
        l6.setText("Total: ");
        l6.setBounds(100, 250, 150, 30);
        f.add(l6);

        t1 = new JTextField();
        t1.setBounds(200, 100, 150, 20);
        f.add(t1);
        t2 = new JTextField();
        t2.setBounds(200, 130, 150, 20);
        f.add(t2);
        t3 = new JTextField();
        t3.setBounds(200, 160, 150, 20);
        f.add(t3);
        t4 = new JTextField();
        t4.setBounds(200, 190, 150, 20);
        f.add(t4);
        t5 = new JTextField();
        t5.setBounds(200, 220, 150, 20);
        f.add(t5);
        t6 = new JTextField();
        t6.setBounds(200, 250, 150, 20);
        f.add(t6);

        b1 = new JButton("Save");
        b1.setBounds(100, 280, 100, 30);
        f.add(b1);
        b2 = new JButton("Total");
        b2.setBounds(250, 280, 100, 30);
        f.add(b2);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1) {
                    String s = t1.getText();
                    String s1 = t2.getText();
                    String s2 = t3.getText();
                    String s3 = t4.getText();
                    String s4 = t5.getText();

                    try {
                        FileWriter fw = new FileWriter("Details.txt");

                        fw.write("\n=============================================");
                        fw.write("\nEmpID\t\tName\t\tBasicPay\t\tDA\t\tHRA");
                        fw.write("\n=============================================");
                        fw.write("\n" + s + "\t\t" + s1 + "\t\t" + s2 + "\t\t" + s3 + "\t\t" + s4);

                        fw.close();
                    } catch (IOException ex) {
                        System.out.println("File Not Found");
                    }
                }
                if (e.getSource() == b2) {
                    try {
                        int basicPay = Integer.parseInt(t3.getText().trim());
                        int da = Integer.parseInt(t4.getText().trim());
                        int hra = Integer.parseInt(t5.getText().trim());

                        int total = basicPay + da + hra;
                        t6.setText(String.valueOf(total));
                    } catch (NumberFormatException ex) {
                        t6.setText("Invalid input");
                    }
                }

            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1) {
                    String s = t1.getText();
                    String s1 = t2.getText();
                    String s2 = t3.getText();
                    String s3 = t4.getText();
                    String s4 = t5.getText();

                    try {
                        FileWriter fw = new FileWriter("Details.txt");

                        fw.write("=============================================");
                        fw.write("EmpID\t\tName\t\tBasicPay\t\tDA\t\tHRA");
                        fw.write("=============================================");
                        fw.write(s + "\t\t" + s1 + "\t\t" + s2 + "\t\t" + s3 + "\t\t" + s4);

                        fw.close();
                    } catch (IOException ex) {
                        System.out.println("File Not Found");
                    }
                }
                if (e.getSource() == b2) {
                    try {
                        int basicPay = Integer.parseInt(t3.getText().trim());
                        int da = Integer.parseInt(t4.getText().trim());
                        int hra = Integer.parseInt(t5.getText().trim());

                        int total = basicPay + da + hra;
                        t6.setText(String.valueOf(total));
                    } catch (NumberFormatException ex) {
                        t6.setText("Invalid input");
                    }
                }

            }
        });

    }

}
