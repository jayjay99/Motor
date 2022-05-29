import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MAIN_PAGE extends JFrame {

	private JPanel contentPane;
	private DBcontroller db= new DBcontroller(); 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAIN_PAGE frame = new MAIN_PAGE();
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
	public MAIN_PAGE() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u5EE0\u5546\u57FA\u672C\u8CC7\u6599\u5EFA\u6A94");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vendor_info vi= new vendor_info();
				vi.show();
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton.setBounds(20, 10, 190, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u7DAD\u4FEE\u4EBA\u54E1\u8CC7\u6599\u5EFA\u6A94");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maintenancestaff ms=new maintenancestaff();
				ms.show();
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_1.setBounds(20, 56, 190, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u8ECA\u7A2E\u4EE3\u78BC\u8CC7\u6599\u5EFA\u6A94");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carinfo ci=new carinfo();
				ci.show();
			}
		});
		btnNewButton_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_2.setBounds(20, 102, 190, 36);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u4FEE\u8B77\u4EE3\u78BC\u8CC7\u6599\u5EFA\u6A94");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maintanenceinfo mi=new maintanenceinfo();
				mi.show();
			}
		});
		btnNewButton_3.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_3.setBounds(20, 148, 190, 36);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u6AA2\u67E5\u4EE3\u78BC\u8CC7\u6599\u5EFA\u6A94");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkdata cd=new checkdata();
				cd.show();
			}
		});
		btnNewButton_4.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_4.setBounds(20, 194, 190, 36);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u5BA2\u6236\u57FA\u672C\u8CC7\u6599\u5EFA\u6A94");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerinfo ci=new customerinfo();
				ci.show();
			}
		});
		btnNewButton_5.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_5.setBounds(20, 240, 190, 36);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\u4E00\u822C\u4FEE\u8B77\u57FA\u672C\u8CC7\u6599\u5EFA\u6A94");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				custmaintanenceinfo cm= new custmaintanenceinfo();
				cm.show();
			}
		});
		btnNewButton_6.setFont(new Font("新細明體", Font.PLAIN, 15));
		btnNewButton_6.setBounds(20, 286, 190, 36);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("\u51FA\u5EE0\u8ECA\u8F1B\u8CC7\u6599\u5EFA\u6A94");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				custmaincomplete cmc =new custmaincomplete();
				cmc.show();
			}
		});
		btnNewButton_7.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_7.setBounds(20, 332, 190, 36);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("\u5DF2\u51FA\u5EE0\u8ECA\u8F1B\u8CC7\u6599\u5EFA\u6A94");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkcompletecase ccc=new checkcompletecase();
				ccc.show();
			}
		});
		btnNewButton_8.setFont(new Font("新細明體", Font.PLAIN, 15));
		btnNewButton_8.setBounds(20, 378, 190, 36);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("\u5BA2\u6236\u4FEE\u8B77\u7D00\u9304\u67E5\u8A62");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkcustmain ccm=new checkcustmain();
				ccm.show();
			}
		});
		btnNewButton_9.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_9.setBounds(20, 424, 190, 36);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("\u71DF\u6536\u72C0\u6CC1\u7D71\u8A08\u67E5\u8A62");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mounthrev mr=new mounthrev();
				mr.show();
			}
		});
		btnNewButton_10.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnNewButton_10.setBounds(20, 470, 190, 36);
		contentPane.add(btnNewButton_10);
	}

}
