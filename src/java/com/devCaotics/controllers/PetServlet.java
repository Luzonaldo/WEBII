/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devCaotics.controllers;

import com.devCaotics.model.entities.Pet;
import com.devCaotics.model.entities.Tutor;
import com.devCaotics.model.repository.PetRepository;
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
@WebServlet(name = "PetServlet", urlPatterns = {"/PetServlet"})
public class PetServlet extends HttpServlet {

    

    
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
        
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String nome = request.getParameter("nome");
        String raca = request.getParameter("raca");
        String especie = request.getParameter("especie");
        String cor = request.getParameter("cor");
        String observacao = request.getParameter("observacao");
        
        Pet p = new Pet();
        p.setCodigo(codigo);
        p.setNome(nome);
        p.setRaca(raca);
        p.setCor(cor);
        p.setEspecie(especie);
        p.setObservacao(observacao);
        
        Tutor t = (Tutor)request.getSession().getAttribute("tutorLogado");
        
        p.setTutor(t);
        
        PetRepository.getCurrentInstance().inserir(p);
        
        request.getSession().setAttribute("msg", "Pet inserido com sucesso!");
        
        response.sendRedirect("tutor.jsp");
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
