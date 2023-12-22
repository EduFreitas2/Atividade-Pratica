package mercado.repository;


import mercado.model.Pokemon;

public interface PokemonRepository {
	public void procurarPokemon(String nomePokemon);
	public void listarTodas();
	public void cadastrar(Pokemon conta);
	public void atualizar(Pokemon conta);
	public void deletar(String nomePokemon);
	//metodos
	public void listarHistoricoCompras();
	public void listarHistoricoVendas();
	
}
