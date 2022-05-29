import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;

public class customerinfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private DBcontroller db= new DBcontroller();
	private int c=1;
	ArrayList<String> arrl=new ArrayList<>();
	ArrayList<String> arrl2=new ArrayList<>();
	private JTextField textField_14;
	private JTextField textField_15;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerinfo frame = new customerinfo();
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
	public customerinfo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8ECA\u724C\u865F\u78BC");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 77, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8ECA\u4E3B\u59D3\u540D");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 55, 77, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u8EAB\u5206\u8B49");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 100, 72, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u8ECA\u7A2E");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(273, 10, 48, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u51FA\u5EE0\u5E74\u4EFD");
		lblNewLabel_4.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(324, 55, 72, 35);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u6392\u6C23\u91CF");
		lblNewLabel_5.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(332, 100, 64, 35);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u8ECA\u8EAB\u984F\u8272");
		lblNewLabel_6.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(324, 145, 72, 35);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("\u6392\u6A94");
		lblNewLabel_6_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_6_1.setBounds(334, 190, 41, 35);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("\u516C\u91CC\u6578\u53CA\u91CC\u7A0B\u985E\u5225");
		lblNewLabel_6_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_6_2.setBounds(311, 235, 146, 36);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7 = new JLabel("\u96FB\u8A71(\u5BB6)");
		lblNewLabel_7.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(10, 145, 72, 35);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u96FB\u8A71(\u516C)");
		lblNewLabel_8.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(10, 190, 72, 35);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u624B\u6A5F");
		lblNewLabel_9.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(10, 235, 58, 35);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u5730\u5740");
		lblNewLabel_10.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(10, 280, 72, 35);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u767C\u7968\u516C\u53F8");
		lblNewLabel_11.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(10, 325, 77, 35);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u7D71\u4E00\u7DE8\u865F");
		lblNewLabel_12.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(10, 370, 77, 35);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\u767C\u7968\u5730\u5740");
		lblNewLabel_13.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(10, 415, 77, 35);
		contentPane.add(lblNewLabel_13);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField.setBounds(90, 11, 153, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(89, 55, 153, 35);
		contentPane.add(textField_1);
		
		
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(89, 100, 153, 35);
		contentPane.add(textField_2);
		
		
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(89, 145, 153, 35);
		contentPane.add(textField_3);
		
		
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(89, 190, 153, 35);
		contentPane.add(textField_4);
		
		
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(89, 235, 153, 35);
		contentPane.add(textField_5);
		
		
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(90, 280, 485, 35);
		contentPane.add(textField_6);
		
		
		
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_7.setColumns(10);
		textField_7.setBounds(90, 325, 485, 35);
		contentPane.add(textField_7);
		
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_8.setColumns(10);
		textField_8.setBounds(90, 370, 485, 35);
		contentPane.add(textField_8);
		
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_9.setColumns(10);
		textField_9.setBounds(90, 415, 485, 35);
		contentPane.add(textField_9);
		
		
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_10.setColumns(10);
		textField_10.setBounds(331, 9, 165, 35);
		contentPane.add(textField_10);
		
		
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_11.setColumns(10);
		textField_11.setBounds(406, 56, 90, 35);
		contentPane.add(textField_11);
		
		
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_12.setColumns(10);
		textField_12.setBounds(406, 101, 90, 35);
		contentPane.add(textField_12);
		
		
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_13.setColumns(10);
		textField_13.setBounds(406, 146, 90, 35);
		contentPane.add(textField_13);
		
		arrl=db.getcustomer(c);
		inputval();
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u81EA\u6392", "\u624B\u6392"}));
		comboBox.setBounds(387, 190, 109, 35);
		contentPane.add(comboBox);
		if(arrl.get(12).equals(String.valueOf(comboBox.getSelectedItem()))) {
			comboBox.setSelectedIndex(0);
		}else {
			comboBox.setSelectedIndex(1);
		}
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u516C\u91CC", "\u82F1\u54E9"}));
		comboBox_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		comboBox_1.setBounds(630, 235, 109, 35);
		contentPane.add(comboBox_1);
		if(arrl.get(13).equals(String.valueOf(comboBox_1.getSelectedItem()))) {
			comboBox_1.setSelectedIndex(0);
		}else {
			comboBox_1.setSelectedIndex(1);
		}
		
		
		JButton btnNewButton = new JButton("\u5132\u5B58");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] info= new String[18];
				info[0]=String.valueOf(db.countcust()+1);
				info[1]=textField.getText();
				info[2]=textField_1.getText();
				info[3]=textField_2.getText();
				info[4]=textField_3.getText();
				info[5]=textField_4.getText();
				info[6]=textField_5.getText();
				info[7]=textField_6.getText();
				info[8]=textField_10.getText();
				info[9]=textField_11.getText();
				info[10]=textField_12.getText();
				info[11]=textField_13.getText();
				info[12]=String.valueOf(comboBox.getSelectedItem());
				info[13]=String.valueOf(comboBox_1.getSelectedItem());
				info[14]=textField_15.getText();
				info[15]=textField_7.getText();
				info[16]=textField_8.getText();
				info[17]=textField_9.getText();
				db.addnewcust(info);
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton.setBounds(10, 505, 103, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u4FEE\u6539");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] info= new String[17];
				info[0]="";
				info[1]=textField.getText();
				info[2]=textField_1.getText();
				info[3]=textField_2.getText();
				info[4]=textField_3.getText();
				info[5]=textField_4.getText();
				info[6]=textField_5.getText();
				info[7]=textField_6.getText();
				info[8]=textField_10.getText();
				info[9]=textField_11.getText();
				info[10]=textField_12.getText();
				info[11]=textField_13.getText();
				info[12]=String.valueOf(comboBox.getSelectedItem());
				info[13]=String.valueOf(comboBox_1.getSelectedItem());
				info[14]=textField_7.getText();
				info[15]=textField_8.getText();
				info[16]=textField_9.getText();
				db.updatecust(info);
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_1.setBounds(10, 550, 103, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("\u4E0A\u7B46");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c-1>0) {
					c=c-1;
					arrl=db.getcustomer(c);
					inputval();
				
					if(arrl.get(12).equals(String.valueOf(comboBox.getSelectedItem()))) {
						comboBox.setSelectedIndex(0);
					}else {
						comboBox.setSelectedIndex(1);
					}
				
					if(arrl.get(13).equals(String.valueOf(comboBox_1.getSelectedItem()))) {
						comboBox_1.setSelectedIndex(0);
					}else {
						comboBox_1.setSelectedIndex(1);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "資料到頂", "警告", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton_3.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_3.setBounds(124, 460, 103, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("\u4E0B\u7B46");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int max= db.countcust();
				if(c+1<=max) {
					c=c+1;
					arrl=db.getcustomer(c);
					inputval();
				
					if(arrl.get(12).equals(String.valueOf(comboBox.getSelectedItem()))) {
						comboBox.setSelectedIndex(0);
					}else {
						comboBox.setSelectedIndex(1);
					}
				
					if(arrl.get(13).equals(String.valueOf(comboBox_1.getSelectedItem()))) {
						comboBox_1.setSelectedIndex(0);
					}else {
						comboBox_1.setSelectedIndex(1);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "資料到底", "警告", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton_3_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_3_1.setBounds(123, 505, 103, 35);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("\u65B0\u4E00\u7B46");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
			}
		});
		btnNewButton_4.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_4.setBounds(10, 460, 103, 35);
		contentPane.add(btnNewButton_4);
		
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
		list.setFont(new Font("新細明體", Font.PLAIN, 25));
		list.setBounds(609, 23, 265, 180);
		//contentPane.add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(609, 23, 265, 180);
		scrollPane.setViewportView(list);
		contentPane.add(scrollPane);
		
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				textField_10.setText(list.getSelectedValue().toString());
			}
			
		});
		
		JButton btnNewButton_2 = new JButton("\u641C\u5C0B");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arrl2=db.searchcartype(textField_10.getText());
				DefaultListModel listModel = new DefaultListModel();
				for (int i = 0; i < arrl2.size(); i++)
				{
				    listModel.addElement(arrl2.get(i));
				}
				list.setModel(listModel);
			}
		});
		btnNewButton_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_2.setBounds(505, 9, 94, 36);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("\u641C\u5C0B");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				arrl=db.searchcustomer(textField_14.getText());
				c=Integer.valueOf(arrl.get(17));
				inputval();
				
				if(arrl.get(12).equals(String.valueOf(comboBox.getSelectedItem()))) {
					comboBox.setSelectedIndex(0);
				}else {
					comboBox.setSelectedIndex(1);
				}
				
				if(arrl.get(13).equals(String.valueOf(comboBox_1.getSelectedItem()))) {
					comboBox_1.setSelectedIndex(0);
				}else {
					comboBox_1.setSelectedIndex(1);
				}
			}
		});
		btnNewButton_5.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_5.setBounds(516, 460, 103, 35);
		contentPane.add(btnNewButton_5);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_14.setBounds(273, 460, 223, 35);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_15.setText("");
		textField_15.setColumns(10);
		textField_15.setBounds(467, 235, 153, 35);
		contentPane.add(textField_15);
		
		
		
		
		
		
		
		
	}
	public void inputval() {
		textField.setText(arrl.get(1));
		textField_1.setText(arrl.get(2));
		textField_2.setText(arrl.get(3));
		textField_3.setText(arrl.get(4));
		textField_4.setText(arrl.get(5));
		textField_5.setText(arrl.get(6));
		textField_6.setText(arrl.get(7));
		textField_7.setText(arrl.get(14));
		textField_8.setText(arrl.get(15));
		textField_9.setText(arrl.get(16));
		textField_10.setText(arrl.get(8));
		textField_11.setText(arrl.get(9));
		textField_12.setText(arrl.get(10));
		textField_13.setText(arrl.get(11));
	}
}
