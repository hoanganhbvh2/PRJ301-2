/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author king
 */
public class arrayList extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet arrayList</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet arrayList at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
//        String[][] array = {
//            {"Name", "Age", "Point"},
//            {"4", "5", "6"},
//            {"4", "5", "6"}
//        };
//        object from class
        ArrayList<String[]> array=new ArrayList<>();
        String[] a1={"Name", "Age", "Point"};
        String[] a2={"John", "9", "10"};
        String[] a3={"Jely", "8", "9"};
//        array.add(a1);
        array.add(a2);
        array.add(a3);
        // duyệt mảng 
        //khai bao arraylist (Student -object)
        ArrayList<Student> array2=new ArrayList<Student>();
        array2.add(new Student("John", 9, 10));
        array2.add(new Student("Jeny", 8, 11));
        array2.add(new Student("Jack", 9, 7));
        
        PrintWriter out = response.getWriter();
        String table_part1 = "<table border='1px solid'>\n"
                + "            <tr>\n"
                + "                <th>Name</th>\n"
                + "                <th>Age</th>\n"
                + "                <th>Point</th>\n"
                + "            </tr>\n";
        String table_part2 = "";
//        String table_part2_2 = "  <tr>\n"
//                + "                <td>Cell1</td>\n"
//                + "                <td>Cell2</td>\n"
//                + "                <td>Cell2</td>\n"
//                + "            </tr>\n";
        String table_part3 = "</table>";
        // 1. duyet mang
//        for (int i = 1; i < array.length; i++) {
//            table_part2 = table_part2 + ""
//                    + "<tr>\n"
//                    + "                <td>" + array[i][0] + "</td>\n"
//                    + "                <td>" + array[i][1] + "</td>\n"
//                    + "                <td>" + array[i][2] + "</td>\n"
//                    + "            </tr>\n";
//        }
        // 2.hien thi
        String table = table_part1 + table_part2 + table_part3;
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet arrayList</title>");
        out.println("</head>");
//        out.println("<body>");
        out.print(table_part1);
        // table_part2
        for (Student s:array2 ) {
//                out.print(s[1]);
            out.print( "<tr>\n"
                    + "                <td>" + s.getName() + "</td>\n"
                    + "                <td>" + s.getAge() + "</td>\n"
                    + "                <td>" + s.getPoint() + "</td>\n"
                    + " </tr>\n");
        }
        out.print(table_part3);
//        out.println(table);
        out.println("</body>");
        out.println("</html>");

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
