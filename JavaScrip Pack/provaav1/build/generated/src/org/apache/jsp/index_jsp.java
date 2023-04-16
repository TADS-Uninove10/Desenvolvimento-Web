package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Endereço de origem</h1>\n");
      out.write("        nome:\n");
      out.write("        <input type=\"text\" name=\"Nome\" size=\"10\"  maxlenght=\"20\" ></input>\n");
      out.write("        cpf ou cnpj\n");
      out.write("        <input tupe=\"text\" name=\"cpf\" sizer=\"10\" maxlenght=\"20\" ></input>\n");
      out.write("        rua\n");
      out.write("        <input tupe=\"text\" name=\"cpf\" sizer=\"10\" maxlenght=\"20\" ></input>\n");
      out.write("        cep:\n");
      out.write("        <input type=\"text\" name=\"cep\" size=\"10\"  maxlenght=\"20\" ></input>\n");
      out.write("        telefone\n");
      out.write("        <input tupe=\"text\" name=\"cpf\" sizer=\"10\" maxlenght=\"20\" ></input>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <h1>Produto1</h1><br>\n");
      out.write("        <img src=\"\"><br\n");
      out.write("\n");
      out.write("            <h1><h1>profundidade= 25cm<br>altura= 50cm<br>largura=20cm</h1><br<h1>\n");
      out.write("                  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <h1>Destinatario</h1>\n");
      out.write("                nome:\n");
      out.write("                <input type=\"text\" name=\"Nome\" size=\"10\"  maxlenght=\"20\" ></input>\n");
      out.write("                cpf ou cnpj\n");
      out.write("                <input tupe=\"text\" name=\"cpf\" sizer=\"10\" maxlenght=\"20\" ></input>\n");
      out.write("                rua\n");
      out.write("                <input tupe=\"text\" name=\"cpf\" sizer=\"10\" maxlenght=\"20\" ></input>\n");
      out.write("                cep:\n");
      out.write("                <input type=\"text\" name=\"cep\" size=\"10\"  maxlenght=\"20\" ></input>\n");
      out.write("                telefone\n");
      out.write("                <input tupe=\"text\" name=\"cpf\" sizer=\"10\" maxlenght=\"20\" ></input>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"ENVIAR\"></input>\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
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
