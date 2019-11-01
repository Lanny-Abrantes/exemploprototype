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
public class Samsung extends TvPrototype {

    protected Samsung(Samsung samsung) {
        this.fabricante = samsung.getFabricante();
        this.resolucao = samsung.getResolucao();
        this.tamanho = samsung.getTamanho();
        this.valor = samsung.getValor();
    }

    public Samsung() {
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
        return new Samsung(this);
    }

}
