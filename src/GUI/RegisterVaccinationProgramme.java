package GUI;


import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class RegisterVaccinationProgramme extends JFrame {

	private JPanel contentPane;
	private JTextField IdentityNumtxt;
	private JTextField FullNametxt;
	private JTextField Gendertxt;
	private JTextField Agetxt;
	private JTextField PhoneNumtxt;
	

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterVaccinationProgramme frame = new RegisterVaccinationProgramme();
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
	public RegisterVaccinationProgramme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		IdentityNumtxt = new JTextField();
		IdentityNumtxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		IdentityNumtxt.setBounds(207, 82, 188, 26);
		contentPane.add(IdentityNumtxt);
		IdentityNumtxt.setColumns(10);
		
		FullNametxt = new JTextField();
		FullNametxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		FullNametxt.setColumns(10);
		FullNametxt.setBounds(207, 133, 188, 26);
		contentPane.add(FullNametxt);
		
		Gendertxt = new JTextField();
		Gendertxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		Gendertxt.setColumns(10);
		Gendertxt.setBounds(207, 185, 188, 26);
		contentPane.add(Gendertxt);
		
		Agetxt = new JTextField();
		Agetxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		Agetxt.setColumns(10);
		Agetxt.setBounds(207, 235, 188, 26);
		contentPane.add(Agetxt);
		
		PhoneNumtxt = new JTextField();
		PhoneNumtxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		PhoneNumtxt.setColumns(10);
		PhoneNumtxt.setBounds(207, 290, 188, 26);
		contentPane.add(PhoneNumtxt);
		
		JLabel lblNewLabel = new JLabel("Please enter your information");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(143, 11, 329, 48);
		contentPane.add(lblNewLabel);
		
		JLabel IdentityNumberLabel = new JLabel("Identity Number:");
		IdentityNumberLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		IdentityNumberLabel.setBounds(40, 85, 133, 20);
		contentPane.add(IdentityNumberLabel);
		
		JLabel FullNemeLabel = new JLabel("Full Name:");
		FullNemeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		FullNemeLabel.setBounds(40, 139, 133, 20);
		contentPane.add(FullNemeLabel);
		
		JLabel GenderLabel = new JLabel("Gender:");
		GenderLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		GenderLabel.setBounds(40, 191, 133, 20);
		contentPane.add(GenderLabel);
		
		JLabel AgeLabel = new JLabel("Age:");
		AgeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		AgeLabel.setBounds(40, 241, 133, 20);
		contentPane.add(AgeLabel);
		
		JLabel PhoneNumLabel = new JLabel("Phone Number:");
		PhoneNumLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		PhoneNumLabel.setBounds(40, 296, 133, 20);
		contentPane.add(PhoneNumLabel);
		
	
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				FileWriter fw = null;
		        PrintWriter writer = null;	
				
				try {
					
					String path = "C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee\\register.txt";
					fw = new FileWriter(path, true);
					writer = new PrintWriter(fw);
					
				    String Identity_Num = IdentityNumtxt.getText();
					String Full_Name = FullNametxt.getText();
					String Gender = Gendertxt.getText();
					int Age = Integer.parseInt(Agetxt.getText());
					String Phone_Num = PhoneNumtxt.getText();
					
					writer.println(Identity_Num);
		        	writer.println(Full_Name);
		        	writer.println(Gender);
		        	writer.println(Age);
		        	writer.println(Phone_Num);
		        	writer.flush();
		        	
					
				}catch (IOException e) {
					e.printStackTrace();
				}finally {
		            if(writer != null) {
		                writer.close();
		            }
		            if(fw != null) {
		                try {
		                    fw.close();
		                } catch (IOException e) {
		                    e.printStackTrace();
		                }
		            }
				}
			
			JOptionPane.showMessageDialog(null, "Registration success!");
				
			VaccinationProgramme a = new VaccinationProgramme();
			a.setVisible(true);
			dispose();
			
			}
		});
		
		

		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(448, 313, 117, 39);
		contentPane.add(btnNewButton);
	}

}
