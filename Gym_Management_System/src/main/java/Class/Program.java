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
 * @author ASUS
 */
public class Program {
    private String programname;

    public String getProgramname() {
        return programname;
    }

    public void setProgramname(String program) {
        this.programname = program;
    }
    
    File f = new File("Program.txt");
    public int addprogram(String program){
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
            if(program.length() != 0){
                w = new FileWriter(f, true);
                w.write(""+ program);
                w.close();
                create = 1;
            }else{
                create = 2;
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Oops! Add Program Fail!");
        }
        
        return create;
    }
}
