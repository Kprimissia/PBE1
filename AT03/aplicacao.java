package prjPokemon;

public class aplicacao {

	public static void main(String[] args) {
		pokemon charmander = new pokemon();
		charmander.atributoNome = "charmander";
		charmander.atributoTipo = "Fogo";
		charmander.atributoNivel = 15;
		charmander.atributoHp = 100;
		
		pokemon squirtle = new pokemon();
		squirtle.atributoNome = "Squirtle";
		squirtle.atributoTipo = "Água";
		squirtle.atributoNivel = 14;
		squirtle.atributoHp = 79;
		
		pokemon pikachu = new pokemon();
		pikachu.atributoNome = "Pikachu";
		pikachu.atributoTipo = "Elétrico";
		pikachu.atributoNivel = 16;
		pikachu.atributoHp = 97;
	
		pokemon Pidgey = new pokemon();
		Pidgey.atributoNome = "Pidgey";
		Pidgey.atributoTipo = "Voador";
		Pidgey.atributoNivel = 10;
		Pidgey.atributoHp = 99;
		
		pokemon rattata = new pokemon();
		rattata.atributoNome = "rattata";
		rattata.atributoTipo = "Normal";
		rattata.atributoNivel = 17;
		rattata.atributoHp = 96;

		charmander.exibirinfo();
		charmander.metodoAtacar();
		charmander.metodoEvoluir();
		
		squirtle.exibirinfo();
     		squirtle.metodoAtacar();
		squirtle.metodoEvoluir();
		
		charmander.exibirinfo();
		charmander.metodoAtacar();
		charmander.metodoEvoluir();
		
		pikachu.exibirinfo();
		pikachu.metodoAtacar();
		pikachu.metodoEvoluir();
		
		rattata.exibirinfo();
		rattata.metodoAtacar();
		rattata.metodoEvoluir();
	}

}