/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-11-24 08:14:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.freestack.helloworld.youtube.models.Video;
import java.util.List;
import java.text.SimpleDateFormat;

public final class listVideos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Liste des videos</title>\n");
      out.write("    <style>\n");
      out.write("      tr:nth-child(even) {\n");
      out.write("        background: #CCC\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      tr:nth-child(odd) {\n");
      out.write("        background: #FFF\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h2>Liste des videos</h2>\n");

    List<Video> videos = (List<Video>) request.getAttribute("videos");
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm dd-MM-yy");

      out.write("\n");
      out.write("<table>\n");
      out.write("    <thead>\n");
      out.write("    <td>Titre</td>\n");
      out.write("    <td>Date creation</td>\n");
      out.write("    <td>URL</td>\n");
      out.write("    <td>Lien</td>\n");
      out.write("    </thead>\n");
      out.write("    ");
 for (Video video : videos) {
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print( video.getTitle() );
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td>");
      out.print( simpleDateFormat.format(video.getCreationDate()) );
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td>");
      out.print( video.getUrl() );
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td>\n");
      out.write("            <a href=\"video.jsp?url=");
      out.print( video.getUrl());
      out.write("&title=");
      out.print( video.getTitle() );
      out.write("\">See</a>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/upload.jsp\">Upload another video</a>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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