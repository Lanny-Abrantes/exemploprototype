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
public class Toshiba extends TvPrototype {

    protected Toshiba(Toshiba toshiba) {
        this.fabricante = toshiba.getFabricante();
        this.resolucao = toshiba.getResolucao();
        this.tamanho = toshiba.getTamanho();
        this.valor = toshiba.getValor();
    }

    public Toshiba() {
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
        return new Toshiba(this);
    }

}
