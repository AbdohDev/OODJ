package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class RegisterVaccinationAppointment extends JFrame {

	private JPanel contentPane;
	private JTextField identityNumtxt;
	private JTextField FullNametxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterVaccinationAppointment frame = new RegisterVaccinationAppointment();
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
	public RegisterVaccinationAppointment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please select your preferable date, time and location");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 141, 479, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Date:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(30, 201, 68, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Time:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(215, 193, 106, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Centre Name:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(385, 197, 138, 31);
		contentPane.add(lblNewLabel_1_2);
		
		Choice timeChoice = new Choice();
		timeChoice.setFont(new Font("Dialog", Font.BOLD, 13));
		timeChoice.add("09:00");
		timeChoice.add("10:00");
		timeChoice.add("11:00");
		timeChoice.add("13:00");
		timeChoice.add("14:00");
		timeChoice.add("15:00");
		timeChoice.add("16:00");
		timeChoice.setBounds(215, 238, 128, 30);
		contentPane.add(timeChoice);
		getContentPane().add(timeChoice);
		
		Choice dateChoice = new Choice();
		dateChoice.setFont(new Font("Dialog", Font.BOLD, 13));
		dateChoice.add("15/12/21");
		dateChoice.add("16/12/21");
		dateChoice.add("17/12/21");
		dateChoice.add("18/12/21");
		dateChoice.add("19/12/21");
		dateChoice.add("20/12/21");
		dateChoice.add("21/12/21");
		dateChoice.setBounds(30, 238, 128, 18);
		contentPane.add(dateChoice);
		
		Choice CentreChoice = new Choice();
		CentreChoice.setFont(new Font("Dialog", Font.BOLD, 13));
		CentreChoice.setBounds(385, 238, 128, 18);
		CentreChoice.add("KLCC");
		CentreChoice.add("MMU");
		CentreChoice.add("IMU");
		CentreChoice.add("Bukit Jalil Stadium");
		CentreChoice.add("Axiata Arena");
		contentPane.add(CentreChoice);
		
		identityNumtxt = new JTextField();
		identityNumtxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		identityNumtxt.setBounds(186, 64, 138, 22);
		contentPane.add(identityNumtxt);
		identityNumtxt.setColumns(10);
		
		FullNametxt = new JTextField();
		FullNametxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		FullNametxt.setColumns(10);
		FullNametxt.setBounds(186, 97, 138, 22);
		contentPane.add(FullNametxt);
		
		
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FileWriter fw = null;
		        PrintWriter writer = null;	
				
				try {
					
					String path = "C:\\Users\\US\\OneDrive - Asia Pacific University\\Desktop\\OODJ Assignment\\PersonnelCommitee\\addAppointment.txt";
					fw = new FileWriter(path, true);
					writer = new PrintWriter(fw);
					
					String Identity_Num = identityNumtxt.getText();
					String Full_Name = FullNametxt.getText();
				    String Date = dateChoice.getSelectedItem();
				    String Time = timeChoice.getSelectedItem();
					String Centre = CentreChoice.getSelectedItem();
					
					writer.println(Identity_Num);
		        	writer.println(Full_Name);
					writer.println(Date);
		        	writer.println(Time);
		        	writer.println(Centre);
		        	writer.flush();
		        	
					
				}catch (IOException e1) {
					e1.printStackTrace();
				}finally {
		            if(writer != null) {
		                writer.close();
		            }
		            if(fw != null) {
		                try {
		                    fw.close();
		                } catch (IOException es) {
		                    es.printStackTrace();
		                }
		            }
				}
				
				JOptionPane.showMessageDialog(null, "Registration success!");
				
				VaccinationAppointment a = new VaccinationAppointment();
				a.setVisible(true);
				dispose();

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(439, 291, 118, 43);
		contentPane.add(btnNewButton);
		
		
		JLabel lblPleaseEnterYour = new JLabel("Please enter your information");
		lblPleaseEnterYour.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPleaseEnterYour.setBounds(10, 4, 479, 49);
		contentPane.add(lblPleaseEnterYour);
		
		JLabel lblNewLabel_2 = new JLabel("Identity Number:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(30, 64, 156, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Full Name:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(30, 97, 118, 18);
		contentPane.add(lblNewLabel_2_1);
		

		
		 
	}
}
