package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class ViewVaccinationStatus extends JFrame {

	private JPanel contentPane;
	private JTextField IdentityNumtxt;
	private JTextField FullNametxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewVaccinationStatus frame = new ViewVaccinationStatus();
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
	public ViewVaccinationStatus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter yout Identity Number and Full Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 17, 387, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdentityNumber = new JLabel("Identity Number:");
		lblIdentityNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdentityNumber.setBounds(35, 56, 140, 25);
		contentPane.add(lblIdentityNumber);
		
		JLabel lblFullName = new JLabel("Full Name:");
		lblFullName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFullName.setBounds(35, 111, 140, 25);
		contentPane.add(lblFullName);
		
		IdentityNumtxt = new JTextField();
		IdentityNumtxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		IdentityNumtxt.setBounds(208, 53, 188, 35);
		contentPane.add(IdentityNumtxt);
		IdentityNumtxt.setColumns(10);
		
		FullNametxt = new JTextField();
		FullNametxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		FullNametxt.setColumns(10);
		FullNametxt.setBounds(208, 105, 188, 35);
		contentPane.add(FullNametxt);
		
		JLabel lblYourCurrentVaccination = new JLabel("Your current vaccination status is...");
		lblYourCurrentVaccination.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYourCurrentVaccination.setBounds(10, 162, 429, 25);
		contentPane.add(lblYourCurrentVaccination);
		
		JLabel lblVaccinationName = new JLabel("Vaccination Name");
		lblVaccinationName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVaccinationName.setBounds(20, 198, 155, 19);
		contentPane.add(lblVaccinationName);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStatus.setBounds(197, 198, 155, 19);
		contentPane.add(lblStatus);
		
		JLabel lblCompletedDate = new JLabel("Completed Date");
		lblCompletedDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCompletedDate.setBounds(384, 198, 155, 19);
		contentPane.add(lblCompletedDate);
		
		JTextArea VaccinaNametxt = new JTextArea();
		VaccinaNametxt.setFont(new Font("Monospaced", Font.BOLD, 20));
		VaccinaNametxt.setBounds(20, 245, 155, 35);
		contentPane.add(VaccinaNametxt);
		
		JTextArea Statustxt = new JTextArea();
		Statustxt.setFont(new Font("Monospaced", Font.BOLD, 16));
		Statustxt.setBounds(197, 245, 173, 35);
		contentPane.add(Statustxt);
		
		JTextArea Datetxt = new JTextArea();
		Datetxt.setFont(new Font("Monospaced", Font.BOLD, 17));
		Datetxt.setBounds(384, 245, 173, 35);
		contentPane.add(Datetxt);
		
		JButton ViewButton = new JButton("View");
		ViewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					File f = new File("C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee"+"\\vaccinationStatus.txt");
					Scanner s = new Scanner(f);
					String Entered_Identity_Num = IdentityNumtxt.getText();
					String Entered_Full_Name = FullNametxt.getText();
					boolean id = false;
					
					while(s.hasNext()) 
					{
						String Identity_Num = s.nextLine();
						String Full_Name = s.nextLine();
						String VaccineName = s.nextLine();
						String Status = s.nextLine();
						String Date = s.nextLine();
						
						if(Identity_Num.contains(Entered_Identity_Num) ) {
							if(Full_Name.contains(Entered_Full_Name)){
								
							
								VaccinaNametxt.setText(VaccineName);
								Statustxt.setText(Status);
								Datetxt.setText(Date);
								
								id = true;
						
							}
													
						}
					}if(id == false) {
						JOptionPane.showMessageDialog(null, "Wrong Input! Please chack your identity number and full name:)");
					}
				}catch(IOException ex) {
					Logger.getLogger(ViewVaccinationProgramme.class.getName()).log(Level.FINE, "Log Text");
					
				}
				
			}
		});
		ViewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		ViewButton.setBounds(434, 122, 105, 29);
		contentPane.add(ViewButton);
		
		
		
		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peopleMain a = new peopleMain();
				a.setVisible(true);
				dispose();
			}
		});
		BackButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		BackButton.setBounds(434, 306, 105, 29);
		contentPane.add(BackButton);
	}

}
