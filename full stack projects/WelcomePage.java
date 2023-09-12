import java.awt.Font;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel wecomLabel = new JLabel("Welcome");

    WelcomePage(String userID) {

        wecomLabel.setText(userID);
        wecomLabel.setBounds(0, 0, 200, 35);
        wecomLabel.setFont(new Font(null, Font.PLAIN, 24));

        frame.add(wecomLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430, 430);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
