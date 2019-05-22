/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import daos.GeneralDAO;
import idaos.IGeneralDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Employee;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author Okala
 */
public class EmployeeServlet extends HttpServlet {

    SessionFactory factory = HibernateUtil.getSessionFactory();
    IGeneralDAO<Employee> igdao = new GeneralDAO<>(Employee.class, factory);

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
            request.getSession().setAttribute("dataEmployee", igdao.getData("", false));
            response.sendRedirect("public/employee.jsp");
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
//        String updateId = request.getParameter("updEmpId");
//        String firstname = request.getParameter("fname");
//        String lastname = request.getParameter("lname");
//        String email = request.getParameter("email");
//        String phone = request.getParameter("phone");
//        String salary = request.getParameter("salary");
//        String date = request.getParameter("date");
//        String jobId = request.getParameter("jobId");
//        String managerId = request.getParameter("managerId");
//        String departmentId = request.getParameter("departmentId");
//
//        String deleteId = request.getParameter("DelEmpId");
//        if (!updateId.isEmpty() && deleteId.isEmpty()) {
//            request.getSession().setAttribute("notif", "Data telah berhasil diupdate");
//            request.getSession().setAttribute("dataEmp", igdao.getData(updateId, false));
//            processRequest(request, response);
//        } else if (!deleteId.isEmpty() && updateId.isEmpty()) {
//            if (igdao.saveOrDelete(new Employee(Integer.parseInt(deleteId)), true)) {
//                request.getSession().setAttribute("notif", "Data telah berhasil dihapus");
//                processRequest(request, response);
//            }
//        } else {
//            request.getSession().setAttribute("notif", "Data tidak berhasil dihapus");
            processRequest(request, response);
//        }

//        processRequest(request, response);

//         String name = request.getParameter("region_name");
//        if (rdao.saveOrDelete(new Region(new BigDecimal(0), name), true)) {
//            processRequest(request, response);
//        }
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
