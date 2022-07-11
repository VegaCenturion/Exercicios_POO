public class Pessoa {
    private String Nome;
    private int Idade;
    private String Sexo;


    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void fazerAniv() {
        System.out.println("O aniversario de " + Nome + " foi de " + Idade + " anos");
    }
}
