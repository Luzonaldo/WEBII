<%-- 
    Document   : atualizaProduto
    Created on : Oct 20, 2022, 10:38:22 AM
    Author     : ALUNO
--%>

<%@page import="com.devCaotics.model.entities.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Altere o produto</h1>
        
        <%
            Produto p = (Produto)request.getAttribute("produto");
        %>
        
        <form method="post" action="ProdutoServlet">
            
            <input type="hidden" name="op" value="a"/>
            Código: <input type="hidden" name="codigo" value="<%= p.getCodigo() %>"/><%= p.getCodigo() %><br/>
            Nome: <input type="text" name="nome" value="<%= p.getNome() %>"/><br/>
            Marca: <input type="text" name="marca" value="<%= p.getMarca() %>"/><br/>
            Categoria: <input type="text" name="categoria" value="<%= p.getCategoria() %>"/><br/>
            Observação: <textarea name="obs"><%= p.getObservacao() %></textarea><br/>
            
            <input type="submit" value="Cadastrar"/>
            
        </form>
    </body>
</html>
