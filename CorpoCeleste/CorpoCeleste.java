package exercicio;

public class CorpoCeleste {
	private String id;
	private String nome;
	private double distancia;
	
	public CorpoCeleste(String id) {
		this.id = id;
	}
	public String toString() {
		return getId()+"/"+getNome()+"/"+getDistancia();
	}
	public boolean equals(Object o) {
		if(o instanceof CorpoCeleste) {
			CorpoCeleste j = (CorpoCeleste) o;
			if((j.getId()).equals(this.getId())) {
				return true;
			}
		}
		return false;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
}
