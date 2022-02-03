package cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 312, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 24, 278, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uF0E7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace =str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnNewButton.setFont(new Font("Wingdings", Font.BOLD, 15));
		btnNewButton.setBounds(10, 98, 72, 55);
		frame.getContentPane().add(btnNewButton);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number7=textField.getText()+btn7.getText();
				textField.setText(number7);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(10, 150, 72, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number4=textField.getText()+btn4.getText();
				textField.setText(number4);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(10, 203, 72, 48);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn1.setBounds(10, 250, 72, 48);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number2=textField.getText()+btn0.getText();
				textField.setText(number2);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(10, 296, 72, 55);
		frame.getContentPane().add(btn0);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnclear.setBounds(80, 98, 72, 55);
		frame.getContentPane().add(btnclear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number8=textField.getText()+btn8.getText();
				textField.setText(number8);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(80, 150, 72, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number5=textField.getText()+btn5.getText();
				textField.setText(number5);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(80, 203, 72, 48);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number2=textField.getText()+btn2.getText();
				textField.setText(number2);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(80, 250, 72, 48);
		frame.getContentPane().add(btn2);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number2=textField.getText()+btndot.getText();
				textField.setText(number2);
				
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btndot.setBounds(80, 296, 72, 55);
		frame.getContentPane().add(btndot);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number2=textField.getText()+btn00.getText();
				textField.setText(number2);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn00.setBounds(149, 98, 72, 55);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number9=textField.getText()+btn9.getText();
				textField.setText(number9);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(149, 150, 72, 55);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number6=textField.getText()+btn6.getText();
				textField.setText(number6);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(149, 203, 72, 48);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number3=textField.getText()+btn3.getText();
				textField.setText(number3);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(149, 250, 72, 48);
		frame.getContentPane().add(btn3);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
		
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
				}
				
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnequal.setBounds(149, 296, 72, 55);
		frame.getContentPane().add(btnequal);
		
		JButton btnsum = new JButton("+");
		btnsum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnsum.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnsum.setBounds(216, 98, 72, 55);
		frame.getContentPane().add(btnsum);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnsub.setBounds(216, 150, 72, 55);
		frame.getContentPane().add(btnsub);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnmul.setBounds(217, 203, 71, 48);
		frame.getContentPane().add(btnmul);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 15));
		btndiv.setBounds(217, 250, 71, 48);
		frame.getContentPane().add(btndiv);
		
		JButton btnNewButton_19 = new JButton("%");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_19.setBounds(216, 296, 72, 55);
		frame.getContentPane().add(btnNewButton_19);
	}
}
