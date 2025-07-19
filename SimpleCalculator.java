import java.util.Scanner;










//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class SimpleCalculator extends JFrame implements ActionListener {
//    private JTextField inputField;
//    private JButton[] numberButtons = new JButton[10];
//    private JButton[] functionButtons = new JButton[4]; // +, -, *, /
//    private JButton addButton, subButton, mulButton, divButton, eqButton, clrButton;
//    private JPanel panel;
//
//    private double num1, num2, result;
//    private char operator;
//
//    public SimpleCalculator() {
//        // Frame settings
//        setTitle("Simple Calculator");
//        setSize(350, 450);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(null);
//
//        // Input Field
//        inputField = new JTextField();
//        inputField.setBounds(30, 30, 270, 40);
//        inputField.setEditable(false);
//        add(inputField);
//
//        // Function buttons
//        addButton = new JButton("+");
//        subButton = new JButton("-");
//        mulButton = new JButton("*");
//        divButton = new JButton("/");
//        eqButton = new JButton("=");
//        clrButton = new JButton("C");
//
//        functionButtons[0] = addButton;
//        functionButtons[1] = subButton;
//        functionButtons[2] = mulButton;
//        functionButtons[3] = divButton;
//
//        for (int i = 0; i < 4; i++) {
//            functionButtons[i].addActionListener(this);
//        }
//
//        eqButton.addActionListener(this);
//        clrButton.addActionListener(this);
//
//        // Number buttons
//        for (int i = 0; i < 10; i++) {
//            numberButtons[i] = new JButton(String.valueOf(i));
//            numberButtons[i].addActionListener(this);
//        }
//
//        // Panel for buttons
//        panel = new JPanel();
//        panel.setBounds(30, 100, 270, 300);
//        panel.setLayout(new GridLayout(4, 4, 10, 10));
//
//        // Adding buttons to panel
//        for (int i = 1; i <= 9; i++) {
//            panel.add(numberButtons[i]);
//        }
//        panel.add(addButton);
//        panel.add(numberButtons[0]);
//        panel.add(subButton);
//        panel.add(mulButton);
//        panel.add(divButton);
//        panel.add(eqButton);
//        panel.add(clrButton);
//
//        add(panel);
//        setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        for (int i = 0; i < 10; i++) {
//            if (e.getSource() == numberButtons[i]) {
//                inputField.setText(inputField.getText().concat(String.valueOf(i)));
//            }
//        }
//        if (e.getSource() == addButton) {
//            num1 = Double.parseDouble(inputField.getText());
//            operator = '+';
//            inputField.setText("");
//        } else if (e.getSource() == subButton) {
//            num1 = Double.parseDouble(inputField.getText());
//            operator = '-';
//            inputField.setText("");
//        } else if (e.getSource() == mulButton) {
//            num1 = Double.parseDouble(inputField.getText());
//            operator = '*';
//            inputField.setText("");
//        } else if (e.getSource() == divButton) {
//            num1 = Double.parseDouble(inputField.getText());
//            operator = '/';
//            inputField.setText("");
//        } else if (e.getSource() == eqButton) {
//            num2 = Double.parseDouble(inputField.getText());
//            switch (operator) {
//                case '+' -> result = num1 + num2;
//                case '-' -> result = num1 - num2;
//                case '*' -> result = num1 * num2;
//                case '/' -> result = num1 / num2;
//            }
//            inputField.setText(String.valueOf(result));
//        } else if (e.getSource() == clrButton) {
//            inputField.setText("");
//        }
//    }
//
//    public static void main(String[] args) {
//        new SimpleCalculator();
//    }
//}
