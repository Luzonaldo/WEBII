<%-- 
    Document   : menuTutor
    Created on : Nov 10, 2022, 9:27:44 AM
    Author     : ALUNO
--%>

<c:if test="${sessionScope.tutorLogado eq null}">
    <jsp:forward page="/loginTutor.jsp"/>
</c:if>

<nav class="navbar bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="tutor.jsp">Home</a>
        <form class="d-flex" role="search" method="post" action="loginTutorServlet">
            <input type="hidden" name="op" value="logout"/>
            <button class="btn btn-outline-success" type="submit">sair</button>
        </form>
    </div>
</nav>

