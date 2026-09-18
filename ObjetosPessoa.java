package aula_17_09_2026;

public class ObjetosPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		
		//OBJETO 1
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("California, USA");
		pessoa1.setProfissao("Ator");
		pessoa1.setRg("99.333.333-x");
		pessoa1.setCpf("999.999.999-99");
		
		//OBJETO 2
		pessoa2.setNome("Messi");
		pessoa2.setIdade(50);
		pessoa2.setEndereco("Miami, USA");
		pessoa2.setProfissao("Jogador de Futebol");
		pessoa2.setRg("55.333.333-5");
		pessoa2.setCpf("111.999.999-99");
		
		//OBJETO 3
		pessoa3.setNome("Goku");
		pessoa3.setIdade(35);
		pessoa3.setEndereco("Kame House");
		pessoa3.setProfissao("Guerreiro");
		pessoa3.setRg("88.333.333-x");
		pessoa3.setCpf("999.555.999-99");
		
		System.out.println("---- OBJETO 1 ----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.getRg());
		System.out.println();

		System.out.println("---- OBJETO 2 ----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.getCpf());
		System.out.println(pessoa2.getRg());
		System.out.println();
		
		System.out.println("---- OBJETO 3 ----");
		System.out.println(pessoa3.getNome());
		System.out.println(pessoa3.getIdade());
		System.out.println(pessoa3.getEndereco());
		System.out.println(pessoa3.getProfissao());
		System.out.println(pessoa3.getCpf());
		System.out.println(pessoa3.getRg());
	}

}
