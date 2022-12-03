<%-- 
    Document   : demonstracaoJSTL
    Created on : Nov 3, 2022, 9:44:52 AM
    Author     : ALUNO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:if test="${1==2}">
            <h2>passou</h2>
        </c:if>
            
            <c:choose>
                <c:when test="${1==2}">
                    <h2>passou no wen</h2>
                </c:when>
                <c:otherwise>
                    <h2>possou no eueyasjhgdasd</h2>
                </c:otherwise>
            </c:choose>
                    
                    <%
                    
                        String[] lista = new String[]{"2","662","737373"};
                        
                        request.setAttribute("l", lista);
                    
                    %>
                    
                    <c:forEach items="${requestScope.l}" var="item">
                        <h3>${item}</h3>
                    </c:forEach>
                        
                    
                    <c:forEach begin="1" end="10" step="1" varStatus="i">
                        <h2>repetiu ${i.index}</h2>
                    </c:forEach>
    </body>
</html>
