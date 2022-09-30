package exercicio;

public class Planeta extends CorpoCeleste{
	public Planeta(String id) {
		super(id);
	}
	public String toString() {
		return "[Planeta]"+getId()+"/"+getNome()+"/"+getDistancia();
	}
}
