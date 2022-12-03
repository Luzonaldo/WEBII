/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devCaotics.model.repository;

import com.devCaotics.model.entities.Pet;
import com.devCaotics.model.entities.Tutor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class PetRepository {
    
     private static PetRepository myself = null;
    
    private List<Pet> pets = null;
    
    private PetRepository(){
        this.pets = new ArrayList<>();
    }
    
    public static PetRepository getCurrentInstance(){
        
        if(myself == null)
            myself = new PetRepository();
        
        return myself;
        
    }
    
    public void inserir(Pet p){
        this.pets.add(p);
    }
    
    public List<Pet> lerPetsPorTutor(Tutor t){
        
        List<Pet> lPets = new ArrayList<>();
        
        for(Pet pAux: this.pets){
            if(pAux.getTutor().getCpf().equals(t.getCpf())){
                lPets.add(pAux);
            }
        }
        
        return lPets;
        
    }
    
}
