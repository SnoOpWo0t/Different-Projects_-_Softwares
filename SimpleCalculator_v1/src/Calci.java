import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Calci {

	private JFrame frame;
	private JTextField textField;
	double first,second,result;
	String operation,Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
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
	public Calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 401, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Roboto Medium", Font.BOLD | Font.ITALIC, 21));
		textField.setBounds(10, 10, 367, 67);
		frame.getContentPane().add(textField);
		textField.setColumns(1);
		
		JButton btnNewButton = new JButton("%");
		btnNewButton.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton.setForeground(new Color(255, 0, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="%";

			}
		});
		btnNewButton.setBounds(10, 87, 85, 62);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1.getText();
				textField.setText(number);

			}
		});
		btnNewButton_1.setForeground(new Color(255, 0, 128));
		btnNewButton_1.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_1.setBounds(10, 159, 85, 62);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_2.getText();
				textField.setText(number);

			}
		});
		btnNewButton_2.setForeground(new Color(255, 0, 128));
		btnNewButton_2.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_2.setBounds(10, 231, 85, 62);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("1");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_2_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_1.setForeground(new Color(255, 0, 128));
		btnNewButton_2_1.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_2_1.setBounds(10, 303, 85, 62);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Sqr");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1.setForeground(new Color(255, 0, 128));
		btnNewButton_2_1_1.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_2_1_1.setBounds(10, 372, 85, 62);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setForeground(new Color(255, 0, 128));
		btnC.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnC.setBounds(105, 87, 85, 62);
		frame.getContentPane().add(btnC);
		
		JButton btnNewButton_4 = new JButton("<~");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace = str.toString();
					textField.setText(backspace);
				}

			}
		});
		btnNewButton_4.setForeground(new Color(255, 0, 128));
		btnNewButton_4.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_4.setBounds(200, 87, 85, 62);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("-");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="-";

			}
		});
		btnNewButton_5.setForeground(new Color(255, 0, 128));
		btnNewButton_5.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_5.setBounds(295, 87, 85, 62);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_3_1 = new JButton("8");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_3_1.getText();
				textField.setText(number);

			}
		});
		btnNewButton_3_1.setForeground(new Color(255, 0, 128));
		btnNewButton_3_1.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_3_1.setBounds(105, 159, 85, 62);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("5");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_3_2.getText();
				textField.setText(number);

			}
		});
		btnNewButton_3_2.setForeground(new Color(255, 0, 128));
		btnNewButton_3_2.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_3_2.setBounds(105, 231, 85, 62);
		frame.getContentPane().add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("2");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_3_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3_3.setForeground(new Color(255, 0, 128));
		btnNewButton_3_3.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_3_3.setBounds(105, 303, 85, 62);
		frame.getContentPane().add(btnNewButton_3_3);
		
		JButton btnNewButton_3_4 = new JButton("0");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_3_4.getText();
				textField.setText(number);

			}
		});
		btnNewButton_3_4.setForeground(new Color(255, 0, 128));
		btnNewButton_3_4.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_3_4.setBounds(105, 372, 85, 62);
		frame.getContentPane().add(btnNewButton_3_4);
		
		JButton btnNewButton_3_5 = new JButton("9");
		btnNewButton_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_3_5.getText();
				textField.setText(number);

			}
		});
		btnNewButton_3_5.setForeground(new Color(255, 0, 128));
		btnNewButton_3_5.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_3_5.setBounds(200, 159, 85, 62);
		frame.getContentPane().add(btnNewButton_3_5);
		
		JButton btnNewButton_3_6 = new JButton("6");
		btnNewButton_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_3_6.getText();
				textField.setText(number);

			}
		});
		btnNewButton_3_6.setForeground(new Color(255, 0, 128));
		btnNewButton_3_6.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_3_6.setBounds(200, 231, 85, 62);
		frame.getContentPane().add(btnNewButton_3_6);
		
		JButton btnNewButton_3_7 = new JButton("3");
		btnNewButton_3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_3_7.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3_7.setForeground(new Color(255, 0, 128));
		btnNewButton_3_7.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_3_7.setBounds(200, 303, 85, 62);
		frame.getContentPane().add(btnNewButton_3_7);
		
		JButton btnNewButton_3_8 = new JButton(".");
		btnNewButton_3_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_3_8.getText();
				textField.setText(number);

			}
		});
		btnNewButton_3_8.setForeground(new Color(255, 0, 128));
		btnNewButton_3_8.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_3_8.setBounds(200, 372, 85, 62);
		frame.getContentPane().add(btnNewButton_3_8);
		
		JButton btnNewButton_3_9 = new JButton("/");
		btnNewButton_3_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="/";

			}
		});
		btnNewButton_3_9.setForeground(new Color(255, 0, 128));
		btnNewButton_3_9.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_3_9.setBounds(295, 159, 85, 62);
		frame.getContentPane().add(btnNewButton_3_9);
		
		JButton btnNewButton_3_10 = new JButton("*");
		btnNewButton_3_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="*";

			}
			
		});
		btnNewButton_3_10.setForeground(new Color(255, 0, 128));
		btnNewButton_3_10.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_3_10.setBounds(295, 231, 85, 62);
		frame.getContentPane().add(btnNewButton_3_10);
		
		JButton btnNewButton_3_11 = new JButton("+");
		btnNewButton_3_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="+";
			}
		});
		btnNewButton_3_11.setForeground(new Color(255, 0, 128));
		btnNewButton_3_11.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_3_11.setBounds(295, 303, 85, 62);
		frame.getContentPane().add(btnNewButton_3_11);
		
		JButton btnNewButton_3_12 = new JButton("=");
		btnNewButton_3_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans ;
				second = Double.parseDouble(textField.getText());
				if(operation == "+")
				{
					result = first+second;
					ans = String.format("%.3f", result);
					textField.setText(ans);
				}
				else if(operation == "*")
				{
					result = first*second;
					ans = String.format("%.3f", result);
					textField.setText(ans);
				}
				else if(operation == "/")
				{
					result = first/second;
					ans = String.format("%.3f", result);
					textField.setText(ans);
				}
				else if(operation == "%")
				{
					result = first%second;
					ans = String.format("%.3f", result);
					textField.setText(ans);
				}
				else if(operation == "-")
				{
					result = first-second;
					ans = String.format("%.3f", result);
					textField.setText(ans);
				}

			}
		});
		btnNewButton_3_12.setForeground(new Color(255, 0, 128));
		btnNewButton_3_12.setFont(new Font("Open Sans ExtraBold", Font.BOLD, 25));
		btnNewButton_3_12.setBounds(295, 372, 85, 62);
		frame.getContentPane().add(btnNewButton_3_12);
	}
}
