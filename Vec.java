import java.util.Scanner;
public class Vec {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int[] vec = new int[20];
		int[] cev = new int [20];
		int vec1 = 0;
		
		
		System.out.println("Entre com o proximo vetor: ");
		for (int i = 0; i < 20; i++) {
			vec[i] = sc.nextInt();
			}
		
		for (int i = vec.length - 1; i >= 0; i--) {
			cev[vec1] = vec[i];
			vec1 = vec1 + 1;
			}
		for (int i = 0; i < 20; i++) {
		System.out.println(cev[i]);
		}
		sc.close();
		
	
	}
}