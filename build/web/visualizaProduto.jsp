<%-- 
    Document   : visualizaProduto
    Created on : Oct 20, 2022, 10:21:33 AM
    Author     : ALUNO
--%>

<%@page import="com.devCaotics.model.entities.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table, td, th {border: 1px solid green}
        </style>
    </head>
    <body>
        <h1>Produto Cadastrado</h1>
        
        <%
            Produto p = (Produto)session.getAttribute("produto");
        %>
        
        <a href="ProdutoServlet">produtos cadastrados</a><br/>
        
        <table>
            <tr>
                <th>Código</th>
                <td><%= p.getCodigo() %></td>
            </tr>
            <tr>
                <th>Nome</th>
                <td><%= p.getNome() %></td>
            </tr>
            <tr>
                <th>Marca</th>
                <td><%= p.getMarca() %></td>
            </tr>
            <tr>
                <th>Categoria</th>
                <td><%= p.getCategoria() %></td>
            </tr>
            <tr>
                <th>Observação</th>
                <td><%= p.getObservacao() %></td>
            </tr>
        </table>
    </body>
</html>
