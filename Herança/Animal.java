package Java;
public class Animal {
	private String Nome;
	private int Idade;
	private double Peso;
	private String Cor;
	private double Tamanho;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public double getTamanho() {
		return Tamanho;
	}
	public void setTamanho(double tamanho) {
		Tamanho = tamanho;
	}
	 
	public void Correr() {
		System.out.println("Animal correndo");
	}
}
