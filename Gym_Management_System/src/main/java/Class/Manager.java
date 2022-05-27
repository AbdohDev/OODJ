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
    @Override
    public void logging(String id, String ldatetime, String result){
        FileWriter w = null;

        if(!flog.exists()) {
            try{
                flog.createNewFile();
            }catch(IOException e){
                System.out.println("Unable to create file due to " + e);
            }
        }

        try{
            w = new FileWriter(flog, true);
            w.write(""+ id + "," + ldatetime + "," + result);
            w.write(System.getProperty("line.separator"));
            w.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Oops! Log Fail!");
        }
    }
    
    //Update Trainer
    public void managetrainer(int export){
        if(export == 1){
            JOptionPane.showMessageDialog(null, "Export Successful!\nThe file is modified.");
        }else{
            JOptionPane.showMessageDialog(null, "Export Fail!\nThe file is not modified.");
        }
        
    }
    
}
