package aula_17_09_2026;

public class ObjetosCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		
		carro1.setAno(1996);
		carro1.setCor("Branco");
		carro1.setMarca("Fiat");
		carro1.setModelo("Uno");
		carro1.setPlaca("ABC-1234");

		System.out.println(carro1.getAno());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getPlaca());
	}

}
