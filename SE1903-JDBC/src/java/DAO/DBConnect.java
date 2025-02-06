/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
//Step 1

import java.sql.*;

/**
 *
 * @author king
 */
public class DBConnect {
    Connection conn;
    // khuyen dung function static  cho connect
//    public static Connection connect() {
    public Connection connect() {
        try {
            conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FU_Example;trustServerCertificate=true", "sa", "abc@1234");
            System.out.println("Ket noi thanh cong");

        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("khong thanh cong");
        }
        return conn;
    }
}
