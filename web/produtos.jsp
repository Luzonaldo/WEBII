<%-- 
    Document   : produtos
    Created on : Oct 20, 2022, 9:01:00 AM
    Author     : ALUNO
--%>

<%@page import="com.devCaotics.model.entities.Produto"%>
<%@page import="java.util.List"%>
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
        <h1>Produtos Cadastrados</h1>
        
        <a href="cadastroProduto.jsp">Cadastrar um produto</a></br>
        <a href="index.html">home</a>
        
        <%
            String m = (String)session.getAttribute("msg");
            
            if(m != null){
        %>
            <h2><%= m%></h2>
        <% 
                session.removeAttribute("msg");
            }
        %>
        
        <% 
            List<Produto> produtos = (List<Produto>)session.getAttribute("listaProdutos");
        %>
        
        <table>
            <tr>
                <th>Código</th>
                <th>Nome</th>
                <th>Marca</th>
                <th>Categoria</th>
                <th>Operações</th>
            </tr>
            <% 
                for(Produto p: produtos){
            %>
                <tr>
                    <td><%= p.getCodigo() %></td>
                    <td><%= p.getNome() %></td>
                    <td><%= p.getMarca() %></td>
                    <td><%= p.getCategoria() %></td>
                    <td>
                        <a href="ProdutoServlet?codigo=<%= p.getCodigo() %>&operacao=v">visualizar</a>
                        <a href="ProdutoServlet?codigo=<%= p.getCodigo() %>&operacao=a">alterar</a>
                        <a href="ProdutoServlet?codigo=<%= p.getCodigo() %>&operacao=d">deletar</a>
                    </td>
                </tr>
            
            <% } %>
        </table>
    </body>
</html>
