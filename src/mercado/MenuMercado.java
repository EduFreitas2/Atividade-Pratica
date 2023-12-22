package mercado;

import java.util.Scanner;

public class MenuMercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando a classe
				Scanner read = new Scanner(System.in);
				int opcao;
				String nome, nomeProduto;
				float valor;
				
				
				System.out.println("                MERCADO 71                   ");
				System.out.println("                                             ");
				System.out.println("*********************************************");
				System.out.println("Identifique-se\n\n            	                             ");
				System.out.println("Informe o seu nome: ");
				nome = read.nextLine();
				
				System.out.println("\n\n\n*********************************************");
				System.out.println(nome + ", Bem vindo ao Mercado 71           	 ");
				System.out.println("                                             ");
				System.out.println("         1 - Visualizar Todos os Produtos    ");
				System.out.println("         2 - Consultar Produto (por número)  ");
				System.out.println("         3 - Cadastrar Produto               ");
				System.out.println("         4 - Consultar Saldo                 ");
				System.out.println("         5 - Depositar                       ");
				System.out.println("         6 - Comprar Produto                 ");
				System.out.println("         7 - Sair                            ");
				System.out.println("*********************************************");
				System.out.println("Entre com a opção desejada:                  ");
				do {
				opcao = read.nextInt();
				if (opcao > 7 || opcao < 1) {
					System.out.println("Opção Inválida!");
					System.out.println("Digite novamente uma opção: ");
					nome = read.nextLine();
				}
				}while(opcao > 7 || opcao < 1);
				
				switch(opcao)
				{
				case 1 ->{
					System.out.println("Lista de produtos: \n");
				}
				case 2->{
					System.out.println("Digite o Número do Produto: \n");
				}
				case 3 ->{
					System.out.println("Digite o Nome do Produto \n");
					System.out.println("Digite o valor: \n");
					
				}
				case 4 ->{
					System.out.println("Consultando saldo... \n");
				}
				case 5 ->{
					System.out.println("Digite o valor que deseja depositar: \n");
				}
				case 6 ->{
					System.out.println("Digite o número do produto: \n");
				}
				case 7 ->{
					System.out.println("**********FIM DO PROGRAMA***********: \n");
					Sobre();
					System.exit(0);
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

}
