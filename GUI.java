import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {
    private circleButton red;
    private circleButton yellow;
    private circleButton green;

    GUI() {
        setTitle("Traffic Light");
        setSize(300, 300);
        setLayout(null);
        red = new circleButton();
        add(red);
        red.setBounds(150, 100, 40, 40);
        red.setBackground(Color.BLACK);
        red.addActionListener(this);

        yellow = new circleButton();
        add(yellow);
        yellow.setBounds(150, 150, 40, 40);
        yellow.setBackground(Color.BLACK);
        yellow.addActionListener(this);

        green = new circleButton();
        add(green);
        green.setBounds(150, 200, 40, 40);
        green.setBackground(Color.BLACK);
        green.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(red)) {
            red.setBackground(Color.RED);
            yellow.setBackground(Color.BLACK);
            green.setBackground(Color.BLACK);
        }
        if (e.getSource().equals(yellow)) {
            red.setBackground(Color.BLACK);
            yellow.setBackground(Color.YELLOW);
            green.setBackground(Color.BLACK);
        }
        if (e.getSource().equals(green)) {
            red.setBackground(Color.BLACK);
            yellow.setBackground(Color.BLACK);
            green.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        GUI g = new GUI();
        g.setVisible(true);
    }

    class circleButton extends JButton {
        public void paintComponent(Graphics g) {
            g.setColor(getBackground());
            g.fillOval(0, 0, getWidth(), getHeight());
        }

        public Dimension getPreferredSize() {
            return new Dimension(40, 40);
        }
    }
}
