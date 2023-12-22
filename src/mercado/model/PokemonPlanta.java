package mercado.model;

public class PokemonPlanta extends Pokemon{

	public PokemonPlanta(int numero, String nomeTreinador, String nomePokemon, int tipo, int nivel, float preco) {
		super(numero, nomeTreinador, nomePokemon, tipo, nivel, preco);
		// TODO Auto-generated constructor stub
	}
	/*Pokemons do Tipo Plantas são mais comuns de aparecerem,
	 * Eles vivem normalmente em floresta e regiões com menor atividade humana
	 * No entanto, não é díficil encontrar um pokémon desse tipo andando pelas ruas da sua cidade
	 * Por isso, o preço vai ser determinado por essa formula:
	 * preco = nivel*5 + 1000 
	 * */
	public void DefinirPreco()
	{
		float precoIdeal = this.getNivel()*5 + 800;
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
		//Especificações do Pokemon Tipo Planta
		System.out.println("\nVANTAGEM CONTRA: Agua ");
		System.out.println("DESVANTAGEM CONTRA: Fogo ");
		System.out.println("HABILIDADE: Facilidade para cortar objetos");
		
	}
}
