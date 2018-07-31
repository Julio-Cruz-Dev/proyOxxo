package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/disenio.css\">\n");
      out.write("        <title> Kiosko Oxxo</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \t<header> \n");
      out.write("\t\t<div class=\"logotipo\">\n");
      out.write("\t\t<img src=\"css/univa.jpg\" width=\"300\" alt=\"\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"FormTelefono.jsp\"> Consultar Saldo Celular </a></li>\n");
      out.write("\t\t\t<li><a href=\"FormRefrendo.jsp\"> Consultar Adeudo Refrendo</a></li>\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("        <section class=\"main\">\n");
      out.write("\t\t<section class=\"articles\">\n");
      out.write("\t\t<article>\n");
      out.write("\t\t<h2> Consultar Saldo Celular </h2>\n");
      out.write("\t\t<p> Podras consultar cuando quieras tu saldo telefonico, solo se requiere ingresar \n");
      out.write("\t\t    tu número telefonico.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t</article>\n");
      out.write("\t\t<article>\n");
      out.write("\t\t<h2> Consultar Saldo Refrendo </h2>\n");
      out.write("\t\t<p> Podras consultar el monto de adeudo de tu refrendo, solo ingresa el número de \n");
      out.write("\t\t    placas de tu vehiculo.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t</article>\n");
      out.write("\t\t\n");
      out.write("\t\t</section>\n");
      out.write("\t</section>\n");
      out.write("\t<footer>\n");
      out.write("\t<p> Equipo Desarrollo de Componentes Web - UNIVA </p>\n");
      out.write("\t</footer>\n");
      out.write("\n");
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
