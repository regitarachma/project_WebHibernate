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
import idaos.IGeneralDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tools.HibernateUtil;

/**
 *
 * @author Rahmad
 */
public class DepartmentServlet extends HttpServlet {

//    private Department department;

    IGeneralDAO<Department> generalDAO = new GeneralDAO<>(Department.class, HibernateUtil.getSessionFactory());

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
            request.getSession().setAttribute("dataDepartment", generalDAO.getData("", false));
            response.sendRedirect("department/department.jsp");
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
//        Product product = productService.find(request.getParameter("id"));
//        Department department
//                = request.setAttribute("department", department); // Will be available as ${product} in JSP
//        request.getRequestDispatcher("/WEB-INF/product.jsp").forward(request, response);
        processRequest(request, response);
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

        String dName = request.getParameter("dName");
        String managerId = request.getParameter("managerId");
        String locId = request.getParameter("locId");
        if (generalDAO.saveOrDelete(new Department(new Short("0"), dName, new Employee(Integer.parseInt(managerId)), new Location(new Short(locId))), true)) {
            processRequest(request, response);
        }

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
