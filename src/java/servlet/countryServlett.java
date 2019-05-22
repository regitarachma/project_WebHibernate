/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import daos.GeneralDAO;
import entities.Country;
import entities.Region;
import idaos.IGeneralDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author Relion31
 */
@WebServlet(name = "countryServlett", urlPatterns = {"/countryServlett"})
public class countryServlett extends HttpServlet {

    SessionFactory factory = HibernateUtil.getSessionFactory();
    IGeneralDAO<Country> cdao = new GeneralDAO<>(Country.class, factory);

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
            request.getSession().setAttribute("dataCountry", cdao.getData("", false));
            response.sendRedirect("country/country.jsp");
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet testing</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet testing at " + request.getContextPath() + "</h1>");
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
            String name = null;
            String id = null;
            String ireg = null;

            id = request.getParameter("country_id");
            name = request.getParameter("country_name");
            ireg = request.getParameter("region_id");
            int id_region = 0;
            if (id != null) {
                if (name != null && ireg != null) {
                    id_region = Integer.parseInt(ireg);
                    if (cdao.saveOrDelete(new Country(id, name, new Region(new BigDecimal(id_region))), true)) {
                        processRequest(request, response);
                    }
                } else {
                    if (cdao.saveOrDelete(new Country(id), false)) {
                        processRequest(request, response);
                    }
                }
            } else {
                processRequest(request, response);
            }
        } catch (Exception e) {
            throw new ServletException(e);
        }
//        processRequest(request, response);
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
        String name = null;
        String id = null;
        String ireg = null;

        id = request.getParameter("country_id");
        name = request.getParameter("country_name");
        ireg = request.getParameter("region_id");

        if (name.isEmpty()) {
            request.getSession().setAttribute("alert", "Nama Country tidak boleh kosong");
        } else {
            if (cdao.saveOrDelete(new Country(id, name, new Region(new BigDecimal(ireg))), true)) {
                processRequest(request, response);
            }
        }
//        processRequest(request, response);
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
