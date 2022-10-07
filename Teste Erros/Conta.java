package Pacote;

public class Conta {

	private double saldo;
	
	public boolean sacar(double valor) {
		if (valor>saldo) {
			System.out.println("Impossivel né cria");
			return false;
		}else {
			System.out.println("AI SIM MEU CRIA");
			saldo-=valor;
			return true;
		}
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	public double getSaldo() {
		return saldo;
	}
}
