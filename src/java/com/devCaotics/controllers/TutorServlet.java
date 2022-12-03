/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devCaotics.controllers;

import com.devCaotics.model.entities.Tutor;
import com.devCaotics.model.repository.TutorRepository;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ALUNO
 */
@WebServlet(name = "TutorServlet", urlPatterns = {"/TutorServlet"})
public class TutorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String cpf = request.getParameter("cpf");
        String nome = request.getParameter("nome");
        String telefone = request.getParameter("telefone");
        String endereco = request.getParameter("endereco");
        String senha = request.getParameter("senha");
        String confirmacao = request.getParameter("conf");

        if (!senha.equals(confirmacao)) {

            String msg = "A senha e a confirmação não batem! Cadastro não realizado";

            request.setAttribute("msg", msg);

            getServletContext().getRequestDispatcher("/loginTutor.jsp")
                    .forward(request, response);

            return;
        }

        Tutor t = new Tutor();

        t.setCpf(cpf);
        t.setNome(nome);
        t.setTelefone(telefone);
        t.setEndereco(endereco);
        t.setSenha(senha);

        TutorRepository.getCurrentInstance().inserir(t);

        String msg = "Tutor Cadastrado com Sucesso!";

        request.setAttribute("msg", msg);

        getServletContext().getRequestDispatcher("/tutor.jsp")
                .forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
