public class Funcionario extends Pessoa{
    private String Setor;
    private boolean Trabalhando;

    public String getSetor() {
        return Setor;
    }
    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    public boolean isTrabalhando() {
        return Trabalhando;
    }
    public void setTrabalhando(boolean Trabalhando) {
        this.Trabalhando = Trabalhando;
    }
    public void Trabson(){
        if(Trabalhando == true){
            System.out.println("Trabalhando");
        }else{
            System.out.println("Não trabalhando");
        }
    }
    public void Trabalhar(){
        System.out.println("Trabalhando");
    }

}
