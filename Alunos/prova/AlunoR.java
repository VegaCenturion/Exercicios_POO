package prova;

public class AlunoR extends Aluno {
	
	public AlunoR(String id, String nome, double nota) {
		super(id, nome, nota);
	}
	public String toString(String id, String nome, double nota) {
		return ("O id �: " + getId() + " | " + "Seu nome �: " + getNome() + " | " + "A nota foi: " + nota + " | " + "[Tipo Regular]") ;
		
	}
}
