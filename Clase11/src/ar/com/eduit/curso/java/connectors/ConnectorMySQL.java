/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.connectors;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author EducaciónIT
 */
public class ConnectorMySQL {
    
    private static String driver="com.mysql.jdbc.Driver";//Driver mysql 5 
    //private static String driver="com.mysql.cj.jdbc.Driver"; //Driver mysql 6 o sup
    //private static String url="jdbc:mysql://localhost:3306/colegio";
    private static String url= "jdbc:mysql://remotemysql.com:3306/5FqFBufD61";
    //private static String user="root";
    //private static String pass="";
    private static String user="5FqFBufD61";
    private static String pass="qrq6FCOaoR";
    
    
    private static Connection conn = null;
    
    private ConnectorMySQL(){}
        
    public synchronized static Connection getConnection(){
        if(conn==null){
            
            try{
                Class.forName(driver);
                conn=DriverManager.getConnection(url,user,pass);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        
        
        return conn;
    }
    
    
    
    
}
