import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class custmaincomplete extends JFrame {

	private JPanel contentPane;
	private DBcontroller db= new DBcontroller();
	private int index;
	private int maxindex;
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
	private JTextField textField_16;
	private JTextField textField_17;
	private JButton btnNewButton_2 ;
	private JComboBox comboBox;
	private JList list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					custmaincomplete frame = new custmaincomplete();
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
	public custmaincomplete() {
		setFont(new Font("Dialog", Font.PLAIN, 8));
		setTitle("\u51FA\u5EE0\u8ECA\u8F1B\u5EFA\u6A94");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5DE5\u55AE\u865F\u78BC");
		lblNewLabel.setBounds(10, 10, 90, 42);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("\u767C\u7968\u516C\u53F8");
		lblNewLabel_1.setBounds(10, 64, 90, 42);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("\u767C\u7968\u5730\u5740");
		lblNewLabel_2.setBounds(10, 116, 90, 42);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_3 = new JLabel("\u51FA\u5EE0\u65E5\u671F");
		lblNewLabel_3.setBounds(10, 168, 90, 42);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_4 = new JLabel("\u662F\u5426\u958B\u7ACB\u767C\u7968");
		lblNewLabel_4.setBounds(280, 10, 120, 42);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5 = new JLabel("\u7D71\u4E00\u767C\u7968");
		lblNewLabel_5.setBounds(280, 64, 90, 42);
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_6 = new JLabel("\u5C0F\u8A08");
		lblNewLabel_6.setBounds(551, 168, 79, 42);
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		comboBox = new JComboBox();
		comboBox.setBounds(410, 12, 56, 42);
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "\u662F", "\u5426"}));
		
		JLabel lblNewLabel_7 = new JLabel("\u652F\u4ED8\u65B9\u5F0F");
		lblNewLabel_7.setBounds(280, 168, 80, 42);
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(370, 177, 111, 29);
		comboBox_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "\u73FE\u91D1", "\u652F\u7968", "\u4FE1\u7528\u5361"}));
		
		JLabel lblNewLabel_8 = new JLabel("\u724C\u7167\u865F\u78BC");
		lblNewLabel_8.setBounds(10, 217, 110, 41);
		lblNewLabel_8.setFont(new Font("新細明體", Font.PLAIN, 20));
		
		JLabel lblNewLabel_9 = new JLabel("\u5165\u5EE0\u65E5\u671F");
		lblNewLabel_9.setBounds(10, 269, 90, 42);
		lblNewLabel_9.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_10 = new JLabel("\u7DAD\u4FEE\u4EBA\u54E1");
		lblNewLabel_10.setBounds(10, 317, 90, 42);
		lblNewLabel_10.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_11 = new JLabel("\u91CC\u7A0B\u6578");
		lblNewLabel_11.setBounds(10, 369, 90, 42);
		lblNewLabel_11.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_12 = new JLabel("\u8ECA\u4E3B\u59D3\u540D");
		lblNewLabel_12.setBounds(280, 214, 90, 42);
		lblNewLabel_12.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_13 = new JLabel("\u96FB\u8A71");
		lblNewLabel_13.setBounds(280, 269, 90, 42);
		lblNewLabel_13.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_14 = new JLabel("\u8ECA\u7A2E");
		lblNewLabel_14.setBounds(280, 317, 90, 42);
		lblNewLabel_14.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_15 = new JLabel("\u51FA\u5EE0\u5E74\u4EFD");
		lblNewLabel_15.setBounds(280, 369, 90, 42);
		lblNewLabel_15.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_16 = new JLabel("\u6392\u6C23\u91CF");
		lblNewLabel_16.setBounds(551, 369, 90, 42);
		lblNewLabel_16.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JLabel lblNewLabel_18 = new JLabel("\u5DF2\u51FA\u5EE0");
		lblNewLabel_18.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_18.setBounds(795, 11, 79, 42);
		contentPane.add(lblNewLabel_18);
		
		list = new JList();
		list.setFont(new Font("新細明體", Font.PLAIN, 25));
		list.setBounds(10, 464, 841, 347);
		contentPane.setLayout(null);
		//contentPane.add(list);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 464, 841, 347);
		scrollPane.setViewportView(list);
		contentPane.add(scrollPane);
		DefaultListModel listModel = new DefaultListModel();
		
		
		contentPane.add(lblNewLabel_9);
		contentPane.add(lblNewLabel_8);
		contentPane.add(lblNewLabel_11);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_4);
		contentPane.add(comboBox);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_5);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_6);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_10);
		contentPane.add(lblNewLabel_12);
		contentPane.add(lblNewLabel_13);
		contentPane.add(lblNewLabel_14);
		contentPane.add(lblNewLabel_15);
		contentPane.add(lblNewLabel_7);
		contentPane.add(comboBox_1);
		contentPane.add(lblNewLabel_16);
		
		
		
	
		
		textField = new JTextField();
		textField.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField.setBounds(98, 17, 172, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(98, 64, 172, 35);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(98, 116, 444, 35);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(98, 168, 172, 35);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(98, 221, 172, 35);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(98, 269, 172, 35);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(98, 321, 172, 35);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_7.setColumns(10);
		textField_7.setBounds(98, 369, 172, 35);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_8.setColumns(10);
		textField_8.setBounds(370, 62, 172, 35);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_9.setColumns(10);
		textField_9.setBounds(640, 175, 172, 35);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_10.setColumns(10);
		textField_10.setBounds(370, 221, 172, 35);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_11.setColumns(10);
		textField_11.setBounds(370, 269, 172, 35);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_12.setColumns(10);
		textField_12.setBounds(370, 317, 172, 35);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_13.setColumns(10);
		textField_13.setBounds(369, 369, 172, 35);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_14.setColumns(10);
		textField_14.setBounds(622, 369, 172, 35);
		contentPane.add(textField_14);
		
		JLabel lblNewLabel_17 = new JLabel("\u5099\u8A3B");
		lblNewLabel_17.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_17.setBounds(10, 421, 80, 35);
		contentPane.add(lblNewLabel_17);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_15.setBounds(98, 421, 530, 33);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_16.setColumns(10);
		textField_16.setBounds(640, 221, 172, 35);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_17.setColumns(10);
		textField_17.setBounds(640, 269, 172, 35);
		contentPane.add(textField_17);
		
		btnNewButton_2 = new JButton("\u51FA\u5EE0");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count=db.countcompletecase()+1;
				String[] info=new String[7];
				info[0]=String.valueOf(count);
				info[1]=textField.getText();
				info[2]=textField_4.getText();
				info[3]=((JTextField)comboBox.getEditor().getEditorComponent()).getText();
				info[4]=textField_17.getText();;
				info[5]=((JTextField)comboBox_1.getEditor().getEditorComponent()).getText();
				info[6]=textField_15.getText();
				db.addcompletecase(info);
				
				createfile();
				JOptionPane.showMessageDialog(null, "出場成功", "通知", JOptionPane.WARNING_MESSAGE);
			}
		});
		btnNewButton_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_2.setBounds(20, 821, 125, 40);
		contentPane.add(btnNewButton_2);
		
		
		//initialize get custcar info
		String pattern = "yyyy/MM/dd";
		index=db.getmcount();
		maxindex=index;
		textField.setText(String.valueOf(index));
		ArrayList<String> arrl1 =new ArrayList<String>();
		arrl1=db.getmainidinfo(String.valueOf(index));
		textField_4.setText(arrl1.get(1));
		textField_10.setText(arrl1.get(2));
		textField_5.setText(arrl1.get(6));
		textField_11.setText(arrl1.get(3));
		textField_6.setText(arrl1.get(4));
		textField_9.setText(arrl1.get(5));
		int tax=(int) (Integer. parseInt(textField_9.getText())*0.05);
		textField_16.setText(String.valueOf(tax));
		textField_17.setText(String.valueOf(Integer. parseInt(textField_9.getText())+Integer. parseInt(textField_16.getText())));
		DateFormat df = new SimpleDateFormat(pattern);
		java.util.Date today = Calendar.getInstance().getTime();
		String todayAsString = df.format(today);
		textField_3.setText(todayAsString);
		// get cust info
		ArrayList<String> arrl2 =new ArrayList<String>();
		arrl2=db.querycustinfo2(arrl1.get(1));
		textField_1.setText(arrl2.get(0));
		textField_8.setText(arrl2.get(1));
		textField_2.setText(arrl2.get(2));
		textField_12.setText(arrl2.get(3));
		textField_7.setText(arrl2.get(4));
		textField_13.setText(arrl2.get(5));
		textField_14.setText(arrl2.get(6));
		// get cust repair item
		String info="";
		ArrayList<String> arrl3 =new ArrayList<String>();
		arrl3=db.getcustrepairitem(String.valueOf(index));
		for (int i = 0; i <arrl3.size(); i++)
		{
			info=arrl3.get(i);
			 listModel.addElement(info);
		}
		list.setModel(listModel);
		
		if(db.checkcompletecase(String.valueOf(index))==1) {
			lblNewLabel_18.setText("已出廠");
			
		}else {
			lblNewLabel_18.setText("未出廠");
			
		}
		//previous
		JButton btnNewButton = new JButton("\u4E0A\u4E00\u7B46");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(index-1>0) {
				index--;
				textField.setText(String.valueOf(index));
				ArrayList<String> arrl1 =new ArrayList<String>();
				arrl1=db.getmainidinfo(String.valueOf(index));
				textField_4.setText(arrl1.get(1));
				textField_10.setText(arrl1.get(2));
				textField_5.setText(arrl1.get(6));
				textField_11.setText(arrl1.get(3));
				textField_6.setText(arrl1.get(4));
				textField_9.setText(arrl1.get(5));
				int tax=(int) (Integer. parseInt(textField_9.getText())*0.05);
				textField_16.setText(String.valueOf(tax));
				textField_17.setText(String.valueOf(Integer. parseInt(textField_9.getText())+Integer. parseInt(textField_16.getText())));
				DateFormat df = new SimpleDateFormat(pattern);
				java.util.Date today = Calendar.getInstance().getTime();
				String todayAsString = df.format(today);
				textField_3.setText(todayAsString);
				// get cust info
				ArrayList<String> arrl2 =new ArrayList<String>();
				arrl2=db.querycustinfo2(arrl1.get(1));
				textField_1.setText(arrl2.get(0));
				textField_8.setText(arrl2.get(1));
				textField_2.setText(arrl2.get(2));
				textField_12.setText(arrl2.get(3));
				textField_7.setText(arrl2.get(4));
				textField_13.setText(arrl2.get(5));
				textField_14.setText(arrl2.get(6));
				// get cust repair item
				String info="";
				ArrayList<String> arrl3 =new ArrayList<String>();
				arrl3=db.getcustrepairitem(String.valueOf(index));
				listModel.clear();
				for (int i = 0; i <arrl3.size(); i++)
				{
					info=arrl3.get(i);
					 listModel.addElement(info);
				}
				list.setModel(listModel);
				if(db.checkcompletecase(String.valueOf(index))==1) {
					lblNewLabel_18.setText("已出廠");
					
				}else {
					lblNewLabel_18.setText("未出廠");
					
				}
			}else {
					JOptionPane.showMessageDialog(null, "資料到頂", "警告", JOptionPane.WARNING_MESSAGE);
				}
		}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton.setBounds(607, 23, 120, 51);
		contentPane.add(btnNewButton);
		
		//next
		JButton btnNewButton_1 = new JButton("\u4E0B\u4E00\u7B46");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(index+1<=maxindex) {
					index++;
					textField.setText(String.valueOf(index));
					ArrayList<String> arrl1 =new ArrayList<String>();
					arrl1=db.getmainidinfo(String.valueOf(index));
					textField_4.setText(arrl1.get(1));
					textField_10.setText(arrl1.get(2));
					textField_5.setText(arrl1.get(6));
					textField_11.setText(arrl1.get(3));
					textField_6.setText(arrl1.get(4));
					textField_9.setText(arrl1.get(5));
					int tax=(int) (Integer. parseInt(textField_9.getText())*0.05);
					textField_16.setText(String.valueOf(tax));
					textField_17.setText(String.valueOf(Integer. parseInt(textField_9.getText())+Integer. parseInt(textField_16.getText())));
					DateFormat df = new SimpleDateFormat(pattern);
					java.util.Date today = Calendar.getInstance().getTime();
					String todayAsString = df.format(today);
					textField_3.setText(todayAsString);
					// get cust info
					ArrayList<String> arrl2 =new ArrayList<String>();
					arrl2=db.querycustinfo2(arrl1.get(1));
					textField_1.setText(arrl2.get(0));
					textField_8.setText(arrl2.get(1));
					textField_2.setText(arrl2.get(2));
					textField_12.setText(arrl2.get(3));
					textField_7.setText(arrl2.get(4));
					textField_13.setText(arrl2.get(5));
					textField_14.setText(arrl2.get(6));
					// get cust repair item
					String info="";
					ArrayList<String> arrl3 =new ArrayList<String>();
					arrl3=db.getcustrepairitem(String.valueOf(index));
					listModel.clear();
					for (int i = 0; i <arrl3.size(); i++)
					{
						info=arrl3.get(i);
						 listModel.addElement(info);
					}
					list.setModel(listModel);
					if(db.checkcompletecase(String.valueOf(index))==1) {
						lblNewLabel_18.setText("已出廠");
						
					}else {
						lblNewLabel_18.setText("未出廠");
						
					}
				}
					else {
						JOptionPane.showMessageDialog(null, "資料到頂", "警告", JOptionPane.WARNING_MESSAGE);
					}
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_1.setBounds(607, 84, 120, 51);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("\u51FA\u5EE0");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count=db.countcompletecase()+1;
				String[] info=new String[7];
				info[0]=String.valueOf(count);
				info[1]=textField.getText();
				info[2]=textField_4.getText();
				info[3]=((JTextField)comboBox.getEditor().getEditorComponent()).getText();
				info[4]=textField_17.getText();;
				info[5]=((JTextField)comboBox_1.getEditor().getEditorComponent()).getText();
				info[6]=textField_15.getText();
				db.addcompletecase(info);
				
				createfile();
				JOptionPane.showMessageDialog(null, "出場成功", "通知", JOptionPane.WARNING_MESSAGE);
			}
		});
		btnNewButton_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_2.setBounds(20, 821, 125, 40);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_6_1 = new JLabel("\u71DF\u696D\u7A05");
		lblNewLabel_6_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_6_1.setBounds(551, 217, 79, 42);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("\u7E3D\u8A08");
		lblNewLabel_6_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_6_2.setBounds(551, 269, 79, 42);
		contentPane.add(lblNewLabel_6_2);
		
		
		

	}
	public void createfile() {
		 try {
			 
		      FileWriter myWriter = new FileWriter("C:\\Users\\a0995\\OneDrive\\桌面\\filename.txt"); 
		      myWriter.write("                                                            MOTOR   摩特汽車服務中心\n");
		      myWriter.write("台北市信安街 84-86號                                                                                                                           TEL:(02)23772881\n");
		      myWriter.write("工單號碼 : "+textField.getText()+"                                                          是否開立三聯式發票 : "+((JTextField)comboBox.getEditor().getEditorComponent()).getText()+"\n");
		      myWriter.write("牌照號碼 : "+textField_4.getText()+"                                            出主姓名 : "+textField_10.getText()+"\n");
		      myWriter.write("入廠日期 : "+textField_5.getText()+"                                       電話 : "+textField_11.getText()+"\n");
		      myWriter.write("里程數 : "+textField_7.getText()+"                                                       出廠年份 : "+textField_13.getText()+"                                       排氣量 : "+textField_14.getText()+"\n");
		      myWriter.write("發票公司 : "+textField_1.getText()+"                                                     統一編號 : "+textField_8.getText()+"\n");
		      myWriter.write("發票地址 : "+textField_2.getText()+"\n");
		      myWriter.write("出廠日期 : "+textField_3.getText()+"                               小計 : "+textField_9.getText()+"                                      營業稅 : "+textField_16.getText()+"                                 總計 : "+textField_17.getText()+"\n");
		      myWriter.write("備  註 : "+textField_15.getText()+"\n");
		      myWriter.write("============================================================================================================================================================================"+"\n");
		      myWriter.write("維修內容                            種類               單價           數量          金額"+"\n");
		      myWriter.write("============================================================================================================================================================================"+"\n");
		      for (int i = 0; i < list.getModel().getSize(); i++) {
		            Object item = list.getModel().getElementAt(i);
		            myWriter.write(String.valueOf(item)+"\n");
		        }
		      
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		      printpreview pp=new printpreview();
		      pp.show();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  	
		}
}
