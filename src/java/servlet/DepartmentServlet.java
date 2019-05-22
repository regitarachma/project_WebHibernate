/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import daos.GeneralDAO;
import entities.Department;
import entities.Employee;
import entities.Location;
import entities.Region;
import idaos.IGeneralDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tools.HibernateUtil;

/**
 *
 * @author RossaHening
 */
public class departmentServlet extends HttpServlet {

    IGeneralDAO<Department> dAO = new GeneralDAO<>(Department.class, HibernateUtil.getSessionFactory());

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
            request.getSession().setAttribute("dataDepartment", dAO.getData("", false));
            response.sendRedirect("department/department.jsp");
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet departmentServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet departmentServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
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
        try {

            String did = null;
            String dname = null;
            String dman = null;
            String dloc = null;

            did = request.getParameter("did");
            dname = request.getParameter("dname");
            dman = request.getParameter("dman");
            dloc = request.getParameter("dloc");

            if (did != null) {
                if (dname != null && dman != null && dloc != null) {
                    if (dAO.saveOrDelete(new Department(new Short(did), dname, new Employee(Integer.parseInt(dman)), new Location(new Short(dloc))), true)) {

                        processRequest(request, response);
                    }
                } else {
                    if (dAO.saveOrDelete(new Department(new Short(did)), false)) {
                        processRequest(request, response);
                    }
                }
//                request.getSession().setAttribute("alert", "D Name tidak boleh kosong");

            } else {
                processRequest(request, response);
            }

        } catch (Exception e) {
            throw new ServletException(e);
        }

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
        String id = null;
        String name = null;
        String man = null;
        String loc = null;

        id = request.getParameter("id");
        name = request.getParameter("name");
        man = request.getParameter("man");
        loc = request.getParameter("loc");

        if (name.isEmpty()) {
            request.getSession().setAttribute("alert", "NAME tidak boleh kosong");
        } else {
            if (dAO.saveOrDelete(new Department(new Short("0"), name, new Employee(Integer.parseInt(man)), new Location(new Short(loc))), true)) {
                processRequest(request, response);
            }
        }
        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
//        @Override
//        public String getServletInfo
//        
//            () {
//        return "Short description";
//        }// </editor-fold>

    }
}
