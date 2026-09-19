package aula_17_09_2026;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Testando classe Fornecedor()...");
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setId(01); 
		fornecedor.setRazaoSocial("Top Soluções LTDA"); 
		fornecedor.setNomeFantasia("Top Soluções Inteligentes"); 
		fornecedor.setCnpj("11.222.333/4444-55"); 
		fornecedor.setEndereco("Rua das Araucárias, Centro, Capão Bonito"); 
		fornecedor.setFone("15 98888-7766"); 
		fornecedor.setEmail("contato@topsolucoesti.com"); 
		fornecedor.setInscricaoEstadual("111.222.333.444"); 
		
		System.out.println("ID: " + fornecedor.getId()); 
		System.out.println("Razão Social: " + fornecedor.getRazaoSocial()); 
		System.out.println("Nome Fantasia: " + fornecedor.getNomeFantasia()); 
		System.out.println("CNPJ: " + fornecedor.getCnpj()); 
		System.out.println("Endereço: " + fornecedor.getEndereco()); 
		System.out.println("Fone: " + fornecedor.getFone()); 
		System.out.println("Email: " + fornecedor.getEmail()); 
		System.out.println("IE: " + fornecedor.getInscricaoEstadual()); 
		
		
		System.out.println("");
		System.out.println("Testando classe Usuario()...");
		Usuario user = new Usuario();
		user.setId(33);
		user.setNome("John Smith");
		user.setPassword(8086);
		user.setPermissao("admin");
		user.setUsuario("johnsmith");
		
		System.out.println(user.getId());
		System.out.println(user.getNome());
		System.out.println(user.getPassword());
		System.out.println(user.getPermissao());
		System.out.println(user.getUsuario());
	}

}
