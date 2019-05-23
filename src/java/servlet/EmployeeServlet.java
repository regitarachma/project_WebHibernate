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
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Department;
import models.Employee;
import models.Job;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author Okala
 */
public class EmployeeServlet extends HttpServlet {

    SessionFactory factory = HibernateUtil.getSessionFactory();
    IGeneralDAO<Employee> igdao = new GeneralDAO<>(Employee.class, factory);
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

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
            request.getSession().setAttribute("notif", null);
            String deleteId = null;
            deleteId = request.getParameter("delEmpId");
            if (deleteId != null) {
                if (igdao.saveOrDelete(new Employee(Integer.parseInt(deleteId)), false)) {
                    request.getSession().setAttribute("notif", "Data berhasil dihapus");
                } else {
                    request.getSession().setAttribute("notif", "Data gagal dihapus");
                }
            }
            
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
        
        String employeeId = null,
               firstName = null,
               lastName = null,
               email = null,
               phoneNumber = null,
               hireDate = null,
               jobId = null,
               salary = null,
               commissionPct = null,
               managerId = null,
               departmentId = null;
        
        employeeId = request.getParameter("empId");
        firstName = request.getParameter("empFirstName");
        lastName = request.getParameter("empLastName");
        email = request.getParameter("empEmail");
        phoneNumber = request.getParameter("empPhone");
        hireDate = request.getParameter("empHireDate");
        jobId = request.getParameter("empJobId");
        salary = request.getParameter("empSalaryId");
        commissionPct = request.getParameter("empCommPct");
        managerId = request.getParameter("empManagerId");
        departmentId = request.getParameter("empDepartmentId");
        
        request.getSession().setAttribute("alert", "");
        request.getSession().setAttribute("success", "");

        if(employeeId.isEmpty()){
            request.getSession().setAttribute("alert", "Employee Id tidak boleh kosong");
        } else {
            if(lastName.isEmpty()){
            request.getSession().setAttribute("alert", "Lastname tidak boleh kosong");
            } else {
                if(email.isEmpty()){
                    request.getSession().setAttribute("alert", "Email tidak boleh kosong");
                } else {
                    if(hireDate.isEmpty()){
                        request.getSession().setAttribute("alert", "Hire Date tidak boleh kosong");
                    } else {
                        if(jobId.isEmpty()){
                            request.getSession().setAttribute("alert", "Job tidak boleh kosong");
                        } else {
                            try {
                                date = formatter.parse(hireDate);
                                Employee employee = new Employee(Integer.parseInt(employeeId), firstName, lastName, email, phoneNumber, new java.sql.Date(date.getTime()), new Job(jobId), new BigDecimal(salary), new BigDecimal(commissionPct), new Employee(Integer.parseInt(employeeId)), new Department(Short.parseShort(departmentId), managerId));
                                if(igdao.saveOrDelete(employee, true)){
                                    request.getSession().setAttribute("success", "Data berhasil disimpan");
                                } else {
                                    request.getSession().setAttribute("alert", "Data berhasil disimpan");
                                }
                            } catch (ParseException ex) {
                                Logger.getLogger(EmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            }
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
