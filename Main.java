package kalkulator;

import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		
		JTextField l;
		JFrame f = new JFrame();
		l = new JTextField(16);
		JButton b=new JButton("0");//creating instance of JButton 
		JButton c=new JButton("1");
		JButton d=new JButton("2");
		JButton e=new JButton("3");
		JButton f1=new JButton("4");
		JButton g=new JButton("5");
		JButton h=new JButton("6");
		JButton i=new JButton("7");
		JButton j=new JButton("8");
		JButton k=new JButton("9");
		JButton beq1 = new JButton("=");
		JButton	ba = new JButton("+");
        JButton bs = new JButton("-");
        JButton bd = new JButton("/");
        JButton bm = new JButton("*");
        JButton beq = new JButton("C");
		b.setBounds(140,400,100, 60);//x axis, y axis, width, height  
		c.setBounds(10,220,100, 60);      
		f.add(b);//adding button in JFrame  
		f.add(c);
		d.setBounds(140,220,100, 60);//x axis, y axis, width, height  
		e.setBounds(270,220,100, 60);      
		f.add(d);//adding button in JFrame  
		f.add(e);    
		f1.setBounds(10,280,100, 60);//x axis, y axis, width, height  
		g.setBounds(140,280,100, 60);      
		f.add(f1);//adding button in JFrame  
		f.add(g);    
		h.setBounds(270,280,100, 60);//x axis, y axis, width, height  
		i.setBounds(10,340,100, 60);      
		f.add(h);//adding button in JFrame  
		f.add(i);    
		j.setBounds(140,340,100, 60);//x axis, y axis, width, height  
		k.setBounds(270,340,100, 60);      
		f.add(j);//adding button in JFrame  
		f.add(k);    
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		
		
		
		Calculator calculator = new Calculator();
		char symbol;
		Double number1, number2;
		Double result;

		Scanner input = new Scanner(System.in);

		System.out.println("Podaj symbol");
		symbol = input.next().charAt(0);
		System.out.println("Podaj liczbe");
		number1 = input.nextDouble();
		System.out.println("Podaj liczbe");
		number2 = input.nextDouble();

		switch (symbol) {
		case '+':
			System.out.println(number1 + " + " + number2 + " = " + calculator.add(number1, number2));
			break;
		case '-':
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;
		case '*':
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;
		case '/':

			try {
				System.out.println(number1 + " / " + number2 + " = " + calculator.divide(number1, number2));
			} catch (IllegalArgumentException error) {
				System.out.println("Exception " + error.getMessage());

			} finally {

				System.out.println("koniec");
			}
			break;
		default:
			System.out.println("Zły Symbol");
			break;
		}
		input.close();

	}

	private static void calculator() {
		// TODO Auto-generated method stub
		
	}

}
