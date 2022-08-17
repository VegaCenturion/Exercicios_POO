package prova;

public class Aluno {

	private String id;
	private String nome;
	private double nota;
	
	public Aluno(String id, String nome, double nota) {
		this.id = id;
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

	

	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public boolean equals(Object o) {
	    boolean existe = false;
	      if(o instanceof Aluno){
		      if (this.getId() == ((Aluno)o).getId()) {
		         existe = true;
		      }
	      return existe;
	   }  
	    return false;
	   }
	public String toString(String id, String nome, double nota) {
		return ("O id é: " + getId() + " | " + "Seu nome é: " + getNome() + " | " + "A nota foi: " + nota) ;
		
	}
}

