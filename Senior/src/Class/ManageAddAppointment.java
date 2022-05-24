/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import GUI.PersonnelMainMenu;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ROY
 */
public class ManageAddAppointment {
    public  ManageAddAppointment(){

}
    public boolean ManageAddAppointment(String IDNumber, String Name, String Date, String Time, String Centre){
            try
        {
                FileWriter Writer = new FileWriter("addAppointment.txt", true);
                Writer.write(IDNumber);
                Writer.write(System.getProperty("line.separator"));
                Writer.write(Name);
                Writer.write(System.getProperty("line.separator"));
                Writer.write(Date);
                Writer.write(System.getProperty("line.separator"));
                Writer.write(Time);
                Writer.write(System.getProperty("line.separator"));
                Writer.write(Centre);
                Writer.write(System.getProperty("line.separator"));
                Writer.close();
                return true;

        }
            catch(Exception e)
            { 
                  return false;
            }
    }
       public void ManageAddModifyAppointment(String IDNumber, String Name, String Date, String Time, String Centre){
             try{
					File f = new File("addAppointment.txt");
					Scanner s = new Scanner(f);
					FileWriter fw = new FileWriter("TempAddAppointment.txt");
					PrintWriter writer = new PrintWriter(fw);
					while(s.hasNext()) 
					{
						String ID_Number = s.nextLine();
						String Full_Name = s.nextLine();
						String Full_Date = s.nextLine();
						String Full_Time = s.nextLine();
						String Centre_Name = s.nextLine();
                                                
                                                if(ID_Number.equals(IDNumber) ) {
							
								Full_Name = Name;
								Full_Date = Date;
								Full_Time = Time;
								Centre_Name = Centre;	
														
																			
						}
						
                                        writer.println(ID_Number);
			        	writer.println(Full_Name);
			        	writer.println(Full_Date);
			        	writer.println(Full_Time);
			        	writer.println(Centre_Name);
			        	writer.flush();	
					}
				}catch(Exception e) {
					
					
				}
             try{
					File f = new File("TempaddAppointment.txt");
					Scanner s = new Scanner(f);
					FileWriter fw = new FileWriter("addAppointment.txt");
					PrintWriter writer = new PrintWriter(fw);
					while(s.hasNext()) 
					{
						String ID_Number = s.nextLine();
						String Full_Name = s.nextLine();
						String Full_Date = s.nextLine();
						String Full_Time = s.nextLine();
						String Centre_Name = s.nextLine();
                                        writer.println(ID_Number);
			        	writer.println(Full_Name);
			        	writer.println(Full_Date);
			        	writer.println(Full_Time);
			        	writer.println(Centre_Name);
			        	writer.flush();	
					}
				}catch(Exception e) {
					
					
				}
    }
       
        public void ManageDeleteAppointment(String IDNumber, String Name, String Date, String Time, String Centre){
             try{
					File f = new File("addAppointment.txt");
					Scanner s = new Scanner(f);
					FileWriter fw = new FileWriter("TempAddAppointment.txt");
					PrintWriter writer = new PrintWriter(fw);
					while(s.hasNext()) 
					{
						String ID_Number = s.nextLine();
						String Full_Name = s.nextLine();
						String Full_Date = s.nextLine();
						String Full_Time = s.nextLine();
						String Centre_Name = s.nextLine();
                                                
                                                if(ID_Number.equals(IDNumber) ) {
							continue;	
														
																			
						}
						
                                        writer.println(ID_Number);
			        	writer.println(Full_Name);
			        	writer.println(Full_Date);
			        	writer.println(Full_Time);
			        	writer.println(Centre_Name);
			        	writer.flush();	
					}
				}catch(Exception e) {
					
					
				}
             try{
					File f = new File("TempaddAppointment.txt");
					Scanner s = new Scanner(f);
					FileWriter fw = new FileWriter("addAppointment.txt");
					PrintWriter writer = new PrintWriter(fw);
					while(s.hasNext()) 
					{
						String ID_Number = s.nextLine();
						String Full_Name = s.nextLine();
						String Full_Date = s.nextLine();
						String Full_Time = s.nextLine();
						String Centre_Name = s.nextLine();
                                        writer.println(ID_Number);
			        	writer.println(Full_Name);
			        	writer.println(Full_Date);
			        	writer.println(Full_Time);
			        	writer.println(Centre_Name);
			        	writer.flush();	
					}
				}catch(Exception e) {
					
					
				}
    }
}
