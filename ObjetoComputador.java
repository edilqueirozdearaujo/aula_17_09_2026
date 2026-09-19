package aula_17_09_2026;

public class ObjetoComputador {

	public static void main(String[] args) {
		Computador pc = new Computador();
		
		pc.setTipo("Desktop");
		pc.setMarca("PC Legal");
		pc.setCpu("Intel Core i5 8th");
		pc.setRam(16);
		pc.setArmzTamanho(5120);
		pc.setArmzTipo("SSD");
		pc.setArmzTamanho(512);
		pc.setOs("Linux");
		
		System.out.println("Computador " +
			pc.getTipo() + " " + pc.getMarca() + 
			" processador " + pc.getCpu() + " " +
			pc.getRam() + "GB de RAM " + pc.getArmzTamanho() +
			"GB " + pc.getArmzTipo() + " sistema operacional " + pc.getOs()
		);
		
	}

}
