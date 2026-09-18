package aula_17_09_2026;
//esse exercício combina o conceito das aulas anteriores com estrutura de repetição.
public class ObjetosAnimais {

	public static void main(String[] args) {
		Animal animal[] = new Animal[9];
		for(int i = 0; i<9; i++) {
			animal[i] = new Animal();
		}		
		
		/*
		Declare o vetor e depois inicialize cada item do vetor.
		O loop acima economiza esse trabalho (imagina objetos isolados!):
		Animal animal0 = new Animal();
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		Animal animal4 = new Animal();
		Animal animal5 = new Animal();
		Animal animal6 = new Animal();
		Animal animal7 = new Animal();
		Animal animal8 = new Animal();
		*/

		animal[0].setNome("Vaca");
		animal[0].setClasse("Mamífero");
		animal[0].setEspecie("Bos taurus");
		animal[0].setFase("Adulto");
		
		animal[1].setNome("Bezerro");
		animal[1].setClasse("Mamífero");
		animal[1].setEspecie("Bos taurus");
		animal[1].setFase("Filhote");
		
		animal[2].setNome("Ovelha");
		animal[2].setClasse("Mamífero");
		animal[2].setEspecie("Ovis aries");
		animal[2].setFase("Filhote");
		
		animal[3].setNome("Cachorro");
		animal[3].setClasse("Mamífero");
		animal[3].setEspecie("Canis familiaris");
		animal[3].setFase("Filhote");
		
		animal[4].setNome("Coelho");
		animal[4].setClasse("Mamífero");
		animal[4].setEspecie("Oryctolagus cuniculus");
		animal[4].setFase("Filhote");
		
		animal[5].setNome("Coelho");
		animal[5].setClasse("Mamífero");
		animal[5].setEspecie("Oryctolagus cuniculus");
		animal[5].setFase("Adulto");
		
		animal[6].setNome("Coelho");
		animal[6].setClasse("Mamífero");
		animal[6].setEspecie("Oryctolagus cuniculus");
		animal[6].setFase("Filhote");

		animal[7].setNome("Pintinho");
		animal[7].setClasse("Ave");
		animal[7].setEspecie("Galus galus");
		animal[7].setFase("Filhote");
		
		animal[8].setNome("Galinha");
		animal[8].setClasse("Ave");
		animal[8].setEspecie("Galus galus");
		animal[8].setFase("Adulto");	
		
		for(int i = 0; i<9; i++) {
			System.out.println("===========================");
			System.out.println("Nome: " + animal[i].getNome());
			System.out.println("Classe: " + animal[i].getClasse());
			System.out.println("Espécie: " + animal[i].getEspecie());
			System.out.println("Fase: " + animal[i].getFase());
			System.out.println();
		}
	
	}

}
