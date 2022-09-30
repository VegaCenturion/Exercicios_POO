package exercicio;

import java.util.*;

public class SistemaPrincipal {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		HashSet arquivos = new HashSet();
		arquivos.add("D158#Jupiter#340#P");
		HashMap organizado = Utils.retornaDados(arquivos);
		Collection a = organizado.values();
		System.out.println("Digite o id desejado");
		String id = sc.next();
		CorpoCeleste request = (CorpoCeleste) organizado.get(id);
		if(Utils.existe(a, request)) {
			System.out.println(request);
		}
		else {
			System.out.println("O id " + id + " não existe.");
		}
	}
	
}
