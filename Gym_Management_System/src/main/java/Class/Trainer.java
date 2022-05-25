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
    private String exp;
    private String goal;
    
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

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
    
    //Login File Handling
    private File f = new File("TrainerAccount.txt");
    
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
    
    public int register(){
        int create = 0;
        return create;
    }
}
