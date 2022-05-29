import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class vendor_info extends JFrame {

	private JPanel contentPane;
	private int index=1;
	private int a=0;
	int c=0;
	int maxarrl=0;
	private DBcontroller db=new DBcontroller();
	private JTextField textField;
	private ArrayList<String> arrL = new ArrayList<>(); 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vendor_info frame = new vendor_info();
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
	public vendor_info() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5EE0\u5546\u4EE3\u78BC");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 80, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5EE0\u5546\u540D\u7A31");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 59, 80, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u8001\u95C6");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 108, 80, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u806F\u7D61\u4EBA");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 157, 80, 39);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u96FB\u8A71");
		lblNewLabel_4.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 206, 80, 39);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u624B\u6A5F");
		lblNewLabel_5.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(10, 255, 80, 39);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u5730\u5740");
		lblNewLabel_6.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(10, 304, 80, 39);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u5EE0\u5546\u4EE3\u78BC");
		lblNewLabel_7.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(100, 10, 386, 39);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u5EE0\u5546\u4EE3\u78BC");
		lblNewLabel_8.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(100, 59, 386, 39);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u5EE0\u5546\u4EE3\u78BC");
		lblNewLabel_9.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(100, 108, 386, 39);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u5EE0\u5546\u4EE3\u78BC");
		lblNewLabel_10.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(100, 157, 386, 39);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u5EE0\u5546\u4EE3\u78BC");
		lblNewLabel_11.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(100, 206, 386, 39);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u5EE0\u5546\u4EE3\u78BC");
		lblNewLabel_12.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(100, 255, 412, 39);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\u5EE0\u5546\u4EE3\u78BC");
		lblNewLabel_13.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(100, 304, 412, 39);
		contentPane.add(lblNewLabel_13);
		JButton btnNewButton = new JButton("\u65B0\u589E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newvendorinfo nvi=new newvendorinfo();
				nvi.show();
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton.setBounds(22, 404, 80, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u4FEE\u6539");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] data=new String[7];
				data[0]=lblNewLabel_7.getText();
				data[1]=lblNewLabel_8.getText();
				data[2]=lblNewLabel_9.getText();
				data[3]=lblNewLabel_10.getText();
				data[4]=lblNewLabel_11.getText();
				data[5]=lblNewLabel_12.getText();
				data[6]=lblNewLabel_13.getText();
				updatevendorinfo uvi=new updatevendorinfo();
				uvi.getdata(data);
				uvi.show();
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_1.setBounds(22, 445, 80, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("\u67E5\u8A62");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arrL=db.queryvendor(textField.getText());
				maxarrl=arrL.size();
				lblNewLabel_7.setText(arrL.get(c));
				lblNewLabel_8.setText(arrL.get(c+1));
				lblNewLabel_9.setText(arrL.get(c+2));
				lblNewLabel_10.setText(arrL.get(c+3));
				lblNewLabel_11.setText(arrL.get(c+4));
				lblNewLabel_12.setText(arrL.get(c+5));
				lblNewLabel_13.setText(arrL.get(c+6));
				
			}
		});
		btnNewButton_3.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_3.setBounds(407, 353, 105, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u4E0A\u7B46");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] vi=new String[7];
				if(index-1>0) {
				index--;
				vi=db.vendorinfo(index);
				lblNewLabel_7.setText(vi[0]);
				lblNewLabel_8.setText(vi[1]);
				lblNewLabel_9.setText(vi[2]);
				lblNewLabel_10.setText(vi[3]);
				lblNewLabel_11.setText(vi[4]);
				lblNewLabel_12.setText(vi[5]);
				lblNewLabel_13.setText(vi[6]);
				}else {
					JOptionPane.showMessageDialog(null, "資料到頂", "警告", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton_4.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_4.setBounds(112, 404, 80, 40);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u4E0B\u7B46");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] vi=new String[7];
				a=db.countvendor();
				if(index+1<=a) {
				index++;
				vi=db.vendorinfo(index);
				lblNewLabel_7.setText(vi[0]);
				lblNewLabel_8.setText(vi[1]);
				lblNewLabel_9.setText(vi[2]);
				lblNewLabel_10.setText(vi[3]);
				lblNewLabel_11.setText(vi[4]);
				lblNewLabel_12.setText(vi[5]);
				lblNewLabel_13.setText(vi[6]);
				}else {
					JOptionPane.showMessageDialog(null, "資料到底", "警告", JOptionPane.WARNING_MESSAGE);
				}
					
			}
		});
		btnNewButton_5.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_5.setBounds(112, 445, 80, 40);
		contentPane.add(btnNewButton_5);
		
		textField = new JTextField();
		textField.setBounds(235, 353, 162, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("\u67E5\u8A62\u4E0A\u7B46");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c-7>0) {
				c=c-7;
				lblNewLabel_7.setText(arrL.get(c));
				index= Integer. parseInt(arrL.get(c));
				lblNewLabel_8.setText(arrL.get(c+1));
				lblNewLabel_9.setText(arrL.get(c+2));
				lblNewLabel_10.setText(arrL.get(c+3));
				lblNewLabel_11.setText(arrL.get(c+4));
				lblNewLabel_12.setText(arrL.get(c+5));
				lblNewLabel_13.setText(arrL.get(c+6));
				}else {
					JOptionPane.showMessageDialog(null, "資料到底", "警告", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton_6.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_6.setBounds(406, 404, 106, 40);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("\u67E5\u8A62\u4E0B\u7B46");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c+7<maxarrl) {
				c=c+7;
				lblNewLabel_7.setText(arrL.get(c));
				index= Integer. parseInt(arrL.get(c));
				lblNewLabel_8.setText(arrL.get(c+1));
				lblNewLabel_9.setText(arrL.get(c+2));
				lblNewLabel_10.setText(arrL.get(c+3));
				lblNewLabel_11.setText(arrL.get(c+4));
				lblNewLabel_12.setText(arrL.get(c+5));
				lblNewLabel_13.setText(arrL.get(c+6));
				
				}else {
					JOptionPane.showMessageDialog(null, "資料到底", "警告", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		btnNewButton_6_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_6_1.setBounds(406, 455, 106, 40);
		contentPane.add(btnNewButton_6_1);
		
		String[] vi=new String[7];
		vi=db.vendorinfo(index);
		lblNewLabel_7.setText(vi[0]);
		lblNewLabel_8.setText(vi[1]);
		lblNewLabel_9.setText(vi[2]);
		lblNewLabel_10.setText(vi[3]);
		lblNewLabel_11.setText(vi[4]);
		lblNewLabel_12.setText(vi[5]);
		lblNewLabel_13.setText(vi[6]);
	}
}
