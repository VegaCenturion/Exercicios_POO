package Pacote;

public class CaixaEletronico {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.depositar(100);
		double valor = 1000;
		c.sacar(valor);
		Conta n = null;
		System.out.println(n.getSaldo());
		//Utils.liberarDinheiro(valor);
		
		// impossivel realizar o casting
		//Conta a =(String) c;
		System.out.println(c.getSaldo());
	}
}
