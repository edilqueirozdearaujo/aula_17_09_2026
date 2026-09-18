package aula_17_09_2026;

public class ObjetosClientes {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setNome("John Silva");
		cliente1.setTelefone("15 99999-5577");
		cliente1.setRg("99.999.888-x");
		cliente1.setCpf("444.333.222-11");

		cliente2.setNome("Smith Tavares");
		cliente2.setTelefone("15 99999-3322");
		cliente2.setRg("11.333.888-x");
		cliente2.setCpf("686.486.386-32");
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getCpf());

		System.out.println("");
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getRg());
		System.out.println(cliente2.getCpf());
	}

}
