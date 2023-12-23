package mercado;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import mercado.controller.PokemonController;
import mercado.model.PokemonAgua;
import mercado.model.PokemonFogo;
import mercado.model.PokemonNormal;
import mercado.model.PokemonPlanta;

import java.lang.Thread;


public class MenuMercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando a classe
				Scanner read = new Scanner(System.in);
				PokemonController pokemon = new PokemonController(); 
				pokemon.cadastrar(new PokemonAgua(pokemon.gerarId(), "Loja 71Pokemon", "Squirtle", 2 ,15 , 2000.0f));
				pokemon.cadastrar(new PokemonPlanta(pokemon.gerarId(),"Loja 71Pokemon", "Bulbasaur", 3 ,15 , 1400.0f));
				pokemon.cadastrar(new PokemonFogo(pokemon.gerarId(),"Loja 71Pokemon", "Charmander", 1 ,15 , 1800.0f));
				pokemon.cadastrar(new PokemonNormal(pokemon.gerarId(),"Loja 71Pokemon", "Ratata", 2 ,15 , 650.0f));
				
				int opcao, nivel, tipo, id;
				String nomePokemon, nomeTreinador, continua;
				float valor;
				
				
				
				System.out.println("                MERCADO POKEMON              ");
				System.out.println("                                             ");
				System.out.println("*********************************************");
				System.out.println("Identifique-se\n\n            	             ");
				System.out.println("Informe o seu nome: ");
				nomeTreinador = read.nextLine();
				while(true){
					opcao = 0;
				System.out.println("\n\n\n*********************************************");
				System.out.println(nomeTreinador + ", Bem vindo ao Mercado Pokemon");
				
				System.out.println("\nAqui nós vendemos e compramos Pokemóns     ");
				
				System.out.println("                                             ");
				System.out.println("         1 - Visualizar Pokémons da Loja     ");
				System.out.println("         2 - Ver funções e habilidade de algum Pokémon da Loja ");
				System.out.println("         3 - Vender seu Pokémon              ");
				System.out.println("         4 - Comprar Pokémon                 ");
				System.out.println("         5 - Histórico de Compras e Vendas    ");
				System.out.println("         6 - Sair                            ");
				System.out.println("*********************************************");
				System.out.println("Entre com a opção desejada:                  ");
				try {
					opcao = read.nextInt();
				}catch(InputMismatchException e) {
				read.nextLine();
				opcao = 0;
				}
				if (opcao == 6) {
					read.close();
					Sobre();
					System.exit(0);
				}
				//opcoes do Crud
				switch(opcao)
				{
				case 1 ->{
					//exibir todos os pokemons da loja
					System.out.println("Lista de Pokémons da loja: \n");
					pokemon.listarTodas();
					keyPress();
				}
				case 2->{
					//consultando pokemon
					System.out.println("Digite o nome do Pokémon: \n");
					read.skip("\\R?");
					nomePokemon = read.nextLine();
					pokemon.procurarPokemon(nomePokemon);
					keyPress();
				}
				case 3 ->{
					//vendendo pokemon
					System.out.println("Digite o nome do seu Pokémon\n");
					read.skip("\\R?");
					nomePokemon = read.nextLine();
						System.out.println("Digite  o nível do seu Pokemon? \n");
						nivel = read.nextInt();
						if(nivel < 1 ) {
							System.out.println("Valor inválido! Não existem Pokémons com nível negativo...");
							keyPress();
							break;
						}
						else {
							if (nivel >= 100) {
								System.out.println("Valor inválido! Não existem Pokémons com o nível superior a 99...");
							keyPress();
							break;
							}
						}
					System.out.println("Por quanto você deseja vende-lo? (R$) \n");
					valor = read.nextFloat();
					
					System.out.println("Informe o número do tipo do seu Pokémon: \n");
					
					System.out.println("1 - FOGO");
					System.out.println("2 - ÁGUA");
					System.out.println("3 - PLANTA");
					System.out.println("4 - NORMAL");
					do {
						System.out.println("Entre com a opção desejada");
						tipo = read.nextInt();
						if(tipo < 1 || tipo > 4 ) {
							System.out.println("Valor inválido!");
						}
					}while(tipo < 1 || tipo > 4);
					//novo switch para cadastrar os pokemons em uma das classes filhas PokemonFogo, PokemonAgua, PokemonPlanta, PokemonTerra
						switch (tipo)
						{
						case 1 ->{
							System.out.println("Pokemons do tipo Fogo vivem em locais quentes, onde é difícil o ser humano chegar...");
							System.out.println("\nO preço em que pagamos é de acordo com o nível e a raridade do tipo de seu Pokémon.");
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							PokemonFogo	c1 = new PokemonFogo(pokemon.gerarId(), nomeTreinador, nomePokemon, tipo, nivel, valor);
							System.out.println("Verificando se o preço do seu Pokemon é compatível com o mercado...");
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							boolean VerificarPreco = c1.DefinirPreco();
							if(VerificarPreco)
							{
								c1.setNomeTreinador("Loja 71Pokemon");
								System.out.println(c1.getPreco());
								pokemon.cadastrar(c1);
								
								
								pokemon.cadastrarVenda(new PokemonFogo(pokemon.gerarId(), nomeTreinador, nomePokemon, tipo, nivel, valor));
							}
							
							keyPress();
							}
							case 2 -> {
							PokemonAgua	c1 = new PokemonAgua(pokemon.gerarId(), nomeTreinador, nomePokemon, tipo, nivel, valor);
							System.out.println("Pokemons do tipo Agua vivem no Oceano, lugar que o ser humano explorou muito pouco...");
							System.out.println("\nO preço em que pagamos é de acordo com o nível e a raridade do tipo de seu Pokémon.\n");
							try {
								Thread.sleep(3000);
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
								System.out.println("Verificando se o preço do seu Pokemon é compatível com o mercado...");
								
								try {
									Thread.sleep(2000);
									
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								boolean VerificarPreco = c1.DefinirPreco();
								if(VerificarPreco)
								{
									c1.setNomeTreinador("Loja 71Pokemon");
									System.out.println(c1.getPreco());
									pokemon.cadastrar(c1);
									
									
									pokemon.cadastrarVenda(new PokemonAgua(pokemon.gerarId(), nomeTreinador, nomePokemon, tipo, nivel, valor));
									
								}
								
								keyPress();
								
							}	
							case 3 ->{
								System.out.println("Pokemons do tipo Planta vivem em Florestas e são tranquilos de encontramos. Por isso, não são raros ");
								System.out.println("\nO preço em que pagamos é de acordo com o nível e a raridade do tipo de seu Pokémon.\n");
								try {
									Thread.sleep(3000);
									
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("Verificando se o preço do seu Pokemon é compatível com o mercado...");
								PokemonPlanta c1 = new PokemonPlanta(pokemon.gerarId(), nomeTreinador, nomePokemon, tipo, nivel, valor);
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								boolean VerificarPreco = c1.DefinirPreco();
								if(VerificarPreco)
								{
									c1.setNomeTreinador("Loja 71Pokemon");
									System.out.println(c1.getPreco());
									pokemon.cadastrar(c1);
									
									
									pokemon.cadastrarVenda(new PokemonPlanta(pokemon.gerarId(), nomeTreinador, nomePokemon, tipo, nivel, valor));
								}
								
								keyPress();
							}
							case 4 ->{
								System.out.println("Pokemons do tipo Normal vivem em Regiões Urbanas, e estão bastante presentes no dia-a-dia do ser Humano");
								System.out.println("\nO preço em que pagamos é de acordo com o nível e a raridade do tipo de seu Pokémon.\n");
								try {
									Thread.sleep(3000);
									
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("Verificando se o preço do seu Pokemon é compatível com o mercado...");
							PokemonNormal c1 = new PokemonNormal(pokemon.gerarId(), nomeTreinador, nomePokemon, tipo, nivel, valor);
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							boolean VerificarPreco = c1.DefinirPreco();
							if(VerificarPreco)
							{
								c1.setNomeTreinador("Loja 71Pokemon");
								
								pokemon.cadastrar(c1);
								
								
								pokemon.cadastrarVenda(new PokemonNormal(pokemon.gerarId(), nomeTreinador, nomePokemon, tipo, nivel, valor));
							}
							
							keyPress();}
							
						}
						
						}
				
				case 4 ->{
					//consultando o Saldo
					System.out.println("\nDigite o nome do Pokemon que deseja comprar: ");
					read.skip("\\R?");
					nomePokemon = read.nextLine();
					System.out.println("\nDigite o nome ID do pokémon: ");
					id = read.nextInt();
					pokemon.deletar(nomePokemon, id, nomeTreinador);
					
					
					keyPress();
				}
				case 5 ->{
					//valor de deposito
					pokemon.listarHistoricoCompras();
					pokemon.listarHistoricoVendas();
					keyPress();
				}
				default ->{
					System.out.println("Opcao Inválida \n");
					keyPress();
				}
				
			}
			
		}
				
		
				
								
}
	
	public static void Sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Eduardo Freitas ");
		System.out.println("Eduardo Freitas - efnascimento.filho2@gmail.com");
		System.out.println("https://github.com/EduFreitas2");
		System.out.println("*********************************************************");
	}	
	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
