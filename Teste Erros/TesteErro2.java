package Pacote;

public class TesteErro2 {
	public static void main(String[] args) throws Exception {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("fim do main");
	}
	public static void metodo1() {
		try {
		System.out.println("inicio do metodo1");
		}catch (ArrayIndexOutOfBoundsException e){
			metodo2();
		}
		System.out.println("fim do metodo1");
	}
	public static void metodo2() {
		System.out.println("inicio do metodo2");
		int Array [] = new int[10];	
				for(int i = 0; i <= 15; i++) {
				Array[i] = i;
				System.out.println(i);
				}
		System.out.println("fim do metodo2");
	}
}
