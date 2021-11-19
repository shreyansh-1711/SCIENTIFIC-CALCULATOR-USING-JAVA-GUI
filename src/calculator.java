
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private JTextField txtDart;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 419, 751);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("       SClENTIFIC CALCULATOR");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setBounds(20, 10, 423, 41);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(20, 61, 375, 73);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.setBackground(new Color(255, 192, 203));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(30, 191, 61, 57);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnX = new JButton("1/x");
		btnX.setBackground(new Color(255, 192, 203));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnX.setBounds(30, 258, 61, 57);
		frame.getContentPane().add(btnX);
		
		JButton btnNewButton_3 = new JButton("x^3");
		btnNewButton_3.setBackground(new Color(230, 230, 250));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(30, 390, 61, 57);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("x^2");
		btnNewButton_4.setBackground(new Color(230, 230, 250));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setBounds(30, 457, 61, 57);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("n!");
		btnNewButton_5.setBackground(new Color(230, 230, 250));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
					
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
				
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_5.setBounds(30, 524, 61, 57);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setBackground(new Color(230, 230, 250));
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
				
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPlusMinus.setBounds(30, 591, 61, 57);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnExp = new JButton(" e^x");
		btnExp.setBackground(new Color(255, 192, 203));
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		btnExp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExp.setBounds(101, 191, 61, 57);
		frame.getContentPane().add(btnExp);
		
		JButton btnLog = new JButton("Log");
		btnLog.setBackground(new Color(255, 192, 203));
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLog.setBounds(101, 257, 61, 57);
		frame.getContentPane().add(btnLog);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 255, 224));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn4.setBounds(101, 457, 61, 57);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 255, 224));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setBounds(101, 524, 61, 57);
		frame.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
						
			}
		});
		btnSin.setForeground(new Color(0, 0, 0));
		btnSin.setBackground(new Color(255, 192, 203));
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSin.setBounds(172, 191, 61, 57);
		frame.getContentPane().add(btnSin);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 255, 224));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn8.setBounds(172, 390, 61, 57);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 255, 224));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn5.setBounds(172, 457, 61, 57);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(255, 255, 224));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn2.setBounds(172, 524, 61, 57);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(255, 255, 224));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn0.setBounds(101, 591, 132, 57);
		frame.getContentPane().add(btn0);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setBackground(new Color(230, 230, 250));
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 19));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setBounds(243, 322, 61, 57);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 255, 224));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBounds(243, 390, 61, 57);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 255, 224));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn6.setBounds(243, 457, 61, 57);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 255, 224));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn3.setBounds(243, 524, 61, 57);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(new Color(255, 255, 224));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnDot.setBounds(243, 591, 61, 57);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(230, 230, 250));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="x^y")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
						resultt=first*resultt;
						
					}
					
					answer=String.format("%.2f", resultt);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnEqual.setBounds(314, 591, 61, 57);
		frame.getContentPane().add(btnEqual);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(new Color(230, 230, 250));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
				
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDivide.setBounds(314, 524, 61, 57);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMul = new JButton("*");
		btnMul.setBackground(new Color(230, 230, 250));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnMul.setBounds(314, 457, 61, 57);
		frame.getContentPane().add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(new Color(230, 230, 250));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
				
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnSub.setBounds(314, 390, 61, 57);
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBackground(new Color(230, 230, 250));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnAdd.setBounds(314, 322, 61, 57);
		frame.getContentPane().add(btnAdd);
		
		JButton btnBackspace_1 = new JButton("C");
		btnBackspace_1.setBackground(new Color(230, 230, 250));
		btnBackspace_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnBackspace_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnBackspace_1.setBounds(172, 322, 61, 57);
		frame.getContentPane().add(btnBackspace_1);
		
		JButton btnBackspace_1_1 = new JButton("%");
		btnBackspace_1_1.setBackground(new Color(230, 230, 250));
		btnBackspace_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
				
			}
		});
		btnBackspace_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackspace_1_1.setBounds(101, 324, 61, 57);
		frame.getContentPane().add(btnBackspace_1_1);
		
		JButton btnBackspace_1_2 = new JButton("x^y");
		btnBackspace_1_2.setBackground(new Color(230, 230, 250));
		btnBackspace_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
				
			}
		});
		btnBackspace_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBackspace_1_2.setBounds(30, 323, 61, 57);
		frame.getContentPane().add(btnBackspace_1_2);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setBackground(new Color(255, 192, 203));
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSinh.setBounds(172, 258, 61, 57);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setBackground(new Color(255, 192, 203));
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCosh.setBounds(243, 258, 61, 57);
		frame.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setBackground(new Color(255, 192, 203));
		btnTanh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTanh.setBounds(314, 258, 61, 57);
		frame.getContentPane().add(btnTanh);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setBackground(new Color(255, 192, 203));
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCos.setBounds(243, 192, 61, 57);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setBackground(new Color(255, 192, 203));
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTan.setBounds(314, 192, 61, 57);
		frame.getContentPane().add(btnTan);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(255, 255, 224));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn7.setBounds(101, 390, 61, 57);
		frame.getContentPane().add(btn7);
		
		txtDart = new JTextField();
		txtDart.setBackground(new Color(0, 191, 255));
		txtDart.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		txtDart.setText("   DART3000");
		txtDart.setBounds(253, 670, 122, 34);
		frame.getContentPane().add(txtDart);
		txtDart.setColumns(10);
	}
}
