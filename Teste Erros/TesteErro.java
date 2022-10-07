package Pacote;

public class TesteErro {
	public static void main(String[] args) throws Exception {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("fim do main");
	}
	public static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}
	public static void metodo2() {
		System.out.println("inicio do metodo2");
		int Array [] = new int[10];
			try {	
				for(int i = 0; i <= 15; i++) {
				Array[i] = i;
				System.out.println(i);
			}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("O erro é:" + e + " <-- Na linha:" );
			}
		System.out.println("fim do metodo2");
	}
}
