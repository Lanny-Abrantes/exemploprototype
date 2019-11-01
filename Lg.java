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
public class Lg extends TvPrototype {

    protected Lg(Lg lg) {
        this.fabricante = lg.getFabricante();
        this.resolucao = lg.getResolucao();
        this.tamanho = lg.getTamanho();
        this.valor = lg.getValor();
    }

    public Lg() {
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
        return new Lg(this);
    }

}
