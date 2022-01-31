
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavoamaral
 */
public class Principal {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        String CPF = null;
        Pacientes p = new Pacientes();
        
         while(!"SAIR".equals(p.getCPF()) || !"sair".equals(p.getCPF())){
            
        
   
       Sintomas s = new Sintomas();
       Integer pontos = 0;
       JOptionPane.showMessageDialog(null, "Bem vindo ao Posto de Saúde de Itaí - SP\nPressione OK para iniciar o atendimento");
       p.setCPF(JOptionPane.showInputDialog("CPF:")); 
       
       if("SAIR".equals(p.getCPF()) || "sair".equals(p.getCPF())) {    
      JOptionPane.showMessageDialog(null, "Encerrando o aplicativo\nPacientes cadastrados: "+p.contarPacientes().toString()+"\nAté mais!");
       System.exit(0);
       } 

       else {
             
       p.coletarInformacoes();

       s.coletarDiagnostico();
       
       //  Encaminhamento
       
       pontos = s.calcularPontos();
        
       if(pontos <= 9)                       JOptionPane.showMessageDialog(null, "RISCO BAIXO\nDirija-se para a ala de risco baixo");
       else if(pontos >= 10 && pontos <= 19) JOptionPane.showMessageDialog(null, "RISCO MÉDIO\nDirija-se para a ala de risco médio");
       else if(pontos >= 20)                 JOptionPane.showMessageDialog(null, "RISCO ALTO\nDirija-se para a ala de risco alto");
       
        
       }  
        
        
        //FIM

        
    } // WHILE
      JOptionPane.showMessageDialog(null, "Encerrando o aplicativo\nPacientes cadastrados: "+p.contarPacientes().toString()+"\nAté mais!");
      System.exit(0);
  }
    
    
}
    
