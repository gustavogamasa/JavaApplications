/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import atividade1.CalculoRaio;
import java.util.Scanner;

/**
 *
 * @author gustavoamaral
 */
public class Atividade1 {
    
 
    public static void main(String[] args) {

        Double R;
        
        System.out.println("Insira o valor do RAIO:");
        
        Scanner ler = new Scanner(System.in);
        
        R = ler.nextDouble();

        CalculoRaio c = new CalculoRaio();
        
        c.FazerCalculo(R);


    }
    


    
}
