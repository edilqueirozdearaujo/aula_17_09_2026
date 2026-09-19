package aula_17_09_2026;

public class Cadeira {
	String material;
	boolean comApoio;
	String tipo;
	String cor;
	
	public void setMaterial(String m) {
		this.material = m;
	}
	public void setApoio(Boolean a) {
		this.comApoio = a;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public void setCor(String c) {
		this.cor = c;
	}
	
	public String getMaterial() {
		return material;
	}
	public boolean getApoio() {
		return comApoio;
	}	
	public String getTipo() {
		return tipo;
	}	
	public String getCor() {
		return cor;
	}	
}
