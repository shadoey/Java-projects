/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class WelcomePage implements ActionListener {
  private String userID;
  JFrame frame = new JFrame();
  JLabel welcomLabel = new JLabel("Welcome");
  JButton Transfer = new JButton("Transer Funds");
  JLabel balanceField = new JLabel();
  JTextField transferfield = new JTextField();
  JButton back = new JButton("back");
  JButton LogOut = new JButton("Log Out");
  JTextField text = new JTextField();;

  HashMap<String, Integer> balanceinfo = new HashMap<>();

  WelcomePage(String userID, HashMap<String, Integer> balanceinfoOriginal) {
    balanceinfo = balanceinfoOriginal;
    this.userID = userID;

    welcomLabel.setText("Welcome," + this.userID);

    frame.setLayout(new BorderLayout());

    // Even listenener
    Transfer.addActionListener(this);
    LogOut.addActionListener(this);

    JPanel North = new JPanel(new GridLayout(1, 3));

    JPanel welPanel = new JPanel(new FlowLayout());
    welcomLabel.setSize(new Dimension(200, 200));
    welPanel.add(welcomLabel);
    North.add(welPanel);

    North.add(new JLabel());
    JPanel Log = new JPanel(new FlowLayout());
    Log.add(LogOut);
    LogOut.setSize(50, 20);
    North.add(Log);
    frame.add(North, BorderLayout.NORTH);

    JPanel West = new JPanel(new BorderLayout());
    JPanel PFPHolder = new JPanel(new FlowLayout());
    String pfpLocation = "C:\\Users\\Lenton\\OneDrive - Curro Holdings\\Pictures\\profile.PNG";
    ImageIcon PFP = new ImageIcon(pfpLocation);
    JLabel PFPLabel = new JLabel(PFP);
    PFPLabel.setSize(50, 50);
    PFPHolder.add(PFPLabel);
    PFPHolder.setSize(50, 50);
    West.add(PFPHolder, BorderLayout.NORTH);

    int bal = balanceinfo.get(this.userID);
    balanceField.setText("Current Balance: N$" + Integer.toString(bal));
    JPanel balLabel = new JPanel(new FlowLayout());

    JPanel TransB = new JPanel(new FlowLayout());
    Transfer.setSize(300, 30);
    TransB.add(Transfer);
    balLabel.add(balanceField);
    balLabel.add(TransB);
    West.add(balLabel, BorderLayout.CENTER);

    frame.add(West, BorderLayout.WEST);

    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 750);
    frame.setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    /*
     * if (e.getSource() == CheckBalance) {
     * int bal = balanceinfo.get(userID);
     * balanceField.setText(Integer.toString(bal));
     * }
     */

    if (e.getSource() == Transfer) {
      int balT = balanceinfo.get(userID);
      PayPro pay = new PayPro(balT, balanceinfo, userID);
    }
    if (e.getSource() == LogOut) {
      frame.dispose();

    }

  }
}