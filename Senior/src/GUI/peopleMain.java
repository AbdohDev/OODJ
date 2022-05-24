package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class peopleMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					peopleMain frame = new peopleMain();
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
	public peopleMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("People Main Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(201, 11, 323, 43);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Veccination Programme");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VaccinationProgramme a = new VaccinationProgramme();
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(177, 77, 248, 69);
		contentPane.add(btnNewButton);
		
		JButton btnVeccinationAppointment = new JButton("Veccination Appointment");
		btnVeccinationAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VaccinationAppointment a = new VaccinationAppointment();
				a.setVisible(true);
				dispose();
			}
		});
		btnVeccinationAppointment.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVeccinationAppointment.setBounds(177, 174, 248, 69);
		contentPane.add(btnVeccinationAppointment);
		
		JButton btnVeccinationStatus = new JButton("Veccination Status");
		btnVeccinationStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewVaccinationStatus a = new ViewVaccinationStatus();
				a.setVisible(true);
				dispose();
			}
		});
		btnVeccinationStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVeccinationStatus.setBounds(177, 283, 248, 69);
		contentPane.add(btnVeccinationStatus);
	}
}
