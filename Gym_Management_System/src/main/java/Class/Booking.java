/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.*;
import java.lang.invoke.MethodHandles;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Booking {
    private String bookid;
    private String goal;
    private String tid;
    private String cid;
    private String traindate;
    private String startT;
    private String duration;
    private String endT;

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTraindate() {
        return traindate;
    }

    public void setTraindate(String traindate) {
        this.traindate = traindate;
    }

    public String getStartT() {
        return startT;
    }

    public void setStartT(String startT) {
        this.startT = startT;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getEndT() {
        return endT;
    }

    public void setEndT(String endT) {
        this.endT = endT;
    }

    public File getFt() {
        return ft;
    }

    public void setFt(File ft) {
        this.ft = ft;
    }
    
    public Booking(){
        
    }
    
    File ft = new File("TrainerAccount.txt");
    
    //Create Booking
    File f = new File("Booking.txt");
    public int createBooking(String bid,String cid,String g,String tid,String tdate,String stime,String dur,String etime,String amount){
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
            if(bid.length() != 0 && cid.length() != 0 && g.length() != 0 &&
                    tid.length() != 0 && tdate.length() != 0 && stime.length() != 0 &&
                    dur.length() != 0 && etime.length() != 0 && amount.length() != 0){
                w = new FileWriter(f, true);
                w.write(""+ bid + "," + cid + "," + g +
                        "," + tid + "," + tdate + "," +
                        stime + "," + dur + "," + etime +
                        "," + amount);
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
    
    //Update Booking
    public void manage(int export){
        if(export == 1){
            JOptionPane.showMessageDialog(null, "Export Successful!\nThe file is modified.");
        }else{
            JOptionPane.showMessageDialog(null, "Export Fail!\nThe file is not modified.");
        }
        
    }
}
