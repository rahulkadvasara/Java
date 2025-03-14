import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingCalculator implements ActionListener {
    JFrame frm = new JFrame("Calculator");
    JPanel pnl = new JPanel(new GridLayout(2, 1, 5, 5));
    JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
    
    JTextField txt1 = new JTextField(8);
    JTextField txt2 = new JTextField(8);
    JTextField txt3 = new JTextField(8);
    JButton btn1 = new JButton("+");
    JButton btn2 = new JButton("-");
    JButton btn3 = new JButton("*");
    JButton btn4 = new JButton("/");

    SwingCalculator() {
        txt3.setEditable(false);

        inputPanel.add(new JLabel("Number 1:"));
        inputPanel.add(txt1);
        inputPanel.add(new JLabel("Number 2:"));
        inputPanel.add(txt2);
        inputPanel.add(new JLabel("="));
        inputPanel.add(txt3);

        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btn4);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        pnl.add(inputPanel);
        pnl.add(buttonPanel);
        
        frm.add(pnl);
        frm.setSize(500, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            double num1 = Double.parseDouble(txt1.getText());
            double num2 = Double.parseDouble(txt2.getText());
            double result = 0;
            
            if (ae.getSource() == btn1) {
                result = num1 + num2;
            } else if (ae.getSource() == btn2) {
                result = num1 - num2;
            } else if (ae.getSource() == btn3) {
                result = num1 * num2;
            } else if (ae.getSource() == btn4) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    txt3.setText("Error: Division by zero");
                    return;
                }
            }
            txt3.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            txt3.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new SwingCalculator();
    }
}