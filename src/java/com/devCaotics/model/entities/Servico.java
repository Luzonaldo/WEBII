/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devCaotics.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class Servico {
    
    private int codigo;
    private long data;
    private String observacao;
    
    private TipoServico tipo;
    private List<Produto> produtos;
    
    public Servico(){
        this.data = new Date().getTime();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getData() {
        return data;
    }
    
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy")
                .format(new Date(this.data));
    }
    
    public String getDataHoraFormatada(){
        return new SimpleDateFormat("hh:mm --- dd/MM/YYYY")
                .format(new Date(this.data));
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public TipoServico getTipo() {
        return tipo;
    }

    public void setTipo(TipoServico tipo) {
        this.tipo = tipo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
    
    
}
