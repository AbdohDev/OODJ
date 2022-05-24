package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CancelVaccinationAppointment extends JFrame {

	private JPanel contentPane;
	private JTextField identityNumtxt;
	private JTextField fullNametxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelVaccinationAppointment frame = new CancelVaccinationAppointment();
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
	public CancelVaccinationAppointment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					File f = new File("C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee"+"\\vaccinationAppointment.txt");
					Scanner s = new Scanner(f);
					
					FileWriter fw = null;
			        PrintWriter writer = null;
					String path = "C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee\\temp2.txt";
					fw = new FileWriter(path);
					writer = new PrintWriter(fw);
					
					String Entered_Identity_Num = identityNumtxt.getText();
					String Entered_Full_Name = fullNametxt.getText();
					
					while(s.hasNext()) 
					{
						String Identity_Num = s.nextLine();
						String Full_Name = s.nextLine();
						String Date = s.nextLine();
						String Time = s.nextLine();
						String Location = s.nextLine();
									

						
						if(!(Identity_Num.contains(Entered_Identity_Num))){
									writer.println(Identity_Num);
									writer.println(Full_Name);
									writer.println(Date);
									writer.println(Time);
									writer.println(Location);
									writer.flush();	
																						       							
						}
					
					}
				}catch(IOException ex) {
					Logger.getLogger(ViewVaccinationProgramme.class.getName()).log(Level.FINE, "Log Text");
					
				}
				
				try{
					File fb = new File("C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee"+"\\temp2.txt");
					Scanner sb = new Scanner(fb);
					
					FileWriter fwb = null;
			        PrintWriter writer = null;
					String path = "C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee\\addAppointment.txt";
					fwb = new FileWriter(path);
					writer = new PrintWriter(fwb);
					
					
					
					while(sb.hasNext()) 
					{
						String Identity_Num = sb.nextLine();
						String Full_Name = sb.nextLine();
						String Date = sb.nextLine();
						String Time = sb.nextLine();
						String Location = sb.nextLine();

						
						writer.println(Identity_Num);
			        	writer.println(Full_Name);
			        	writer.println(Date);
			        	writer.println(Time);
			        	writer.println(Location);
			        	writer.flush();			        	
						
					}
				}catch(IOException ex) {
					Logger.getLogger(ViewVaccinationProgramme.class.getName()).log(Level.FINE, "Log Text");
					
				}
				
				JOptionPane.showMessageDialog(null, "Your appointment is canceled!");
				VaccinationAppointment a = new VaccinationAppointment();
				a.setVisible(true);
				dispose();

	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(423, 289, 131, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Identity Number:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(46, 125, 158, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblFullName = new JLabel("Full Name:");
		lblFullName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFullName.setBounds(46, 187, 158, 23);
		contentPane.add(lblFullName);
		
		identityNumtxt = new JTextField();
		identityNumtxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		identityNumtxt.setBounds(229, 126, 158, 23);
		contentPane.add(identityNumtxt);
		identityNumtxt.setColumns(10);
		
		fullNametxt = new JTextField();
		fullNametxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		fullNametxt.setColumns(10);
		fullNametxt.setBounds(229, 188, 158, 23);
		contentPane.add(fullNametxt);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter your information");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(139, 22, 301, 44);
		contentPane.add(lblNewLabel_1);
	}
}
