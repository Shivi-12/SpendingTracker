/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Shivi
 */
public class dbConnect {
    public static Connection c;
    public static Statement st;
    static{
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false","root","@Shivya12");
            st=c.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
}
