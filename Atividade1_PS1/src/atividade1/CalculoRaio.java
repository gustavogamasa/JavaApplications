/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * @author gustavoamaral
 */
public class CalculoRaio {
    
    
    public void FazerCalculo(Double R){
    
     Double Area, PI = 3.1415;
        
      
        
        Area = (PI*(R*R));
        
        System.out.printf("\nArea = %.2f m2\n", Area);
        
        if(Area <=1000) {System.out.println("\n Será necessário 1 salva-vida\n");}
        
        else if(Area >= 1001 && Area <= 10000) {System.out.println("\n Serão necessários 2 salva-vidas\n");}
        else if(Area >= 10001 && Area <= 100000) {System.out.println("\n Serão necessários 3 salva-vidas\n");}
        else if(Area >= 100001) {System.out.println("\n Serão necessários 4 salva-vidas\n");}
       
    
    }
    
}
