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
public class Principal {
    
    public static void main(String[] args) {
        
        Cce cce = new Cce();
        Lg lg = new Lg();
        Samsung samsung = new Samsung();
        Toshiba toshiba = new Toshiba();
        
        TvPrototype cceNovo = cce.clonar();
        cceNovo.setFabricante("Pessoa1");
        cceNovo.setResolucao(4000);
        cceNovo.setTamanho(32);
        cceNovo.setValor(3200);
        
        TvPrototype lgNovo = lg.clonar();
        lgNovo.setFabricante("Pessoa1");
        lgNovo.setResolucao(4000);
        lgNovo.setTamanho(32);
        lgNovo.setValor(3200);
        
        TvPrototype samsungNovo = samsung.clonar();
        samsungNovo.setFabricante("Pessoa1");
        samsungNovo.setResolucao(4000);
        samsungNovo.setTamanho(32);
        samsungNovo.setValor(3250);
        
        TvPrototype toshibaNovo = toshiba.clonar();
        toshibaNovo.setFabricante("Pessoa1");
        toshibaNovo.setResolucao(4000);
        toshibaNovo.setTamanho(32);
        toshibaNovo.setValor(3205);
        
        System.out.println("CceNovo: \n" + cceNovo.exibeInfo()
                + "\n\nLgNovo: \n" + lgNovo.exibeInfo()
                + "\n\nSamsungNovo: \n" + samsungNovo.exibeInfo()
                + "\n\nTtoshibaNovo: \n" + toshibaNovo.exibeInfo());
    }
}
