package prova;

public class AlunoE extends Aluno {

	public AlunoE(String id, String nome, double nota) {
		super(id, nome, nota);
	}
	public String toString(String id, String nome, double nota) {
		return ("O id �: " + getId() + " | " + "Seu nome �: " + getNome() + " | " + "A nota foi: " + nota + " | " + "[Tipo Especial]") ;
		
	}
}
