import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		Leao x = new Leao();
		Scanner sc = new Scanner(System.in);
		x.setNome("Simba");
		System.out.println(x.getNome());
		x.Rugir();
		Leao x1 = new Leao();
		x1.setNome("Mufasa");
		x1.Rugir();
		Animal a = new Leao();
		Leao b = (Leao)a;
		b.Rugir();
		/* a variável Animal y aponta para um objeto do tipo Leao, porém a variável 
		e da classe Animal, por isso e impossivel usar o metódo Rugir em y.
		Podendo utilizar do metódo Correr pois Leao também possui
		o metodo Correr*/
		a.setNome("Scar");
		System.out.println(a.getNome());
		Leao u = new Leao();
		u.Rugir();
		u.setNome("Kiara");
		a.Correr();
		u.Correr();
		b.setNome("Kovu");
		Leao x3 = new Leao();
		System.out.println("entre com o nome do leão");
		x3.setNome(sc.nextLine());
		System.out.println(x3.getNome());
		x3.Rugir();
		System.out.println(b.getNome());
		Urso t = new Urso();
		t.Correr();
		x3.Correr();
		Animal [] cor = new Animal[4];
		cor[0] = new Leao();
		cor[1] = new Urso();
		cor[2] = new Tigre();
		cor[3] = new Leao();
		
		for (int i = 0; i < cor.length; i++) {
			cor[i].Correr();
			if(cor[i] instanceof Leao){
				b.Rugir();
			}
		}
	sc.close();
	}
}
