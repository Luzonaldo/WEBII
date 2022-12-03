<%-- 
    Document   : cadastroProduto
    Created on : Oct 13, 2022, 9:32:32 AM
    Author     : ALUNO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Produtos</h1>
        <a href="index.html">home</a></br>
        <a href="ProdutoServlet">Produtos Cadastrados</a>
        <%
            String m = (String)session.getAttribute("msg");
            
            if(m != null){
        %>
            <h2><%= m%></h2>
        <% 
                session.removeAttribute("msg");
            }
        %>
        
        <form method="post" action="ProdutoServlet">
            
            Código: <input type="text" name="codigo"/><br/>
            Nome: <input type="text" name="nome"/><br/>
            Marca: <input type="text" name="marca"/><br/>
            Categoria: <input type="text" name="categoria"/><br/>
            Observação: <textarea name="obs"></textarea><br/>
            
            <input type="submit" value="Cadastrar"/>
            
        </form>
        
        
    </body>
</html>
