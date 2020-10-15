package projetoheranca2;

//import beans.Atendente;
import interfaces.Funcionario;
import beans.Gerente;
import beans.Professor;
import java.util.Scanner;

public class ProjetoHeranca2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scEntrada = new Scanner(System.in);
        
        
        System.out.println("Qual o seu cargo?");
        
        switch(scEntrada.nextLine().toUpperCase()){
            case "GER":
               Gerente gerente = new Gerente();
                gerente.setDepto("ACESSO");
                gerente.setSalario(3000);
                gerente.setNome("GErente");
                mostraDados(gerente);
                break;
                
 //           case "ATD":
 //               Atendente atendente = new Atendente();
 //               break;
                
            case "PROF":
                Professor prof = new Professor();
                prof.setNome("Prof");
                prof.setHorasDeAula(20);
	        prof.setDepto("ACESSO");
                prof.setSalario(3000);
                mostraDados(prof);
                break;
                
           	 default:
                break;
     	   }
    	    
	    }
	    
   	 public static void mostraDados(Funcionario func) {
     	   System.out.println(func.getInfo());
	    }
    
	}
