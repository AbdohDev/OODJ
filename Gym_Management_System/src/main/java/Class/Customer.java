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
public class Customer extends Person{
    private String userid;
    
    public Customer() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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
    
    File f = new File("CustomerAccount.txt");
    public int register(String id, String name, String contact, String email){
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
            if(id.length() != 0 && name.length() != 0 && contact.length() != 0 && email.length() != 0){
                w = new FileWriter(f, true);
                w.write(""+ id + "," + name + "," + contact + "," + email);
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

    
}
