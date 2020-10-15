package beans;



public class Professor extends Funcionario implements interfaces.Funcionario{
    private int horasDeAula;

    public int getHorasDeAula() {
        return horasDeAula;
    }

    public void setHorasDeAula(int horasDeAula) {
        this.horasDeAula = horasDeAula;
    }
    
    
    public double getGastos() {
        return getSalario() + (getHorasDeAula() * 10);
    }
    
    public String getInfo(){
     String infos = "Nome: " + getNome() + "\n";
     infos += "Departamento: " + getDepto()+ "\n";
     infos += "Salário: " + getSalario()+ "\n";
     
     infos += "Horas de Aula: " + getHorasDeAula() + "\n";
     return infos;
    }
    
    public void recebeAumento(double aumento) {
        setSalario(aumento + 400);
    }

}