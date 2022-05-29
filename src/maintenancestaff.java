import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class maintenancestaff extends JFrame {

	private JPanel contentPane;
	private DBcontroller db= new DBcontroller(); 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maintenancestaff frame = new maintenancestaff();
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
	public maintenancestaff() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 746, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u54E1\u5DE5\u4EE3\u78BC");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 80, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u54E1\u5DE5\u59D3\u540D");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(190, 10, 80, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u54E1\u5DE5\u96FB\u8A71");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(471, 10, 80, 49);
		contentPane.add(lblNewLabel_2);
		
		JList list = new JList();
		list.setFont(new Font("新細明體", Font.PLAIN, 25));
		list.setBounds(10, 69, 710, 392);
		contentPane.add(list);
		DefaultListModel listModel = new DefaultListModel();
		String info="";
		ArrayList<String> arrl =new ArrayList<String>();
		arrl=db.mstaff();
		for (int i = 0; i <arrl.size(); i=i+3)
		{
			info=arrl.get(i)+"                       "+arrl.get(i+1)+"                       "+arrl.get(i+2);
		    listModel.addElement(info);
		}
		list.setModel(listModel);
		
		JButton btnNewButton = new JButton("\u65B0\u589E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addstaff as=new addstaff();
				as.show();
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton.setBounds(38, 471, 101, 40);
		contentPane.add(btnNewButton);
		
		JButton btnVuE = new JButton("\u4FEE\u6539");
		btnVuE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updatestaff us =new updatestaff();
				us.show();
			}
		});
		btnVuE.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnVuE.setBounds(149, 471, 101, 40);
		contentPane.add(btnVuE);
		
	}
}
