/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devCaotics.model.repository;

import com.devCaotics.model.entities.Tutor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class TutorRepository {
    
     private static TutorRepository myself = null;
    
    private List<Tutor> tutores = null;
    
    private TutorRepository(){
        this.tutores = new ArrayList<>();
    }
    
    public static TutorRepository getCurrentInstance(){
        
        if(myself == null)
            myself = new TutorRepository();
        
        return myself;
        
    }
    
    public void inserir(Tutor t){
        this.tutores.add(t);
    }
    
    public Tutor buscarPorCPF(String cpf){
        
        for(Tutor t: this.tutores){
            if(t.getCpf().equals(cpf)){
                return t;
            }
        }
       return null; 
    }
    
}
