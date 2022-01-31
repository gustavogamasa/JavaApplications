/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gustavoamaral.mapaps2;

import java.util.ArrayList;


/**
 *
 * @author gustavoamaral
 */
public class Quartos {
    
    private String quartoNumero;
    private String quartoTipo;
    private Integer quartoCapacidade;
    private Double quartoValorDiaria;
    private String quartoDisponivel;

    public Quartos(String quartoNumero, String quartoTipo, Integer quartoCapacidade, Double quartoValorDiaria, String quartoDisponive) {
        this.quartoNumero = quartoNumero;
        this.quartoTipo = quartoTipo;
        this.quartoCapacidade = quartoCapacidade;
        this.quartoValorDiaria = quartoValorDiaria;
        this.quartoDisponivel =  quartoDisponive;

    }
    
        ArrayList<Quartos> classQ = new ArrayList<>();

    Quartos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void cadastrarQuarto(Quartos q){
    classQ.add(q);
    }
    
    public int contarQuartos(){
    return classQ.size();
    }
    
   
    
    


    public String getQuartoNumero() {
        return quartoNumero;
    }

    public void setQuartoNumero(String quartoNumero) {
        this.quartoNumero = quartoNumero;
    }

    public String getQuartoTipo() {
        return quartoTipo;
    }

    public void setQuartoTipo(String quartoTipo) {
        this.quartoTipo = quartoTipo;
    }

    public Integer getQuartoCapacidade() {
        return quartoCapacidade;
    }

    public void setQuartoCapacidade(Integer quartoCapacidade) {
        this.quartoCapacidade = quartoCapacidade;
    }

    public Double getQuartoValorDiaria() {
        return quartoValorDiaria;
    }

    public void setQuartoValorDiaria(Double quartoValorDiaria) {
        this.quartoValorDiaria = quartoValorDiaria;
    }

    public String getQuartoDisponivel() {
        return quartoDisponivel;
    }

    public void setQuartoDisponivel(String quartoDisponivel) {
        this.quartoDisponivel = quartoDisponivel;
    }
    
    
    
    
    
    
}
