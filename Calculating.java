/*
# Name: Dashawn Richardson
         # Date: 5/1/2024
         # This assignment requires you to create a Java application that implements a scientific calculator.
         project focus on GUI and learn how to implement proper use of buttons as in trig, and basic function of a
         calculator
*/


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculating {

    double first;
    double second;

    double product;

    String ans;
    String oper;

    private JPanel Calculator;
    private JButton sinhButton;
    private JButton asinButton;
    private JButton sinButton;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton button11;
    private JButton cosButton;
    private JButton acosButton;
    private JButton coshButton;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button18;
    private JButton tanButton;
    private JButton atanButton;
    private JButton tanhButton;
    private JButton cButton;
    private JButton xButton;
    private JButton button24;
    private JButton button25;
    private JButton a1NButton;
    private JButton logButton;
    private JButton a10NButton;
    private JButton EXITButton;
    private JButton button30;
    private JButton button31;
    private JButton modButton;
    private JButton button33;
    private JButton lnButton;
    private JButton absButton;
    private JButton xButton1;
    private JButton xButton2;
    private JButton button40;
    private JTextField textField1;
    private JTextField textField2;

    public Calculating() {
        try {
            //action buttons for most of basic function
            a1Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textField1.getText() + a1Button.getText();
                    textField1.setText("");
                    textField1.setText(number);
                }
            });
            a0Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textField1.getText() + a0Button.getText();
                    textField1.setText("");
                    textField1.setText(number);
                }
            });
            a2Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textField1.getText() + a2Button.getText();
                    textField1.setText("");
                    textField1.setText(number);
                }
            });
            a3Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textField1.getText() + a3Button.getText();
                    textField1.setText("");
                    textField1.setText(number);
                }
            });
            a4Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textField1.getText() + a4Button.getText();
                    textField1.setText("");
                    textField1.setText(number);
                }
            });
            a5Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textField1.getText() + a5Button.getText();
                    textField1.setText("");
                    textField1.setText(number);
                }
            });
            a6Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textField1.getText() + a6Button.getText();
                    textField1.setText("");
                    textField1.setText(number);
                }
            });
            a7Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String number = textField1.getText() + a7Button.getText();
                    textField1.setText("");
                    textField1.setText(number);
                }
            });
            a8Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textField1.getText() + a8Button.getText();
                    textField1.setText("");
                    textField1.setText(number);
                }
            });
            a9Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textField1.getText() + a9Button.getText();
                    textField1.setText("");
                    textField1.setText(number);
                }
            });
            //start of action buttons of my operators
            button30.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    first = Double.parseDouble(textField1.getText());
                    textField1.setText("");
                    oper = "÷";
                }
            });
            button31.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    first = Double.parseDouble(textField1.getText());
                    textField1.setText("");
                    oper = "-";
                }
            });
            button24.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    first = Double.parseDouble(textField1.getText());
                    textField1.setText("");
                    oper = "+";
                }
            });
            button33.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    first = Double.parseDouble(textField1.getText());
                    textField1.setText("");
                    oper = "%";
                }
            });
                //action listener for my "=" operator to decide which to use
            button25.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    second = Double.parseDouble(textField1.getText());
                    if (oper == "+") {
                        product = first + second;
                        ans = String.format("%.1f", product);
                        textField1.setText(ans);
                        textField2.setText(ans);
                    } else if (oper == "-") {
                        product = first - second;
                        ans = String.format("%.2f", product);
                        textField1.setText(ans);
                        textField2.setText(ans);
                    } else if (oper == "÷") {
                        if(second != 0){
                                product = first / second;
                            }else{
                            JOptionPane.showMessageDialog(null,"Can't do this, Sorry");
                        }
                        ans = String.format("%.2f", product);
                        textField1.setText(ans);
                        textField2.setText(ans);
                    } else if (oper == "x") {
                        product = first * second;
                        ans = String.format("%.1f", product);
                        textField1.setText(ans);
                        textField2.setText(ans);
                    } else if (oper == "%") {
                        product = (first / second) * 100;
                        ans = String.format("%.2f", product);
                        textField1.setText(ans);
                        textField2.setText(ans);
                    } else if (oper == "Mod") {
                        product = first % second;
                        ans = String.format("%.2f", product);
                        textField1.setText(ans);
                        textField2.setText(ans);
                    }
                    textField1.setText("");

                }
            });
            //action button for my null
            cButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText(null);
                }
            });
            //more operators and my trig buttons
            xButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    first = Double.parseDouble(textField1.getText());
                    textField1.setText("");
                    oper = "x";
                }
            });
            sinButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.sin(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            cosButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.cos(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            tanButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.tan(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            asinButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.asin(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            acosButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.acos(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            atanButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.atan(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            sinhButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.sinh(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            coshButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.cosh(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            tanhButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.tanh(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            logButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.log10(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            button18.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Double.parseDouble(String.valueOf(textField1.getText()));
                    //IDk if your okay with this but I found this online to quick check negative or positive
                    value = value * (-1);
                    textField1.setText(String.valueOf(value));
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            xButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = (Double.parseDouble(textField1.getText()));
                    value = value * value;
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            xButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = (Double.parseDouble(textField1.getText()));
                    value = value * value * value;
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            button40.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.sqrt(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            EXITButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            absButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.abs(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");

                }
            });
            lnButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.log(Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            modButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    first = Double.parseDouble(textField1.getText());
                    textField1.setText("");
                    oper = "Mod";
                }
            });
            a10NButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = Math.pow(10, Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
            a1NButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double value = 1 / (Double.parseDouble(textField1.getText()));
                    textField1.setText("");
                    textField2.setText("");
                    textField1.setText(textField1.getText() + value);
                    textField2.setText(textField1.getText());
                    textField1.setText("");
                }
            });
        }catch (Exception e){
            textField2.setText("Error");
        }
    }

    public static void main(String[] args) {
        //main method calls in and opens the panel 
        JFrame frame = new JFrame("Calculating");
        frame.setContentPane(new Calculating().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
