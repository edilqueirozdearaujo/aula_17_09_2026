package aula_17_09_2026;

public class Fornecedor {
	int id;
	String razaoSocial;
	String nomeFantasia;
	String cnpj;
	String endereco;
	String fone;
	String email;
	String inscricaoEstadual;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setRazaoSocial(String rs) {
		this.razaoSocial = rs;
	}
	public void setNomeFantasia(String nf) {
		this.nomeFantasia = nf;
	}
	public void setCnpj(String pj) {
		this.cnpj = pj;
	}
	public void setEndereco(String e) {
		this.endereco = e;
	}
	public void setFone(String f) {
		this.fone = f;
	}
	public void setEmail(String e) {
		this.email = e;
	}
	public void setInscricaoEstadual(String ie) {
		this.inscricaoEstadual = ie;
	}
	
	public int getId() {
		return id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getFone() {
		return fone;
	}
	public String getEmail() {
		return email;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	
	
	
}
