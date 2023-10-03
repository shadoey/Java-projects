package loginapp;

import java.util.HashMap; // Add this import statement

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener {

    WelcomePage welcomePage;
    private IdAndPasswords instance;

    JFrame LPframe = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JTextField userPasswordField = new JTextField();
    JLabel userIDLabel = new JLabel("UserID");
    JLabel userPasswordLabel = new JLabel("Password");
    JLabel messagLabel = new JLabel();
    JLabel welcome = new JLabel("Welcome to Losper Ebanking");

    HashMap<String, String> logininfo = new HashMap<>();

    LoginPage(IdAndPasswords instance) {
        this.instance = instance;
        this.logininfo = instance.getloginInfo();

        userIDLabel.setBounds(50, 50, 75, 25);
        userPasswordLabel.setBounds(50, 100, 75, 25);

        messagLabel.setBounds(125, 250, 250, 35);
        messagLabel.setFont(new Font("Arial", Font.ITALIC, 25));

        userIDField.setBounds(125, 50, 200, 25);
        userPasswordField.setBounds(125, 100, 200, 25);

        loginButton.setBounds(100, 200, 100, 25);
        loginButton.addActionListener(this);

        resetButton.setBounds(200, 200, 100, 25);
        resetButton.addActionListener(this);

        LPframe.getContentPane().setBackground(new Color(173, 216, 230));
        welcome.setBounds(75, 10, 300, 35);
        welcome.setFont(new Font("Arial", Font.BOLD, 20));
        welcome.setHorizontalAlignment(JLabel.CENTER);

        LPframe.add(userIDLabel);
        LPframe.add(userPasswordLabel);
        LPframe.add(messagLabel);
        LPframe.add(userIDField);
        LPframe.add(userPasswordField);
        LPframe.add(loginButton);
        LPframe.add(resetButton);
        LPframe.add(welcome);
        LPframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LPframe.setSize(420, 420);
        LPframe.setLayout(null);
        LPframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Your actionPerformed code remains unchanged
    }
}
