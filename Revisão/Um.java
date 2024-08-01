package programacao_backend;

import java.util.Scanner;

public class Um {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);	
		
    
    System.out.print(" Qual o valor: ");
	int vone = sc.nextInt();
	
	System.out.print(" Qual o valor: ");
	int vtwo = sc.nextInt();
	
    System.out.println(" A soma é: " + (vone + vtwo));

	sc.close();
	  
	}

}
