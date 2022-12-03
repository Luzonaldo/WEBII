/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devCaotics.controllers.tags;

import com.devCaotics.model.entities.Pet;
import com.devCaotics.model.entities.Tutor;
import com.devCaotics.model.repository.PetRepository;
import java.io.IOException;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author ALUNO
 */
public class CarregaPets extends SimpleTagSupport{

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag(); //To change body of generated methods, choose Tools | Templates.
    
        Tutor tLogado = (Tutor)getJspContext().getAttribute("tutorLogado",
                PageContext.SESSION_SCOPE);
        
        if(tLogado == null){
            getJspContext().setAttribute("msg", 
                    "Não é possível usar esta tag sem estar logado", PageContext.SESSION_SCOPE);
        
            return;
        }
        
        List<Pet> pets = PetRepository.getCurrentInstance()
                .lerPetsPorTutor(tLogado);
        
        getJspContext().setAttribute("pets", pets, PageContext.PAGE_SCOPE);
        
        
        
    }
    
    
    
}
