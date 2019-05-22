/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import daos.GeneralDAO;
import entities.Job;
import entities.Region;
import idaos.IGeneralDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.rmi.ServerException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tools.HibernateUtil;

/**
 *
 * @author ASUS
 */


public class jobServlet extends HttpServlet {

    IGeneralDAO<Job> jao = new GeneralDAO<>(Job.class, HibernateUtil.getSessionFactory());

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
            request.getSession().setAttribute("dataJob", jao.getData("", false));
            response.sendRedirect("job/job.jsp");
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet jobServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet jobServlet at " + request.getContextPath() + "</h1>");
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
            String jid = null;
            String jname = null;
            String jmin = null;
            String jmax = null;
            jid = request.getParameter("jid");
            jname = request.getParameter("jname");
            jmin = request.getParameter("jmin");
            jmax = request.getParameter("jmax");
            if (jid != null) {
                if (jname != null && jmin != null && jmax != null) {
                    if (jao.saveOrDelete(new Job(jid, jname, Integer.parseInt(jmin), Integer.parseInt(jmax)), true)) {
                        processRequest(request, response);
                    }
                } else {
                    if (jao.saveOrDelete(new Job(jid), false)) {
                        processRequest(request, response);
                    }
                }
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
//        processRequest(request, response);
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String min = request.getParameter("min");
        String max = request.getParameter("max");
        if (id.isEmpty()) {
            request.getSession().setAttribute("alert", "Job ID tidak boleh kosong");
        } else {
            if (jao.saveOrDelete(new Job(id, name, Integer.parseInt(min), Integer.parseInt(max)), true)) {
                processRequest(request, response);
            }
        }
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
