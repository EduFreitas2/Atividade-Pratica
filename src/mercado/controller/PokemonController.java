package mercado.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import mercado.model.Pokemon;
import mercado.repository.PokemonRepository;

public class PokemonController implements PokemonRepository{
	private ArrayList<Pokemon> listaPokemon = new ArrayList<Pokemon>();
	private ArrayList<Pokemon> listaPokemonComprados = new ArrayList<Pokemon>();
	private ArrayList<Pokemon> listaPokemonVendidos = new ArrayList<Pokemon>();
	private int id = 0;
	
	@Override
	public void procurarPokemon(String nomePokemon) {
		// TODO Auto-generated method stub
		var pokemon = buscarNaCollection(nomePokemon);
		if (pokemon != null)
			pokemon.visualizar();
		else
			System.out.println("\nO pokémon não foi encontrado!");
	}

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		for (var pokemon: listaPokemon) {
			pokemon.visualizarTudo();
			
		}
		
	}

	@Override
	public void cadastrar(Pokemon pokemon) {
		// TODO Auto-generated method stub
		listaPokemon.add(pokemon);
		
		
	}

	@Override
	public void atualizar(Pokemon conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(String nomePokemon, int id, String nomeTreinador) {
		// TODO Auto-generated method stub
		int opcao;
		Scanner read = new Scanner(System.in);
			var pokemon = buscarNaCollection(nomePokemon); {
			if(pokemon != null)
			{//verificando se o nome e o id são referentes ao pokemon escolhido
				if(pokemon.getNumero() == id) {
					System.out.println("Pokemon Encontrado!\n");
					pokemon.visualizarTudo();
					System.out.println("Deseja realmente comprar?");
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					try {
					opcao = read.nextInt();
					}catch(InputMismatchException e) {
					read.nextLine();
					opcao = 0;
					}
					System.out.println("\nRealizando Operações...");
					if (opcao == 1) {
					pokemon.setNomeTreinador(nomeTreinador);
					listaPokemonComprados.add(pokemon);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("COMPRA REALIZADA COM SUCESSO!\n");
					System.out.println("Cuide bem do nosso amigo!\n");
					listaPokemon.remove(id-1);}
					else if(opcao == 2) 
					{
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("\nCOMPRA NÃO REALIZADA!\n");
					}  else {
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("\nOPÇÃO INVALIDA!");
					}
					
				}	
					
			}
			else {
				System.out.println("\nRealizando Operações...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				System.out.println("\nPokémon não encontrado!");
		}
		}
	}

	@Override
	public void listarHistoricoCompras() {
		// TODO Auto-generated method stub
		if(listaPokemonComprados.isEmpty())
		{
			System.out.println("\nHISTÓRICO DE COMPRAS:\n");
			System.out.println("Você ainda não comprou Pokémons!");
		}
		else {
			System.out.println("/nHISTÓRICO DE COMPRAS:\n");
		for (var pokemon: listaPokemonComprados) {
			
			pokemon.visualizarComprado();}
		}
		
	}

	@Override
	public void listarHistoricoVendas() {
		// TODO Auto-generated method stub
		if(listaPokemonVendidos.isEmpty())
		{
			System.out.println("\nHISTÓRICO DE VENDAS:\n");
			System.out.println("Você ainda não vendeu Pokémons!");
		}
		else {
			System.out.println("\n HISTÓRICO DE VENDAS:\n");
		for (var pokemon: listaPokemonVendidos) {
			
			pokemon.visualizarTudo();}
		}
	}
	@Override
	public void cadastrarVenda(Pokemon pokemon) {
		listaPokemonVendidos.add(pokemon);
		
	}
	public int gerarId() {
		
		return ++ id;
	}
	public Pokemon buscarNaCollection(String nomePokemon) {
		for (var pokemon : listaPokemon) {
			
			if(pokemon.getNomePokemon().equalsIgnoreCase(nomePokemon))
			{
				
				return pokemon;
			}	
		}
		return null;
	}
	

}
