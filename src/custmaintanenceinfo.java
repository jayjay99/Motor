import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class custmaintanenceinfo extends JFrame {

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
	private JTextField textField_14;
	private JTextField textField_15;
	private DBcontroller db= new DBcontroller(); 
	private JTextField textField_16;
	private ArrayList<String> arrl;
	private JTextField textField_17;
	private int cost=0;
	private int index;
	private int fin;
	private JComboBox comboBox;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					custmaintanenceinfo frame = new custmaintanenceinfo();
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
	public custmaintanenceinfo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5DE5\u55AE\u865F\u78BC");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 24, 91, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u724C\u7167\u865F\u78BC");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 76, 91, 42);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u8ECA\u4E3B\u59D3\u540D");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 128, 91, 42);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u96FB\u8A71");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(10, 180, 91, 42);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u8ECA\u7A2E");
		lblNewLabel_4.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(10, 232, 91, 42);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u51FA\u5EE0\u5E74\u4EFD");
		lblNewLabel_5.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(10, 284, 91, 42);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u91CC\u7A0B\u985E\u5225");
		lblNewLabel_6.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(344, 76, 91, 42);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u91CC\u7A0B\u6578");
		lblNewLabel_7.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(344, 128, 91, 42);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u5165\u5EE0\u65E5\u671F");
		lblNewLabel_8.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(344, 180, 91, 42);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u7DAD\u4FEE\u4EBA\u54E1");
		lblNewLabel_9.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(344, 232, 91, 42);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u7DAD\u4FEE\u5C0F\u8A08");
		lblNewLabel_10.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(344, 278, 91, 42);
		contentPane.add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField.setBounds(100, 24, 218, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(100, 76, 218, 33);
		contentPane.add(textField_1);
		
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(100, 128, 218, 33);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(100, 180, 218, 33);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(100, 232, 218, 33);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(100, 284, 218, 33);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(445, 76, 218, 33);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_7.setColumns(10);
		textField_7.setBounds(445, 134, 218, 33);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_8.setColumns(10);
		textField_8.setBounds(445, 180, 218, 33);
		contentPane.add(textField_8);
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		java.util.Date today = Calendar.getInstance().getTime();
		String todayAsString = df.format(today);
		textField_8.setText(todayAsString);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_9.setColumns(10);
		textField_9.setBounds(445, 232, 186, 33);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_10.setColumns(10);
		textField_10.setBounds(445, 284, 218, 33);
		contentPane.add(textField_10);
		

		
		JLabel lblNewLabel_10_1 = new JLabel("\u7DAD\u4FEE\u5167\u5BB9");
		lblNewLabel_10_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_10_1.setBounds(10, 358, 91, 42);
		contentPane.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("\u7A2E\u985E");
		lblNewLabel_10_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_10_2.setBounds(380, 330, 91, 42);
		contentPane.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_3 = new JLabel("\u55AE\u50F9");
		lblNewLabel_10_3.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_10_3.setBounds(481, 327, 91, 42);
		contentPane.add(lblNewLabel_10_3);
		
		JLabel lblNewLabel_10_4 = new JLabel("\u6578\u91CF");
		lblNewLabel_10_4.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_10_4.setBounds(582, 327, 91, 42);
		contentPane.add(lblNewLabel_10_4);
		
		JLabel lblNewLabel_10_5 = new JLabel("\u91D1\u984D");
		lblNewLabel_10_5.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_10_5.setBounds(683, 330, 91, 42);
		contentPane.add(lblNewLabel_10_5);
		
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
		list.setBounds(219, 339, 151, 156);
		//contentPane.add(list);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(219, 339, 151, 156);
		scrollPane.setViewportView(list);
		contentPane.add(scrollPane);
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent event) {
				 if (!event.getValueIsAdjusting()) {
					 JList source = (JList)event.getSource();
					 ArrayList<String> arrl2 =new ArrayList<String>();
			         arrl2=db.getminfo(source.getSelectedValue().toString());
			         textField_11.setText(arrl2.get(0));
			         textField_16.setText(arrl2.get(1));
	                }
			}
		});
		
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_11.setColumns(10);
		textField_11.setBounds(10, 396, 197, 33);
		contentPane.add(textField_11);
		textField_11.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				DefaultListModel listModel = new DefaultListModel();
				String info="";
				arrl =new ArrayList<String>();
				ArrayList<String> arrl2 =new ArrayList<String>();
				arrl=db.queryminfoname(textField_11.getText());
				//arrl2=db.querycheck(textField_11.getText());
				for (int i = 0; i <arrl.size(); i++)
				{
					info=arrl.get(i);
				    listModel.addElement(info);
				}
				//for (int i = 0; i <arrl2.size(); i++)
				//{
					//info=arrl2.get(i);
				   // listModel.addElement(info);
				//}
				list.setModel(listModel);
				
			}
			
		});
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_12.setColumns(10);
		textField_12.setBounds(481, 364, 91, 33);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_13.setColumns(10);
		textField_13.setBounds(582, 364, 91, 33);
		contentPane.add(textField_13);
		textField_13.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				textField_14.setText(Integer.toString(Integer.parseInt(textField_13.getText())*Integer.parseInt(textField_12.getText())));
			}
			
		});
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_14.setColumns(10);
		textField_14.setBounds(683, 364, 91, 33);
		contentPane.add(textField_14);
		
		JLabel lblNewLabel_10_6 = new JLabel("\u6392\u6C23\u91CF");
		lblNewLabel_10_6.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_10_6.setBounds(445, 24, 91, 42);
		contentPane.add(lblNewLabel_10_6);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_15.setColumns(10);
		textField_15.setBounds(518, 30, 218, 33);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_16.setColumns(10);
		textField_16.setBounds(380, 363, 91, 33);
		contentPane.add(textField_16);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(645, 230, 129, 42);
		contentPane.add(comboBox);
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField_9.setText(String.valueOf(comboBox.getSelectedItem()));
			}
			
		});
		
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setFont(new Font("新細明體", Font.PLAIN, 25));
		list_1.setBounds(10, 508, 764, 243);
		//contentPane.add(list_1);
		DefaultListModel listModel = new DefaultListModel();
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 508, 764, 243);
		scrollPane_1.setViewportView(list_1);
		contentPane.add(scrollPane_1);
		
		
		JButton btnNewButton = new JButton("\u65B0\u589E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String info="";
				info=String.format("%1$-10s%2$-10s%3$-10s%4$-10s%5$-10s%6$-10s",textField_11.getText(),textField_16.getText(),textField_17.getText(),textField_12.getText(),textField_13.getText(),textField_14.getText());
				cost=cost+Integer.parseInt(textField_14.getText());
				textField_10.setText(String.valueOf(cost));
				listModel.addElement(info);
				list_1.setModel(listModel);
				textField_11.setText("");
				textField_16.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton.setBounds(658, 407, 115, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u522A\u9664");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list_1.getSelectedIndex();
		           listModel.remove(index);
		           list_1.updateUI();
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_1.setBounds(658, 459, 115, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u5B58\u6A94");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] info=new String[6];
				info[0]=textField.getText();
				info[1]=textField_1.getText();
				info[2]=textField_2.getText();
				info[3]=textField_3.getText();
				info[4]=textField_9.getText();
				info[5]=textField_10.getText();
				arrl =new ArrayList<String>();
				 for(int i = 0; i< list_1.getModel().getSize();i++){
			            arrl.add((String) list_1.getModel().getElementAt(i));
			        }
				db.saveminfo(info,arrl);
				db.updatecustmile(textField_7.getText(), textField_1.getText());
			}
		});
		btnNewButton_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_2.setBounds(20, 761, 115, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("\u65B0\u4E00\u7B46");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(String.valueOf(db.getmcount()+1));
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				DateFormat df = new SimpleDateFormat(pattern);
				java.util.Date today = Calendar.getInstance().getTime();
				String todayAsString = df.format(today);
				textField_8.setText(todayAsString);
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_16.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				 DefaultListModel listModel = (DefaultListModel) list_1.getModel();
			        listModel.removeAllElements();
			        
			    ArrayList<String> staffalist =new ArrayList<String>();
			    staffalist=db.getallstaffname();
			    comboBox.removeAllItems();
				
				for(int i=0;i<staffalist.size();i++) {
					comboBox.addItem(staffalist.get(i));
				}
				comboBox.setSelectedIndex(0);
				
			}
		});
		btnNewButton_2_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(145, 761, 115, 42);
		contentPane.add(btnNewButton_2_1);
		
		JList list_2 = new JList();
		list_2.setFont(new Font("新細明體", Font.PLAIN, 24));
		list_2.setBounds(784, 300, 190, 451);
		contentPane.add(list_2);
		
		DefaultListModel listModel_2 = new DefaultListModel();
		String info="";
		ArrayList<String> ar =new ArrayList<String>();
		ar=db.getvendor();
		for (int i = 0; i <ar.size(); i++)
		{
			info=ar.get(i);
			listModel_2.addElement(info);
		}
		list_2.setModel(listModel_2);
		list_2.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					textField_17.setText(list_2.getSelectedValue().toString());
	                }
			}
			
		});
		
		
		JLabel lblNewLabel_10_5_1 = new JLabel("\u5EE0\u5546");
		lblNewLabel_10_5_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_10_5_1.setBounds(380, 405, 91, 42);
		contentPane.add(lblNewLabel_10_5_1);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_17.setColumns(10);
		textField_17.setBounds(380, 439, 91, 33);
		contentPane.add(textField_17);
		
		JButton btnNewButton_3 = new JButton("\u641C\u5C0B");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.removeAllElements();
				ArrayList<String> arrl2=new ArrayList<String>();
				ArrayList<String> arrl3=new ArrayList<String>();
				arrl2=db.getmainidinfo(textField.getText());
				textField.setText(arrl2.get(0));
				textField_1.setText(arrl2.get(1));
				textField_2.setText(arrl2.get(2));
				textField_3.setText(arrl2.get(3));
				textField_9.setText(arrl2.get(4));
				textField_10.setText(arrl2.get(5));
				textField_8.setText(arrl2.get(6));
				arrl3=db.mainsearchcustomer(arrl2.get(1));
				textField_4.setText(arrl3.get(0));
				textField_5.setText(arrl3.get(1));
				textField_15.setText(arrl3.get(2));
				textField_6.setText(arrl3.get(3));
				textField_7.setText(arrl3.get(4));
				String info2="";
				index=Integer. parseInt(textField.getText());
				ArrayList<String> arrl4 =new ArrayList<String>();
				arrl4=db.getcustrepairitem(String.valueOf(index));
				for (int i = 0; i <arrl4.size(); i++)
				{
					info2=arrl4.get(i);
					 listModel.addElement(info2);
				}
				list_1.setModel( listModel);
			}
		});
		btnNewButton_3.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_3.setBounds(326, 24, 91, 33);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_11 = new JLabel("\u5EE0\u5546");
		lblNewLabel_11.setFont(new Font("新細明體", Font.PLAIN, 30));
		lblNewLabel_11.setBounds(784, 241, 71, 49);
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton_4 = new JButton("\u4E0A\u7B46");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(index-1>0) {
					listModel.removeAllElements();
					index=index-1;
					ArrayList<String> arrl2=new ArrayList<String>();
					ArrayList<String> arrl3=new ArrayList<String>();
					arrl2=db.getmainidinfo(String.valueOf(index));
					textField.setText(arrl2.get(0));
					textField_1.setText(arrl2.get(1));
					textField_2.setText(arrl2.get(2));
					textField_3.setText(arrl2.get(3));
					textField_9.setText(arrl2.get(4));
					textField_10.setText(arrl2.get(5));
					textField_8.setText(arrl2.get(6));
					arrl3=db.mainsearchcustomer(arrl2.get(1));
					textField_4.setText(arrl3.get(0));
					textField_5.setText(arrl3.get(1));
					textField_15.setText(arrl3.get(2));
					textField_6.setText(arrl3.get(3));
					textField_7.setText(arrl3.get(4));
					String info2="";
					ArrayList<String> arrl4 =new ArrayList<String>();
					arrl4=db.getcustrepairitem(String.valueOf(index));
					for (int i = 0; i <arrl4.size(); i++)
					{
						info2=arrl4.get(i);
						 listModel.addElement(info2);
					}
					list_1.setModel( listModel);
				}
				else {
					JOptionPane.showMessageDialog(null, "資料到頂", "警告", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton_4.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_4.setBounds(737, 73, 102, 49);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("\u4E0B\u7B46");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(index+1<=fin) {
					listModel.removeAllElements();
					index=index+1;
					ArrayList<String> arrl2=new ArrayList<String>();
					ArrayList<String> arrl3=new ArrayList<String>();
					arrl2=db.getmainidinfo(String.valueOf(index));
					textField.setText(arrl2.get(0));
					textField_1.setText(arrl2.get(1));
					textField_2.setText(arrl2.get(2));
					textField_3.setText(arrl2.get(3));
					textField_9.setText(arrl2.get(4));
					textField_10.setText(arrl2.get(5));
					textField_8.setText(arrl2.get(6));
					arrl3=db.mainsearchcustomer(arrl2.get(1));
					textField_4.setText(arrl3.get(0));
					textField_5.setText(arrl3.get(1));
					textField_15.setText(arrl3.get(2));
					textField_6.setText(arrl3.get(3));
					textField_7.setText(arrl3.get(4));
					String info2="";
					ArrayList<String> arrl4 =new ArrayList<String>();
					arrl4=db.getcustrepairitem(String.valueOf(index));
					for (int i = 0; i <arrl4.size(); i++)
					{
						info2=arrl4.get(i);
					    listModel.addElement(info2);
					}
					list_1.setModel(listModel);
				}
				else {
					JOptionPane.showMessageDialog(null, "資料到底", "警告", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton_4_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_4_1.setBounds(737, 134, 102, 49);
		contentPane.add(btnNewButton_4_1);
		
		//JScrollPane scrollPane = new JScrollPane();
		//scrollPane.setBounds(219, 339, 151, 156);
		//scrollPane.setViewportView(list);
		//contentPane.add(scrollPane);
		
		
		
		textField_1.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				textField_1.setText("");
			}

			@Override
			public void focusLost(FocusEvent e) {
				arrl =new ArrayList<String>();
				arrl=db.querycustinfo(textField_1.getText());
				textField_2.setText(arrl.get(0));
				textField_3.setText(arrl.get(1));
				textField_4.setText(arrl.get(2));
				textField_5.setText(arrl.get(3));
				textField_15.setText(arrl.get(4));
				textField_6.setText(arrl.get(5));
				textField_7.setText(arrl.get(6));
			}
			
		});
		
		
		index=db.getmcount();
		fin=index;
		ArrayList<String> arrl2=new ArrayList<String>();
		ArrayList<String> arrl3=new ArrayList<String>();
		arrl2=db.getmainidinfo(String.valueOf(index));
		textField.setText(String.valueOf(index));
		textField_1.setText(arrl2.get(1));
		textField_2.setText(arrl2.get(2));
		textField_3.setText(arrl2.get(3));
		textField_9.setText(arrl2.get(4));
		textField_10.setText(arrl2.get(5));
		textField_8.setText(arrl2.get(6));
		arrl3=db.mainsearchcustomer(arrl2.get(1));
		textField_4.setText(arrl3.get(0));
		textField_5.setText(arrl3.get(1));
		textField_15.setText(arrl3.get(2));
		textField_6.setText(arrl3.get(3));
		textField_7.setText(arrl3.get(4));
		String info2="";
		ArrayList<String> arrl4 =new ArrayList<String>();
		arrl4=db.getcustrepairitem(String.valueOf(index));
		for (int i = 0; i <arrl4.size(); i++)
		{
			info2=arrl4.get(i);
		    listModel.addElement(info2);
		}
		list_1.setModel(listModel);
		
		
		
		
		
	}
}
