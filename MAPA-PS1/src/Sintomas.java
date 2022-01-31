
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
public class Sintomas {

    public boolean isFebre() {
        return Febre;
    }

    public void setFebre(boolean Febre) {
        this.Febre = Febre;
    }

    public boolean isDorDeCabeca() {
        return DorDeCabeca;
    }

    public void setDorDeCabeca(boolean DorDeCabeca) {
        this.DorDeCabeca = DorDeCabeca;
    }

    public boolean isSecrecaoNasalouEspirros() {
        return SecrecaoNasalouEspirros;
    }

    public void setSecrecaoNasalouEspirros(boolean SecrecaoNasalouEspirros) {
        this.SecrecaoNasalouEspirros = SecrecaoNasalouEspirros;
    }

    public boolean isDorIrritacaoGarganta() {
        return DorIrritacaoGarganta;
    }

    public void setDorIrritacaoGarganta(boolean DorIrritacaoGarganta) {
        this.DorIrritacaoGarganta = DorIrritacaoGarganta;
    }

    public boolean isTosseSeca() {
        return TosseSeca;
    }

    public void setTosseSeca(boolean TosseSeca) {
        this.TosseSeca = TosseSeca;
    }

    public boolean isDificuldadeResp() {
        return DificuldadeResp;
    }

    public void setDificuldadeResp(boolean DificuldadeResp) {
        this.DificuldadeResp = DificuldadeResp;
    }

    public boolean isDoresCOrpo() {
        return DoresCOrpo;
    }

    public void setDoresCOrpo(boolean DoresCOrpo) {
        this.DoresCOrpo = DoresCOrpo;
    }

    public boolean isDiarreia() {
        return Diarreia;
    }

    public void setDiarreia(boolean Diarreia) {
        this.Diarreia = Diarreia;
    }

    public boolean isContato14DiasCovid() {
        return Contato14DiasCovid;
    }

    public void setContato14DiasCovid(boolean Contato14DiasCovid) {
        this.Contato14DiasCovid = Contato14DiasCovid;
    }

    public boolean isLocaisAlomeracao() {
        return LocaisAlomeracao;
    }

    public void setLocaisAlomeracao(boolean LocaisAlomeracao) {
        this.LocaisAlomeracao = LocaisAlomeracao;
    }

    public Integer getPontosDiagnostico() {
        return PontosDiagnostico;
    }

    public void setPontosDiagnostico(Integer PontosDiagnostico) {
        this.PontosDiagnostico = PontosDiagnostico;
    }
    
    
    
    
 
    private boolean Febre = false;
    private boolean DorDeCabeca = false;
    private boolean SecrecaoNasalouEspirros = false;
    private boolean DorIrritacaoGarganta = false;
    private boolean TosseSeca = false;
    private boolean DificuldadeResp = false;
    private boolean DoresCOrpo = false;
    private boolean Diarreia = false;
    private boolean Contato14DiasCovid = false;
    private boolean LocaisAlomeracao = false;
    
    private Integer PontosDiagnostico = 0;
    
    
    
public void coletarDiagnostico(){



        JOptionPane.showMessageDialog(null, "Muito obrigado pelas informações!\nPresisone OK para iniciar o diagnóstico.");

        // INICIO DIAGNOSTICO
        
         List<String> opcaoDiag = new ArrayList<>();
         opcaoDiag.add("Sim");
         opcaoDiag.add("Não");
         
         // FEBRE ---------------------------
         
         Object[] opcoes = opcaoDiag.toArray();
         int value = JOptionPane.showOptionDialog(
         null,
         "Tem febre?",
         null,
         JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         opcoes,
         opcaoDiag.get(0)     
         
         );
         
         if (value == 0) setFebre(true);
         
         //FEBRE -------------------------
         
          //DOR DE CABECA   -------------------------
         value = JOptionPane.showOptionDialog(
         null,
         "Tem dor de cabeça?",
         null,
         JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         opcoes,
         opcaoDiag.get(0)     
         
         );
         
         if (value == 0) setDorDeCabeca(true);
         
         //DOR DE CABECA  -------------------------
         
         
         //Secrecao Nasal ou espirros   -------------------------
         value = JOptionPane.showOptionDialog(
         null,
         "Tem secreção nasal ou espirros?",
         null,
         JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         opcoes,
         opcaoDiag.get(0)     
         
         );
         
         if (value == 0) setSecrecaoNasalouEspirros(true);
         
         //Secrecao Nasal ou espirros  -------------------------  
         
                  
         //   Dor/irritacao garganta   -------------------------
         value = JOptionPane.showOptionDialog(
         null,
         "Tem dor/irritação na garganta?",
         null,
         JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         opcoes,
         opcaoDiag.get(0)     
         
         );
         
         if (value == 0) setDorIrritacaoGarganta(true);
         //   Dor/irritacao garganta 
         
         //   Tosse seca  -------------------------
         value = JOptionPane.showOptionDialog(
         null,
         "Tem tosse seca?",
         null,
         JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         opcoes,
         opcaoDiag.get(0)     
         
         );
         
         if (value == 0) setTosseSeca(true);
         //   Tosse seca 
         
         
               //   Tosse seca  -------------------------
         value = JOptionPane.showOptionDialog(
         null,
         "Tem dificuldade respiratória?",
         null,
         JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         opcoes,
         opcaoDiag.get(0)     
         
         );
         
         if (value == 0) setDificuldadeResp(true);
         //   Dificuldade respiratoria
         
         
        //   dores no corpo    -------------------
         value = JOptionPane.showOptionDialog(
         null,
         "Tem dores no corpo?",
         null,
         JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         opcoes,
         opcaoDiag.get(0)     
         
         );
         
         if (value == 0) setDoresCOrpo(true);
         //   Dores no corpo
         
         
         //   diarreia   -------------------
         value = JOptionPane.showOptionDialog(
         null,
         "Tem diarreia?",
         null,
         JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         opcoes,
         opcaoDiag.get(0)     
         
         );
         
         if (value == 0) setDiarreia(true);
         
         //   diarreia   -------------------
         
        //   contato 14 dias   -------------------
         value = JOptionPane.showOptionDialog(
         null,
         "Esteve em contato, nos últimos 14 dias, com um caso diagnosticado com COVID-19?",
         null,
         JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         opcoes,
         opcaoDiag.get(0)     
         
         );
         
         if (value == 0) setContato14DiasCovid(true);
        //   contato 14 dias   -------------------

          //   Esteve em locais com grande aglomeracao   -------------------
         value = JOptionPane.showOptionDialog(
         null,
         "Esteve em locais com grande aglomeração?",
         null,
         JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         opcoes,
         opcaoDiag.get(0)     
         
         );
         
         if (value == 0) setLocaisAlomeracao(true);
        
        //   Esteve em locais com grande aglomeracao   -------------------
        
        // FIM DIAGNOSTICO   SIM = 0     NAO = 1



}
    
    public Integer calcularPontos(){
    Integer pontos = 0;
    
    if(Febre == true) pontos = pontos + 5;
    if(DorDeCabeca == true) pontos = pontos +1;
    if(SecrecaoNasalouEspirros == true) pontos = pontos + 1;
    if(DorIrritacaoGarganta == true) pontos = pontos + 1;
    if(TosseSeca == true) pontos = pontos + 3;
    if(DificuldadeResp == true) pontos = pontos + 10;
    if(DoresCOrpo == true) pontos = pontos + 1;
    if(Diarreia == true) pontos = pontos + 1;
    if(Contato14DiasCovid == true) pontos = pontos + 10;
    if(LocaisAlomeracao == true) pontos = pontos + 3;
        
    return pontos;   
    }
    
    
}
