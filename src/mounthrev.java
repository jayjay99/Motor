import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;

public class mounthrev extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private DBcontroller db= new DBcontroller();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mounthrev frame = new mounthrev();
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
	public mounthrev() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1150, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("");
		textField.setBounds(447, 289, 220, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u5BC6\u78BC");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel.setBounds(377, 286, 60, 48);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_1.setBounds(10, 56, 108, 42);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(128, 56, 108, 42);
		contentPane.add(textField_2);
		textField_2.setVisible(false);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(246, 56, 108, 42);
		contentPane.add(textField_3);
		textField_3.setVisible(false);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(10, 154, 108, 42);
		contentPane.add(textField_4);
		textField_4.setVisible(false);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(128, 154, 108, 42);
		contentPane.add(textField_5);
		textField_5.setVisible(false);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(246, 154, 108, 42);
		contentPane.add(textField_6);
		textField_6.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("\u5E74\u4EFD");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(10, 10, 112, 36);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u6708\u4EFD");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(132, 10, 112, 36);
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setVisible(false);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u5929");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1_2.setBounds(246, 10, 112, 36);
		contentPane.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setVisible(false);
		
		JLabel lblNewLabel_1_3 = new JLabel("\u5E74\u4EFD");
		lblNewLabel_1_3.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1_3.setBounds(10, 108, 112, 36);
		contentPane.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setVisible(false);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u6708\u4EFD");
		lblNewLabel_1_1_1.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(128, 108, 112, 36);
		contentPane.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setVisible(false);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("\u5929");
		lblNewLabel_1_2_1.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1_2_1.setBounds(246, 108, 112, 36);
		contentPane.add(lblNewLabel_1_2_1);
		lblNewLabel_1_2_1.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(607, 4, 232, 42);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		
		
		
		
		
		JLabel lblNewLabel_3 = new JLabel("\u4FEE\u8B77\u7E3D\u984D");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(500, -2, 112, 48);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		
		JLabel lblNewLabel_3_1 = new JLabel("\u73FE\u91D1\u5408\u8A08");
		lblNewLabel_3_1.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_3_1.setBounds(500, 50, 112, 48);
		contentPane.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setVisible(false);
		
		JLabel lblNewLabel_2_1 = new JLabel("0");
		lblNewLabel_2_1.setFont(new Font("新細明體", Font.PLAIN, 40));
		lblNewLabel_2_1.setBounds(607, 56, 232, 42);
		contentPane.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setVisible(false);
		
		JLabel lblNewLabel_3_2 = new JLabel("\u4FE1\u7528\u5361\u5408\u8A08");
		lblNewLabel_3_2.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_3_2.setBounds(830, -2, 128, 48);
		contentPane.add(lblNewLabel_3_2);
		lblNewLabel_3_2.setVisible(false);
		
		JLabel lblNewLabel_2_2 = new JLabel("0");
		lblNewLabel_2_2.setFont(new Font("新細明體", Font.PLAIN, 40));
		lblNewLabel_2_2.setBounds(951, 4, 232, 42);
		contentPane.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setVisible(false);
		
		JLabel lblNewLabel_3_3 = new JLabel("\u652F\u7968\u5408\u8A08");
		lblNewLabel_3_3.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_3_3.setBounds(830, 47, 112, 48);
		contentPane.add(lblNewLabel_3_3);
		lblNewLabel_3_3.setVisible(false);
		
		JLabel lblNewLabel_2_3 = new JLabel("0");
		lblNewLabel_2_3.setFont(new Font("新細明體", Font.PLAIN, 40));
		lblNewLabel_2_3.setBounds(951, 47, 232, 42);
		contentPane.add(lblNewLabel_2_3);
		lblNewLabel_2_3.setVisible(false);
		
		JLabel lblNewLabel_3_4 = new JLabel("\u5C1A\u6B20\u5408\u8A08");
		lblNewLabel_3_4.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_3_4.setBounds(500, 108, 112, 48);
		contentPane.add(lblNewLabel_3_4);
		lblNewLabel_3_4.setVisible(false);
		
		JLabel lblNewLabel_2_4 = new JLabel("0");
		lblNewLabel_2_4.setFont(new Font("新細明體", Font.PLAIN, 40));
		lblNewLabel_2_4.setBounds(607, 108, 232, 42);
		contentPane.add(lblNewLabel_2_4);
		lblNewLabel_2_4.setVisible(false);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(10, 260, 1114, 391);
		//contentPane.add(list);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 260, 1114, 391);
		scrollPane.setViewportView(list);
		contentPane.add(scrollPane);
		scrollPane.setVisible(false);
		
		JButton btnNewButton_1 = new JButton("\u641C\u5C0B");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date1=textField_1.getText()+"-"+textField_2.getText()+"-"+textField_3.getText(); 
				String date2=textField_4.getText()+"-"+textField_5.getText()+"-"+textField_6.getText();
				lblNewLabel_2.setText(Integer.toString(db.getrev(date1, date2)));
				int[] paytype = new int[3];
				paytype=db.getrevtype(date1, date2);
				lblNewLabel_2_1.setText(String.valueOf(paytype[0]));
				lblNewLabel_2_3.setText(String.valueOf(paytype[1]));
				lblNewLabel_2_2.setText(String.valueOf(paytype[2]));
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 24));
		btnNewButton_1.setBounds(364, 47, 108, 55);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setVisible(false);
		
		
		
		JButton btnNewButton = new JButton("\u78BA\u8A8D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int flag=db.checkpassword(textField.getText());
				if(flag==1) {
					lblNewLabel.setVisible(false);
					textField.setVisible(false);
					btnNewButton.setVisible(false);
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					textField_3.setVisible(true);
					textField_4.setVisible(true);
					textField_5.setVisible(true);
					textField_6.setVisible(true);
					lblNewLabel_1.setVisible(true);
					lblNewLabel_1_1.setVisible(true);
					lblNewLabel_1_2.setVisible(true);
					lblNewLabel_1_3.setVisible(true);
					lblNewLabel_1_1_1.setVisible(true);
					lblNewLabel_1_2_1.setVisible(true);
					btnNewButton_1.setVisible(true);
					lblNewLabel_3.setVisible(true);
					lblNewLabel_3_1.setVisible(true);
					lblNewLabel_2_1.setVisible(true);
					lblNewLabel_3_2.setVisible(true);
					lblNewLabel_2_2.setVisible(true);
					lblNewLabel_3_3.setVisible(true);
					lblNewLabel_2_3.setVisible(true);
					lblNewLabel_3_4.setVisible(true);
					lblNewLabel_2_4.setVisible(true);
					lblNewLabel_2.setVisible(true);
					scrollPane.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "密碼錯誤", "警告", JOptionPane.WARNING_MESSAGE);
					textField.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 24));
		btnNewButton.setBounds(677, 286, 87, 48);
		contentPane.add(btnNewButton);
		
		
	
		
	}
}
