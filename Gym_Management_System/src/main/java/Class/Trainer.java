/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Trainer extends Staff{
    private String goal;
    private File f = new File("TrainerAccount.txt");
    
    public Trainer() {
    }

    @Override
    public String getUserid() {
        return userid;
    }
    
    @Override
    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getContact() {
        return contact;
    }

    @Override
    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
    
    //Login
    @Override
    public boolean login(String id, String pw){
        boolean found = false;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(f));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] rec = line.split(",");
                if(rec[0].equals(id) && rec[2].equals(pw)){
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
    
    //Register
    public int register(String id,String name,String pw,String cont,String goal){
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
            if(id.length() != 0 && name.length() != 0 &&
                   pw.length() != 0 && cont.length() != 0 &&
                    goal.length() != 0){
                w = new FileWriter(f, true);
                w.write(""+ id + "," + name + "," + 
                        pw + "," + cont + "," + goal);
                w.write(System.getProperty("line.separator"));
                w.close();
                create = 1;
            }else{
                create = 2;
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Oops! Register Fail!");
        }
        return create;
    }
    
    File flog = new File("Logging_Trainer.txt");
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
}
