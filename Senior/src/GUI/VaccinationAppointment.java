package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VaccinationAppointment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VaccinationAppointment frame = new VaccinationAppointment();
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
	public VaccinationAppointment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vaccination Appointment");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(150, 28, 290, 37);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterVaccinationAppointment a = new RegisterVaccinationAppointment();
				a.setVisible(true);
				dispose();				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(195, 97, 166, 54);
		contentPane.add(btnNewButton);
		
		JButton btnCancel_1 = new JButton("Cancel");
		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelVaccinationAppointment a = new CancelVaccinationAppointment();
				a.setVisible(true);
				dispose();	
			}
		});
		btnCancel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCancel_1.setBounds(195, 174, 166, 54);
		contentPane.add(btnCancel_1);
		
		JButton btnCancel = new JButton("View");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewVaccinationAppointment a = new ViewVaccinationAppointment();
				a.setVisible(true);
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCancel.setBounds(195, 257, 166, 47);
		contentPane.add(btnCancel);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peopleMain a = new peopleMain();
				a.setVisible(true);
				dispose();
			}
		});
		backButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		backButton.setBounds(402, 303, 126, 37);
		contentPane.add(backButton);
	}
}
