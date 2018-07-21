package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("   <link href=\"../javascript/jquery.bootgrid-1.3.1/jquery.bootgrid.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("   <script src=\"../javascript/jquery.bootgrid-1.3.1/jquery.bootgrid.fa.js\" type=\"text/javascript\"></script>\n");
      out.write("   <script src=\"../javascript/jquery.bootgrid-1.3.1/jquery.bootgrid.fa.min.js\" type=\"text/javascript\"></script>\n");
      out.write("   <script src=\"../javascript/jquery.bootgrid-1.3.1/jquery.bootgrid.js\" type=\"text/javascript\"></script>\n");
      out.write("   <link href=\"../javascript/jquery.bootgrid-1.3.1/jquery.bootgrid.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("   <script src=\"../javascript/jquery.bootgrid-1.3.1/jquery.bootgrid.min.js\" type=\"text/javascript\"></script>   \n");
      out.write("   <SCRIPT type=\"text/javascript\">        \n");
      out.write("        $(document).ready( function () {\n");
      out.write("            alert('hello');\n");
      out.write("            $(\"#grid-basic\").bootgrid();   \n");
      out.write("            alert('h');\n");
      out.write("        } );\n");
      out.write("   </script>\n");
      out.write("</head>\n");
      out.write("<body>      \n");
      out.write("    <table id=\"grid-basic\" class=\"table table-condensed table-hover table-striped\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th data-column-id=\"id\" data-type=\"numeric\">ID</th>\n");
      out.write("                <th data-column-id=\"sender\">Sender</th>\n");
      out.write("                <th data-column-id=\"received\" data-order=\"desc\">Received</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td>10238</td>\n");
      out.write("                <td>eduardo@pingpong.com</td>\n");
      out.write("                <td>14.10.2013</td>\n");
      out.write("            </tr>\n");
      out.write("            ...\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
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
