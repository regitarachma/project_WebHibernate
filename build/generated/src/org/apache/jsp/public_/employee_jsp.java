package org.apache.jsp.public_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Employee;
import java.util.List;

public final class employee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Employee Table</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"../assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 List<Employee> employees = (List<Employee>) session.getAttribute("dataEmployee"); 
      out.write("\n");
      out.write("        ");
 if(session.getAttribute("notif") != null){
      out.write("\n");
      out.write("        <div class='alert alert-danger' role='alert'>");
      out.print( session.getAttribute("notif") );
      out.write("</div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h1 class=\"center\">Employee Table</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <table id=\"table-employee\">\n");
      out.write("                        <thead>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>FirstName</th>\n");
      out.write("                        <th>LastName</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Phone</th>\n");
      out.write("                        <th>HireDate</th>\n");
      out.write("                        <th>Salary</th>\n");
      out.write("                        <th>Commission Pct</th>\n");
      out.write("                        <th>JobID</th>\n");
      out.write("                        <th>ManagerID</th>\n");
      out.write("                        <th>DepartmentID</th>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
 for (Employee employee : employees) { 
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( employee.getEmployeeId() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( employee.getFirstName() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( employee.getLastName() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( employee.getEmail() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( employee.getPhoneNumber() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( employee.getHireDate() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( employee.getSalary() );
      out.write("</td>\n");
      out.write("                                ");
if(employee.getManagerId()==null) {
      out.write("\n");
      out.write("                                <td>");
      out.print( "-" );
      out.write("</td>\n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("                                <td>");
      out.print( employee.getCommissionPct() );
      out.write("</td>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                <td>");
      out.print( employee.getJobId() );
      out.write("</td>\n");
      out.write("                                 ");
if(employee.getManagerId()==null) {
      out.write("\n");
      out.write("                                <td>");
      out.print( "-" );
      out.write("</td>\n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("                                <td>");
      out.print( employee.getManagerId().getEmployeeId() );
      out.write("</td>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                ");
if(employee.getDepartmentId()==null) {
      out.write("\n");
      out.write("                                <td>");
      out.print( "-" );
      out.write("</td>\n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("                                <td>");
      out.print(employee.getDepartmentId().getDepartmentId() );
      out.write("</td>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                        <tfoot>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>FirstName</th>\n");
      out.write("                        <th>LastName</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Phone</th>\n");
      out.write("                        <th>HireDate</th>\n");
      out.write("                        <th>Salary</th>\n");
      out.write("                        <th>Commission Pct</th>\n");
      out.write("                        <th>JobID</th>\n");
      out.write("                        <th>ManagerID</th>\n");
      out.write("                        <th>DepartmentID</th>    \n");
      out.write("                        </tfoot>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
