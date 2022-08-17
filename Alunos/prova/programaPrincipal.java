package prova;
import java.util.Scanner;
import java.util.ArrayList;

public class programaPrincipal {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> alunos = new ArrayList<String>();
		
		for(int i = 0; i < 101; i++) {
			System.out.println("Digite como pede (id#nome#nota#tipo): ");
			String s = sc.nextLine();
			alunos.add(s);
	
		}
			
		
			Utils a = new Utils();
			Aluno[] bct = new Aluno[alunos.size()];
			bct = a.retornaDados(alunos);
			
			for(int i = 0; i < alunos.size(); i++) {
				System.out.println(bct);
		}
		sc.close();
	}
}


