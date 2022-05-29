import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class checkdata extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private DBcontroller db= new DBcontroller(); 
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkdata frame = new checkdata();
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
	public checkdata() {
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
		arrl=db.checkshow();
		for (int i = 0; i <arrl.size(); i=i+3)
		{
			info=arrl.get(i)+"          "+arrl.get(i+1)+"          "+arrl.get(i+2);
		    listModel.addElement(info);
		}
		list.setModel(listModel);
		
		textField = new JTextField();
		textField.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField.setEnabled(false);
		textField.setBounds(28, 50, 72, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText(String.valueOf(db.countcheck()+1));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(264, 50, 150, 30);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("\u6AA2\u67E5\u4EE3\u78BC");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel.setBounds(28, 10, 82, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u6AA2\u67E5\u9805\u76EE\u540D\u7A31");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(264, 10, 136, 30);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\u65B0\u589E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] check=new String[3];
				check[0]=textField.getText();
				check[1]=textField_2.getText();
				check[2]=textField_1.getText();
				db.addcheck(check);
				DefaultListModel listModel = new DefaultListModel();
				String info="";
				ArrayList<String> arrl =new ArrayList<String>();
				
				arrl=db.checkshow();
				for (int i = 0; i <arrl.size(); i=i+3)
				{
					info=arrl.get(i)+"          "+arrl.get(i+1)+"          "+arrl.get(i+2);
				    listModel.addElement(info);
				}
				list.setModel(listModel);
				arrl=new ArrayList<String>();
				textField.setText(String.valueOf(db.countcheck()+1));
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton.setBounds(424, 50, 100, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u6AA2\u67E5\u9805\u76EE\u7C21\u7A31");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(118, 10, 136, 30);
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("新細明體", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(104, 50, 150, 30);
		contentPane.add(textField_2);
	}
}
