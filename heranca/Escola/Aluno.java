public class Aluno extends Pessoa{
    private String Curso;
    private String Matricula;

    public String getCurso() {
        return Curso;
    }
    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getMatricula() {
        return Matricula;
    }
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void Baderna(){
        System.out.println("Badernando");
    }

}

