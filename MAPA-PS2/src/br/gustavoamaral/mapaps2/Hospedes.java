/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gustavoamaral.mapaps2;

/**
 *
 * @author gustavoamaral
 */
public class Hospedes {
    
    private String hospedeNome;
    private String hospedeIdade;
    private String quartoEndereco;

    public Hospedes(String hospedeNome, String hospedeIdade, String quartoEndereco) {
        this.hospedeNome = hospedeNome;
        this.hospedeIdade = hospedeIdade;
        this.quartoEndereco = quartoEndereco;
    }

    public String getHospedeNome() {
        return hospedeNome;
    }

    public void setHospedeNome(String hospedeNome) {
        this.hospedeNome = hospedeNome;
    }

    public String getHospedeIdade() {
        return hospedeIdade;
    }

    public void setHospedeIdade(String hospedeIdade) {
        this.hospedeIdade = hospedeIdade;
    }

    public String getQuartoEndereco() {
        return quartoEndereco;
    }

    public void setQuartoEndereco(String quartoEndereco) {
        this.quartoEndereco = quartoEndereco;
    }
   

    
    
    
}
