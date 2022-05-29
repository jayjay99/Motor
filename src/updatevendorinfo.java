import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class updatevendorinfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private DBcontroller db=new DBcontroller();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updatevendorinfo frame = new updatevendorinfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public updatevendorinfo() {
		setTitle("\u4FEE\u6539");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5EE0\u5546\u4EE3\u78BC");
		lblNewLabel.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 80, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5EE0\u5546\u540D\u7A31");
		lblNewLabel_1.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 59, 80, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u8001\u95C6");
		lblNewLabel_2.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 108, 80, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u806F\u7D61\u4EBA");
		lblNewLabel_3.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 157, 80, 39);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u96FB\u8A71");
		lblNewLabel_4.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 206, 80, 39);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u624B\u6A5F");
		lblNewLabel_5.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(10, 255, 80, 39);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u5730\u5740");
		lblNewLabel_6.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(10, 304, 80, 39);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setFont(new Font("�s�ө���", Font.PLAIN, 25));
		textField.setBounds(100, 17, 299, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("�s�ө���", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(100, 59, 299, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("�s�ө���", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(100, 108, 299, 28);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("�s�ө���", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(100, 157, 299, 28);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("�s�ө���", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(100, 206, 299, 28);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("�s�ө���", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(100, 255, 299, 28);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("�s�ө���", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(100, 304, 299, 28);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("\u4FEE\u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] newdata=new String[7];
				newdata[0]=textField.getText();
				newdata[1]=textField_1.getText();
				newdata[2]=textField_2.getText();
				newdata[3]=textField_3.getText();
				newdata[4]=textField_4.getText();
				newdata[5]=textField_5.getText();
				newdata[6]=textField_6.getText();
				db.updatevendor(newdata);
			}
		});
		btnNewButton.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		btnNewButton.setBounds(30, 402, 140, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		btnNewButton_1.setBounds(298, 402, 140, 51);
		contentPane.add(btnNewButton_1);
	}
	public void getdata(String[] data) {
		textField.setText(data[0]);
		textField_1.setText(data[1]);
		textField_2.setText(data[2]);
		textField_3.setText(data[3]);
		textField_4.setText(data[4]);
		textField_5.setText(data[5]);
		textField_6.setText(data[6]);
	}
}
