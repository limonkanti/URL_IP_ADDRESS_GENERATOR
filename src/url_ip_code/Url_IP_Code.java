package url_ip_code;

import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class Url_IP_Code extends JFrame implements ActionListener {

    JLabel l;
    JTextField tf;
    JButton b;

    Url_IP_Code() {
        super("Get IP Address From URL");
        l = new JLabel("Enter URL:");
        l.setBounds(50, 70, 150, 20);;
        tf = new JTextField();
        tf.setBounds(50, 100, 200, 20);

        b = new JButton("Get IP");
        b.setBounds(50, 150, 80, 30);
        b.addActionListener(this);
        add(l);
        add(tf);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String url = tf.getText();
        try {
            InetAddress ia = InetAddress.getByName(url);
            String ip = ia.getHostAddress();
            JOptionPane.showMessageDialog(this, ip);
            System.out.println(ip);
        } catch (UnknownHostException e1) {
            JOptionPane.showMessageDialog(this, e1.toString());
            
        }
    }

    public static void main(String[] args) {
        new Url_IP_Code();
    }
}
