package HomeworkPractice;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;

public class bankScreen {

	private JFrame frame;
	private JTextField txtCredit;
	private JTextField txtDebit;
	private JTextField txtBalance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bankScreen window = new bankScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}});
	}

	/**
	 * Create the application.
	 */
	
	
	public bankScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(new Rectangle(100, 100, 470, 300));
		frame.setBounds(100, 100, 470, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[48px][86px][54px][][]", "[14px][20px][20px][20px]"));
		
		JLabel lblNewLabel = new JLabel("ACME Bank");
		frame.getContentPane().add(lblNewLabel, "cell 1 0,alignx center,aligny center");
		
		JLabel lblDeposit = new JLabel("Deposit");
		frame.getContentPane().add(lblDeposit, "cell 0 1,alignx right,aligny center");
		
		txtCredit = new JTextField();
		frame.getContentPane().add(txtCredit, "cell 1 1,alignx left,aligny center");
		txtCredit.setColumns(10);
		
		JButton btnCredit = new JButton("Credit");
		
		
		btnCredit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
				int creditVal = Integer.parseInt(txtCredit.getText());
			
				txtBalance.setText(Integer.toString(~creditVal+1));	
					
					}
				});		

		frame.getContentPane().add(btnCredit, "cell 2 1 3 1,aligny center");
		
		JLabel lblWithdrawl = new JLabel("Withdrawl");
		frame.getContentPane().add(lblWithdrawl, "cell 0 2,alignx right,aligny center");
		
		txtDebit = new JTextField();
		frame.getContentPane().add(txtDebit, "cell 1 2,alignx left,aligny center");
		txtDebit.setColumns(10);
		
		JButton btnDebit = new JButton("Debit");
		
		btnDebit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
				int debitVal = Integer.parseInt(txtDebit.getText());
				
				txtBalance.setText(Integer.toString(debitVal));
				
			
			}
		});
		
		frame.getContentPane().add(btnDebit, "cell 2 2 2 1,aligny center");
		
		JLabel lblBalance = new JLabel("Balance");
		frame.getContentPane().add(lblBalance, "cell 0 3,alignx right,aligny center");
		
		txtBalance = new JTextField();

		frame.getContentPane().add(txtBalance, "cell 1 3,alignx left,aligny center");
		txtBalance.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				txtBalance.setText("");
				txtCredit.setText("");
				txtDebit.setText("");
			}
		});
		frame.getContentPane().add(btnClear, "cell 2 3");
	}		

			private JTextField textField;
			private JTextField textField_1;

			/**
			 * Create the panel.
			 */
			public bankScreen1() {
				setPreferredSize(new Dimension(435, 230));
				setLayout(new MigLayout("", "[][grow]", "[][][][][][]"));
				
				JLabel lblUsername = new JLabel("Username:");
				add(lblUsername, "cell 0 0,alignx center");
				
				textField = new JTextField();
				add(textField, "cell 1 0,growx");
				textField.setColumns(10);
				
				JLabel lblPin = new JLabel("PIN:");
				add(lblPin, "cell 0 1,alignx center");
				
				textField_1 = new JTextField();
				add(textField_1, "cell 1 1,growx");
				textField_1.setColumns(10);
				
				JButton btnSubmit = new JButton("Submit");
				btnSubmit.setPreferredSize(new Dimension(100, 25));
				add(btnSubmit, "cell 1 4");
				{
			}
		}
	}