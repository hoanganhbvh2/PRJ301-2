/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author king
 */
// step 1
import DAO.DBConnect;
import DAO.HumanDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Human;
import org.apache.tomcat.dbcp.dbcp2.DriverManagerConnectionFactory;

public class test {

    public static void main(String[] args) throws SQLException {

//        DBConnect luom = new DBConnect(); // xem ky lai sao van khoi tao duoc ?
//        Connection conn = luom.connect();
//        // menh lenh
//        String sql = "select * from Human";
//        PreparedStatement stmt = conn.prepareStatement(sql);
//        //ResultSet
//        ResultSet out = stmt.executeQuery();
//        ArrayList<Human> list = new ArrayList<Human>();
//
//        while (out.next()) {
//            //hoa ra no tra ve tung record 1
//            Human h = new Human(out.getInt("HumanID"),
//                    out.getString("HumanName"),
//                    out.getString("HumanDOB"),
//                    out.getString("HumanGender"), 
//                    out.getInt("TypeID"));
//           list.add(h);
//            System.out.println(h.toString());
//
//        }
        HumanDAO dao=new HumanDAO();
        ArrayList<Human> list = new ArrayList<Human>();
        list =dao.getAHuman(2);
        System.out.println(list);

    }

}
