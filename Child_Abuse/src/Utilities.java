/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.Date;
/**
 *
 * @author Adewale
 */
public class Utilities {
    static Connection con;
    static Statement st;
    
   
    public void connect(){
        try{
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con = DriverManager.getConnection("jdbc:odbc:Abuse","","");
         st = con.createStatement();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public String curdate(){
        Date d = new Date();
        String g = d.toLocaleString();
        return g;
        
    }
}
