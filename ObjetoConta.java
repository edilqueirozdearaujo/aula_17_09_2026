package aula_17_09_2026;

import java.util.Scanner;

public class ObjetoConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		Scanner ler = new Scanner(System.in);
		String resp;
		double valor;
		boolean continuar = true;
		
		conta.setId(223344);
		conta.setTipo("Conta Corrente");
		conta.setSaldo(100.00);
		
		while(continuar) {
			System.out.println("");
			System.out.println("-----------------------------");
			System.out.println("INFORME O QUE DESEJA FAZER. COMANDOS DISPONÍVEIS:");
			System.out.println("c = consultar saldo    d = depósito     s = saque    f = fechar e sair");
			System.out.print("> ");
			resp = ler.next();
			if(resp.equalsIgnoreCase("C") ) {
				System.out.println("-----------------------------");
				System.out.println("SALDO INICIAL DA CONTA:");
				System.out.println("ID: " + conta.getId());
				System.out.println("Tipo: " + conta.getTipo());
				System.out.println("Saldo: R$" + conta.getSaldo());				
			}else if(resp.equalsIgnoreCase("F") ) {
				System.out.println("OBRIGADO, VOLTE SEMPRE!");
				continuar = false;
			}else if(resp.equalsIgnoreCase("D") ) {
				System.out.print("Informe o valor para DEPOSITAR: ");
				valor = ler.nextDouble();
				conta.depositar(valor);
				System.out.println("-----------------------------");
				System.out.println("DEPÓSITO REALIZADO COM SUCESSO!");
				//System.out.println("Saldo: R$ " + conta.getSaldo());				
			}else if(resp.equalsIgnoreCase("S") ) {
				System.out.print("Informe o valor para SAQUE: ");
				valor = ler.nextDouble();
				conta.sacar(valor);
				System.out.println("-----------------------------");
				System.out.println("SAQUE REALIZADO COM SUCESSO!");
				//System.out.println("Saldo: R$ " + conta.getSaldo());				
			}
		}	
		ler.close();
	}

}
