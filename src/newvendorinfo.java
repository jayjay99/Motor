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

public class newvendorinfo extends JFrame {

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
					newvendorinfo frame = new newvendorinfo();
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
	public newvendorinfo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5EE0\u5546\u4EE3\u78BC");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel.setBounds(21, 20, 80, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5EE0\u5546\u540D\u7A31");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(21, 69, 80, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u8001\u95C6");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(21, 118, 80, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u806F\u7D61\u4EBA");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(21, 167, 80, 39);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u96FB\u8A71");
		lblNewLabel_4.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(21, 216, 80, 39);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u624B\u6A5F");
		lblNewLabel_5.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(21, 265, 80, 39);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u5730\u5740");
		lblNewLabel_6.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(21, 314, 80, 39);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField.setEditable(false);
		textField.setBounds(111, 20, 341, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText(String.valueOf(db.countamount()+1));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(111, 69, 341, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(111, 118, 341, 31);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(111, 167, 341, 31);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(111, 216, 341, 31);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(111, 265, 341, 31);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(111, 314, 341, 31);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("\u65B0\u589E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] info=new String[7];
				info[0]=textField.getText();
				info[1]=textField_1.getText();
				info[2]=textField_2.getText();
				info[3]=textField_3.getText();
				info[4]=textField_4.getText();
				info[5]=textField_5.getText();
				info[6]=textField_6.getText();
				db.newvendorinfo(info);
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton.setBounds(53, 422, 143, 54);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_1.setBounds(322, 422, 143, 54);
		contentPane.add(btnNewButton_1);
	}
}
