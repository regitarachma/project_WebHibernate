import daos.GeneralDAO;
import entities.Job;
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
 * @author RR17
 */
public class JobServlet extends HttpServlet {

    IGeneralDAO<Job> jdao = new GeneralDAO<>(Job.class, HibernateUtil.getSessionFactory());

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
            //menampilkan getAll data Job dengan kembalian false
            request.getSession().setAttribute("dataJob", jdao.getData("", false));

            //controller link direct ke tampilan Job 
            response.sendRedirect("jsp/job.jsp");
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet JobServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet JobServlet at " + request.getContextPath() + "</h1>");
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
        String id = request.getParameter("job_id");
        String name = request.getParameter("job_title");
        String min = request.getParameter("min_sal");
        String max = request.getParameter("max_sal");
        if (jdao.saveOrDelete(new Job(id, name, Integer.parseInt(min), Integer.parseInt(max)), true)) {
             processRequest(request, response);   
        }
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
        String id = request.getParameter("Job_id");
        String name = request.getParameter("job_title");
        String min = request.getParameter("min_sal");
        String max = request.getParameter("max_sal");
//        if (id.isEmpty()) {
//            request.getSession().setAttribute("alert", "Job ID tidak boleh kosong");
//        } else {
            if (jdao.saveOrDelete(new Job(id, name, Integer.parseInt(min), Integer.parseInt(max)), true)) {
                processRequest(request, response);
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
