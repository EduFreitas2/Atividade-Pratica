package mercado.model;

public class PokemonNormal extends Pokemon{

	public PokemonNormal(int numero, String nomeTreinador, String nomePokemon, int tipo, int nivel, float preco) {
		super(numero, nomeTreinador, nomePokemon, tipo, nivel, preco);
		// TODO Auto-generated constructor stub
	}
	/*Pokemons do Tipo Normal são pokemons que já se adaptaram a atividade humana e costumam viver em áreas urbanas 
	 * Muitas pessoas costumam ter esse tipo de Pokemon como animais domésticos
	 * Por isso o seu preço no Mercado é menor quando comparado aos outros tipos 
	 * Apeans o nível é um fator determinante para o seu preço
	 * Por isso, o preço vai ser determinado por essa formula:
	 * preco = nivel*3 + 400 
	 * */
	public boolean DefinirPreco()
	{
		float precoIdeal = this.getNivel()*3 + 400;
		if (this.getPreco() >=  precoIdeal)
		{
			System.out.println("PREÇO NÃO COMPATÍVEL COM O MERCADO!\n\nNão há como comprarmos o seu Pokémon.");
			return false;
		}
		else//caso a loja compre, o preço para revender o pokemon será determinado pelo preço ideal + 50 reais
		{
			
			System.out.println("\nTRATO FEITO!");
			System.out.println("\nPara mais detalhes, acesse o Histórico de Compras e Vendas");
			this.setPreco(precoIdeal+50);
			return true;
		}
	}
	@Override
	public void visualizar() {
		super.visualizar();
		//Especificações do Pokemon Tipo NORMAL
		System.out.println("\nVANTAGEM CONTRA: Não há vantagens ");
		System.out.println("DESVANTAGEM CONTRA: Não há desvantagens ");
		System.out.println("HABILIDADE: Grande Velocidade");
		
	}
}
