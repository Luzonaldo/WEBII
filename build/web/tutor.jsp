<%-- 
    Document   : tutor.jsp
    Created on : Nov 3, 2022, 11:36:58 AM
    Author     : ALUNO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="web2" uri="https://devCaotics.org/web2tags" %>
<%@taglib prefix="ifpe" uri="com.devCaotics.ifpeTags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">


        <title>JSP Page</title>
    </head>
    <body>

        <jsp:directive.include  file="menuTutor.jsp"/>
        <web2:hellou attr1="atributo 1"  t="${sessionScope.tutorLogado}"/>

        <web2:tag2>
            Esta tag tem conteúdo no corpo
        </web2:tag2>
            
            <small style="color:red">${sessionScope.msg}</small>
            
            <c:remove scope="session" var="msg"/>

        <h1>Bem vindo ${sessionScope.tutorLogado.nome}!</h1>
        ${requestScope.msg}

        <button class="btn btn-primary" data-bs-toggle="modal" 
                data-bs-target="#modalPet">Adicionar um Pet</button>

        <div class="modal fade" id="modalPet" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Insira seu Pet</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form class="form-control" method="post" action="PetServlet">
                            
                            <table class="table">
                                <tr>
                                    <th>Código</th>
                                    <td><input type="text" name="codigo"/></td>
                                </tr>
                                <tr>
                                    <th>Nome</th>
                                    <td><input type="text" name="nome"/></td>
                                </tr>
                                <tr>
                                    <th>Raça</th>
                                    <td><input type="text" name="raca"/></td>
                                </tr>
                                <tr>
                                    <th>Espécie</th>
                                    <td><input type="text" name="especie"/></td>
                                </tr>
                                <tr>
                                    <th>Cor</th>
                                    <td><input type="text" name="cor"/></td>
                                </tr>
                                <tr>
                                    <th>Observaçao</th>
                                    <td><textarea name="observacao"></textarea></td>
                                </tr>
                            </table>
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-primary">Inserir</button>
                        </form>
                    </div>
                    
                </div>
            </div>
        </div>

        
        <ifpe:CarregaPets/>
        
        ${pageScope.pets.size()}

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
