/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devCaotics.model.repository;

import com.devCaotics.model.entities.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class ProdutoRepository {
    
    private static ProdutoRepository myself = null;
    
    private List<Produto> produtos = null;
    
    private ProdutoRepository(){
        this.produtos = new ArrayList<>();
    }
    
    public static ProdutoRepository getCurrentInstance(){
        
        if(myself == null)
            myself = new ProdutoRepository();
        
        return myself;
        
    }
    
    public void insert(Produto p ){
        this.produtos.add(p);
    }
    
    public void update(Produto p){
        
        for(Produto pAux : this.produtos){
            
            if(pAux.getCodigo() == p.getCodigo()){
                
                pAux.setCategoria(p.getCategoria());
                pAux.setMarca(p.getMarca());
                pAux.setNome(p.getNome());
                pAux.setObservacao(p.getObservacao());
                
                return;
            }
            
        }
        
    }
    
    public Produto read(int codigo){
        
        for(Produto pAux: this.produtos){
            if(pAux.getCodigo() == codigo){
                return pAux;
            }
        }
        
        return null;
        
    }
    
    public void delete(int codigo){
        
        Produto pAuxAux = null;
        
        for(Produto pAux: this.produtos){
            if(pAux.getCodigo() == codigo){
                pAuxAux = pAux;
                break;
            }
        }
        
        if(pAuxAux != null)
            this.produtos.remove(pAuxAux);
        
    }
    
    
}
