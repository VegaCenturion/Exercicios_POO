package exercicio;

public class Estrela extends CorpoCeleste {
	public Estrela(String id) {
		super(id);
	}
	public String toString() {
		return "[Estrela]"+getId()+"/"+getNome()+"/"+getDistancia();
	}
}
