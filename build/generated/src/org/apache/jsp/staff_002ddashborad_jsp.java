package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staff_002ddashborad_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"stylesheet.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<title>Bus Management system</title>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"top-bar\">\n");
      out.write("    <h1> <i class=\"fas fa-bus\"> </i>BUS MANAGEMENT SYSTEM </h1>\n");
      out.write("</div>\n");
      out.write("<div class=\"content\">\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"login-form\">\n");
      out.write("\t\t\t<div class=\"buttons\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"form-group w50\">\n");
      out.write("\t\t\t\t\t<input type=\"button\"  class=\"form-control\" id=\"add-driver\" name=\"btn-login\" value=\"Add Driver\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group w50\">\n");
      out.write("\t\t\t\t\t<input type=\"button\"  class=\"form-control\"  id=\"delete-driver\" name=\"btn-forget\" value=\"Delete Driver\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group w50\">\n");
      out.write("\t\t\t\t\t<input type=\"button\"  class=\"form-control\"  id=\"give-route\" name=\"btn-login\" value=\"Give New Route\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group w50\">\n");
      out.write("\t\t\t\t\t<input type=\"button\"  class=\"form-control\"  id=\"change-route\" name=\"btn-forget\" value=\"Change Route\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"adddriverform\" class=\"modal\">\n");
      out.write("\t<div class=\"modal-content\">\n");
      out.write("            <form action=\"AdminServlet\" method=\"get\">\n");
      out.write("                <input type=\"hidden\" name=\"test\" value=\"addD\"/>\n");
      out.write("\t\t<span class=\"close\">&times;</span>\n");
      out.write("\t\t<h2>Fill Details</h2>\n");
      out.write("                <div class=\"form-group\"> \n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" name=\"dname\" placeholder=\"Driver Name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\"> \n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" name=\"dnumber\" placeholder=\"Driver Phone Number\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\"> \n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" name=\"did\" placeholder=\"Driver ID\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\"> \n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" name=\"daddress\" placeholder=\"Address\">\n");
      out.write("                </div>\n");
      out.write("\t\t <div class=\"form-group\"> \n");
      out.write("                     <input type=\"submit\" class =\"form-control\" value=\"Submit\">\n");
      out.write("                 </div>\n");
      out.write("            </form>\n");
      out.write("\t </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"deletedriverform\" class=\"modal\">\n");
      out.write("\t<div class=\"modal-content\">\n");
      out.write("            <form action=\"AdminServlet\" method=\"get\">\n");
      out.write("                <input type=\"hidden\" name=\"test\" value=\"deleteD\"/>\n");
      out.write("\t\t<span class=\"close\">&times;</span>\n");
      out.write("\t\t<h2>Fill Details</h2><br> <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"dname\" placeholder=\"Driver Name\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class =\"form-group\">\n");
      out.write("                     <input type=\"text\" class=\"form-control\" name=\"did\" placeholder=\"Driver ID\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class =\"form-group\">\n");
      out.write("                              <input type=\"submit\" class =\"form-control\" value=\"Delete\">\n");
      out.write("                    </div>\n");
      out.write("            </form>\n");
      out.write("\t </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    <div id=\"giverouteform\" class=\"modal\">\n");
      out.write("\t<div class=\"modal-content\">\n");
      out.write("            <form action=\"AdminServlet\" method=\"get\">\n");
      out.write("                <input type=\"hidden\" name=\"test\" value=\"giveR\"/>\n");
      out.write("\t\t<span class=\"close\">&times;</span>\n");
      out.write("\t\t<h2>Fill Details</h2><br> <br>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" name=\"route_id\" placeholder=\"Route ID\">\n");
      out.write("                </div> \n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" name=\"stop1\" placeholder=\"Stop 1\">\n");
      out.write("                </div> \t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" name=\"stop2\" placeholder=\"Stop 2\">\n");
      out.write("                </div> \n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" name=\"pickip\" placeholder=\"Pick Up\">\n");
      out.write("                </div> \n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("\t\t\t  <input type=\"submit\" class=\"form-control\" value=\"Create\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\t </div>\n");
      out.write("</div>\n");
      out.write("    <div id=\"changerouteform\" class=\"modal\">\n");
      out.write("\t<div class=\"modal-content\">\n");
      out.write("            <form action=\"AdminServlet\" method=\"get\">\n");
      out.write("                <input type=\"hidden\" name=\"test\" value=\"changeR\"/>\n");
      out.write("\t\t<span class=\"close\">&times;</span>\n");
      out.write("                <h2>Fill Details</h2><br> <br>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" name=\"rid\" placeholder=\"Route ID\">\n");
      out.write("                </div> \n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" name=\"s1\" placeholder=\"Stop 1\">\n");
      out.write("                </div> \t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" name=\"s2\" placeholder=\"Stop 2\">\n");
      out.write("                </div> \n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  <input type=\"text\" class=\"form-control\" name=\"p1\" placeholder=\"Pick Up\">\n");
      out.write("                </div> \n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("\t\t\t  <input type=\"submit\" class=\"form-control\" value=\"Create\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\t </div>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("<div class=\"footer\"> </div>\n");
      out.write("<script>\n");
      out.write("//getting forms\n");
      out.write("var adddriver = document.getElementById('adddriverform');\n");
      out.write("var deletedriver = document.getElementById('deletedriverform');\n");
      out.write("var giveroute= document.getElementById('giverouteform');\n");
      out.write("var changeroute= document.getElementById('changerouteform');\n");
      out.write("\n");
      out.write("\n");
      out.write("document.getElementsByClassName(\"close\")[0].onclick = function() {\n");
      out.write("  adddriver.style.display = \"none\";\n");
      out.write("}\n");
      out.write("document.getElementsByClassName(\"close\")[1].onclick = function() {\n");
      out.write("  deletedriver.style.display = \"none\";\n");
      out.write("}\n");
      out.write("document.getElementsByClassName(\"close\")[2].onclick = function() {\n");
      out.write("  giveroute.style.display = \"none\";\n");
      out.write("}\n");
      out.write("document.getElementsByClassName(\"close\")[3].onclick = function() {\n");
      out.write("  changeroute.style.display = \"none\";\n");
      out.write("}\n");
      out.write("//getting the buttons from main form\n");
      out.write("\n");
      out.write("adddriverbtn = document.getElementById('add-driver');\n");
      out.write("deletedriverbtn = document.getElementById('delete-driver');\n");
      out.write("giveroutebtn=document.getElementById('give-route');\n");
      out.write("changeroutebtn=document.getElementById('change-route')\n");
      out.write("\n");
      out.write("adddriverbtn.onclick = function(){\n");
      out.write("    adddriver.style.display ='block';\n");
      out.write("}\n");
      out.write("deletedriverbtn.onclick = function(){\n");
      out.write("    deletedriver.style.display ='block';\n");
      out.write("}\n");
      out.write("giveroutebtn.onclick = function(){\n");
      out.write("    giveroute.style.display ='block';\n");
      out.write("}\n");
      out.write("changeroutebtn.onclick = function(){\n");
      out.write("    changeroute.style.display ='block';\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
