public class Planta {
    private String id;  // id da planta
    private String nome;    // nome da planta
    private double tamanho; // tamanho da planta

    public Planta(String id) {  // construtor
        this.id = id;
    }

    public double getTamanho() {    // retorna o tamanho da planta
        return tamanho;
    }
    public void setTamanho(double tamanho) {    // define o tamanho da planta
        this.tamanho = tamanho;
    }
    public String getId() { // retorna o id da planta
        return id;
    }
    public String getNome() {   // retorna o nome da planta
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString() {      // toString() is a method that returns a string representation of an object
        return this.id + "#" + nome + " # " + tamanho+"#";
    }
    public boolean equals(Object o) {   // equals() is a method that returns true if two objects are equal
        if (o instanceof Planta) {  // instanceof is a Java keyword that returns true if an object is an instance of a class
            Planta p = (Planta) o;  // casting is a Java keyword that converts an object from one type to another
            return this.id.equals(p.getId());   // equals() is a method that returns true if two objects are equal
        }
        return false;
    }
}
