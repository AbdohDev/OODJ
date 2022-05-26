/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Class;

import GUI.ManagerLogin;
import java.io.*;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Manager extends Staff{

    public Manager() {
    }
    
    //Login File Handling
    private File f = new File("ManagerAccount.txt");
    
    @Override
    public boolean login(String id, String pw){
        boolean found = false;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(f));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] rec = line.split(",");
                if(rec[0].equals(id) && rec[1].equals(pw)){
                    found = true;
                    break;
                }
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Oops! Login fail.");
        }finally{
            if(br != null){
                try{
                    br.close();
                }catch(IOException e){
                    JOptionPane.showMessageDialog(null, "Fail to loading file");
                }
            }
        }
        return found;
    }
    
    File flog = new File("Logging_Manager.txt");
    public void logging(){
        
    }
    
}
