/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;

/**
 *
 * @author king
 */
import java.sql.*;
import model.Human;

public class HumanDAO {

    Connection conn;
    // cach 1 

    public HumanDAO() {
        DBConnect db = new DBConnect();
        this.conn = db.connect();
    }

//    conn=
    public ArrayList getAllHuman() throws SQLException {
        // tao statement + xu ly database
        String sql = "select * from Human";
        PreparedStatement stmt = conn.prepareStatement(sql);
        //ResultSet
        ResultSet out = stmt.executeQuery();
        ArrayList<Human> list = new ArrayList<Human>();
        while (out.next()) {
            //hoa ra no tra ve tung record 1
            Human h = new Human(out.getInt("HumanID"),
                    out.getString("HumanName"),
                    out.getString("HumanDOB"),
                    out.getString("HumanGender"),
                    out.getInt("TypeID"));
            list.add(h);
//            System.out.println(h.toString());

        }
        return list;
    }

    public ArrayList getAHuman(int HumanID) {
        ArrayList<Human> list = new ArrayList<Human>();
        int id=HumanID;
        try {
            String sql = "select * from Human WHERE HumanID="+id;
            PreparedStatement stmt = conn.prepareStatement(sql);
            //ResultSet
            ResultSet rs = stmt.executeQuery();
            System.out.println(stmt.toString());
            while (rs.next()) {
              Human h = new Human(
                        rs.getInt(1),
                        rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)
                );
              list.add(h);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}
