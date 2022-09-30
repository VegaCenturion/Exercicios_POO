package exercicio;

import java.util.*;

public class Utils {
	public static boolean existe (Collection<CorpoCeleste> x, CorpoCeleste y){
		if(x.contains(y)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void ordena(List<CorpoCeleste> x) {
		for(int i = 0; i < x.size(); i++) {
			for(int j = 0; j < x.size(); j++) {
				double a = x.get(i).getDistancia();
				double b = x.get(j).getDistancia();
				if(a > b) {
					CorpoCeleste aux = x.get(j);
					x.set(j, x.get(i));
					x.set(i, aux);
				}
			
			}
		}
	}
	public static HashMap retornaDados(HashSet conjuntoCorpos) {
		Iterator <String> iter = conjuntoCorpos.iterator();
		HashMap organizado = new HashMap();
		while(iter.hasNext()) {
			String dados = iter.next();
			String [] split = dados.split("#");
			if(split[3].equals("P")) {
				Planeta x = new Planeta(split[0]);
				x.setNome(split[1]);
				x.setDistancia(Double.parseDouble(split[2]));
				x.setId(split[0]);
				organizado.put(x.getId(), x);
			}
			else if(split[3].equals("E")) {
				Estrela x = new Estrela(split[0]);
				x.setNome(split[1]);
				x.setDistancia(Double.parseDouble(split[2]));
				x.setId(split[0]);
				organizado.put(x.getId(), x);
			}
		}
		return organizado;
	}
}
