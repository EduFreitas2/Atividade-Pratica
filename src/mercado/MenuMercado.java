package mercado;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


import mercado.model.PokemonAgua;

import java.lang.Thread;


public class MenuMercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando a classe
				Scanner read = new Scanner(System.in);
				int opcao, nivel, tipo;
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
				System.out.println("         1 - Visualizar Pokémons             ");
				System.out.println("         2 - Consultar Pokémon               ");
				System.out.println("         3 - Vender seu Pokémon              ");
				System.out.println("         4 - Comprar Pokémon                 ");
				System.out.println("         5 - Histórico de Compras            ");
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
					keyPress();
				}
				case 2->{
					//consultando pokemon
					System.out.println("Digite o nome do Pokémon: \n");
				}
				case 3 ->{
					//vendendo pokemon
					System.out.println("Qual pokémon deseja vender \n");
					read.skip("\\R?");
					nomePokemon = read.nextLine();
					
					System.out.println("Qual é o nível dele? \n");
					nivel = read.nextInt();
					System.out.println("Por quanto deseja vender ele? (R$) \n");
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
							System.out.println("Verificando se o preço do seu Pokemon é compátivel com o mercado...");
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							keyPress();
							}
							case 2 -> {
								PokemonAgua pokemon1 = new PokemonAgua(1, nomeTreinador, nomePokemon, tipo, nivel, valor);
								
								System.out.println("Verificando se o preço do seu Pokemon é compátivel com o mercado...");
								try {
									Thread.sleep(2000);
									
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								pokemon1.DefinirPreco();
								pokemon1.visualizar();
								keyPress();
								
							}	
							case 3 ->{
								System.out.println("Verificando se o preço do seu Pokemon é compátivel com o mercado...");
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								keyPress();
							}
							case 4 ->{System.out.println("Verificando se o preço do seu Pokemon é compátivel com o mercado...");
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							keyPress();}
							
						}
						
						}
				
				case 4 ->{
					//consultando o Saldo
					System.out.println("Consultando saldo... \n");
					keyPress();
				}
				case 5 ->{
					//valor de deposito
					System.out.println("Digite o valor que deseja depositar: \n");
					keyPress();
				}
				case 6 ->{
					
					System.out.println("Digite o número do produto: \n");
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
