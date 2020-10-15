package beans;

public class Gerente extends Funcionario implements interfaces.Funcionario{
    
    public void recebeAumento(double salario){
        double percentAumentoPlus = getSalario() * 0.15;
        setSalario(salario + percentAumentoPlus);
    }
    
    public double getGastos() {
        return getSalario();
    }
    
    public String getInfo(){
     String infos = "Nome: " + getNome() + "\n";
     infos += "Departamento: " + getDepto()+ "\n";
     infos += "Salário: " + getSalario()+ "\n";
     
     return infos;
    }
}
