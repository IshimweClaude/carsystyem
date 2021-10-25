package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.CarModel;

public final class SaveForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"  href=\"./font-awesome-4.7.0/css/font-awesome.min.css\"/>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\"/>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js\" integrity=\"sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js\" integrity=\"sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\"/>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("   </head>\n");
      out.write("<style>\n");
      out.write("    body{\n");
      out.write("        background-color: #111;\n");
      out.write("    }\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  padding: 12px 12px 12px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: black;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25 {\n");
      out.write("  float: left;\n");
      out.write("  width: 25%;\n");
      out.write("  margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-75 {\n");
      out.write("  float: left;\n");
      out.write("  width: 75%;\n");
      out.write("  margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("  .col-25, .col-75, input[type=submit] {\n");
      out.write("    width: 100%;\n");
      out.write("    margin-top: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".li{\n");
      out.write("   font-size: 1em;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground: #04AA6D;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tpadding: 5px 30px;\n");
      out.write("\tmargin-top: 20px;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tletter-spacing: 2px;\n");
      out.write("\ttransition: 0.5s;\n");
      out.write("}\n");
      out.write(".msg{\n");
      out.write("    color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("       ");

               CarModel carmod =(CarModel) request.getAttribute("carModel");
            if(carmod == null){
                carmod = new CarModel();
                request.setAttribute("carModel", carmod);
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("</center> \n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"container-fluid\" style=\"background: #000; color: white;margin: 0;\">\n");
      out.write("        <h1 class=\"tt\">RWANDA GOVERNMENT CARS REGISTRATION</h1>\n");
      out.write("         </div>\n");
      out.write("    <br>\n");
      out.write("    <div>\n");
      out.write("        <h4 class=\"msg\">");
      out.print(carmod.getGeneraMsg());
      out.write("</h4>\n");
      out.write("    </div>\n");
      out.write("        <br>\n");
      out.write("  <form action=\"CarController\" method=\"POST\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-25\">\n");
      out.write("      <label for=\"pn\">Plate Number</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"pn\" name=\"a\" placeholder=\"Car plate number...\" value=\"");
      out.print(carmod.getPlatenoInput());
      out.write("\">\n");
      out.write("        <div><h4>");
      out.print(carmod.getPlateMsg());
      out.write("</h4></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-25\">\n");
      out.write("      <label for=\"institution\">Institution</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-75\">\n");
      out.write("      <select id=\"institution\" name=\"b\" value=\"");
      out.print(carmod.getInstitutionInput());
      out.write("\">\n");
      out.write("        <option value=\"RDB\">RDB</option>\n");
      out.write("        <option value=\"NPD\">NPD</option>\n");
      out.write("        <option value=\"RIB\">RIB</option>\n");
      out.write("      </select>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <div class=\"row\">\n");
      out.write("    <div class=\"col-25\">\n");
      out.write("      <label for=\"date\">Manufacturing Date Date</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-75\">\n");
      out.write("        <input type=\"date\" id=\"date\" name=\"c\" placeholder=\"Your date..\" value=\"");
      out.print(carmod.getManufacturedate());
      out.write("\">\n");
      out.write("        <div><h4 class=\"msg\">");
      out.print(carmod.getManuMsg());
      out.write("</h4></div>\n");
      out.write("    </div>\n");
      out.write("  </div>  \n");
      out.write("          <div class=\"row\">\n");
      out.write("    <div class=\"col-25\">\n");
      out.write("      <label for=\"capital\">Cost</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"capital\" name=\"d\" placeholder=\"Your capital..\" value=\"");
      out.print(carmod.getCostValue());
      out.write("\">\n");
      out.write("        <div><h4 class=\"msg\">");
      out.print(carmod.getCostMsg());
      out.write("</h4></div>\n");
      out.write("    </div>\n");
      out.write("  </div>    \n");
      out.write("  <br>\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <input type=\"submit\" value=\"Submit\">\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("       <a href=\"carList.jsp\" class=\"li\">View List</a>   \n");
      out.write("       </center> \n");
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
