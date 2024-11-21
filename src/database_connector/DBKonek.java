/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_connector;

/**
 *
 * @author Marlo
 */
import java.sql.*;
import javax.swing.JOptionPane;

//class for db connection
public class DBKonek {
    
    private static final String url = "jdbc:mysql://localhost:3306/optical_clinic";
    private static final String userName = "root";
    private static final String userPassword = "";
    
    private static Connection kon;
    private static DBKonek dbKon;
        
    public DBKonek(){
        //get Connection Method
        kon = null;
        try {
            kon = DriverManager.getConnection(url, userName, userPassword );
            JOptionPane.showMessageDialog(null, "Connected Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connected Unsuccesfull");
           
        }
    }
    
    public static DBKonek getDBConnection(){
        if(dbKon == null){
            dbKon = new DBKonek();
        }
        return dbKon;
    }
    
    public static Connection getConnection(){
        return kon;
    }
    
    
}

