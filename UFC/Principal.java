package Exercicios;

import java.util.Scanner;

public class Principal{
        public static void main(String[] args) {
            int TAM = 10;
        Lutador [] x = new Lutador[TAM];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o nome do lutador: ");
            String nome = sc.nextLine();
            System.out.println("Digite a idade do lutador: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o peso do lutador: ");
            double peso = sc.nextDouble();
            sc.nextLine();

            if(peso <= 65 ){
            x[i] = new pesoPena(nome, idade, peso);
            } else if (peso <= 83.9){
            x[i] = new pesoMedio(nome, idade, peso);
            } else if (peso <= 93.0){
                    x[i] = new pesoMeioPesado(nome, idade, peso);
            } else if (peso <= 120.2){
                    x[i] = new pesoPesado(nome, idade, peso);
            }else {
                    System.out.println("Peso invalido");
            }

            System.out.println("Escolha um lutador de 0 a " + (TAM - 1) + ":");
            int id = sc.nextInt();
            x[id].getLutador();
            x[id].possiveisLutas(x);
            x[id].sorteioLuta(x);
        }

        sc.nextInt();
    }
}