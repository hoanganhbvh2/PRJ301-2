/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;

/**
 *
 * @author king
 */
public class ConnectDB {
    public static Connection connect(){
        Connection conn=null;
        String url="jdbc:sqlserver://localhost:1433;databaseName=FU_Example;trustServerCertificate=true;encrypt=true";
        try {
            // ket noi
            conn=DriverManager.getConnection(url,"sa","abc@1234");
            System.out.println("Ket noi thanh cong");
            
        } catch (Exception e) {
            System.out.println("Khong thanh cong");
            e.getStackTrace();
        }
        return conn;
    }
    
}
