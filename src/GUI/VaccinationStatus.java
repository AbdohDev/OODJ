package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VaccinationStatus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VaccinationStatus frame = new VaccinationStatus();
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
	public VaccinationStatus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vaccination Status");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(181, 23, 242, 25);
		contentPane.add(lblNewLabel);
		
		JButton ViewButton = new JButton("View");
		ViewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewVaccinationStatus a = new ViewVaccinationStatus();
				a.setVisible(true);
				dispose();
			}
		});
		ViewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		ViewButton.setBounds(173, 96, 233, 69);
		contentPane.add(ViewButton);
		
		JButton SearchButton = new JButton("Search");
		SearchButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		SearchButton.setBounds(173, 219, 233, 69);
		contentPane.add(SearchButton);
		
		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peopleMain a = new peopleMain();
				a.setVisible(true);
				dispose();
			}
		});
		BackButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		BackButton.setBounds(434, 311, 130, 41);
		contentPane.add(BackButton);
	}

}
