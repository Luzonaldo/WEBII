/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devCaotics.controllers;

import com.devCaotics.model.entities.Produto;
import com.devCaotics.model.repository.ProdutoRepository;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ALUNO
 */
@WebServlet(name = "ProdutoServlet", urlPatterns = {"/ProdutoServlet"})
public class ProdutoServlet extends HttpServlet {
    
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
        
        String operacao = request.getParameter("operacao");
        
        if(operacao != null && operacao.equals("v")){
            
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            Produto p = ProdutoRepository.getCurrentInstance().read(codigo);
            
            request.getSession().setAttribute("produto", p);
            
            response.sendRedirect("visualizaProduto.jsp");
            
            return;
            
        }
        
        if(operacao!=null && operacao.equals("a")){
            
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            Produto p = ProdutoRepository.getCurrentInstance().read(codigo);
            
            request.setAttribute("produto", p);
            
            getServletContext().getRequestDispatcher("/atualizaProduto.jsp")
                    .forward(request, response);
            
            return;
            
        }
        
        if(operacao!=null && operacao.equals("d")){
            
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            
            ProdutoRepository.getCurrentInstance().delete(codigo);
            
            request.getSession().setAttribute("msg", "Produto deletado com Sucesso!");
            
            response.sendRedirect("produtos.jsp");
            
            
            return;
        }
        
        List<Produto> produtos = ProdutoRepository.getCurrentInstance()
                .readAll();
        
        request.getSession().setAttribute("listaProdutos", 
                produtos);
        
        response.sendRedirect("produtos.jsp");
        
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
        
        
        
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String nome = request.getParameter("nome");
        String marca = request.getParameter("marca");
        String categoria = request.getParameter("categoria");
        String obs = request.getParameter("obs");
        
        Produto p = new Produto();
        
        p.setCodigo(codigo);
        p.setNome(nome);
        p.setMarca(marca);
        p.setCategoria(categoria);
        p.setObservacao(obs);
        
        String aux = "";
        
        if(operacao != null && operacao.equals("a")){
            ProdutoRepository.getCurrentInstance().update(p);
            
            aux+= "alterado";
            
        }else{
            ProdutoRepository.getCurrentInstance().insert(p);
            
            aux+="cadastrado";
            
        }
        
        HttpSession session = request.getSession();
        
        session.setAttribute("msg", "Produto "+aux+" com Sucesso!");
        
        doGet(request, response);
        
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp); //To change body of generated methods, choose Tools | Templates.
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
