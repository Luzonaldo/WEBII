<%-- 
    Document   : tutor.jsp
    Created on : Nov 3, 2022, 11:36:58 AM
    Author     : ALUNO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
      
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:directive.include  file="menuTutor.jsp"/>
        
        <h1>Bem vindo ${sessionScope.tutorLogado.nome}!</h1>
        ${requestScope.msg}
    </body>
</html>
