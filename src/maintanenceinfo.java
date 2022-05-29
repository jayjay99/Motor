import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class maintanenceinfo extends JFrame {

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
					maintanenceinfo frame = new maintanenceinfo();
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
	public maintanenceinfo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 840, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setFont(new Font("新細明體", Font.PLAIN, 20));
		list.setBounds(10, 90, 804, 411);
		contentPane.add(list);
		
		DefaultListModel listModel = new DefaultListModel();
		String info="";
		ArrayList<String> arrl =new ArrayList<String>();
		arrl=db.minfoshow();
		for (int i = 0; i <arrl.size(); i=i+3)
		{
			info=String.format("%1$s%2$20s%3$20s",arrl.get(i),arrl.get(i+1),arrl.get(i+2));
			//info=arrl.get(i)+"                       "+arrl.get(i+1)+"                       "+arrl.get(i+2);
		    listModel.addElement(info);
		}
		list.setModel(listModel);
		
		textField = new JTextField();
		textField.setBounds(10, 46, 131, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(151, 46, 131, 34);
		contentPane.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u539F\u5EE0", "\u6B63\u5EE0", "\u526F\u5EE0", "\u4E2D\u53E4", "\u9032\u53E3"}));
		comboBox.setBounds(292, 46, 93, 34);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("\u65B0\u589E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] info=new String[3];
				info[0]=textField.getText();
				info[1]=textField_1.getText();
				info[2]=comboBox.getSelectedItem().toString();
				db.addminfo(info);
				String up="";
				ArrayList<String> arrl =new ArrayList<String>();
				listModel.removeAllElements();
				arrl=db.minfoshow();
				for (int i = 0; i <arrl.size(); i=i+3)
				{
					up=String.format("%1$-20s%2$-20s%3$-20s",arrl.get(i),arrl.get(i+1),arrl.get(i+2) );
					//up=arrl.get(i)+String.format("%1$-20s",arrl.get(i+1))+String.format("% 10s%n",arrl.get(i+2));
				    listModel.addElement(up);
				}
				list.setModel(listModel);
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton.setBounds(395, 46, 93, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u7DAD\u4FEE\u4EE3\u865F");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 131, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u7DAD\u4FEE\u540D\u7A31");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(151, 10, 131, 26);
		contentPane.add(lblNewLabel_1);
	}
}
