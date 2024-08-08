package programacao_backend;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o código da primeira peça: ");
		int id1 = input.nextInt();
		
		System.out.print("Insira a quantidade de peças: ");
		int quant1 = input.nextInt();
		
		System.out.print("Insira o valor unitário de cada peça: ");
		double valor1 = input.nextDouble();
		
		System.out.print("Insira o código da segunda peça: ");
		int id2 = input.nextInt();
		
		System.out.print("Insira a quantidade de peças: ");
		int quant2 = input.nextInt();
		
		System.out.print("Insira o valor unitário de cada peça: ");
		double valor2 = input.nextDouble();
		
		double total1 = quant1 * valor1;
		double total2 = quant2 * valor2;
		double total = total1 + total2;	
		
		System.out.printf("A quantia a ser paga é de pela peça %d é R$%.2f.", id1, total1);
		System.out.printf("\nA quantia a ser paga é de pela peça %d é R$%.2f.", id2, total2);
		System.out.printf("\nA quantia total é R$%.2f.", total);
		
		input.close();
			
	}

}
