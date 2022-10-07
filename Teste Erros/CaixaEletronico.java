package Pacote;

public class CaixaEletronico {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.depositar(100);
		double valor = 1000;
		c.sacar(valor);
		Conta n = null;
		/*Ele compila com o parametro null(nulo)
		 Porem existe o erro EM TEMPO DE EXECUCAO
		 (NullPointerException) não permitindo o
		 codigo a rodar*/
		System.out.println(n.getSaldo());
		// impossivel realizar o casting
		//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬↓▬▬▬▬▬▬▬▬▬▬▬▬▬▬
		//Conta a =(String) c;
		System.out.println(c.getSaldo());
	}
}
