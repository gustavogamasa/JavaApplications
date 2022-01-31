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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dados d = new Dados();
        d.iniciarQuartos();
        
        menuPrincipal mP = new menuPrincipal();
        mP.show();

        
 
        
       
        
        
        
    }
    
}
