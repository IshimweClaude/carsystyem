package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Domain.Car;
import dao.GenericDao;
import java.time.Period;
import java.time.LocalDate;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html> \n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write(".customers {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".customers td, .customers th {\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".customers tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write(".customers tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write(".customers th {\n");
      out.write("  padding-top: 12px;\n");
      out.write("  padding-bottom: 12px;\n");
      out.write("  text-align: left;\n");
      out.write("  background-color: #04AA6D;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("    .ga{\n");
      out.write("     font-size: 1em;\n");
      out.write("        background: #04AA6D;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tpadding: 10px 30px;\n");
      out.write("\tmargin-top: 20px;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tletter-spacing: 2px;\n");
      out.write("\ttransition: 0.5s;\n");
      out.write("            }\n");
      out.write("            .tit{\n");
      out.write("                color: #04AA6D;\n");
      out.write("            }      \n");
      out.write("      \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

//            GenericDao<Car> carDao = new GenericDao<>(Car.class);
//            List<Car> cars = carDao.FindAll();
        
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h1>LIST OF COMPANY REGISTERED</h1>\n");
      out.write("        <hr >\n");
      out.write("        \n");
      out.write("       <table border=\"1\" class=\"customers\" id=\"cooperative_table\">\n");
      out.write("            <thead>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <th>PLATE NUMBER</th>\n");
      out.write("                    <th>iNSTITUTION</th>\n");
      out.write("                    <th>MANUFACTURING DATE</th>\n");
      out.write("                    <th>COST</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            ");
 
                //for(Car car: cars){
                    
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        <a href=\"SaveForm.jsp\" class=\"ga\">BACK TO FORM</a>\n");
      out.write("    </center>\n");
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
