
import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class Backend implements ActionListener {
    JFrame frame = new JFrame("CLick me button counter");

    int count = 0;
    JPanel panel = new JPanel();
    JButton button = new JButton("Click me");
    JLabel label = new JLabel("Number of clicks are " + count);
    JButton reset = new JButton("Reset");

    public void Back() {
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));

        panel.setLayout(new GridLayout(2, 1));
        button.setSize(50, 50);
        panel.add(button);
        panel.add(reset);

        button.addActionListener(this);
        reset.addActionListener(this);

        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        // frame.setBounds(250, 250, 250, 250);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            count += 1;
            label.setText("Number of clicks are" + count);

        }
        if (e.getSource() == reset) {
            count = 0;
            label.setText("Number of clicks are" + count);
        }

    }
}
