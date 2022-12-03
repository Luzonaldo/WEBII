package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.devCaotics.model.entities.Produto;
import java.util.List;

public final class produtos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            table, td, th {border: 1px solid green}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Produtos Cadastrados</h1>\n");
      out.write("        \n");
      out.write("        <a href=\"cadastroProduto.jsp\">Cadastrar um produto</a></br>\n");
      out.write("        <a href=\"index.html\">home</a>\n");
      out.write("        \n");
      out.write("            <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("            \n");
      out.write("            ");
 
                session.removeAttribute("msg");
            
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 
            List<Produto> produtos = (List<Produto>)session.getAttribute("listaProdutos");
        
      out.write("\n");
      out.write("        \n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Código</th>\n");
      out.write("                <th>Nome</th>\n");
      out.write("                <th>Marca</th>\n");
      out.write("                <th>Categoria</th>\n");
      out.write("                <th>Operações</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 
                for(Produto p: produtos){
            
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.getNome() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.getMarca() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.getCategoria() );
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"ProdutoServlet?codigo=");
      out.print( p.getCodigo() );
      out.write("&operacao=v\">visualizar</a>\n");
      out.write("                        <a href=\"ProdutoServlet?codigo=");
      out.print( p.getCodigo() );
      out.write("&operacao=a\">alterar</a>\n");
      out.write("                        <a href=\"ProdutoServlet?codigo=");
      out.print( p.getCodigo() );
      out.write("&operacao=d\">deletar</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            \n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </table>\n");
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
