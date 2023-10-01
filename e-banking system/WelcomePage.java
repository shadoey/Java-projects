import java.awt.Font;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.util.*;

public class WelcomePage implements ActionListener {
    private String userID;
    JFrame frame = new JFrame();
    JLabel wecomLabel = new JLabel("Welcome");
    JButton CheckBalance = new JButton("Check balance");
    JButton Transfer = new JButton("Transfer money");
    JTextField balacefield = new JTextField();
    JTextField transferfield = new JTextField();
    JButton back = new JButton("back");

    HashMap<String, Integer> balanceinfo = new HashMap<>();

    WelcomePage(String userID, HashMap<String, Integer> balanceinfoOriginal) {
        balanceinfo = balanceinfoOriginal;
        this.userID = userID;

        wecomLabel.setText("Welcome" + " " + userID);

        wecomLabel.setBounds(0, 0, 200, 35);
        wecomLabel.setFont(new Font(null, Font.PLAIN, 24));

        balacefield.setBounds(150, 50, 200, 25);
        balacefield.setFont(new Font(null, Font.ITALIC, 25));
        transferfield.setBounds(125, 100, 200, 25);

        CheckBalance.setBounds(50, 50, 100, 25);
        CheckBalance.addActionListener(this);
        Transfer.setBounds(50, 100, 100, 25);
        Transfer.addActionListener(this);

        frame.add(wecomLabel);
        frame.add(CheckBalance);
        frame.add(balacefield);
        frame.add(transferfield);
        frame.add(Transfer);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430, 430);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == CheckBalance) {
            int bal = balanceinfo.get(userID);
            balacefield.setText(Integer.toString(bal));
        }

        if (e.getSource() == Transfer) {
            int balT = balanceinfo.get(userID);
            PayPro pay = new PayPro(balT, balanceinfo, userID);
        }

    }
}
