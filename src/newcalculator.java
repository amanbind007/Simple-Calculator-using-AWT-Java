import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class newcalculator {

	private JFrame frmSimpleCalculator;
	double firstNo, secondNo, result;
	String operation;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newcalculator window = new newcalculator();
					window.frmSimpleCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public newcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frmSimpleCalculator = new JFrame();
		frmSimpleCalculator.setTitle("Calculator - Aman Bind");
		frmSimpleCalculator.getContentPane().setBackground(Color.DARK_GRAY);
		frmSimpleCalculator.setBounds(100, 100, 329, 275);
		frmSimpleCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimpleCalculator.getContentPane().setLayout(null);
		
		TextField textField = new TextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setFont(new Font("Dialog", Font.PLAIN, 20));
		textField.setBounds(10, 10, 293, 37);
		frmSimpleCalculator.getContentPane().add(textField);
		
		Button button_1 = new Button("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "1";
				textField.setText(temp);
			}
		});
		button_1.setForeground(Color.ORANGE);
		button_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(10, 59, 53, 30);
		frmSimpleCalculator.getContentPane().add(button_1);
		
		Button button_2 = new Button("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "2";
				textField.setText(temp);
			}
		});
		button_2.setForeground(Color.ORANGE);
		button_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_2.setBackground(Color.GRAY);
		button_2.setBounds(86, 59, 53, 30);
		frmSimpleCalculator.getContentPane().add(button_2);
		
		Button button_3 = new Button("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "3";
				textField.setText(temp);
			}
		});
		button_3.setForeground(Color.ORANGE);
		button_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_3.setBackground(Color.GRAY);
		button_3.setBounds(159, 59, 56, 30);
		frmSimpleCalculator.getContentPane().add(button_3);
		
		Button button_4 = new Button("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "4";
				textField.setText(temp);
			}
		});
		button_4.setForeground(Color.ORANGE);
		button_4.setBackground(Color.GRAY);
		button_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_4.setBounds(10, 105, 53, 30);
		frmSimpleCalculator.getContentPane().add(button_4);
		
		Button button_5 = new Button("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "5";
				textField.setText(temp);
			}
		});
		button_5.setBackground(Color.GRAY);
		button_5.setForeground(Color.ORANGE);
		button_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_5.setBounds(86, 105, 53, 30);
		frmSimpleCalculator.getContentPane().add(button_5);
		
		Button button_6 = new Button("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "6";
				textField.setText(temp);
			}
		});
		button_6.setForeground(Color.ORANGE);
		button_6.setBackground(Color.GRAY);
		button_6.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_6.setBounds(159, 105, 56, 30);
		frmSimpleCalculator.getContentPane().add(button_6);
		
		Button button_7 = new Button("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "7";
				textField.setText(temp);
			}
		});
		button_7.setBackground(Color.GRAY);
		button_7.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_7.setForeground(Color.ORANGE);
		button_7.setBounds(10, 150, 53, 30);
		frmSimpleCalculator.getContentPane().add(button_7);
		
		Button button_8 = new Button("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "8";
				textField.setText(temp);
			}
		});
		button_8.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_8.setBackground(Color.GRAY);
		button_8.setForeground(Color.ORANGE);
		button_8.setBounds(86, 150, 53, 30);
		frmSimpleCalculator.getContentPane().add(button_8);
		
		Button button_9 = new Button("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "9";
				textField.setText(temp);
			}
		});
		button_9.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_9.setBackground(Color.GRAY);
		button_9.setForeground(Color.ORANGE);
		button_9.setBounds(159, 150, 56, 30);
		frmSimpleCalculator.getContentPane().add(button_9);
		
		Button button_Add = new Button("+");
		button_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo = Double.parseDouble(textField.getText());
				operation = "+";
				textField.setText("");
			}
		});
		button_Add.setBackground(Color.ORANGE);
		button_Add.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_Add.setBounds(250, 59, 53, 30);
		frmSimpleCalculator.getContentPane().add(button_Add);
		
		Button button_Sub = new Button("-");
		button_Sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo = Double.parseDouble(textField.getText());
				operation = "-";
				textField.setText("");
			}
		});
		button_Sub.setBackground(Color.ORANGE);
		button_Sub.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_Sub.setBounds(250, 105, 53, 30);
		frmSimpleCalculator.getContentPane().add(button_Sub);
		
		Button button_Div = new Button("\u00F7");
		button_Div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo = Double.parseDouble(textField.getText());
				operation = "/";
				textField.setText("");
			}
		});
		button_Div.setBackground(Color.ORANGE);
		button_Div.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_Div.setBounds(250, 150, 53, 30);
		frmSimpleCalculator.getContentPane().add(button_Div);
		
		Button button_0 = new Button("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = textField.getText() + "0";
				textField.setText(temp);
			}
		});
		button_0.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_0.setBackground(Color.GRAY);
		button_0.setForeground(Color.ORANGE);
		button_0.setBounds(86, 194, 53, 30);
		frmSimpleCalculator.getContentPane().add(button_0);
		
		Button button_Mul = new Button("\u00D7");
		button_Mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNo = Double.parseDouble(textField.getText());
				operation = "*";
				textField.setText("");
			}
		});
		button_Mul.setBackground(Color.ORANGE);
		button_Mul.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_Mul.setBounds(250, 194, 53, 30);
		frmSimpleCalculator.getContentPane().add(button_Mul);
		
		Button button_Equal = new Button("=");
		button_Equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNo = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = firstNo + secondNo;
					textField.setText(result+"");
				}
				else if (operation == "-") {
					result = firstNo - secondNo;
					textField.setText(result+"");
				}
				else if (operation == "/") {
					result = firstNo/secondNo;
					textField.setText(result+"");
				}
				else if(operation == "*") {
					result = firstNo*secondNo;
					textField.setText(result+"");
				}
			}
		});
		button_Equal.setBackground(Color.GREEN);
		button_Equal.setFont(new Font("Dialog", Font.PLAIN, 24));
		button_Equal.setBounds(159, 194, 56, 30);
		frmSimpleCalculator.getContentPane().add(button_Equal);
		
		Button button_CE = new Button("CE");
		button_CE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				operation = "";
			}
		});
		button_CE.setBackground(Color.RED);
		button_CE.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_CE.setBounds(10, 194, 53, 30);
		frmSimpleCalculator.getContentPane().add(button_CE);
	}
}
