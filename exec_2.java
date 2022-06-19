import java.util.Scanner;
public class exec_2{
	public static void main(String[] args) {
		int a, b , c, d = 0;
		Scanner valor = new Scanner(System.in);
		System.out.println("digite os valores dos numeros: ");
		a = valor.nextInt();
		b = valor.nextInt();
		c = a + b;
		d = c / 2;
		System.out.println(" a soma é: " + c);
		System.out.println(" a media é: " + d);
		valor.close();
		
	}
}