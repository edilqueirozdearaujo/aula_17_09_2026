package aula_17_09_2026;

public class Cliente {
	int id;
	String nome;
	String telefone;
	String cpf;
	String rg;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String tel) {
		this.telefone = tel;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
}
