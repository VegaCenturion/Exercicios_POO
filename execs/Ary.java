
public class Ary {
	public static void main(String[] args) {
		
		int [] ary = new int[20]; 
		int saida = 0;

		
		for ( int i =  ary.length - 1 ; i >= 0 ; i-- ) {

		saida = saida + ary[i];

		}

		System.out.println ( saida );
	}
}
