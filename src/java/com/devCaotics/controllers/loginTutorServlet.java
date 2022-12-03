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
@WebServlet(name = "loginTutorServlet", urlPatterns = {"/loginTutorServlet"})
public class loginTutorServlet extends HttpServlet {

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
        
        String operacao = request.getParameter("op");
        
        if(operacao != null){
            
            request.getSession().invalidate();
            
            getServletContext().getRequestDispatcher("/loginTutor.jsp")
                .forward(request, response);
            
            return;
            
        }
        
        String cpf = request.getParameter("cpf");
        String senha = request.getParameter("senha");
        
        Tutor t = TutorRepository.getCurrentInstance().buscarPorCPF(cpf);
        
        if(t!=null){
            
            if(t.getSenha().equals(senha)){
                request.getSession().setAttribute("tutorLogado", t);
                
                getServletContext().getRequestDispatcher("/tutor.jsp")
                        .forward(request, response);
                
                return;
                
            }
            
        }
        
        request.setAttribute("msg", "Não foi possível realizar o login: "
                + "A senha ou o CPF estão inválidos");
        
        getServletContext().getRequestDispatcher("/loginTutor.jsp")
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
