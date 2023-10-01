
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PayPro implements ActionListener {

    HashMap<String, Integer> balanceinfo = new HashMap<>();

    // Fields
    JFrame pF = new JFrame("Make Payment");
    JLabel balance = new JLabel("");
    JTextField eAmount = new JTextField(16);
    JTextField eAccNum = new JTextField(16);
    JButton completeT = new JButton("COMPLETE TRANSACTION");
    JButton NavButtonL = new JButton("<");
    private int balT;
    String userid;

    PayPro(int balT, HashMap<String, Integer> balanceinfoOriginal, String UserID) {
        balanceinfo = balanceinfoOriginal;
        this.balT = balT;

        userid = UserID;

        // Layout

        pF.setLayout(new BorderLayout());
        pF.setSize(new Dimension(300, 300));
        pF.setForeground(Color.DARK_GRAY);
        pF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pF.pack();
        pF.setVisible(true);
        // Components

        // event listener
        completeT.addActionListener(this);
        NavButtonL.addActionListener(this);
        // DESIGN
        JPanel nP = new JPanel(new GridLayout(3, 2));
        nP.add(new JLabel("Balance"));
        balance.setText(Integer.toString(balT));
        nP.add(balance);
        nP.add(new JLabel("Enter Amount: "));
        nP.add(eAmount);
        nP.add(new JLabel("Enter Account: "));
        nP.add(eAccNum);
        pF.add(nP, BorderLayout.NORTH);
        pF.setSize(600, 750);

        JPanel cP = new JPanel(new FlowLayout());
        cP.add(completeT);
        pF.add(cP, BorderLayout.CENTER);

        JPanel sP = new JPanel(new GridLayout(1, 2));
        sP.add(NavButtonL);
        pF.add(sP, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == completeT) {
            String x = eAccNum.getText();
            if (balanceinfo.containsKey(x)) {
                int newBal = balT;
                double BalAmount = newBal;
                String EA = eAmount.getText();
                double CA = 0.00;

                try {
                    CA = Double.parseDouble(EA);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(pF, "Amount Should Be a Number", "Input Error",
                            JOptionPane.ERROR_MESSAGE);
                    eAmount.setText(" ");

                }

                double diff = BalAmount - CA;
                if (diff > 50.00 && (balanceinfo.containsKey(x))) {
                    balT = (int) diff;

                    balance.setText(Double.toString(diff));

                    ;

                } else {
                    JOptionPane.showMessageDialog(pF, "Minimum Balance Should Be No Less Than 50.00", "Balance Error",
                            JOptionPane.ERROR_MESSAGE);
                    eAmount.setText(" ");

                }
            } else {
                JOptionPane.showMessageDialog(pF, "Account does not exist", "Account Error", JOptionPane.ERROR_MESSAGE);

            }
        }
        if (event.getSource() == NavButtonL) {
            pF.dispose();
        }
    }
}
