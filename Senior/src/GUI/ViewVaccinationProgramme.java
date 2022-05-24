package GUI;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class ViewVaccinationProgramme extends JFrame {

	private JPanel contentPane;
	private JTextField IdentityNumtxt;
	//try full name verification
	private JTextField EnterFullNametxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewVaccinationProgramme frame = new ViewVaccinationProgramme();
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
	public ViewVaccinationProgramme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 418);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		IdentityNumtxt = new JTextField();
		IdentityNumtxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		IdentityNumtxt.setBounds(208, 53, 188, 35);
		contentPane.add(IdentityNumtxt);
		IdentityNumtxt.setColumns(10);
		
		JTextArea FullNametxt = new JTextArea();
		FullNametxt.setFont(new Font("Monospaced", Font.BOLD, 17));
		FullNametxt.setBounds(10, 254, 188, 35);
		contentPane.add(FullNametxt);
		
		JTextArea Gendertxt = new JTextArea();
		Gendertxt.setFont(new Font("Monospaced", Font.BOLD, 17));
		Gendertxt.setBounds(219, 254, 105, 35);
		contentPane.add(Gendertxt);
		
		JTextArea Agetxt = new JTextArea();
		Agetxt.setFont(new Font("Monospaced", Font.BOLD, 17));
		Agetxt.setBounds(351, 254, 45, 35);
		contentPane.add(Agetxt);
		
		JTextArea PhoneNumbertxt = new JTextArea();
		PhoneNumbertxt.setFont(new Font("Monospaced", Font.BOLD, 17));
		PhoneNumbertxt.setBounds(449, 254, 154, 35);
		contentPane.add(PhoneNumbertxt);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 224, 88, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gender:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(219, 224, 88, 19);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Age:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(351, 224, 88, 19);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone Number:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(449, 224, 146, 19);
		contentPane.add(lblNewLabel_1_3);
		
		JButton BackBuyyon = new JButton("Back");
		BackBuyyon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VaccinationProgramme a = new VaccinationProgramme();
				a.setVisible(true);
				dispose();
			}
		});
		BackBuyyon.setFont(new Font("Tahoma", Font.BOLD, 14));
		BackBuyyon.setBounds(483, 320, 105, 29);
		contentPane.add(BackBuyyon);
		
		JLabel lblNewLabel = new JLabel("Idnetity Number: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(35, 56, 140, 25);
		contentPane.add(lblNewLabel);
		
		EnterFullNametxt = new JTextField();
		EnterFullNametxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		EnterFullNametxt.setColumns(10);
		EnterFullNametxt.setBounds(208, 105, 188, 35);
		contentPane.add(EnterFullNametxt);
		

		
		JButton ViewButton = new JButton("View");
		ViewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		ViewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					File f = new File("C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee"+"\\register.txt");
					Scanner s = new Scanner(f);
					String Entered_Identity_Num = IdentityNumtxt.getText();
					String Entered_Full_Name = EnterFullNametxt.getText();
					boolean id = false;
					
					while(s.hasNext()) 
					{
						String Identity_Num = s.nextLine();
						String Full_Name = s.nextLine();
						String Gender = s.nextLine();
						String Age = s.nextLine();
						String Phone_Number = s.nextLine();
						
						if(Identity_Num.contains(Entered_Identity_Num) ) {
							if(Full_Name.contains(Entered_Full_Name)){
								
								FullNametxt.setText(Full_Name);
								Gendertxt.setText(Gender);
								Agetxt.setText(Age);
								PhoneNumbertxt.setText(Phone_Number);
								
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
				
		ViewButton.setBounds(434, 122, 105, 29);
		contentPane.add(ViewButton);
		
		JLabel lblNewLabel_1_4 = new JLabel("Full Name:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(35, 111, 88, 19);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblPleaseEnterYour = new JLabel("Please enter your Identity Number and Full Name");
		lblPleaseEnterYour.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPleaseEnterYour.setBounds(10, 17, 429, 25);
		contentPane.add(lblPleaseEnterYour);
		
		JLabel lblYourCurrentRegisterd = new JLabel("Your current registerd information is...");
		lblYourCurrentRegisterd.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYourCurrentRegisterd.setBounds(10, 180, 429, 25);
		contentPane.add(lblYourCurrentRegisterd);
		
		
		
		
	}
}
