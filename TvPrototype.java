/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prototype;

/**
 *
 * @author fafic
 */
public abstract class TvPrototype {
 
    protected int tamanho, resolucao;
    protected double valor;
    protected String fabricante;
    
    
    public abstract String exibeInfo();
    public abstract TvPrototype clonar();

    
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getResolucao() {
        return resolucao;
    }

    public void setResolucao(int resolucao) {
        this.resolucao = resolucao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    
    
    
}
