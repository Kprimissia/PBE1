package prjAtividade02;

import java.util.Scanner;

public class AplicacaoContaBancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ContaBancaria conta01 = new ContaBancaria();
		
		System.out.println("Qual o número da conta? ");
		conta01.setNumeroConta(sc.nextInt());
		System.out.println("Qual o nome do titular? ");
		conta01.setNomeTitular(sc.nextLine());
		System.out.println("Qual o saldo da conta? ");
		conta01.setSaldo(sc.nextDouble());
		
		System.out.println("Quer depositar ou sacar o saldo? \n 1) Depositar \n 2) Sacar\n 3) Não desejo fazer nada");
		int opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.println("Quanto você deseja depositar? ");
			double deposito = sc.nextDouble();
			
			saldo += deposito;
		}
		else if(opcao == 2) {
			System.out.println("Quanto você deseja sacar? ");
			double saque = sc.nextDouble();
			
			saldo -= saque;
		}
		else if(opcao == 3) {
			System.out.println("Então terminamos por aqui.");
		}
		else {
			System.out.println("Valor Inválido");
		}
				
				
	}

}