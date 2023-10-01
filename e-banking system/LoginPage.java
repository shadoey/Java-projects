import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener {

    private String userID;
    WelcomePage welcomePage;
    private IdAndPasswords instance;

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("reset");
    JTextField userIDField = new JTextField();
    JTextField userPasswordField = new JTextField();
    JLabel userIDLabel = new JLabel("userID");
    JLabel userPasswordLabel = new JLabel("Password");
    JLabel messagLabel = new JLabel();

    HashMap<String, String> logininfo = new HashMap<>();

    LoginPage(IdAndPasswords instance) {
        this.instance = instance;
        this.logininfo = instance.getloginInfo();

        userIDLabel.setBounds(50, 50, 75, 25);
        userPasswordLabel.setBounds(50, 100, 75, 25);

        messagLabel.setBounds(125, 250, 250, 35);
        messagLabel.setFont(new Font(null, Font.ITALIC, 25));

        userIDField.setBounds(125, 50, 200, 25);
        userPasswordField.setBounds(125, 100, 200, 25);

        loginButton.setBounds(100, 200, 100, 25);
        loginButton.addActionListener(this);

        resetButton.setBounds(200, 200, 100, 25);
        resetButton.addActionListener(this);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messagLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
        }

        if (e.getSource() == loginButton) {

            String userid = userIDField.getText();
            String password = userPasswordField.getText();

            if (logininfo.containsKey(userid)) {
                if (logininfo.get(userid).equals(password)) {
                    messagLabel.setForeground(Color.green);
                    messagLabel.setText("Success!!");
                    userID = userid;
                    WelcomePage welcomePage = new WelcomePage(userid, instance.get_balanceinfo());
                } else {
                    messagLabel.setForeground(Color.red);
                    messagLabel.setText("failed to login!!");
                }
            }

            else {
                messagLabel.setForeground(Color.green);
                messagLabel.setText("username not found!!");
            }
        }
    }
}
