import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {

    static final int screen_width = 600;
    static final int screen_height = 600;
    static final int unit_size = 10;
    static final int Game_units = (screen_width * screen_height) / unit_size;
    static final int Delay = 75;
    final int x[] = new int[Game_units];
    final int y[] = new int[Game_units];
    int bodyParts = 5;
    int applesEaten;
    int appleX;
    int appleY;
    int objectX;
    int objectY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(screen_width, screen_height));
        this.setBackground(Color.gray);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();

    }

    public void startGame() {
        newApple();
        newObject();
        running = true;
        timer = new Timer(Delay, this);
        timer.start();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {

        if (running) {
            for (int i = 0; i < screen_height / unit_size; i++) {
                g.drawLine(i * unit_size, 0, i * unit_size, screen_height);
                g.drawLine(0, i * unit_size, screen_width, i * unit_size);
            }
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, unit_size, unit_size);

            g.setColor(Color.white);
            g.fillOval(objectX, objectY, unit_size, unit_size);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], unit_size, unit_size);
                } else {
                    g.setColor(new Color(45, 180, 0));
                    g.fillRect(x[i], y[i], unit_size, unit_size);
                }
            }
            g.setColor(Color.RED);
            g.setFont(new Font("Ink Free", Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score" + applesEaten, (screen_width - metrics.stringWidth("Score" + applesEaten)) / 2,
                    g.getFont().getSize());

        } else {
            gameover(g);
        }
    }

    public void newApple() {
        appleX = random.nextInt((int) screen_width / unit_size);
        appleY = random.nextInt((int) screen_height / unit_size);
    }

    public void newObject() {
        objectX = random.nextInt((int) screen_width / unit_size);
        objectY = random.nextInt((int) screen_height / unit_size);
    }

    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];

            switch (direction) {
                case 'U':
                    y[0] = y[0] - unit_size;
                    break;

                case 'D':
                    y[0] = y[0] + unit_size;
                    break;

                case 'L':
                    x[0] = x[0] - unit_size;
                    break;

                case 'R':
                    x[0] = x[0] + unit_size;
                    break;
            }
        }
    }

    public void checkApple() {
        if ((x[0] == appleX) && (y[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            newApple();
        }

    }

    public void checkObject() {
        if ((x[0] == objectX) && (y[0] == objectY)) {
            running = false;
        }

    }

    public void checkColiisions() {
        // collisions check
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }
        if (x[0] < 0) {
            running = false;
        }
        if (x[0] > screen_width) {
            running = false;
        }
        if (y[0] < 0) {
            running = false;
        }
        if (y[0] > screen_height) {
            running = false;
        }

        if (!running) {
            timer.stop();
        }

    }

    public void gameover(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Game over", (screen_width - metrics.stringWidth("Game over")) / 2, screen_height / 2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (running) {
            move();
            checkApple();
            checkColiisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;

            }

        }
    }
}
