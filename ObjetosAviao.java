package aula_17_09_2026;

public class ObjetosAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		
		aviao1.setFabricante("Airbus");
		aviao1.setModelo("A320");
		aviao1.setPassageiros(220);
		aviao1.setVelocidade(875.0);
		
		
		System.out.println("Dados do Avião 1:");
		System.out.println("Fabricante: " + aviao1.getFabricante());
		System.out.println("Modelo: " + aviao1.getModelo());
		System.out.println("Pasageiros: " + aviao1.getPassageiros());
		System.out.println("Velocidade: " + aviao1.getVelocidade());
	}

}
