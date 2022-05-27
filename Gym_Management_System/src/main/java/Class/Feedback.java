/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Samurai
 */
public class Feedback {
    
        File f = new File("Feedback.txt");

        public int addFeedback(String CustomerID, String TrainerID, String TrainerFeedback){
        int create = 0;
        FileWriter w = null;
        
        if(!f.exists()) {
            try{
                f.createNewFile();
            }catch(IOException e){
                System.out.println("Unable to create file due to " + e);
            }
        }
        
        try{
            if(CustomerID.length() != 0 && TrainerID.length() != 0 && TrainerFeedback.length() != 0){
                w = new FileWriter(f, true);
                w.write(""+ CustomerID + "," + TrainerID + "," + TrainerFeedback);
                w.write(System.getProperty("line.separator"));
                w.close();
                create = 1;
            }else{
                create = 2;
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Oops! No feedback was added!");
        }
        
        return create;
    }
}

