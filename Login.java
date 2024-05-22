
/*Write a Java program to create a simple login GUI application. The GUI should consist of:

Two text fields for username and password input.
A "Login" button to submit the credentials.
A "Clear" button to clear the username and password fields. */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    private JTextField username;
    private JPasswordField password;
    private JLabel l1, l2;
    private JButton b1, b2;

    Login() {
        setSize(300, 200);
        setLayout(null);
        l1 = new JLabel("Username: ");
        l1.setBounds(100, 80, 160, 80);
        add(l1);
        username = new JTextField();
        username.setBounds(200, 100, 160, 30);
        add(username);
        l2 = new JLabel("Password:");
        l2.setBounds(100, 180, 160, 80);
        add(l2);
        password = new JPasswordField();
        password.setBounds(200, 200, 160, 30);
        add(password);
        b1 = new JButton("Login");
        b1.setBounds(100, 280, 100, 40);
        add(b1);
        b1.addActionListener(this);
        b2 = new JButton("Clear");
        b2.setBounds(250, 280, 100, 40);
        add(b2);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String user = username.getText();
            String pass = password.getText();
            JOptionPane.showMessageDialog(null, "Logged IN");
        } else if (e.getSource() == b2) {
            username.setText("");
            password.setText("");
        }
    }

    public static void main(String[] args) {
        Login frame = new Login();
        frame.setVisible(true);
    }

}
