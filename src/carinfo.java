import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class carinfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private DBcontroller db= new DBcontroller(); 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carinfo frame = new carinfo();
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
	public carinfo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setFont(new Font("新細明體", Font.PLAIN, 25));
		list.setBounds(42, 90, 443, 411);
		contentPane.add(list);
		
		DefaultListModel listModel = new DefaultListModel();
		String info="";
		ArrayList<String> arrl =new ArrayList<String>();
		arrl=db.carinfoshow();
		for (int i = 0; i <arrl.size(); i=i+2)
		{
			info=arrl.get(i)+"                       "+arrl.get(i+1);
		    listModel.addElement(info);
		}
		list.setModel(listModel);
		textField = new JTextField();
		textField.setBounds(42, 46, 142, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(206, 46, 142, 34);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("\u65B0\u589E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ci=new String[2];
				ci[0]=textField.getText();
				ci[1]=textField_1.getText();
				db.addnewcar(ci);
				DefaultListModel listModel = new DefaultListModel();
				String info="";
				ArrayList<String> arrl =new ArrayList<String>();
				arrl=db.carinfoshow();
				for (int i = 0; i <arrl.size(); i=i+2)
				{
					info=arrl.get(i)+"                       "+arrl.get(i+1);
				    listModel.addElement(info);
				}
				list.setModel(listModel);
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton.setBounds(358, 44, 106, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u8ECA\u8F1B\u4EE3\u78BC");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(42, 10, 100, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8ECA\u8F1B\u540D\u7A31");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(206, 10, 100, 34);
		contentPane.add(lblNewLabel_1);
	}
}
