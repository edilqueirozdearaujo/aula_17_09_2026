package aula_17_09_2026;

public class Animal {
	String nome;
	String classe;
	String especie;
	String fase;
	
	public void setNome(String n) {
		this.nome = n;
	}
	public void setClasse(String c) {
		this.classe = c;
	}
	public void setEspecie(String e) {
		this.especie = e;
	}
	public void setFase(String f) {
		this.fase = f;
	}
	
	public String getNome() {
		return nome;
	}
	public String getClasse() {
		return classe;
	}	
	public String getEspecie() {
		return especie;
	}
	public String getFase() {
		return fase;
	}	
}
