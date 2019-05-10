package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stafflogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Bus Management system</title>\n");
      out.write("<link href=\"stylesheet.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"fontawesome/all.css\" type=\"text/css\" rel=\"stylesheet\"> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"top-bar\">\n");
      out.write("<h1> BUS MANAGEMENT SYSTEM </h1>\n");
      out.write("</div>\n");
      out.write("<div class=\"content\">\n");
      out.write("\t<div class=\"login-form\">\n");
      out.write("            <form method=\"get\" action=\"LoginServlet\">\n");
      out.write("            <div class =\"form-group\">\n");
      out.write("                <h2 style=\"text-align:center\"> STAFF LOGIN </h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("\t\t<input type=\"text\" class=\"form-control\" id=\"uid\" name=\"id\" placeholder=\"Enter Staff Id\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"upwd\" name=\"pwd\" placeholder=\"Enter Staff password\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("\t\t<input type=\"submit\" value=\"Login\" />\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"footer\"> </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
