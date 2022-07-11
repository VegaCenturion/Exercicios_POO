public class Professor extends Pessoa{
    private String Especialidade;
    private double Salario;

    public String getEspecialidade() {
        return Especialidade;
    }
    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

    public Double getSalario() {
        return Salario;
    }
    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }



    public void receberAumento(){
        double Aumento = (getSalario() * 0.5);
    }

    public void Ensino() {
        System.out.println("Ensinando");
    }

}



