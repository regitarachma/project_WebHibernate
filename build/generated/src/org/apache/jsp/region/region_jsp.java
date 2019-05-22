package org.apache.jsp.region;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Region;
import java.util.List;

public final class region_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/bootstrap.min.css\" >\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.css\"/>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.18/datatables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
 List<Region> regions = (List<Region>) session.getAttribute("dataRegion"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>Region Table</h1>\r\n");
      out.write("            <div class=\"card border-info\">\r\n");
      out.write("                <div class=\"card-header bg-info text-white\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#input-region\">\r\n");
      out.write("                        Add Data\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <!--<a type=\"button\" class=\"btn btn-light\" href=\"addRegion.jsp\">Add</a>-->\r\n");
      out.write("                    <a type=\"button\" class=\"btn btn-light\" href=\"../RegionServlet\">Refresh</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <table id=\"table_id\" border=\"1\" class=\"table table-striped\">\r\n");
      out.write("                        <thead class=\"thead-dark\" align=\"center\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>Region ID</th>\r\n");
      out.write("                                <th>Region Name</th>\r\n");
      out.write("                                <th>Action</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody align=\"center\">\r\n");
      out.write("                            ");
for (Region region : regions) {
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>");
      out.print( region.getRegionId());
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print( region.getRegionName());
      out.write("</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <a type=\"button\" class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#edit-region");
      out.print( region.getRegionId());
      out.write("\">Edit</a>\r\n");
      out.write("                                    <a type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#delete-region");
      out.print( region.getRegionId());
      out.write("\">Delete</a>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");
 }
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Modal edit Dialog -->\r\n");
      out.write("        ");
for (Region region : regions) {
      out.write("\r\n");
      out.write("        <div class=\"modal fade\" id=\"edit-region");
      out.print( region.getRegionId());
      out.write("\" role=\"dialog\" aria-labelledby=\"confirmDeleteLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h4 class=\"modal-title\">Update Region</h4>\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form action=\"../RegionServlet\" method=\"get\">\r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("                            <input type=\"hidden\" class=\"form-control\" id=\"region_Id\" name=\"region_Id\" value=\"");
      out.print( region.getRegionId());
      out.write("\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"region_Name\" name=\"region_Name\" value=\"");
      out.print( region.getRegionName());
      out.write("\" required placeholder=\"Enter Region Name\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\" id=\"confirm\">Update</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Modal input Dialog -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"input-region\" role=\"dialog\" aria-labelledby=\"confirmDeleteLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h4 class=\"modal-title\">Add Region</h4>\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form action=\"../RegionServlet\" method=\"post\">\r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"region_name\" name=\"region_name\" placeholder=\"Enter Region Name\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\" id=\"confirm\">Save</button>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Modal delete Dialog -->\r\n");
      out.write("        ");
for (Region region : regions) {
      out.write("\r\n");
      out.write("        <div class=\"modal fade\" id=\"delete-region");
      out.print( region.getRegionId());
      out.write("\" role=\"dialog\" aria-labelledby=\"confirmDeleteLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h4 class=\"modal-title\">Delete Region</h4>\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form action=\"../rDeleteServlet\" method=\"get\">\r\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" id=\"region_name\" name=\"region_id\" value=\"");
      out.print( region.getRegionId());
      out.write("\">\r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("                            Apakah anda yakin ingin menghapus data ini?\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\" id=\"confirm\">Delete</button>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('#table_id').DataTable();\r\n");
      out.write("            });\r\n");
      out.write("        </script>      \r\n");
      out.write("    </body>  \r\n");
      out.write("</html>\r\n");
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
