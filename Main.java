package kalkulator;


import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main implements ActionListener {
   private static JTextField inputBox;

   Main(){}
   public static void main(String[] args) {
      createWindow();
   }

   private static void createWindow() {          
      JFrame frame = new JFrame("Calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      createUI(frame);
      frame.setSize(200, 200);            
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   private static void createUI(JFrame frame) {
      JPanel panel = new JPanel();
      Main calculator = new Main();
      GridBagLayout layout = new GridBagLayout();          
      GridBagConstraints gbc = new GridBagConstraints();
      panel.setLayout(layout);
       
      inputBox = new JTextField(10);        
      inputBox.setEditable(false);

      JButton button0 = new JButton("0");JButton button1 = new JButton("1");
      JButton button2 = new JButton("2");JButton button3 = new JButton("3");
      JButton button4 = new JButton("4");JButton button5 = new JButton("5");
      JButton button6 = new JButton("6");JButton button7 = new JButton("7");
      JButton button8 = new JButton("8");JButton button9 = new JButton("9");

      JButton buttonPlus = new JButton("+");JButton buttonMinus = new JButton("-");
      JButton buttonDivide = new JButton("/");JButton buttonMultiply = new JButton("*");
      JButton buttonClear = new JButton("C");JButton buttonDot = new JButton(".");
      JButton buttonEquals = new JButton("=");

      button1.addActionListener((ActionListener) calculator);button2.addActionListener((ActionListener) calculator);
      button3.addActionListener((ActionListener) calculator);button4.addActionListener((ActionListener) calculator);
      button5.addActionListener((ActionListener) calculator);button6.addActionListener((ActionListener) calculator);
      button7.addActionListener((ActionListener) calculator);button8.addActionListener((ActionListener) calculator);
      button9.addActionListener((ActionListener) calculator);button0.addActionListener((ActionListener) calculator);

      buttonPlus.addActionListener((ActionListener) calculator);buttonMinus.addActionListener((ActionListener) calculator);
      buttonDivide.addActionListener((ActionListener) calculator);buttonMultiply.addActionListener((ActionListener) calculator);
      buttonClear.addActionListener((ActionListener) calculator);buttonDot.addActionListener((ActionListener) calculator);
      buttonEquals.addActionListener((ActionListener) calculator);

      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridx = 0; gbc.gridy = 0; panel.add(button1, gbc);        
      gbc.gridx = 1; gbc.gridy = 0; panel.add(button2, gbc);
      gbc.gridx = 2; gbc.gridy = 0; panel.add(button3, gbc);
      gbc.gridx = 3; gbc.gridy = 0; panel.add(buttonPlus, gbc);
      gbc.gridx = 0; gbc.gridy = 1; panel.add(button4, gbc);
      gbc.gridx = 1; gbc.gridy = 1; panel.add(button5, gbc);
      gbc.gridx = 2; gbc.gridy = 1; panel.add(button6, gbc);
      gbc.gridx = 3; gbc.gridy = 1; panel.add(buttonMinus, gbc);
      gbc.gridx = 0; gbc.gridy = 2; panel.add(button7, gbc);
      gbc.gridx = 1; gbc.gridy = 2; panel.add(button8, gbc);
      gbc.gridx = 2; gbc.gridy = 2; panel.add(button9, gbc);
      gbc.gridx = 3; gbc.gridy = 2; panel.add(buttonDivide, gbc);
      gbc.gridx = 0; gbc.gridy = 3; panel.add(buttonDot, gbc);
      gbc.gridx = 1; gbc.gridy = 3; panel.add(button0, gbc);
      gbc.gridx = 2; gbc.gridy = 3; panel.add(buttonClear, gbc);
      gbc.gridx = 3; gbc.gridy = 3; panel.add(buttonMultiply, gbc);
      gbc.gridwidth = 3;

      gbc.gridx = 0; gbc.gridy = 4; panel.add(inputBox, gbc);        
      gbc.gridx = 3; gbc.gridy = 4; panel.add(buttonEquals, gbc);
      frame.getContentPane().add(panel, BorderLayout.CENTER);        
   }

   public void actionPerformed(ActionEvent e) {
      String command = e.getActionCommand();
      if (command.charAt(0) == 'C') {                      
         inputBox.setText("");
      }else if (command.charAt(0) == '=') {                    
         inputBox.setText(evaluate(inputBox.getText()));
      }else {                                
         inputBox.setText(inputBox.getText() + command);
      }
   }
 
   public static String evaluate(String expression) {
      char[] arr = expression.toCharArray();
      String operand1 = "";String operand2 = "";String operator = "";
      double result = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
            if(operator.isEmpty()){
               operand1 += arr[i];
            }else{
               operand2 += arr[i];
            }
         }  

         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
            operator += arr[i];
         }
      }

      if (operator.equals("+"))
         result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
      else if (operator.equals("-"))
         result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
      else if (operator.equals("/"))
         result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
      else if (operator.equals("*"))
         result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));          
      return operand1 + operator + operand2 + "=" + result;
   }    
} 
//		//
//		
//		Calculator calculator = new Calculator();
//		char symbol;
//		Double number1, number2;
//		Double result;
//
//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Podaj symbol");
//		symbol = input.next().charAt(0);
//		System.out.println("Podaj liczbe");
//		number1 = input.nextDouble();
//		System.out.println("Podaj liczbe");
//		number2 = input.nextDouble();
//
//		switch (symbol) {
//		case '+':
//			System.out.println(number1 + " + " + number2 + " = " + calculator.add(number1, number2));
//			break;
//		case '-':
//			result = number1 - number2;
//			System.out.println(number1 + " - " + number2 + " = " + result);
//			break;
//		case '*':
//			result = number1 * number2;
//			System.out.println(number1 + " * " + number2 + " = " + result);
//			break;
//		case '/':
//
//			try {
//				System.out.println(number1 + " / " + number2 + " = " + calculator.divide(number1, number2));
//			} catch (IllegalArgumentException error) {
//				System.out.println("Exception " + error.getMessage());
//
//			} finally {
//
//				System.out.println("koniec");
//			}
//			break;
//		default:
//			System.out.println("Zły Symbol");
//			break;
//		}
//		input.close();
//
//	}
//
//	private static void calculator() {
//		
//	}
//
//}
