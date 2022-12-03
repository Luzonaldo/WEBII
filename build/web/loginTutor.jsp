<%-- 
    Document   : loginTutor
    Created on : Nov 3, 2022, 10:32:40 AM
    Author     : ALUNO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI=" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>



        <script>

            $(document).ready(function () {
                $('#myModal').modal("show")

                $("#linkCadastro").click(function () {
                    $('#modalCadastro').modal("show")
                })

                $(".registrar").click(function () {
                    $('#modalCadastro').modal("show")
                })

                $(".lodal").click(function () {
                    $('#myModal').modal("show")
                })

            })




        </script>

        <title>JSP Page</title>
    </head>
    <body >


        <button class="logar">logar</button>
        <button class="registrar">registrar</button>
        
        ${requestScope.msg}
        
        <!-- Modal -->
        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog modal-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">realizar Login</h4>
                    </div>
                    <div class="modal-body">

                        <div class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                            <input id="cpf" type="text" class="form-control" name="cpf" placeholder="CPF Tutor">
                        </div> 

                        <div class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                            <input id="password" type="password" class="form-control" name="senha" placeholder="Senha">
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button id="linkCadastro" type="button" class="btn btn-link">registrar-se</button>
                        <button type="button" class="btn btn-primary" data-dismiss="modal">Logar</button>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="modal fade" id="modalCadastro" role="dialog">
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">realizar Login</h4>
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

                            <button type="button" data-dismiss="modalCadastro">cancelar</button>
                            <button type="submit" class="btn btn-primary">cadastrar</button>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-link">registrar-se</button>
                    <button type="button" class="btn btn-primary" data-dismiss="modal">Logar</button>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
