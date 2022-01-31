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
public class Dados {
    
    
   public static ArrayList<Quartos> classQ = new ArrayList<>();
   public static ArrayList<Hospedes> classHosp = new ArrayList<>();
    
    
    public void cadastrarQuarto(Quartos q){
    classQ.add(q);
    }
    
    public void cadastrarHospede(Hospedes h){
    classHosp.add(h);
    }
    
    public int contarQuartos(){
    return classQ.size();
    }
    
    public ArrayList<Quartos> retornarQuartos(){
    return classQ;
    }
    
    public void atualizarQuarto(Integer i){
    if (i==1) classQ.set(i-1, new Quartos("1", "Simples", 1, 75.0, "Não"));
    else if (i==2) classQ.set(i-1, new Quartos("2", "Simples", 2, 90.0, "Não"));
    else if (i==3) classQ.set(i-1, new Quartos("3", "Luxo", 3, 120.0, "Não"));
    else if (i==4) classQ.set(i-1, new Quartos("4", "Luxo", 2, 90.0, "Não"));

    }
    
    
    public void iniciarQuartos(){
 
        
        Quartos q = new Quartos("1", "Simples", 1, 75.0, "Sim");
        cadastrarQuarto(q); 
        
        Quartos q2 = new Quartos("2", "Simples", 2, 90.0, "Sim");
        cadastrarQuarto(q2);
        
        Quartos q3 = new Quartos("3", "Luxo", 3, 120.0, "Sim");
        cadastrarQuarto(q3);
        
        Quartos q4 = new Quartos("4", "Luxo", 2, 90.0, "Sim");
        cadastrarQuarto(q4);
            
        
    

    }
    
    public double retornarValorDiaria(Integer i){
    
    double valor = 0;
    
    if(null!=i) switch (i) {
           case 1:
               valor = 75;
               break;
           case 2:
               valor = 90;
               break;
           case 3:
               valor = 120;
               break;
           case 4:
               valor = 90;
               break;
           default:
               break;
       }
                     
    return valor;
    
    }
    
    
    
    
    
}
