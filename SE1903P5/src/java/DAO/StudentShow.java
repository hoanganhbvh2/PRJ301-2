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
public class StudentShow {

    Connection conn;

    public StudentShow() {
        this.conn = ConnectDB.connect();
    }

    public void FillAll() throws SQLException {

        PreparedStatement stmt = this.conn.prepareStatement("Select * from SinhVien");
        stmt.execute();
        ResultSet s = stmt.getResultSet();

        while (s.next()) {
            System.out.println(s.getString("HoTen"));
            System.out.println(s.getString("NgaySinh"));
        }
    }

}
