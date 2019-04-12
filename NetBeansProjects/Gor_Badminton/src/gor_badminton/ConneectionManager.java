/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gor_badminton;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author lenovo
 */
public class ConneectionManager {
    private Connection con;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/gorbadminton";
    private String username = "root";
    private String password = "";
    
    public Connection LogOn(){
        try {
            Class.forName(driver).newInstance();
            con = DriveManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return con;    
        
        }
    } 
    
    

