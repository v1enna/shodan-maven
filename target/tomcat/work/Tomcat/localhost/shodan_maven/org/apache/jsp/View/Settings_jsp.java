/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-10-03 13:14:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Settings_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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

      out.write("<div class=\"content\">\r\n");
      out.write("\t<div id=\"settings-page\">\r\n");
      out.write("\t\t<div class=\"settings-routines\">\r\n");
      out.write("\t\t\t<h1>\r\n");
      out.write("\t\t\t\t<i class=\"far fa-address-book\"></i>\r\n");
      out.write("\t\t\t\tImpostazioni di ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"button button--unshadow button--alternative settings-status\"></div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"settings-container\">\r\n");
      out.write("\t\t\t\t<div class=\"set-info\">\r\n");
      out.write("\t\t\t\t\t<div class=\"button button--unshadow button--alternative settings-money\">\r\n");
      out.write("\t\t\t\t\t\t<strong>\r\n");
      out.write("\t\t\t\t\t\t\tHai ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.money}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&euro; nel portafogli.\r\n");
      out.write("\t\t\t\t\t\t</strong>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tNon puoi ricaricare il tuo saldo perchè questa piattaforma è una demo.\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form onsubmit=\"tryPasswordChange(); return false\" class=\"psw-form\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Cambia la password</h2>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"settings-input-old-password\" type=\"password\" required placeholder=\"Password attuale\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"settings-input-new-password\" type=\"password\" required placeholder=\"Nuova password\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"settings-input-new-password-again\" type=\"password\" required placeholder=\"Ripeti la password\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"settings-submit-password\" class=\"button button--submit\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form onsubmit=\"tryEmailChange(); return false\" class=\"email-form\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Cambia l'email</h2>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input id=\"settings-input-email\" type=\"email\" required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"settings-submit-email\" class=\"button button--submit\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"Scripts/SettingsRoutines.js\"></script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
