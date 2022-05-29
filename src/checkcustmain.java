import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

public class checkcustmain extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private DBcontroller db= new DBcontroller();
	private ArrayList<String> arrl =new ArrayList<String>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkcustmain frame = new checkcustmain();
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
	public checkcustmain() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField.setBounds(110, 10, 159, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(110, 59, 159, 39);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(110, 108, 159, 39);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D\u641C\u5C0B");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 10, 90, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8ECA\u724C\u641C\u5C0B");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 59, 90, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u96FB\u8A71\u641C\u5C0B");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 108, 90, 39);
		contentPane.add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("\u724C\u7167");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(385, 10, 56, 39);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("\u8ECA\u7A2E");
		lblNewLabel_3_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(385, 59, 56, 39);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("\u59D3\u540D");
		lblNewLabel_3_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(580, 10, 56, 39);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("\u51FA\u5EE0\u5E74\u4EFD");
		lblNewLabel_3_3.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_3_3.setBounds(580, 59, 80, 39);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("\u6392\u6C23\u91CF");
		lblNewLabel_3_4.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_3_4.setBounds(580, 107, 69, 39);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(432, 54, 143, 33);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_4_2.setBounds(627, 10, 143, 33);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("");
		lblNewLabel_4_3.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_4_3.setBounds(670, 59, 143, 33);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("");
		lblNewLabel_4_4.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_4_4.setBounds(647, 107, 143, 33);
		contentPane.add(lblNewLabel_4_4);
		
		JList list = new JList();
		list.setFont(new Font("新細明體", Font.PLAIN, 20));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(10, 185, 864, 666);
		//contentPane.add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 185, 864, 666);
		scrollPane.setViewportView(list);
		contentPane.add(scrollPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(432, 18, 131, 23);
		contentPane.add(comboBox);
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DefaultListModel dmodel = new DefaultListModel();
				ArrayList<String> arrl2 =new ArrayList<String>();
				ArrayList<String> arrl3 =new ArrayList<String>();
				ArrayList<String> arrl4 =new ArrayList<String>();
				arrl2=db.querycustinfo3(comboBox.getSelectedItem().toString(), 4);
				lblNewLabel_4_2.setText(arrl2.get(0));
				lblNewLabel_4_1.setText(arrl2.get(1));
				lblNewLabel_4_3.setText(arrl2.get(2));
				lblNewLabel_4_4.setText(arrl2.get(3));
				arrl3=db.getorderid(comboBox.getSelectedItem().toString());
				String input="";
				for(int i=0;i<arrl3.size();i++) {
					arrl4=db.getcustrepairitem2(arrl3.get(i));
					for(int j=0;j<arrl4.size();j++) {
						input=arrl4.get(j);
						dmodel.addElement(input);
					}
				}
				
				list.setModel(dmodel);
				
				
			}
			
		});
		
		
		JButton btnNewButton = new JButton("\u641C\u5C0B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arrl=db.querycustinfo3(textField.getText(),1);
				comboBox.removeAllItems();
				for(int i=0;i<arrl.size();i++) {
					comboBox.addItem(arrl.get(i));
				}
				comboBox.setSelectedIndex(0);
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton.setBounds(279, 10, 96, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u641C\u5C0B");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arrl=db.querycustinfo3(textField_1.getText(),2);
				comboBox.removeAllItems();
				
				for(int i=0;i<arrl.size();i++) {
					comboBox.addItem(arrl.get(i));
				}
				comboBox.setSelectedIndex(0);
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_1.setBounds(279, 59, 96, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u641C\u5C0B");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arrl=db.querycustinfo3(textField_2.getText(),3);
				comboBox.removeAllItems();
				
				for(int i=0;i<arrl.size();i++) {
					comboBox.addItem(arrl.get(i));
				}
				comboBox.setSelectedIndex(0);
			}
		});
		btnNewButton_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_2.setBounds(279, 108, 96, 39);
		contentPane.add(btnNewButton_2);
	}
	
}
