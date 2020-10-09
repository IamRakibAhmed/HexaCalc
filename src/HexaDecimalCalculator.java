/*
  @author Rakib Ahmed
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HexaDecimalCalculator extends JFrame implements calculations {
    private String sign;
    private int toBeCalculatedValue;

    private JLabel jLabel1;
    private JTextField jTextField1;

    public HexaDecimalCalculator() {
        init();
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            Logger.getLogger(HexaDecimalCalculator.class.getName()).log(Level.SEVERE, null, e);
        }
        EventQueue.invokeLater(() -> new HexaDecimalCalculator().setVisible(true));
    }

    private void init() {
        JButton buttonF = new JButton();
        JButton buttonCE = new JButton();
        JButton buttonAC = new JButton();
        JButton buttonDEL = new JButton();
        JButton buttonE = new JButton();
        JButton buttonD = new JButton();
        JButton buttonC = new JButton();
        JButton buttonDIV = new JButton();
        JButton buttonB = new JButton();
        JButton buttonA = new JButton();
        JButton button9 = new JButton();
        JButton buttonMULTI = new JButton();
        JButton button8 = new JButton();
        JButton button7 = new JButton();
        JButton button6 = new JButton();
        JButton buttonMIN = new JButton();
        JButton button5 = new JButton();
        JButton button4 = new JButton();
        JButton button3 = new JButton();
        JButton buttonPLUS = new JButton();
        JButton button2 = new JButton();
        JButton button1 = new JButton();
        JButton button0 = new JButton();
        JButton buttonEQUAL = new JButton();
        jTextField1 = new JTextField();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("HexaCalc");
        setResizable(false);

        buttonF.setBackground(SystemColor.activeCaption);
        buttonF.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonF.setText("F");
        buttonF.addActionListener(this::ButtonFActionPerformed);

        buttonCE.setBackground(new Color(255, 255, 204));
        buttonCE.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonCE.setText("CE");
        buttonCE.addActionListener(this::ButtonCEActionPerformed);

        buttonAC.setBackground(new Color(255, 255, 204));
        buttonAC.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonAC.setText("AC");
        buttonAC.addActionListener(this::ButtonACActionPerformed);

        buttonDEL.setBackground(new Color(255, 255, 204));
        buttonDEL.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonDEL.setText("DEL");
        buttonDEL.addActionListener(this::ButtonDELActionPerformed);

        buttonE.setBackground(SystemColor.activeCaption);
        buttonE.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonE.setText("E");
        buttonE.addActionListener(this::ButtonEActionPerformed);

        buttonD.setBackground(SystemColor.activeCaption);
        buttonD.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonD.setText("D");
        buttonD.addActionListener(this::ButtonDActionPerformed);

        buttonC.setBackground(SystemColor.activeCaption);
        buttonC.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonC.setText("C");
        buttonC.addActionListener(this::ButtonCActionPerformed);

        buttonDIV.setBackground(Color.orange);
        buttonDIV.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonDIV.setText("÷");
        buttonDIV.addActionListener(this::ButtonDIVActionPerformed);

        buttonB.setBackground(SystemColor.activeCaption);
        buttonB.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonB.setText("B");
        buttonB.addActionListener(this::ButtonBActionPerformed);

        buttonA.setBackground(SystemColor.activeCaption);
        buttonA.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonA.setText("A");
        buttonA.addActionListener(this::ButtonAActionPerformed);

        button9.setBackground(SystemColor.activeCaption);
        button9.setFont(new Font("Tahoma", Font.BOLD, 18));
        button9.setText("9");
        button9.addActionListener(this::Button9ActionPerformed);

        buttonMULTI.setBackground(Color.orange);
        buttonMULTI.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonMULTI.setText("×");
        buttonMULTI.addActionListener(this::ButtonMULTIActionPerformed);

        button8.setBackground(SystemColor.activeCaption);
        button8.setFont(new Font("Tahoma", Font.BOLD, 18));
        button8.setText("8");
        button8.addActionListener(this::Button8ActionPerformed);

        button7.setBackground(SystemColor.activeCaption);
        button7.setFont(new Font("Tahoma", Font.BOLD, 18));
        button7.setText("7");
        button7.addActionListener(this::Button7ActionPerformed);

        button6.setBackground(SystemColor.activeCaption);
        button6.setFont(new Font("Tahoma", Font.BOLD, 18));
        button6.setText("6");
        button6.addActionListener(this::Button6ActionPerformed);

        buttonMIN.setBackground(Color.orange);
        buttonMIN.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonMIN.setText("-");
        buttonMIN.addActionListener(this::ButtonMINActionPerformed);

        button5.setBackground(SystemColor.activeCaption);
        button5.setFont(new Font("Tahoma", Font.BOLD, 18));
        button5.setText("5");
        button5.addActionListener(this::Button5ActionPerformed);

        button4.setBackground(SystemColor.activeCaption);
        button4.setFont(new Font("Tahoma", Font.BOLD, 18));
        button4.setText("4");
        button4.addActionListener(this::Button4ActionPerformed);

        button3.setBackground(SystemColor.activeCaption);
        button3.setFont(new Font("Tahoma", Font.BOLD, 18));
        button3.setText("3");
        button3.addActionListener(this::Button3ActionPerformed);

        buttonPLUS.setBackground(Color.orange);
        buttonPLUS.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonPLUS.setText("+");
        buttonPLUS.addActionListener(this::ButtonPLUSActionPerformed);

        button2.setBackground(SystemColor.activeCaption);
        button2.setFont(new Font("Tahoma", Font.BOLD, 18));
        button2.setText("2");
        button2.addActionListener(this::Button2ActionPerformed);

        button1.setBackground(SystemColor.activeCaption);
        button1.setFont(new Font("Tahoma", Font.BOLD, 18));
        button1.setText("1");
        button1.addActionListener(this::Button1ActionPerformed);

        button0.setBackground(SystemColor.activeCaption);
        button0.setFont(new Font("Tahoma", Font.BOLD, 18));
        button0.setText("0");
        button0.addActionListener(this::Button0ActionPerformed);

        buttonEQUAL.setBackground(new Color(255, 255, 204));
        buttonEQUAL.setFont(new Font("Tahoma", Font.BOLD, 18));
        buttonEQUAL.setText("=");
        buttonEQUAL.addActionListener(this::ButtonEQUALActionPerformed);

        jTextField1.setEditable(false);
        jTextField1.setFont(new Font("Tahoma", Font.BOLD, 24));
        jTextField1.setHorizontalAlignment(JTextField.RIGHT);
        jTextField1.setBorder(BorderFactory.createEtchedBorder());

        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel1.setForeground(new Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(button9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(button8, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(buttonF, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(buttonE, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addComponent(buttonD, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addComponent(buttonC, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(buttonB, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(buttonA, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(buttonEQUAL, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button0, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(buttonMIN, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(buttonMULTI, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(buttonAC, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                                        .addComponent(buttonDIV, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(buttonPLUS, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(button3, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                                        .addComponent(button6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(buttonCE, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(buttonDEL, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button9, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button8, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonAC, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonCE, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonDEL, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button0, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonDIV, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonF, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonE, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonD, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonMULTI, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonC, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonB, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonA, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonMIN, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonEQUAL, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonPLUS, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void ButtonACActionPerformed(ActionEvent e) {
        jTextField1.setText("");
        jLabel1.setText("");
    }

    private void ButtonCActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "C");
    }

    private void Button9ActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "9");
    }

    private void Button6ActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "6");
    }

    private void Button3ActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "3");
    }

    private void Button0ActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "0");
    }

    private void Button1ActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "1");
    }

    private void Button2ActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "2");
    }

    private void Button4ActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "4");
    }

    private void Button5ActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "5");
    }

    private void Button7ActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "7");
    }

    private void Button8ActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "8");
    }

    private void ButtonAActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "A");
    }

    private void ButtonBActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "B");
    }

    private void ButtonDActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "D");
    }

    private void ButtonEActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "E");
    }

    private void ButtonFActionPerformed(ActionEvent e) {
        jTextField1.setText(jTextField1.getText() + "F");
    }

    private void ButtonCEActionPerformed(ActionEvent e) {
        jTextField1.setText("");
    }

    private void ButtonDIVActionPerformed(ActionEvent e) {
        sign = "÷";

        if (jTextField1.getText().length() > 0)
            storeToBeCalculatedValue(sign);
    }

    private void ButtonMULTIActionPerformed(ActionEvent e) {
        sign = "×";

        if (jTextField1.getText().length() > 0)
            storeToBeCalculatedValue(sign);
    }

    private void ButtonMINActionPerformed(ActionEvent e) {
        sign = "-";

        if (jTextField1.getText().length() > 0)
            storeToBeCalculatedValue(sign);
    }

    private void ButtonPLUSActionPerformed(ActionEvent e) {
        sign = "+";

        if (jTextField1.getText().length() > 0)
            storeToBeCalculatedValue(sign);
    }

    private void ButtonDELActionPerformed(ActionEvent e) {
        String value = jTextField1.getText();
        int length = value.length();

        if (length > 0) {
            StringBuilder builder = new StringBuilder(value);
            builder.deleteCharAt(length - 1);
            jTextField1.setText(builder.toString());
        }
    }

    private void ButtonEQUALActionPerformed(ActionEvent e) {
        if (jTextField1.getText().length() > 0) {
            String value = jTextField1.getText();
            int b = hexaToDec(value);

            if (null != sign)
                switch (sign) {
                    case "+":
                        add(toBeCalculatedValue, b);
                        break;
                    case "-":
                        subtract(toBeCalculatedValue, b);
                        break;
                    case "×":
                        multiply(toBeCalculatedValue, b);
                        break;
                    case "÷":
                        divide(toBeCalculatedValue, b);
                        break;
                    default:
                        break;
                }
        }
    }

    @Override
    public void add(int a, int b) {
        setResult(a + b);
    }

    @Override
    public void subtract(int a, int b) {
        setResult(a - b);
    }

    @Override
    public void multiply(int a, int b) {
        setResult(a * b);
    }

    @Override
    public void divide(int a, int b) {
        setResult(a / b);
    }

    private void setResult(int result) {
        String res = decToHexa(result);
        jTextField1.setText(res);
        jLabel1.setText("");
    }

    private void storeToBeCalculatedValue(String sign) {
        String value = jTextField1.getText();

        toBeCalculatedValue = hexaToDec(value);
        jLabel1.setText(value + " " + sign);
        jTextField1.setText("");
    }

    @Override
    public int hexaToDec(String value) {
        String digits = "0123456789ABCDEF";
        int val = 0;
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    @Override
    public String decToHexa(int value) {
        int rem;
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (value > 0) {
            rem = value % 16;
            hex.insert(0, hexChars[rem]);
            value /= 16;
        }
        return hex.toString();
    }
}
