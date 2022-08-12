package Exercicios;

import java.util.Random;

public abstract class Lutador {
    private String nome;
    private int idade;
    private double peso;
    protected int id;

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getPeso(){
        return peso;
    }
    public int getId() {
        return this.id;
    }
    public String categoriaLutador() {
        return "Error";

    }
    public Lutador(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    public String toString(){
        return nome + " / " + idade + " / " + peso;
    }
    Random rand = new Random();
    public void sorteioLuta(Lutador [] x) {
        boolean sameInstance = false;
        int random = -1;
        do {
            Random rand = new Random();
            random = rand.nextInt(x.length);
            if(this instanceof pesoMeioPesado && x[random] instanceof pesoMeioPesado && this != x[random]) {
                sameInstance = true;
            }
            else if(this instanceof pesoMedio && x[random] instanceof pesoMedio && this != x[random]) {
                sameInstance = true;
            }
            else if(this instanceof pesoPena && x[random] instanceof pesoPena && this != x[random]) {
                sameInstance = true;
            }
            else if(this instanceof pesoPesado && x[random] instanceof pesoPesado && this != x[random]) {
                sameInstance = true;
            }
        }while(sameInstance != true);
        System.out.println(this.getLutador() + " vai lutar com " + x[random].getLutador()); //erro no .getLutador();
    }


    public void possiveisLutas(Lutador[] x){
        for (int i = 0; i < x.length; i++) {
            if(this instanceof pesoPena && x[i] instanceof pesoPena && this != x[i]){
                System.out.println(this + " e " + x[i] + " podem lutar");
            }
            if(this instanceof pesoMedio && x[i] instanceof pesoMedio && this != x[i]){
                System.out.println(this + " e " + x[i] + " podem lutar");
            }
            if(this instanceof pesoMeioPesado && x[i] instanceof pesoMeioPesado && this != x[i]){
                System.out.println(this + " e " + x[i] + " podem lutar");
            }
            if(this instanceof pesoPesado && x[i] instanceof pesoPesado && this != x[i]){
                System.out.println(this + " e " + x[i] + " podem lutar");
            }
        }

    }
}
