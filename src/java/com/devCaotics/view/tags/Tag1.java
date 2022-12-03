/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devCaotics.view.tags;

import com.devCaotics.model.entities.Tutor;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author ALUNO
 */
public class Tag1 extends SimpleTagSupport{

    private String attr1;
    private String attr2;
    private Tutor t;
    
    @Override
    public void doTag() throws JspException, IOException {
        
        getJspContext().getOut()
                .println("<h1>Hellou uordi galera "
                        + "attr1:"+attr1+" attr2: "+this.t.getNome()+"</h1>");
        
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public void setT(Tutor t) {
        this.t = t;
    }
    
    
    
    
}
