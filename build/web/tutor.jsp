<%-- 
    Document   : tutor.jsp
    Created on : Nov 3, 2022, 11:36:58 AM
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
        <h1>Bem vindo Tutor!</h1>
        ${requestScope.msg}
    </body>
</html>
