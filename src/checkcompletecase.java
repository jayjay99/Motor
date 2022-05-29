import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class checkcompletecase extends JFrame {

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
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private int index=1;
	private int maxindex=0;
	private ArrayList<String> arrl =new ArrayList<String>();
	private ArrayList<String> arrl2 =new ArrayList<String>();
	private ArrayList<String> arrl3 =new ArrayList<String>();
	private ArrayList<String> arrl4 =new ArrayList<String>();
	private DBcontroller db= new DBcontroller();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkcompletecase frame = new checkcompletecase();
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
	public checkcompletecase() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
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
		
		JLabel lblNewLabel_7 = new JLabel("\u652F\u4ED8\u65B9\u5F0F");
		lblNewLabel_7.setBounds(280, 168, 80, 42);
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 20));
		
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
		
		JLabel lblNewLabel_17 = new JLabel("\u5099\u8A3B");
		lblNewLabel_17.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_17.setBounds(10, 421, 80, 35);
		
		
		JLabel lblNewLabel_6_1 = new JLabel("\u71DF\u696D\u7A05");
		lblNewLabel_6_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_6_1.setBounds(551, 217, 79, 42);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("\u7E3D\u8A08");
		lblNewLabel_6_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_6_2.setBounds(551, 269, 79, 42);
		contentPane.add(lblNewLabel_6_2);
		
		contentPane.add(lblNewLabel_17);
		contentPane.add(lblNewLabel_9);
		contentPane.add(lblNewLabel_8);
		contentPane.add(lblNewLabel_11);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_4);
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
		contentPane.add(lblNewLabel_16);
		
		textField = new JTextField();
		textField.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField.setBounds(104, 20, 166, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(104, 64, 166, 42);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(104, 116, 478, 42);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(104, 177, 166, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(104, 217, 166, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(104, 269, 166, 30);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(104, 317, 166, 35);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_7.setColumns(10);
		textField_7.setBounds(416, 10, 166, 42);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_8.setColumns(10);
		textField_8.setBounds(380, 68, 166, 30);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_9.setColumns(10);
		textField_9.setBounds(370, 168, 166, 40);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_10.setColumns(10);
		textField_10.setBounds(370, 217, 166, 42);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_11.setColumns(10);
		textField_11.setBounds(329, 277, 166, 30);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_12.setColumns(10);
		textField_12.setBounds(329, 317, 166, 35);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_13.setColumns(10);
		textField_13.setBounds(601, 177, 166, 30);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_14.setColumns(10);
		textField_14.setBounds(623, 217, 166, 30);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_15.setColumns(10);
		textField_15.setBounds(601, 273, 166, 30);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_16.setColumns(10);
		textField_16.setBounds(81, 369, 166, 30);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_17.setColumns(10);
		textField_17.setBounds(370, 379, 166, 30);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_18.setColumns(10);
		textField_18.setBounds(623, 369, 166, 30);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_19.setColumns(10);
		textField_19.setBounds(60, 421, 699, 30);
		contentPane.add(textField_19);
		
		JList list = new JList();
		list.setFont(new Font("新細明體", Font.PLAIN, 25));
		list.setBounds(10, 474, 864, 387);
		//contentPane.add(list);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 474, 864, 387);
		scrollPane.setViewportView(list);
		contentPane.add(scrollPane);
		DefaultListModel listModel = new DefaultListModel();
		
		JButton btnNewButton = new JButton("\u4E0A\u4E00\u7B46");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				maxindex=db.countcompletecase();
				if(index-1>0) {
					index=index-1;
					arrl=db.getcompletecaes(String.valueOf(index));
					arrl2=db.getcustrepairitem(arrl.get(0));
					arrl3=db.querycustinfo2(arrl.get(1));
					arrl4=db.getmainidinfo(arrl.get(0));
					textField.setText(arrl.get(0));
					textField_4.setText(arrl.get(1));
					textField_7.setText(arrl.get(2));
					textField_15.setText(arrl.get(3));
					textField_9.setText(arrl.get(4));
					textField_3.setText(arrl.get(5));
					textField_19.setText(arrl.get(6));
					textField_1.setText(arrl3.get(0));
					textField_8.setText(arrl3.get(1));
					textField_2.setText(arrl3.get(2));
					textField_12.setText(arrl3.get(3));
					textField_16.setText(arrl3.get(4));
					textField_17.setText(arrl3.get(5));
					textField_18.setText(arrl3.get(6));
					textField_10.setText(arrl4.get(2));
					textField_11.setText(arrl4.get(3));
					textField_6.setText(arrl4.get(4));
					textField_13.setText(arrl4.get(5));
					textField_5.setText(arrl4.get(6));
					listModel.clear();
					String info="";
					for (int i = 0; i <arrl2.size(); i++)
					{
						info=arrl2.get(i);
						 listModel.addElement(info);
					}
					list.setModel(listModel);
					
				}else {
					JOptionPane.showMessageDialog(null, "資料到底", "警告", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 23));
		btnNewButton.setBounds(748, 10, 126, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u4E0B\u4E00\u7B46");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maxindex=db.countcompletecase();
				if(index+1<=maxindex) {
					index=index+1;
					arrl=db.getcompletecaes(String.valueOf(index));
					arrl2=db.getcustrepairitem(arrl.get(0));
					arrl3=db.querycustinfo2(arrl.get(1));
					arrl4=db.getmainidinfo(arrl.get(0));
					textField.setText(arrl.get(0));
					textField_4.setText(arrl.get(1));
					textField_7.setText(arrl.get(2));
					textField_15.setText(arrl.get(3));
					textField_9.setText(arrl.get(4));
					textField_3.setText(arrl.get(5));
					textField_19.setText(arrl.get(6));
					textField_1.setText(arrl3.get(0));
					textField_8.setText(arrl3.get(1));
					textField_2.setText(arrl3.get(2));
					textField_12.setText(arrl3.get(3));
					textField_16.setText(arrl3.get(4));
					textField_17.setText(arrl3.get(5));
					textField_18.setText(arrl3.get(6));
					textField_10.setText(arrl4.get(2));
					textField_11.setText(arrl4.get(3));
					textField_6.setText(arrl4.get(4));
					textField_13.setText(arrl4.get(5));
					textField_5.setText(arrl4.get(6));
					listModel.clear();
					String info="";
					for (int i = 0; i <arrl2.size(); i++)
					{
						info=arrl2.get(i);
						 listModel.addElement(info);
					}
					list.setModel(listModel);
					
				}else {
					JOptionPane.showMessageDialog(null, "資料到底", "警告", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 23));
		btnNewButton_1.setBounds(748, 64, 126, 42);
		contentPane.add(btnNewButton_1);
		
		
		arrl=db.getcompletecaes(String.valueOf(index));
		arrl2=db.getcustrepairitem(arrl.get(0));
		arrl3=db.querycustinfo2(arrl.get(1));
		arrl4=db.getmainidinfo(arrl.get(0));
		textField.setText(arrl.get(0));
		textField_4.setText(arrl.get(1));
		textField_7.setText(arrl.get(2));
		textField_15.setText(arrl.get(3));
		textField_9.setText(arrl.get(4));
		textField_3.setText(arrl.get(5));
		textField_19.setText(arrl.get(6));
		textField_1.setText(arrl3.get(0));
		textField_8.setText(arrl3.get(1));
		textField_2.setText(arrl3.get(2));
		textField_12.setText(arrl3.get(3));
		textField_16.setText(arrl3.get(4));
		textField_17.setText(arrl3.get(5));
		textField_18.setText(arrl3.get(6));
		textField_10.setText(arrl4.get(2));
		textField_11.setText(arrl4.get(3));
		textField_6.setText(arrl4.get(4));
		textField_13.setText(arrl4.get(5));
		textField_5.setText(arrl4.get(6));
		
		listModel.clear();
		String info="";
		for (int i = 0; i <arrl2.size(); i++)
		{
			info=arrl2.get(i);
			 listModel.addElement(info);
		}
		list.setModel(listModel);
	}
}
