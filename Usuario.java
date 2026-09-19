package aula_17_09_2026;

public class Usuario {
	int id;
	String nome;
	int password;
	String permissao;
	String usuario;
	
	public void setId(int i) {
		this.id = i;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public void setPassword(int pwd) {
		this.password = pwd;
	}
	public void setPermissao(String p) {
		this.permissao = p;
	}
	public void setUsuario(String u) {
		this.usuario = u;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public int getPassword() {
		return password;
	}
	public String getPermissao() {
		return permissao;
	}
	public String getUsuario() {
		return usuario;
	}	
}
