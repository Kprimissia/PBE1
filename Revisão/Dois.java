package programacao_backend;

import java.util.Scanner;

public class Dois {

	public static void main(String[] args) {
		
		double pi = 3.14159;
		Scanner sc = new Scanner (System.in);
		System.out.println("Qual o raio do círculo? ");
		double raio = sc.nextDouble();
		
		
	System.out.printf("A área do círculo é: %.4f " , pi*raio*raio);
	
		
 sc.close();	
		
	}

}
