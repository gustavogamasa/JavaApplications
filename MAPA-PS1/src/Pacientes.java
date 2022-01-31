
import java.util.ArrayList;
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
public class Pacientes {

    public Pacientes() {
    }
    
    public String CPF = null;
    public String nome = null;
    public String sexo = null;
    public String idade = null;
    
    public static ArrayList<Pacientes> listaPacientes = new ArrayList<>();
    
    
    public void cadastrarPaciente(Pacientes p){
    listaPacientes.add(p);
    }
    
    public Integer contarPacientes(){
    return listaPacientes.size();
    }
    // -------- Métodos get and set

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    

    // -------- FIM Get and set
   
    public void coletarInformacoes(){
        
       
                
        setNome(JOptionPane.showInputDialog("Seu nome:"));
        setIdade(JOptionPane.showInputDialog("Sua idade:"));
      
        // ------ input sexo  
        String[] opcoesSexo = {"Escolha", "Masculino", "Faminino"};

        String getSexo = (String) JOptionPane.showInputDialog(        
        null,
        "Sexo:",
        null,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoesSexo,
        opcoesSexo[0]);
        
        setSexo(getSexo);
        cadastrarPaciente(this);
        //fim input sexo
        
       // setCPF(JOptionPane.showInputDialog("CPF:"));                
        // FIM COLETA
    }
    
    
    
}
