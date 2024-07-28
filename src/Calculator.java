import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
    
    boolean isOperatorClicked = false;
    String oldValue;
    String operator;
    
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton, eightButton, nineButton, clearButton;
    JButton fourButton, minusButton, plusButton;
    JButton fiveButton, sixButton, dotButton, zeroButton, equalButton;
    JButton oneButton, twoButton, threeButton, divButton, mulButton;

    public Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(400, 150);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.BOLD, 17));
        sevenButton.setBackground(Color.white);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.setFont(new Font("Arial", Font.BOLD, 17));
        eightButton.setBackground(Color.white);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setFont(new Font("Arial", Font.BOLD, 17));
        nineButton.setBackground(Color.white);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setFont(new Font("Arial", Font.BOLD, 17));
        fourButton.setBackground(Color.white);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 17));
        fiveButton.setBackground(Color.white);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setFont(new Font("Arial", Font.BOLD, 17));
        sixButton.setBackground(Color.white);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(new Font("Arial", Font.BOLD, 17));
        oneButton.setBackground(Color.white);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setFont(new Font("Arial", Font.BOLD, 17));
        twoButton.setBackground(Color.white);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setFont(new Font("Arial", Font.BOLD, 17));
        threeButton.setBackground(Color.white);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.setFont(new Font("Arial", Font.BOLD, 17));
        dotButton.setBackground(Color.white);
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 17));
        zeroButton.setBackground(Color.white);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.setFont(new Font("Arial", Font.BOLD, 17));
        equalButton.setBackground(Color.orange);
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divButton = new JButton("%");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(new Font("Arial", Font.BOLD, 17));
        divButton.setBackground(Color.white);
        divButton.addActionListener(this);
        jf.add(divButton);

        mulButton = new JButton("X");
        mulButton.setBounds(330, 230, 80, 80);
        mulButton.setFont(new Font("Arial", Font.BOLD, 17));
        mulButton.setBackground(Color.white);
        mulButton.addActionListener(this);
        jf.add(mulButton);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        minusButton.setFont(new Font("Arial", Font.BOLD, 17));
        minusButton.setBackground(Color.white);
        minusButton.addActionListener(this);
        jf.add(minusButton);

        plusButton = new JButton("+");
        plusButton.setBounds(330, 430, 80, 80);
        plusButton.setFont(new Font("Arial", Font.BOLD, 17));
        plusButton.setBackground(Color.white);
        plusButton.addActionListener(this);
        jf.add(plusButton);

        clearButton = new JButton("clear");
        clearButton.setBounds(430, 430, 80, 80);
        clearButton.setFont(new Font("Arial", Font.BOLD, 17));
        clearButton.setBackground(Color.white);
        clearButton.addActionListener(this);
        jf.add(clearButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton) {
            if (isOperatorClicked) {
                displayLabel.setText("7");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "7");
            }
        } else if (e.getSource() == eightButton) {
            if (isOperatorClicked) {
                displayLabel.setText("8");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "8");
            }
        } else if (e.getSource() == nineButton) {
            if (isOperatorClicked) {
                displayLabel.setText("9");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "9");
            }
        } else if (e.getSource() == fourButton) {
            if (isOperatorClicked) {
                displayLabel.setText("4");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "4");
            }
        } else if (e.getSource() == fiveButton) {
            if (isOperatorClicked) {
                displayLabel.setText("5");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "5");
            }
        } else if (e.getSource() == sixButton) {
            if (isOperatorClicked) {
                displayLabel.setText("6");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "6");
            }
        } else if (e.getSource() == oneButton) {
            if (isOperatorClicked) {
                displayLabel.setText("1");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "1");
            }
        } else if (e.getSource() == twoButton) {
            if (isOperatorClicked) {
                displayLabel.setText("2");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "2");
            }
        } else if (e.getSource() == threeButton) {
            if (isOperatorClicked) {
                displayLabel.setText("3");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "3");
            }
        } else if (e.getSource() == zeroButton) {
            if (isOperatorClicked) {
                displayLabel.setText("0");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "0");
            }
        } else if (e.getSource() == dotButton) {
            displayLabel.setText(displayLabel.getText() + ".");
        } else if (e.getSource() == plusButton) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            operator = "+";
        } else if (e.getSource() == minusButton) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            operator = "-";
        } else if (e.getSource() == mulButton) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            operator = "*";
        } else if (e.getSource() == divButton) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            operator = "/";
        } else if (e.getSource() == clearButton) {
            displayLabel.setText("");
        } else if (e.getSource() == equalButton) {
            String newValue = displayLabel.getText();
            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);
            float result = 0;

            switch (operator) {
                case "+":
                    result = oldValueF + newValueF;
                    break;
                case "-":
                    result = oldValueF - newValueF;
                    break;
                case "*":
                    result = oldValueF * newValueF;
                    break;
                case "/":
                    result = oldValueF / newValueF;
                    break;
            }

            displayLabel.setText(result + "");
        }
    }
}

        
        	
        	
     

        	

			
		
        
        
        
        
        
	

	

	
        	
       
      	
				
   

	
