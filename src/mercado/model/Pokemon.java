package mercado.model;

public abstract class Pokemon {
	private String nomeTreinador;
	private String nomePokemon;
	private float preco;
	private int tipo;
	private int numero;
	private int nivel;

	public Pokemon(int numero, String nomeTreinador, String nomePokemon, int tipo,int nivel, float preco) {
		this.nomeTreinador = nomeTreinador;
		this.nomePokemon = nomePokemon;
		this.preco = preco;
		this.tipo = tipo;
		this.nivel = nivel;
		
		
	}

	public String getNomeTreinador() {
		return nomeTreinador;
	}

	public void setNomeTreinador(String nomeTreinador) {
		this.nomeTreinador = nomeTreinador;
	}

	public String getNomePokemon() {
		return nomePokemon;
	}

	public void setNomePokemon(String nomePokemon) {
		this.nomePokemon = nomePokemon;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	//novosmetodos
	public void visualizar() {

		
		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "FOGO";
		break;
		case 2:
			tipo = "AGUA";
		break;
		
		case 3: 
			tipo = "PLANTA";
		break;
		case 4:
			tipo = "NORMAL";
		break;
		}
		
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Pokémon:");
		System.out.println("***********************************************************");
		System.out.println("ID Pokémon " + this.numero);
		System.out.println("NOME DO POKÉMON: " + this.nomePokemon);
		System.out.println("DONO: " + this.nomeTreinador);
		System.out.println("TIPO DO POKÉMON: " + tipo);
		System.out.println("PREÇO: " + this.preco);
		
	}

}
