package mercado.model;

public class PokemonAgua extends Pokemon{



	public PokemonAgua(int numero, String nomeTreinador, String nomePokemon, int tipo, int nivel, float preco) {
		super(numero, nomeTreinador, nomePokemon, tipo, nivel, preco);
		// TODO Auto-generated constructor stub
	}

	/*Pokemons do Tipo Agua são mais dificeis de capturar do que Pokemons do tipo Terra e Planta,
	 * Isso se deve pq o ser humano explorou apenas 5% do mar inteiro, então há muita coisa para descobrir
	 * sobre esse tipo de pokemon
	 * Por isso o calculo que determina se o preço é compativel com a loja, é um pouco mais rígido 
	 * Além do tipo, o nivel do pokemon é algo que influência muito no seu preço
	 * Por isso, o preço vai ser determinado por essa formula:
	 * preco = nivel*15 + 1000 
	 * */
	public void DefinirPreco()
	{
		float precoIdeal = this.getNivel()*15 + 1000;
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
		//Especificações do Pokemon Tipo Agua
		System.out.println("\nVANTAGEM CONTRA: Fogo ");
		System.out.println("DESVANTAGEM CONTRA: Planta ");
		System.out.println("HABILIDADE: Nadar");
		
	}

}
