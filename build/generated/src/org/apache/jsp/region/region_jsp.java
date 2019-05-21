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
      out.write("        <title>Region Data</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 List<Region> regions = (List<Region>)session.getAttribute("dataRegion"); 
      out.write("\n");
      out.write("        <h1><center>Data Region</center></h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card border-info\">\n");
      out.write("                <div class=\"card-header bg-info text-white\">\n");
      out.write("                    <a type=\"button\" class=\"btn btn-light\" href=\"addRegionForm.jsp\">Tambah Region</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <table border=\"1\" class=\"table table-striped\">\n");
      out.write("                        <thead class=\"thead-dark\" align=\"center\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Region ID</th>\n");
      out.write("                                <th>Region Name</th>\n");
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
 for (Region region : regions) { 
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td> ");
      out.print( region.getRegionId() );
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print( region.getRegionName());
      out.write(" </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a type=\"button\" class=\"btn btn-warning\" href=\"#\">Edit</a>\n");
      out.write("                                    <a type=\"button\" class=\"btn btn-danger\" href=\"#\">Delete</a>\n");
      out.write("                                </td>\n");
      out.write("        <!--                            <c:forEach var=\"datas\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${datas.region_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${datas.region_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
      out.write("                        <a href=\"../RegionServlet\"><input type=\"button\" value=\"Refresh\" /></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<!--         Button trigger modal \n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\">\n");
      out.write("            Tambah Data Region\n");
      out.write("        </button>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         Modal \n");
      out.write("        <div class=\"modal fade\" id=\"addRegion\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal Title</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form action=\"../RegionServlet\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"region\">Region Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"region\" id=\"region\" placeholder=\"Nama Region\" />\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\">Save</button>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $('#myModal').on('shown.bs.modal', function (){\n");
      out.write("                    $('#myInput').trigger('focus')\n");
      out.write("                })\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery.js\"></script>\n");
      out.write("        <script src=\"../assets/js/bootstrap.min.js\"></script>-->\n");
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
