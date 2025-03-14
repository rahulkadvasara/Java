import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Stopwatch implements ActionListener {
    JFrame frame = new JFrame("Stopwatch");
    JPanel panel = new JPanel();
    JLabel timeLabel = new JLabel("00:00:00", SwingConstants.CENTER);
    JButton startButton = new JButton("Start");
    JButton pauseButton = new JButton("Pause");
    JButton stopButton = new JButton("Stop");
    Timer timer;
    int elapsedTime = 0;
    boolean running = false;

    Stopwatch() {
        panel.setLayout(new GridLayout(2, 1, 5, 5));
        JPanel displayPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        displayPanel.add(timeLabel);
        
        buttonPanel.add(startButton);
        buttonPanel.add(pauseButton);
        buttonPanel.add(stopButton);
        
        startButton.addActionListener(this);
        pauseButton.addActionListener(this);
        stopButton.addActionListener(this);
        
        panel.add(displayPanel);
        panel.add(buttonPanel);
        frame.add(panel);
        
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        // timer = new Timer(1000, e -> updateTimer());
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTimer();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            startTimer();
        } else if (e.getSource() == pauseButton) {
            pauseTimer();
        } else if (e.getSource() == stopButton) {
            stopTimer();
        }
    }

    public void updateTimer() {
        elapsedTime++;
        int hours = elapsedTime / 3600;
        int minutes = (elapsedTime % 3600) / 60;
        int seconds = elapsedTime % 60;
        timeLabel.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }

    public void startTimer() {
        if (!running) {
            timer.start();
            running = true;
        }
    }

    public void pauseTimer() {
        timer.stop();
        running = false;
    }

    public void stopTimer() {
        timer.stop();
        elapsedTime = 0;
        timeLabel.setText("00:00:00");
        running = false;
    }

    public static void main(String[] args) {
        new Stopwatch();
    }
}
