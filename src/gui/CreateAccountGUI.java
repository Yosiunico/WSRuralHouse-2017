package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;

public class CreateAccountGUI extends JFrame {

	private JPanel contentPane;
	private JTextField usernameJTextField;
	private JPasswordField passwordJPasswordField;
	private JPasswordField confirmPasswordJPasswordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccountGUI frame = new CreateAccountGUI();
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
	public CreateAccountGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usernameJTextField = new JTextField();
		usernameJTextField.setBounds(199, 36, 188, 20);
		contentPane.add(usernameJTextField);
		usernameJTextField.setColumns(10);
		
		passwordJPasswordField = new JPasswordField();
		passwordJPasswordField.setBounds(199, 67, 188, 20);
		contentPane.add(passwordJPasswordField);
		
		confirmPasswordJPasswordField = new JPasswordField();
		confirmPasswordJPasswordField.setBounds(199, 98, 188, 20);
		contentPane.add(confirmPasswordJPasswordField);
		
		JRadioButton customerJRadioButton = new JRadioButton("Customer");
		buttonGroup.add(customerJRadioButton);
		customerJRadioButton.setBounds(87, 152, 109, 23);
		contentPane.add(customerJRadioButton);
		
		JRadioButton ownerJRadioButton = new JRadioButton("Owner");
		buttonGroup.add(ownerJRadioButton);
		ownerJRadioButton.setBounds(217, 152, 109, 23);
		contentPane.add(ownerJRadioButton);
		
		JButton createAccountJButton = new JButton("Create account");
		createAccountJButton.setBounds(87, 201, 252, 23);
		contentPane.add(createAccountJButton);
		
		JLabel usernameJLabel = new JLabel("Username: ");
		usernameJLabel.setBounds(134, 39, 55, 14);
		contentPane.add(usernameJLabel);
		
		JLabel passwordJLabel = new JLabel("Password: ");
		passwordJLabel.setBounds(136, 70, 53, 14);
		contentPane.add(passwordJLabel);
		
		JLabel confirmPasswordJLabel = new JLabel("Confirm password: ");
		confirmPasswordJLabel.setBounds(87, 101, 93, 14);
		contentPane.add(confirmPasswordJLabel);
	}
}
