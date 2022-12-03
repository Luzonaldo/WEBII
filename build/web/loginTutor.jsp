<%-- 
    Document   : loginTutor
    Created on : Nov 3, 2022, 10:32:40 AM
    Author     : ALUNO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">


        <title>JSP Page</title>
    </head>
    <body >
        
    <c:if test="${sessionScope.tutorLogado ne null}">
        <jsp:forward page="/tutor.jsp" />
    </c:if>

        

        <!-- Modal -->
        <form method="post" action="loginTutorServlet">
            <div class="modal fade" id="myModal" role="dialog" data-bs-backdrop="static" >
                <div class="modal-dialog ">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h3 class="modal-title">Bem vindo ao IFPE Dog&Frendis Shop </h3>
                        </div>
                        <div class="modal-body modal-sm ">
                            <h4 >realizar Login</h4>
                            <hr>
                            <small style="color:red">${requestScope.msg}</small>
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input id="cpf" type="text" class="form-control" name="cpf" placeholder="CPF Tutor">
                            </div> 

                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                <input id="password" type="password" class="form-control" name="senha" placeholder="Senha">
                            </div>

                        </div>
                            <div class="modal-footer" >
                                <button id="linkCadastro" type="button" class="btn btn-link " data-bs-toggle="modal" data-bs-target="#modalCadastro">registrar-se</button>
                                <button type="submit" class="btn btn-primary" data-dismiss="modal">Logar</button>
                            </div>
                    </div>
                </div>
            </div>
        </form>

        <div class="modal fade" id="modalCadastro" role="dialog">
            <div class="modal-dialog modal-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Registro de Tutor</h4>
                        
                    </div>
                    <div class="modal-body">
                        <div class="panel panel-default">
                            <form class="form-control" action="TutorServlet" method="post">

                                <div class="input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="cpf_tutor" type="text" class="form-control" name="cpf" placeholder="CPF Tutor">
                                </div>  

                                <div class="input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="nome" type="text" class="form-control" name="nome" placeholder="Nome Tutor">
                                </div> 

                                <div class="input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="telefone" type="text" class="form-control" name="telefone" placeholder="telefone de contato">
                                </div> 


                                <div class="input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="endereco" type="text" class="form-control" name="endereco" placeholder="endereço Tutor">
                                </div> 

                                <div class="input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="senha_tutor" type="password" class="form-control" name="senha" placeholder="Senha">
                                </div> 

                                <div class="input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="confirmacao" type="password" class="form-control" name="conf" placeholder="Confirmação da Senha">
                                </div> 

                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">cancelar</button>
                                <button type="submit" class="btn btn-primary">cadastrar</button>
                            </form>
                        </div>
                    </div>

                </div>
            </div>
        </div>


        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
        <script defer>


        var htmlModal = document.getElementById('myModal');
        var htmlModalCadastro = document.getElementById('modalCadastro');

        var myModal = new bootstrap.Modal(htmlModal, {
            keyboard: false
        });
        
        
        
        htmlModalCadastro.addEventListener("hidden.bs.modal",function(e){
            myModal.show()
        })

        
            myModal.show();
        

        </script>

    </body>
</html>
