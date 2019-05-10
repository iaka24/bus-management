package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002ddriver_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"top-bar\">\n");
      out.write("<h1> BUS MANAGEMENT SYSTEM </h1>\n");
      out.write("</div>\n");
      out.write("<div class=\"content\">\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"login-form\">\n");
      out.write("\t\t\t<div class=\"buttons\">\n");
      out.write("\t\t\t\t<div class=\"form-group w50\">\n");
      out.write("\t\t\t\t\t<input type=\"button\"  class=\"form-control\" class=\"btn\" id=\"add-driver\" name=\"btn-login\" value=\"Add driver\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group w50\">\n");
      out.write("\t\t\t\t\t<input type=\"button\"  class=\"form-control\"  id=\"btn-login\" name=\"btn-forget\" value=\"Remove driver\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group w50\">\n");
      out.write("\t\t\t\t\t<input type=\"button\"  class=\"form-control\" id=\"btn-login\" name=\"btn-login\" value=\"Add Driver\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group w50\">\n");
      out.write("\t\t\t\t\t<input type=\"button\"  class=\"form-control\"  id=\"btn-login\" name=\"btn-forget\" value=\"Delete Driver\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group w50\">\n");
      out.write("\t\t\t\t\t<input type=\"button\"  class=\"form-control\"  id=\"btn-login\" name=\"btn-login\" value=\"Give New Route\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group w50\">\n");
      out.write("\t\t\t\t\t<input type=\"button\"  class=\"form-control\"  id=\"btn-login\" name=\"btn-forget\" value=\"Change Route\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"myModal2\" class=\"modal2\">\n");
      out.write("\t<div class=\"modal-content\">\n");
      out.write("\t\t<span class=\"close\">&times;</span>\n");
      out.write("\t\t<p>Fill Details</p>\n");
      out.write("\t\t<form class=\"driver-form\" >\n");
      out.write("\t\t  Driver Name:<br>\n");
      out.write("\t\t  <input type=\"text\" class=\"driver-form\" name=\"id\" value=\"Driver Name\"><br><br>\n");
      out.write("\t\t   Driver Phone Number:<br>\n");
      out.write("\t\t  <input type=\"text\" class=\"driver-form\" name=\"id\" value=\"Driver Phone Number\"><br><br>\n");
      out.write("\t\t  <br><br>\n");
      out.write("\t\t  Driver ID:<br>\n");
      out.write("\t\t  <input type=\"text\" class=\"driver-form\" name=\"id\" value=\"Driver ID\"><br><br>\n");
      out.write("\t\t \n");
      out.write("\t\t  Address:<br>\n");
      out.write("\t\t  <input type=\"text\" class=\"driver-form\" name=\"id\" value=\"Address\"><br><br>\n");
      out.write("\t\t \n");
      out.write("\t\t  <input type=\"submit\" value=\"Submit\">\n");
      out.write("\t    </form> \n");
      out.write("\t </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"footer\"> </div>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("var modal2 = document.getElementById('myModal2');\n");
      out.write("\n");
      out.write("\n");
      out.write("var btn2 = document.getElementById(\"add-driver\");\n");
      out.write("\n");
      out.write("\n");
      out.write("var span2 = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("\n");
      out.write("btn2.onclick = function() {\n");
      out.write("  modal2.style.display = \"block\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.onclick = function() {\n");
      out.write("  modal2.style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("window.onclick = function(event) {\n");
      out.write("  if (event.target == modal2) {\n");
      out.write("    modal2.style.display = \"none\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
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
