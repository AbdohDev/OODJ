/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author US
 */
public class LoginFunctionPeople {
    private String Username;
    
    public LoginFunctionPeople(){
    }
    
    public void setUsername(String Username)
    {
        this.Username = Username;
    }
    public String getUsername()
    {
        return Username;
    } 
     private String password;
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return password;
    } 
    
  private static File file = new File("RegisterAccountPeople.txt");
    
    static{
        if(file !=null){
            try{
                file.createNewFile();
            }catch(IOException e){
                System.out.println("Unable to create file due to " + e);
            }
        }
    }
   
   public boolean isLogin(String username, String password){
       boolean flag=false;
       BufferedReader br=null;
       try{
           br=new BufferedReader(new FileReader(file));
           String line = null;
           while((line = br.readLine()) !=null){
               String[] datas = line.split(",");
               if(datas[0].equals(username)&&datas[1].equals(password)){
                   flag=true;
                   break;
               }
           }
       }catch(FileNotFoundException e){
           JOptionPane.showMessageDialog(null, "Unable to find the document!");
       }catch(IOException e){
           JOptionPane.showMessageDialog(null, "Login fail!");
       }finally{
           if(br !=null){
               try{
                   br.close();
               }catch(IOException e){
                   JOptionPane.showMessageDialog(null, "Fail to loading file");
               }
           }
       }
   return flag;
   }
   
   public Boolean UpdateLogin(LoginFunctionPersonnel loginFunction) {
       String login = "RegisterAccountPeople.txt";
        Boolean isUpdated = false;
        try {
            String Content = "";
            Path path = Paths.get(login);
            byte[] bytes = Files.readAllBytes(path);
            List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (String data : allLines) {
                if (!data.equals("")) {
                    String[] arrOfStr = data.split(",");
                    if (arrOfStr[0].equals(loginFunction.getUsername())) {
                        Content = Content + (loginFunction.getUsername() + "," + loginFunction.getPassword()+System.getProperty("line.separator"));
                    } else {
                        Content = Content + (arrOfStr[0] + "," + arrOfStr[1] + System.getProperty("line.separator"));
                    }
                }
            }
            File file1 = new File(login);
            file1.delete();
            file1.createNewFile();
            FileWriter fw = new FileWriter(login, true);
            fw.write(Content);
            fw.close();
            isUpdated = true;
        } catch (IOException ex) {
            isUpdated = false;
        }
        return isUpdated;
    }
}
