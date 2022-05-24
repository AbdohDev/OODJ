package GUI;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;



public class ModifyVaccinationProgramme extends JFrame {

	private JPanel contentPane;
	private JTextField IdentityNumtxt;
	private JTextField NewFullNametxt;
	private JTextField NewGendertxt;
	private JTextField NewAgetxt;
	private JTextField NewPhoneNumtxt;
	private JTextField EnteredFullnametxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyVaccinationProgramme frame = new ModifyVaccinationProgramme();
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
	public ModifyVaccinationProgramme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		IdentityNumtxt = new JTextField();
		IdentityNumtxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		IdentityNumtxt.setBounds(275, 28, 179, 29);
		contentPane.add(IdentityNumtxt);
		IdentityNumtxt.setColumns(10);
		
		NewFullNametxt = new JTextField();
		NewFullNametxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		NewFullNametxt.setColumns(10);
		NewFullNametxt.setBounds(210, 125, 179, 29);
		contentPane.add(NewFullNametxt);
		
		NewGendertxt = new JTextField();
		NewGendertxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		NewGendertxt.setColumns(10);
		NewGendertxt.setBounds(210, 183, 179, 29);
		contentPane.add(NewGendertxt);
		
		NewAgetxt = new JTextField();
		NewAgetxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		NewAgetxt.setColumns(10);
		NewAgetxt.setBounds(210, 237, 179, 29);
		contentPane.add(NewAgetxt);
		
		NewPhoneNumtxt = new JTextField();
		NewPhoneNumtxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		NewPhoneNumtxt.setColumns(10);
		NewPhoneNumtxt.setBounds(210, 293, 179, 29);
		contentPane.add(NewPhoneNumtxt);
		
		JLabel lblNewLabel = new JLabel("New Full Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(43, 127, 135, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdentityNumber = new JLabel("Current Identity Number:");
		lblIdentityNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdentityNumber.setBounds(43, 30, 199, 21);
		contentPane.add(lblIdentityNumber);
		
		JLabel lblNewGender = new JLabel("New Gender:");
		lblNewGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewGender.setBounds(43, 190, 135, 21);
		contentPane.add(lblNewGender);
		
		JLabel lblNewAge = new JLabel("New Age:");
		lblNewAge.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewAge.setBounds(43, 244, 135, 21);
		contentPane.add(lblNewAge);
		
		JLabel lblNewPhoneNumber = new JLabel("New Phone Number:");
		lblNewPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewPhoneNumber.setBounds(43, 300, 161, 21);
		contentPane.add(lblNewPhoneNumber);
		
		JLabel lblCurrentFullName = new JLabel("Current Full Name:");
		lblCurrentFullName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCurrentFullName.setBounds(43, 77, 199, 21);
		contentPane.add(lblCurrentFullName);
		
		EnteredFullnametxt = new JTextField();
		EnteredFullnametxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		EnteredFullnametxt.setColumns(10);
		EnteredFullnametxt.setBounds(275, 68, 179, 29);
		contentPane.add(EnteredFullnametxt);
		

		
		//Modify
		JButton ModifyButton = new JButton("Modify");
		ModifyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					File f = new File("C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee"+"\\register.txt");
					Scanner s = new Scanner(f);
					
					FileWriter fw = null;
			        PrintWriter writer = null;
					String path = "C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee\\temp.txt";
					fw = new FileWriter(path);
					writer = new PrintWriter(fw);
					
					String Entered_Identity_Num = IdentityNumtxt.getText();
					String Entered_FUll_Name = EnteredFullnametxt.getText();
					String New_Full_Name = NewFullNametxt.getText();
					String New_Gender = NewGendertxt.getText();
					String New_Age = NewAgetxt.getText();
					String New_Phone_Num = NewPhoneNumtxt.getText();
					
					boolean modified = false;
					
					while(s.hasNext()) 
					{
						String Identity_Num = s.nextLine();
						String Full_Name = s.nextLine();
						String Gender = s.nextLine();
						String Age = s.nextLine();
						String Phone_Number = s.nextLine();
						
						if(Identity_Num.contains(Entered_Identity_Num) ) {
							
							if(Full_Name.contains(Entered_FUll_Name)) {
								Full_Name = New_Full_Name;
								Gender = New_Gender;
								Age = New_Age;
								Phone_Number = New_Phone_Num;	
								modified = true;
								
							}							
																			
						}
						
						
						
						writer.println(Identity_Num);
			        	writer.println(Full_Name);
			        	writer.println(Gender);
			        	writer.println(Age);
			        	writer.println(Phone_Number);
			        	writer.flush();			        	
						
					}if(modified == false) {
						JOptionPane.showMessageDialog(null, "Wrong Input!Please chack your identity number and full name:)");
					}if(modified == true) {
						JOptionPane.showMessageDialog(null, "Successfully modified!");
					}
				}catch(IOException ex) {
					Logger.getLogger(ViewVaccinationProgramme.class.getName()).log(Level.FINE, "Log Text");
					
				}
				
				try{
					File fb = new File("C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee"+"\\temp.txt");
					Scanner sb = new Scanner(fb);
					
					FileWriter fwb = null;
			        PrintWriter writer = null;
					String path = "C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee\\register.txt";
					fwb = new FileWriter(path);
					writer = new PrintWriter(fwb);
					
					
					
					while(sb.hasNext()) 
					{
						String Identity_Num = sb.nextLine();
						String Full_Name = sb.nextLine();
						String Gender = sb.nextLine();
						String Age = sb.nextLine();
						String Phone_Number = sb.nextLine();

						
						writer.println(Identity_Num);
			        	writer.println(Full_Name);
			        	writer.println(Gender);
			        	writer.println(Age);
			        	writer.println(Phone_Number);
			        	writer.flush();	
			        							
					}
					
				}catch(IOException ex) {
					Logger.getLogger(ViewVaccinationProgramme.class.getName()).log(Level.FINE, "Log Text");
					
				}
				
				
				
				VaccinationProgramme a = new VaccinationProgramme();
				a.setVisible(true);
				dispose();
				dispose();
				
			}
		});
		
		
		
		ModifyButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		ModifyButton.setBounds(441, 313, 135, 39);
		contentPane.add(ModifyButton);
		
		
		
		
	}
}
