/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.84
 * Generated at: 2019-05-28 18:53:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public final class Tienda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"esS\" >\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrapValidator.js\"></script>\r\n");
      out.write("<script src=\"js/codigos.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/dataTables.bootstrap.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrapValidator.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- js -->\r\n");
      out.write("<script src=\"js/jquery-2.1.4.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

Connection con;
String url = "jdbc:mysql://localhost:3306/tenisdb";
String Driver = "com.mysql.jdbc.Driver";
String user="root";
String clave = "mysql";
Class.forName(Driver);
con=DriverManager.getConnection(url,user,clave);

PreparedStatement ps;
ResultSet rs;
ps=con.prepareStatement("SELECT idproducto, nombre, descripcion, precio FROM producto");
rs = ps.executeQuery();


      out.write("\r\n");
      out.write("\t<div id=\"IdArriba\"><a href=\"javascript:void(0)\"><span></span></a></div>\r\n");
      out.write("\t<!-- header -->\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"header-left\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"Index.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tTennis Club\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"logo-position\" src=\"images/logo.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse nav-wil\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t<nav class=\"link-effect-9\" id=\"link-effect-9\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Index.jsp\" class=\"hvr-overline-from-center scroll\">Inicio</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Noticias.jsp\" class=\"hvr-overline-from-center scroll\">Noticias</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Tienda.jsp\" class=\"hvr-overline-from-center scroll\">Tienda</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Galeria.jsp\" class=\"hvr-overline-from-center scroll\">Galeria</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Ranking.jsp\" class=\"hvr-overline-from-center scroll\">Ranking</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Contactos.jsp\" class=\"hvr-overline-from-center scroll\">Contactos</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /.navbar-collapse -->\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //header -->\r\n");
      out.write("        <!--Slider-->\r\n");
      out.write("        <section class=\"slider-container\">\r\n");
      out.write("        \t<ul id=\"slider\" class=\"slider-wrapper\">\r\n");
      out.write("            \t<li class=\"slider-current\">\r\n");
      out.write("                \t<img src=\"images/imagen1.jpg\" alt=\"Slider Imagen 1\">\r\n");
      out.write("                    <div class=\"caption\">\r\n");
      out.write("                    \t<h3 class=\"caption-title\">MEJORANDO CADA DIA MÁS</h3>\r\n");
      out.write("                        <p>Así con el deporte, uno crece como persona</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                \t<img src=\"images/imagen2.jpg\" alt=\"Slider Imagen 1\">\r\n");
      out.write("                    <div class=\"caption\">\r\n");
      out.write("                    \t<h3 class=\"caption-title\">SIEMPRE HACIA ADELANTE</h3>\r\n");
      out.write("                        <p>Nunca te rindas y lucha por ser mejor</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                \t<img src=\"images/imagen3.jpg\" alt=\"Slider Imagen 1\">\r\n");
      out.write("                    <div class=\"caption\">\r\n");
      out.write("                    \t<h3 class=\"caption-title\">SUEÑA EN GRANDE</h3>\r\n");
      out.write("                        <p>Vive la vida y no dejes que la vida te viva</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul id=\"slider-controls\" class=\"slider-controls\">\r\n");
      out.write("            \t<li class=\"active\"></li>\r\n");
      out.write("            \t<li></li>\r\n");
      out.write("            \t<li></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </section>\r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("       <div class=\"producto-prin\">\r\n");
      out.write("        \t<div class=\"enc-noticia\">NUESTROS PRODUCTOS</div>\r\n");
      out.write("        \t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div style=\"margin-bottom: 20px\">\r\n");
      out.write("\t\t\t\t<b style=\"text-align: left;\">Categoria</b>\r\n");
      out.write("\t\t\t\t<select id=\"id_cboCategoria\" name=\"categoria\"   class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t<option value=\" \" >[ Seleccione ]</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t    </div>\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("        \t<div class='row'>\r\n");
      out.write("\t        \t");

				while(rs.next()){
				
      out.write("        \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t            <div class=\"col-sm-4\">\r\n");
      out.write("\t         \t\t<div class='panel panel-default'>\r\n");
      out.write("\t\t         \t\t<div class='panel-heading' style='overflow:hidden'>\r\n");
      out.write("\t\t         \t\t   \r\n");
      out.write("\t\t\t\t\t            \t<img src=\"images/null.jpg\" alt=\"imagen-not-prin\" style=\"width: 250px\">\r\n");
      out.write("\t\t\t\t\t            \r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t         \t\t<div class='pane-body' style=\"height: 200px\">\t\r\n");
      out.write("\t\t\t         \t\t<hi id=\"tit-noticia\">\r\n");
      out.write("\t\t\t         \t\t\t<a href='DetalleProducto.jsp?id=");
      out.print( rs.getString("idProducto"));
      out.write("'>\r\n");
      out.write("\t\t\t         \t\t");
      out.print( rs.getString("nombre"));
      out.write("</a></hi>\r\n");
      out.write("\t\t\t            \t<p class=\"text-noticia\" style=\"height: 125px\">\r\n");
      out.write("\t\t\t                \t");
      out.print( rs.getString("descripcion"));
      out.write("\r\n");
      out.write("\t\t\t           \t \t</p>\r\n");
      out.write("\t\t\t           \t \t<p class=\"text-noticia\" style=\"margin-right:20px; text-align: right;\"> PRECIO: S/.\r\n");
      out.write("\t\t\t                \t");
      out.print( rs.getDouble("precio"));
      out.write("\r\n");
      out.write("\t\t\t           \t \t</p>\r\n");
      out.write("\t\t         \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t         \r\n");
      out.write("\t           \t</div>   \r\n");
      out.write("\t            ");
}
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready( function(){\r\n");
      out.write("\t$.getJSON(\"cargaCategoria\",{}, function (data){\r\n");
      out.write("\t\tconsole.log(data);\r\n");
      out.write("\r\n");
      out.write("\t\t$.each(data.lstCategoria, function(index, item){\r\n");
      out.write("\t\t\t$(\"#id_cboCategoria\").append(\"<option value=\"+item.idCategoria+\">\"+ item.nombre +\"</option>\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html> ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
