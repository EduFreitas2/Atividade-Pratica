package mercado.repository;


import mercado.model.Pokemon;

public interface PokemonRepository {
	public void procurarPokemon(String nomePokemon);
	public void listarTodas();
	public void cadastrar(Pokemon pokemon);
	public void cadastrarVenda(Pokemon pokemon);
	public void atualizar(Pokemon pokemon);
	public void deletar(String nomePokemon, int id, String nomeTreinador);
	//metodos
	public void listarHistoricoCompras();
	public void listarHistoricoVendas();
	
}
