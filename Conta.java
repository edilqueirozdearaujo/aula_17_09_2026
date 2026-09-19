package aula_17_09_2026;

public class Conta {
	int id;
	String tipo;
	double saldo;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setSaldo(double s) {
		this.saldo = s;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public int getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
