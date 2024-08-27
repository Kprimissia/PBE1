package prjZoologico;

public class Aplicacao {

	public static void main(String[] args) {
		ClasseAnimal elefante = new ClasseAnimal();
		elefante.atributoNome = "Dumbo";
		elefante.atributoRaca = "Africano";
		elefante.atributoSexo = "Macho";
		elefante.atributoPeso = 170;
		
		ClasseAnimal girafa = new ClasseAnimal("Github", "Russa", "Femea", 50);
		
		SubClasseCarnivoros leao = new SubClasseCarnivoros();
		leao.atributoNome = "Leaodro";
		leao.atributoRaca = "Australeandro";
		leao.atributoSexo = "Macho";
		leao.atributoPeso = 123;
		
		leao.exibirInfo();
		leao.metodoCacar();
		
		elefante.exibirInfo();
		
		elefante.metodoComer();
		
		elefante.exibirInfo();
		
		girafa.exibirInfo();
		
		
		
	}	
	
}	