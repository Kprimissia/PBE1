package programacao_backend;

import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	System.out.print("Qual é seu número? ");
	int num = sc.nextInt();
	
	System.out.print("Qual é seu número de horas trabalhadas? ");
	int horas = sc.nextInt();
	
	System.out.print("Qual é o valor que você ganha por hora? ");
	int valor = sc.nextInt();
	
	System.out.println("Funcionário " + (num) + " tem " + (horas) + " horas trabalhadas, o valor de sua hora é R$" + (valor));
	
	sc.close();
		
		
		

	}

}
