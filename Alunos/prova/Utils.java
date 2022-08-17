package prova;

import java.util.ArrayList;

public class Utils {
	
	
	public static boolean existe(ArrayList<String> x, Aluno y) {
			if(x.contains(y)){
				return true;
			} else {
				return false;
		}
	}
	
	public Aluno[] retornaDados(ArrayList<String> listaAlunos) {
		Aluno alunos[] = new Aluno[listaAlunos.size()];
		for(int i = 0; i < listaAlunos.size(); i++) {
		String [] y =((String) listaAlunos.get(i)).split("#");	
		if( y[3].equals("E")) {
			alunos[i] = new AlunoE(y[0], y[1], Double.parseDouble(y[2]));
		}else if( y[3].equals("R")){
			alunos[i] = new AlunoR(y[0], y[1], Double.parseDouble(y[2]));
		}else{
			System.out.println("ERRO GERAL!!!");
			}
		}
		return alunos;
	}
}
