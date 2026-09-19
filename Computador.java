package aula_17_09_2026;

public class Computador {
	String tipo; //pc, notebook, all in one
	String marca;
	String cpu;
	int ram;
	String armzTipo;
	int armzTamanho;
	String os;
	
	public void setTipo(String tp) {
		this.tipo = tp;
	}
	public void setMarca(String m) {
		this.marca = m;
	}	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setArmzTipo(String a) {
		this.armzTipo = a;
	}
	public void setArmzTamanho(int t) {
		this.armzTamanho = t;
	}
	public void setOs(String os) {
		this.os = os;
	}

	public String getTipo() {
		return tipo;
	}
	public String getMarca() {
		return marca;
	}
	public String getCpu() {
		return cpu;
	}
	public int getRam() {
		return ram;
	}
	public String getArmzTipo() {
		return armzTipo;
	}
	public int getArmzTamanho() {
		return armzTamanho;
	}
	public String getOs() {
		return os;
	}
	

}
