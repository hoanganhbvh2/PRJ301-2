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

/**
 *
 * @author king
 */
public class checkValidate extends HttpServlet {

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
            out.println("<title>Servlet checkValidate</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet checkValidate at " + request.getContextPath() + "</h1>");
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
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        String sex = request.getParameter("sex");
        String sport = request.getParameter("sport");
        String travel = request.getParameter("travel");
        String study = request.getParameter("study");
        String cars = request.getParameter("cars");
        //response

        if (sport==null) {
            sport = "";
        } else {
            sport = "checked";
        }
        if (travel==null) {
            travel = "";
        } else {
            travel ="checked";
        }
        if (study==null) {
            study = "";
        } else {
            study = "checked";
        }
        PrintWriter out = response.getWriter();
//        out.println(name);
//        out.println(pass);
//        out.println(sex);
//        out.println(sport);
//        out.println(travel);
//        out.println(study);
        String table = "";
        String part1 = "        <table border='1px solid'>\n"
                + "            <tr>\n"
                + "                <th>Name</th>\n"
                + "                <th>Password</th>\n"
                + "                <th>Sex</th>\n"
                + "                <th>Sport</th>\n"
                + "                <th>Travel</th>\n"
                + "                <th>Study</th>\n"
                + "                <th>Edit</th>\n"
                + "                <th>Delete</th>\n"
                + "            </tr>";
        String part2 = "           <tr>\n"
                + "                <td>" + name + "</td>\n"
                + "                <td>" + pass + "</td>\n"
                + "                <td>" + sex + "</td>\n"
                + "                <td><input type='checkbox' " + sport + " disabled></td>\n"
                + "                <td><input type='checkbox' " + study + " disabled></td>\n"
                + "                <td><input type='checkbox' " + travel + "disabled></td>\n"
                + "                <td>edit</td>\n"
                + "                <td>delete</td>\n"
                + "            </tr>";
        String part3 = "        </table>";

        table = part1 + part2 + part3;

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet checkValidate</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(table);
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
