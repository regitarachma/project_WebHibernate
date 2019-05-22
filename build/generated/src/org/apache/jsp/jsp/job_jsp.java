package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Job;
import java.util.List;
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Job Data</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 List<Job> jobs = (List<Job>)session.getAttribute("dataJob"); 
      out.write("\n");
      out.write("        <h1><center>Data Job</center></h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card border-info\">\n");
      out.write("                <div class=\"card-header bg-info text-white\">\n");
      out.write("                    <!--<a type=\"button\" class=\"btn btn-light\" href=\"addJobForm.jsp\">Tambah Job</a>-->\n");
      out.write("                    <button type=\"button\" class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#insert-job\">\n");
      out.write("                        Tambah Data Job\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <table border=\"1\" class=\"table table-striped\">\n");
      out.write("                        <thead class=\"thead-dark\" align=\"center\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Job ID</th>\n");
      out.write("                                <th>Job Title</th>\n");
      out.write("                                <th>Minimal Salary</th>\n");
      out.write("                                <th>Maximal Salary</th>\n");
      out.write("                                <th>Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody align=\"center\">\n");
      out.write("                        <!--<c:forEach var=\"datas\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">-->\n");
      out.write("                            \n");
      out.write("                            ");
      out.write("\n");
      out.write("                            ");
 for (Job job : jobs) { 
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td> ");
      out.print( job.getJobId());
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print( job.getJobTitle());
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print( job.getMinSalary());
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print( job.getMaxSalary());
      out.write(" </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <!--<a type=\"button\" class=\"btn btn-warning\" href=\"#\">Edit</a>-->\n");
      out.write("                                    <a type=\"button\" class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#edit-job");
      out.print( job.getJobId());
      out.write("\">Edit</a>\n");
      out.write("                                    \n");
      out.write("                                    <a type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#delete-job");
      out.print( job.getJobId());
      out.write("\">Delete</a>\n");
      out.write("                                </td>\n");
      out.write("        <!--                            <c:forEach var=\"datas\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${datas.job_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${datas.job_title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${datas.min_salary}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${datas.max_salary}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <a>Edit</a>\n");
      out.write("                                            <a>Delete</a>\n");
      out.write("                                        </td> -->\n");
      out.write("                          </tr>\n");
      out.write("                          ");
 } 
      out.write("\n");
      out.write("                        <!--</c:forEach>-->\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                          ");
      out.write("\n");
      out.write("                        <a href=\"../JobServlet\"><input type=\"button\" value=\"Refresh\" /></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--modal insert job-->\n");
      out.write("        <div class=\"modal fade\" id=\"insert-job\" role=\"dialog\" aria-labelledby=\"confirmDeleteLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title\">Insert Job</h4>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">x</button>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <form action=\"../JobServlet\" method=\"post\">\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"job_id\" name=\"Job_id\" placeholder=\"Enter Job ID\">          \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"job_title\" name=\"job_title\" placeholder=\"Enter Job Title\">          \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"min_sal\" name=\"min_sal\" placeholder=\"Enter Minimal Salary\">          \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"max_sal\" name=\"max_sal\" placeholder=\"Enter Maximal Salary\">          \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\" id=\"confirm\">Save</button>\n");
      out.write("                        </div>\n");
      out.write("              </form>\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--modal edit job-->\n");
      out.write("        ");
for (Job job : jobs) {
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"edit-job");
      out.print( job.getJobId());
      out.write("\" role=\"dialog\" aria-labelledby=\"confirmDeleteLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title\">Update Job</h4>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"../JobServlet\" method=\"get\">\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <input type=\"hidden\" class=\"form-control\" id=\"job_id\" name=\"job_id\" value=\"");
      out.print( job.getJobId());
      out.write("\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"job_title\" name=\"job_title\" value=\"");
      out.print( job.getJobTitle());
      out.write("\" required placeholder=\"Enter Job Title\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"min_sal\" name=\"min_sal\" value=\"");
      out.print( job.getMinSalary());
      out.write("\" required placeholder=\"Enter Minimal Salary\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"max_sal\" name=\"max_sal\" value=\"");
      out.print( job.getMaxSalary());
      out.write("\" required placeholder=\"Enter Maximal Salary\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\" id=\"confirm\">Update</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("        \n");
      out.write("        <!--modal delete job-->\n");
      out.write("        ");
for (Job job : jobs) {
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"modal fade\" id=\"delete-job");
      out.print( job.getJobId());
      out.write("\" role=\"dialog\" aria-labelledby=\"confirmDeleteLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title\">Delete Job</h4>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"../deleteJobServlet\" method=\"get\">\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <input type=\"hidden\" class=\"form-control\" id=\"job_id\" name=\"job_id\" value=\"");
      out.print( job.getJobId());
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" class=\"form-control\" id=\"job_title\" name=\"job_title\" value=\"");
      out.print( job.getJobTitle());
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" class=\"form-control\" id=\"min_sal\" name=\"min_sal\" value=\"");
      out.print( job.getMinSalary());
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" class=\"form-control\" id=\"max_sal\" name=\"max_sal\" value=\"");
      out.print( job.getMaxSalary());
      out.write("\" required placeholder=\"Enter Maximal Salary\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\" id=\"confirm\">Delete</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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
