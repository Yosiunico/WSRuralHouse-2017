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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import dataAccess.*;
import domain.Customer;
import domain.Owner;

public class SingUpGUI extends JFrame {
	
	DataAccess dataAccess = new DataAccess();

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
					SingUpGUI frame = new SingUpGUI();
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
	public SingUpGUI() {
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
		createAccountJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean passwordMatch = false;
				if(passwordJPasswordField.getPassword().toString().equals(confirmPasswordJPasswordField.getPassword().toString())) {
					passwordMatch = true;
				}
				
				if(passwordMatch) {
					if(customerJRadioButton.isSelected()) {
						Customer customer = new Customer(usernameJTextField.getText().toString(), passwordJPasswordField.getPassword().toString());
						dataAccess.storeCustomer(customer);
					} else if(ownerJRadioButton.isSelected()) {
						Owner owner = new Owner(usernameJTextField.getText().toString(), passwordJPasswordField.getPassword().toString());
						dataAccess.storeOwner(owner);
					}
				}
				
			}
		});
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
