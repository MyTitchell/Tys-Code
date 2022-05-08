package HomeworkPractice;

import javax.swing.JPanel;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.Box;

public class bankApp extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public bankApp() {
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

	}

}
