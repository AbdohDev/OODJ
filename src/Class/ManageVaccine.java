/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author US
 */
public class ManageVaccine {
     public  ManageVaccine(){

}
     public boolean ManageAddVaccine(String OrderID, String ProductBrand, String Branch, String Quantity){
            try
        {
                FileWriter Writer = new FileWriter("Inventory.txt", true);
                Writer.write(OrderID);
                Writer.write(System.getProperty("line.separator"));
                Writer.write(ProductBrand);
                Writer.write(System.getProperty("line.separator"));
                Writer.write(Branch);
                Writer.write(System.getProperty("line.separator"));
                Writer.write(Quantity);
                Writer.write(System.getProperty("line.separator"));
                Writer.close();
                return true;

        }
            catch(Exception e)
            { 
                  return false;
            }
    }


    public void ManageModifyVaccine(String OrderID, String ProductBrand, String Branch, String Quantity){
             try{
					File f = new File("Inventory.txt");
					Scanner s = new Scanner(f);
					FileWriter fw = new FileWriter("TempInventory.txt");
					PrintWriter writer = new PrintWriter(fw);
					while(s.hasNext()) 
					{
						String Full_OrderID = s.nextLine();
						String Full_ProductBrand = s.nextLine();
						String Full_Branch = s.nextLine();
						String Full_Quantity = s.nextLine();
                                                
                                                if(Full_OrderID.equals(OrderID) ) {
							
								Full_ProductBrand = ProductBrand;
								Full_Branch = Branch;
								Full_Quantity = Quantity;	
														
																			
						}
						
                                        writer.println(Full_OrderID);
			        	writer.println(Full_ProductBrand);
			        	writer.println(Full_Branch);
			        	writer.println(Full_Quantity);
			        	writer.flush();	
					}
				}catch(Exception e) {
					
					
				}
             try{
					File f = new File("TempInventory.txt");
					Scanner s = new Scanner(f);
					FileWriter fw = new FileWriter("Inventory.txt");
					PrintWriter writer = new PrintWriter(fw);
					while(s.hasNext()) 
					{
						String Full_OrderID = s.nextLine();
						String Full_ProductBrand = s.nextLine();
						String Full_Branch = s.nextLine();
						String Full_Quantity = s.nextLine();
                                        writer.println(Full_OrderID);
			        	writer.println(Full_ProductBrand);
			        	writer.println(Full_Branch);
			        	writer.println(Full_Quantity);
			        	writer.flush();	
					}
				}catch(Exception e) {
					
					
				}
    }
    
     public void ManageDeleteVaccine(String OrderID, String ProductBrand, String Branch, String Quantity){
             try{
					File f = new File("Inventory.txt");
					Scanner s = new Scanner(f);
					FileWriter fw = new FileWriter("TempInventory.txt");
					PrintWriter writer = new PrintWriter(fw);
					while(s.hasNext()) 
					{
						String Full_OrderID = s.nextLine();
						String Full_ProductBrand = s.nextLine();
						String Full_Branch = s.nextLine();
						String Full_Quantity = s.nextLine();
                                                
                                                if(Full_OrderID.equals(OrderID) ) {
							continue;			
																			
						}
						
                                        writer.println(Full_OrderID);
			        	writer.println(Full_ProductBrand);
			        	writer.println(Full_Branch);
			        	writer.println(Full_Quantity);
			        	writer.flush();	
					}
				}catch(Exception e) {
					
					
				}
             try{
					File f = new File("TempInventory.txt");
					Scanner s = new Scanner(f);
					FileWriter fw = new FileWriter("Inventory.txt");
					PrintWriter writer = new PrintWriter(fw);
					while(s.hasNext()) 
					{
						String Full_OrderID = s.nextLine();
						String Full_ProductBrand = s.nextLine();
						String Full_Branch = s.nextLine();
						String Full_Quantity = s.nextLine();
                                        writer.println(Full_OrderID);
			        	writer.println(Full_ProductBrand);
			        	writer.println(Full_Branch);
			        	writer.println(Full_Quantity);
			        	writer.flush();	
					}
				}catch(Exception e) {
					
					
				}
    }
     
     
}
