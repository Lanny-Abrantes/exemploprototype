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
public class Cce extends TvPrototype {
    
    protected Cce(Cce cce) {
        this.fabricante = cce.getFabricante();
        this.resolucao = cce.getResolucao();
        this.tamanho = cce.getTamanho();
        this.valor = cce.getValor();
    }

    public Cce() {
    }
    
    @Override
    public String exibeInfo() {
        return "Fabricante: " + this.fabricante
                + "\nResolução: " + this.resolucao
                + "\nTamanho: " + this.tamanho
                + "\nValor: " + this.valor;
    }
    
    @Override
    public TvPrototype clonar() {
        return new Cce(this);
    }
    
}
