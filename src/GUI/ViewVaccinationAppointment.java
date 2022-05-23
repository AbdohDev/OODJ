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
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class ViewVaccinationAppointment extends JFrame {

	private JPanel contentPane;
	private JTextField IdentityNumtxt;
	private JTextField FullNametxt;
	private JButton ViewButton;
	private JLabel lblYourAppointmentIs;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewVaccinationAppointment frame = new ViewVaccinationAppointment();
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
	public ViewVaccinationAppointment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter your Identity Number and Full Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 17, 387, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdentityNumber = new JLabel("Identity Number:");
		lblIdentityNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdentityNumber.setBounds(35, 56, 140, 25);
		contentPane.add(lblIdentityNumber);
		
		JLabel lblFullName = new JLabel("Full Name:");
		lblFullName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFullName.setBounds(35, 111, 88, 19);
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
		
		lblYourAppointmentIs = new JLabel("Your appointment is...");
		lblYourAppointmentIs.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYourAppointmentIs.setBounds(10, 162, 429, 25);
		contentPane.add(lblYourAppointmentIs);
		
		lblNewLabel_1 = new JLabel("Time");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(186, 198, 88, 19);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 198, 88, 19);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Centre Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(367, 198, 105, 19);
		contentPane.add(lblNewLabel_3);
		
		JTextArea Datetxt = new JTextArea();
		Datetxt.setFont(new Font("Monospaced", Font.BOLD, 20));
		Datetxt.setBounds(10, 228, 154, 35);
		contentPane.add(Datetxt);
		
		JTextArea Timetxt = new JTextArea();
		Timetxt.setFont(new Font("Monospaced", Font.BOLD, 20));
		Timetxt.setBounds(188, 228, 154, 35);
		contentPane.add(Timetxt);
		
		JTextArea CentreNametxt = new JTextArea();
		CentreNametxt.setFont(new Font("Monospaced", Font.BOLD, 17));
		CentreNametxt.setBounds(367, 228, 209, 35);
		contentPane.add(CentreNametxt);
		
		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VaccinationAppointment a = new VaccinationAppointment();
				a.setVisible(true);
				dispose();
			}
		});
		BackButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		BackButton.setBounds(458, 310, 105, 29);
		contentPane.add(BackButton);
		
		ViewButton = new JButton("View");
		ViewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					File f = new File("C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee"+"\\addAppointment.txt");
					Scanner s = new Scanner(f);
					String Entered_Identity_Num = IdentityNumtxt.getText();
					String Entered_Full_Name = FullNametxt.getText();
					boolean id = false;
					
					while(s.hasNext()) 
					{
						String Identity_Num = s.nextLine();
						String Full_Name = s.nextLine();
						String Date = s.nextLine();
						String Time = s.nextLine();
						String Location = s.nextLine();
						
						if(Identity_Num.contains(Entered_Identity_Num) ) {
							if(Full_Name.contains(Entered_Full_Name)){
								
								FullNametxt.setText(Full_Name);
								Datetxt.setText(Date);
								Timetxt.setText(Time);
								CentreNametxt.setText(Location);
								
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
		
		
	}
}
