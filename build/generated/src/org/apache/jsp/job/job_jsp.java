package org.apache.jsp.job;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Job;
import java.util.List;

public final class job_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"../assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.css\"/>\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/getData.js\"></script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.js\"></script>\n");
      out.write("        ");
 List<Job> list = (List<Job>) session.getAttribute("dataJob");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Job Table</h1>\n");
      out.write("        <div class=\"card border-info\">\n");
      out.write("            <div class=\"card-header bg-info text-white\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-light\" data-toggle=\"modal\" data-target=\"#input-job\">\n");
      out.write("                    Add Data\n");
      out.write("                </button>\n");
      out.write("                <!--<a type=\"button\" class=\"btn btn-light\" href=\"addRegion.jsp\">Add</a>-->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <table class=\"table table-striped table-bordered data\">\n");
      out.write("                    <thead class=\"thead-dark\" align=\"center\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Job ID</th>\n");
      out.write("                            <th>Job Name</th>\n");
      out.write("                            <th>Min</th>\n");
      out.write("                            <th>Max</th>\n");
      out.write("                            <th>Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody align=\"center\">\n");
      out.write("                        ");
for (Job j : list) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( j.getJobId());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( j.getJobTitle());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( j.getMinSalary());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( j.getMaxSalary());
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <a type=\"button\" class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#edit-job");
      out.print( j.getJobId());
      out.write("\">Edit</a>\n");
      out.write("                                <a type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#delete-job");
      out.print( j.getJobId());
      out.write("\">Delete</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>   \n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Modal input Dialog -->\n");
      out.write("    <div class=\"modal fade\" id=\"input-job\" role=\"dialog\" aria-labelledby=\"confirmDeleteLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h4 class=\"modal-title\">Add Job</h4>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("                </div>\n");
      out.write("                <form action=\"../jobServlet\" method=\"post\">\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"job\" name=\"id\" placeholder=\"Enter Job ID\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Enter Job Title\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"min\" name=\"min\" placeholder=\"Enter Minimal Salary\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"max\" name=\"max\" placeholder=\"Enter Maximal Salary\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\" id=\"confirm\">Save</button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--modal edit job-->\n");
      out.write("    ");
for (Job j : list) {
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"edit-job");
      out.print( j.getJobId());
      out.write("\" role=\"dialog\" aria-labelledby=\"confirmDeleteLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h4 class=\"modal-title\">Update Job</h4>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("                </div>\n");
      out.write("                <form action=\"../jobServlet\" method=\"get\">\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" id=\"jid\" name=\"jid\" value=\"");
      out.print( j.getJobId());
      out.write("\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"jname\" name=\"jname\" value=\"");
      out.print( j.getJobTitle());
      out.write("\" required placeholder=\"Enter Job Title\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"jmin\" name=\"jmin\" value=\"");
      out.print( j.getMinSalary());
      out.write("\" required placeholder=\"Enter Minimal Salary\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"jmax\" name=\"jmax\" value=\"");
      out.print( j.getMaxSalary());
      out.write("\" required placeholder=\"Enter Maximal Salary\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" id=\"confirm\">Update</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
 }
      out.write("\n");
      out.write("    ");
for (Job j : list) {
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"delete-job");
      out.print( j.getJobId());
      out.write("\" role=\"dialog\" aria-labelledby=\"confirmDeleteLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h4 class=\"modal-title\">Delete Job</h4>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("                </div>\n");
      out.write("                <form action=\"../deleteJobServlet\" method=\"get\">\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" id=\"jid\" name=\"jid\" value=\"");
      out.print( j.getJobId());
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" id=\"jname\" name=\"jname\" value=\"");
      out.print( j.getJobTitle());
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" id=\"jmin\" name=\"jmin\" value=\"");
      out.print( j.getMinSalary());
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" id=\"jmax\" name=\"jmax\" value=\"");
      out.print( j.getMaxSalary());
      out.write("\" required placeholder=\"Enter Maximal Salary\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" id=\"confirm\">Delete</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
 }
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('.data').DataTable();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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
