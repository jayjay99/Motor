import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;

public class printpreview extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					printpreview frame = new printpreview();
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
	public printpreview() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 70, 964, 867);
		contentPane.add(textArea);
		try {
			FileReader reader=new FileReader("C:\\Users\\a0995\\OneDrive\\桌面\\filename.txt");
			BufferedReader br=new BufferedReader(reader);
			textArea.read(br,null);
			br.close();
			textArea.requestFocus();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		JButton btnNewButton = new JButton("\u5217\u5370");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					boolean complete=textArea.print();
					if(complete) {
						JOptionPane.showMessageDialog(null, "完成列印","資訊",JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "列印","印表機",JOptionPane.ERROR_MESSAGE);
					}
				}catch(PrinterException e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		btnNewButton.setBounds(10, 10, 131, 50);
		contentPane.add(btnNewButton);
	}
}
