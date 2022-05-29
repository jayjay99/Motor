import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addstaff extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private DBcontroller db= new DBcontroller(); 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addstaff frame = new addstaff();
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
	public addstaff() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1.setBounds(333, 215, 101, 36);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("新細明體", Font.PLAIN, 20));
		textField.setBounds(121, 10, 206, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText(String.valueOf(db.countstaff()+1));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(121, 76, 206, 43);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(121, 133, 206, 43);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("\u54E1\u5DE5\u4EE3\u865F");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel.setBounds(0, 27, 101, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u54E1\u5DE5\u59D3\u540D");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(0, 90, 101, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u54E1\u5DE5\u96FB\u8A71");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(0, 146, 101, 29);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\u65B0\u589E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] info=new String[3];
				info[0]=textField.getText();
				info[1]=textField_1.getText();
				info[2]=textField_2.getText();
				db.addnewstaff(info);
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton.setBounds(226, 215, 101, 36);
		contentPane.add(btnNewButton);
	}
}
