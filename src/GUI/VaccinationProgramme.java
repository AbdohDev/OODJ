package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class VaccinationProgramme extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VaccinationProgramme frame = new VaccinationProgramme();
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
	public VaccinationProgramme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Modify");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				ModifyVaccinationProgramme a = new ModifyVaccinationProgramme();
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(207, 176, 159, 56);
		contentPane.add(btnNewButton);
		
		JButton RegisterButton = new JButton("Register");
		RegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterVaccinationProgramme a = new RegisterVaccinationProgramme();
				a.setVisible(true);
				dispose();
			}
		});
		RegisterButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		RegisterButton.setBounds(207, 98, 159, 56);
		contentPane.add(RegisterButton);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewVaccinationProgramme a = new ViewVaccinationProgramme();
				a.setVisible(true);
				dispose();
			}
		});
		btnView.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnView.setBounds(207, 256, 159, 56);
		contentPane.add(btnView);
		
		JLabel lblNewLabel = new JLabel("Vaccination Programme");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(159, 31, 274, 37);
		contentPane.add(lblNewLabel);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peopleMain a = new peopleMain();
				a.setVisible(true);
				dispose();
			}
		});
		backButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		backButton.setBounds(428, 299, 126, 37);
		contentPane.add(backButton);
	}

}
