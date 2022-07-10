
// Junto com o exercicio no github de conta e cliente
public class ContaBancaria {
	 private double Saldo = 0.0;
	 private Data dataAbertura = new Data();
	 
	public String getSaldo() {
		String resultado = String.format("%.2f", Saldo);
		return "R$" + resultado;
	}
	public void setSaldo(double Saldo) {
		this.Saldo = Saldo %2f;
	}

	public int getDataAbertura() {
		int[] data = new int [3];
			data[0] = dataAbertura.getMês();
			data[1] = dataAbertura.getAno();
			data[2] = dataAbertura.getDia();
			return 0;
	}
	public String dataAb(){
		return + dataAbertura.getMês() + "/" + dataAbertura.getAno() + "/" + dataAbertura.getDia();
	}  

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public void depositar(double Saldo) {
		this.Saldo += Saldo;
	}
	
	public boolean Sacar(double Sacar) {
		if(Sacar> Saldo) {
			return false;
		} else {
			Saldo = Saldo - Sacar;
			return true;
		}
	}
}
