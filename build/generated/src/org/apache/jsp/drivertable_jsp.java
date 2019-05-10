package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class drivertable_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("table {\n");
      out.write("  font-family: arial, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("  border: 1px solid #dddddd;\n");
      out.write("  text-align: left;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("  background-color: #dddddd;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>HTML Table</h2>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("  <tr>\n");
      out.write("    <th>Driver </th>\n");
      out.write("\t<th>Driver Name </th\n");
      out.write("\t<th>Driver Phone Number </th>\n");
      out.write("\t<th>Driver ID</th>\n");
      out.write("\t<th>Driver Address</th>\n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Alfreds Futterkiste</td>\n");
      out.write("    <td>Maria Anders</td>\n");
      out.write("    <td>Germany</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Centro comercial Moctezuma</td>\n");
      out.write("    <td>Francisco Chang</td>\n");
      out.write("    <td>Mexico</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Ernst Handel</td>\n");
      out.write("    <td>Roland Mendel</td>\n");
      out.write("    <td>Austria</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Island Trading</td>\n");
      out.write("    <td>Helen Bennett</td>\n");
      out.write("    <td>UK</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Laughing Bacchus Winecellars</td>\n");
      out.write("    <td>Yoshi Tannamuri</td>\n");
      out.write("    <td>Canada</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Magazzini Alimentari Riuniti</td>\n");
      out.write("    <td>Giovanni Rovelli</td>\n");
      out.write("    <td>Italy</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("\n");
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
