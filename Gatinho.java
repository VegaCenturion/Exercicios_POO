public class Gatinho{ // Modelo de objeto

	public static void main(String[] args){
		gato gatoObj = new gato();
			gatoObj.nome = "Frajola";
			gatoObj.cor = "Cinza e Branco";
			gatoObj.idade = 10.4;
			gatoObj.vivo = true;
		
			gato c1 = new gato();
			c1.nome = "tom";
			c1.cor	= "branco";
			c1.idade = 5.3;
			c1.vivo = true;
			
			gato c2 = new gato();
			c2.nome = "garfield";
			c2.cor	= "laranja";
			c2.idade = 3.5;
			c2.vivo = false;
			
			
		gatoObj.miar();
	}
}
