package mercado.model;

public class PokemonFogo extends Pokemon{

	public PokemonFogo(int numero, String nomeTreinador, String nomePokemon, int tipo, int nivel, float preco) {
		super(numero, nomeTreinador, nomePokemon, tipo, nivel, preco);
		// TODO Auto-generated constructor stub
	}
	/*Pokemons do Tipo Fogo são mais dificeis de capturar do que Pokemons do tipo Terra e Planta,
	 * Isso se deve pq esse tipo de pokemon costuma viver em regiões muito quentes, proximas a vulcões. No entanto
	 * a sua captura é um pouco mais tranquila quando comparada a Pokemons do Tipo aquatico
	 * Por isso o calculo que determina se o preço é compativel com a loja, é ralacionado com o seu nível de dificuldade
	 * de captura e também com o seu nivel
	 
	 * Por isso, o preço vai ser determinado por essa formula:
	 * preco = nivel*10 + 1000 
	 * */
	public void DefinirPreco()
	{
		float precoIdeal = this.getNivel()*10 + 1000;
		if (this.getPreco() >=  precoIdeal)
		{
			System.out.println("PREÇO NÃO COMPÁTIVEL COM O MERCADO!\n\n Não há como comprarmos o seu Pokémon.");
			
		}
		else//caso a loja compre, o preço para revender o pokemon será determinado pelo preço ideal + 50 reais
		{
			
			System.out.println("TRATO FEITO!");
			System.out.println("\nPara mais detalhes, acesse o Histórico de Compras e Vendas");
			this.setPreco(precoIdeal+50);
		}

	
	}
	@Override
	public void visualizar() {
		super.visualizar();
		//Especificações do Pokemon Tipo Fogo
		System.out.println("Vantagem contra Pokémon tipo Planta ");
		System.out.println("Desvantagem contra Pokémon tipo Água ");
		System.out.println("Capacidade de iluminar lugares escuros ");
		
	}
}
