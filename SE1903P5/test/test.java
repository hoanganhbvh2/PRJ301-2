
import DAO.ConnectDB;
import DAO.StudentShow;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author king
 */
import java.sql.*;
public class test {
    public static void main(String[] args) throws SQLException {
        // tao class de tai su dung
//        ConnectDB luom =new ConnectDB();
//        Connection conn=luom.connect();
//        System.out.println(conn);
////        Step 3 : statement

        // cach 1
//        Statement stmt= conn.createStatement();
//        //Step 4 : lay ket qua tu statement 
//        ResultSet s=stmt.executeQuery("Select * from SinhVien");
        
        //cach 2
//        PreparedStatement stmt= conn.prepareStatement("Select * from SinhVien");
//        stmt.execute();
//        ResultSet s= stmt.getResultSet();
//       
//        while(s.next()){
//            System.out.println(s.getString("HoTen"));
//            System.out.println(s.getString("NgaySinh"));
//        }

        StudentShow h=new StudentShow();
        h.FillAll();
        
    }
    
}
