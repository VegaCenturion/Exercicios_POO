import java.util.Scanner;
public class Corretora extends Imovel {
	public static void main (String[] args) {
		Imovel [] Imoveis = new Imovel [5];
		double Soma = 0.0;
		
	Scanner Iml = new Scanner(System.in);
	System.out.println("digite os valores dos Imoveis:  ");
	for(int i = 0; i < 5; i++) {
		Imoveis[i].setPreco(Iml.nextDouble());
	}
	for(int i = 0; i < 5; i++) {
		Soma += Imoveis[i].getPreco();
	}
	
	System.out.println(Soma); 
	
	Iml.close();
	
	}
}
