package TrabalhoFinalPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerraFlixMain {
	static Biblioteca biblioteca = new Biblioteca();
	static Temporada temporada = new Temporada();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("SERRAFLIX - BEM VINDO(A)!");

		Filme f1 = new Filme(10, "Harry Potter e Ordem da Fênix ", Categoria.FANTASIA, 2.5);
		Filme f2 = new Filme(9, "Senhor dos Anéis e a Sociedade do Anel", Categoria.FANTASIA, 3.0);
		Filme f3 = new Filme(10, "Pineapple Express", Categoria.COMEDIA, 2.0);		
		List<Filme> filmes = new ArrayList<>();
		filmes.add(f1);
		filmes.add(f2);
		filmes.add(f3);

		biblioteca.adicionarFilme(f1);
		biblioteca.adicionarFilme(f2);
		biblioteca.adicionarFilme(f3);

		System.out.println("CATÁLAGO DE FILMES CADASTRADOS: ");
		System.out.println("==================================");		
		for (int i = 0; i < filmes.size(); i++) {
			System.out.println("Nome do filme: "+filmes.get(i).getNome());
			System.out.println("Nota: " +filmes.get(i).getPontuacao());
			System.out.println("Categoria: " +filmes.get(i).getCategoria());
			System.out.println("==================================");
		}

		Serie s1 = new Serie(10,"Freaks and Geeks",Categoria.COMEDIA);
		Serie s2 = new Serie(10,"Breaking Bad",Categoria.FANTASIA);
		Serie s3 = new Serie(10,"Terror",Categoria.TERROR);

		List<Serie> series = new ArrayList<>();
		series.add(s1);
		series.add(s2);
		series.add(s3);

		s1.setTemporada(10, 1);
		s2.setTemporada(15, 3);
		s3.setTemporada(12, 5);

		biblioteca.adicionarSerie(s1);
		biblioteca.adicionarSerie(s2);
		biblioteca.adicionarSerie(s3);

		System.out.println("CATÁLAGO DE SÉRIES CADASTRADAS: ");
		System.out.println("==================================");
		for (int y = 0; y < series.size(); y++) {
			System.out.println("Nome da série: "+series.get(y).getNome());
			System.out.println("Nota: " +series.get(y).getPontuacao());
			System.out.println("Categoria: " +series.get(y).getCategoria());
			System.out.println("==================================");
		}
		
		chamaMenuPrincipal();

	}	


		public static void chamaMenuPrincipal() {
			int op = 0;
			Scanner scan = new Scanner(System.in);
					
			do {
				System.out.println("=========== MENU PRINCIPAL =============");
				System.out.println("Digite o número relacionado a opção escolhida:");
				System.out.println("1 - Cadastrar");
				System.out.println("2 - Editar");
				System.out.println("3 - Remover");
				System.out.println("4 - Classificar");
				System.out.println("5 - Listar");
				System.out.println("0 - Sair do programa");
				System.out.println("=========================================");
				System.out.println("Digite a opção desejada....");
				

				switch (scan.nextInt()) {
				case 1:
					menuCadastrar();
					break;
				case 2:
					menuEditar();
					break;
				case 3:
					menuRemover();
					break;
				case 4:
					menuClassificar();
					break;
				case 5:
					menuListar();
					break;
				case 0:
					scan.close();
					break;
				default:
					System.out.println("Digite uma opção válida.");
					chamaMenuPrincipal();
					break;
				}
			} while (op != 0);
		}
			
	private static void menuCadastrar() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("O que você deseja Cadastrar?");
		System.out.println("(1) FILME  |   (2) SÉRIE");
		System.out.println("Se desejar voltar ao Menu Principal, digite 0.");
		int entradaScan = scanner.nextInt();
		int op = 0;
		
		do {
			switch (entradaScan){
			case 1:
				cadastrarNovoFilme();
				break;
			case 2:
				cadastrarNovaSerie();
				break;
			case 0:
				chamaMenuPrincipal();
				break;
			default:
				System.out.println("Digite uma opção válida.");
				menuCadastrar();
				break;
			}
		} while (op!= 0);
		
		scanner.close();
	}
	
	private static void cadastrarNovoFilme() {
		
		System.out.println(" == CADASTRO DE NOVO FILME ==");
		
		Scanner scanner = new Scanner(System.in);
		
		int entradaScan;
		int pontuacaoFilme;
		double duracaoFilme;
		String nomeFilme;
		Categoria categoriaFilme = null;
		
		System.out.println("Qual é o Nome do Filme?");
		System.out.println(">");
		nomeFilme = scanner.nextLine();

		System.out.println("Qual é a pontuação do Filme?");
		System.out.println(" Digite um valor entre 0 e 5");
		System.out.println(">");
		pontuacaoFilme = scanner.nextInt();
		
		try {
			if (pontuacaoFilme < 0 || pontuacaoFilme > 5) {
				System.out.println("Digite um valor válido.");	
			}
			} catch (ClassificacaoForaDoRange e) {
				e.getMessage();
				menuCadastrar();
			}
		
		/*if (pontuacaoFilme < 0 || pontuacaoFilme > 5) {
			System.out.println("Digite um valor válido.");
			menuCadastrar();
		}*/
		
		System.out.println("Qual é a Categoria do Filme?");
		System.out.println("1 - FANTASIA");
		System.out.println("2 - TERROR");
		System.out.println("3 - COMEDIA");
		entradaScan = scanner.nextInt();

		switch (entradaScan) {
		case 1:
			categoriaFilme = Categoria.FANTASIA;
			break;
		case 2:
			categoriaFilme = Categoria.TERROR;
			break;
		case 3:
			categoriaFilme = Categoria.COMEDIA;
			break;
		default:
			System.out.println("Digite uma opção válida.");
			menuCadastrar();
		}
		
		System.out.println("Qual é a duração do Filme?");
		System.out.println(">");
		duracaoFilme = scanner.nextDouble();
		
		Filme filme = new Filme(pontuacaoFilme, nomeFilme, categoriaFilme, duracaoFilme);
		
		biblioteca.adicionarFilme(filme);
		//biblioteca.programas.add(filme);
		
		System.out.println("Filme cadastrado com sucesso!");
		System.out.println(".........");
		System.out.println("Deseja cadastrar um Novo Filme?");
		System.out.println("1 - Sim");
		System.out.println("2 - Voltar ao Menu de Cadastro");
		System.out.println("0 - Voltar ao Menu Principal");
		entradaScan = scanner.nextInt();
		
		switch(entradaScan) {
		case 1:
			cadastrarNovoFilme();
			break;
		case 2:
			menuCadastrar();
			break;
		case 0:
			chamaMenuPrincipal();
			break;
		}
		
		scanner.close();
		
	}
		
	private static void cadastrarNovaSerie() {
		
		System.out.println(" == CADASTRO DE NOVA SÉRIE ==");
		
		Scanner scanner = new Scanner(System.in);
		
		int entradaScan;
		int pontuacaoSerie;
		int temporadaSerie;
		int episodioSerie;
		String nomeSerie;
		Categoria categoriaSerie = null;
		
		System.out.println("Qual é o Nome da série?");
		System.out.println(">");
		nomeSerie = scanner.nextLine();

		System.out.println("Qual é a pontuação da série?");
		System.out.println(">");
		pontuacaoSerie = scanner.nextInt();
		
		try {
			if (pontuacaoSerie < 0 || pontuacaoSerie > 10) {
				System.out.println("Digite um valor válido.");
			}
						
			} catch (ClassificacaoForaDoRange e) {
				e.getMessage();
				menuCadastrar(); 
			}
		
		/*if (pontuacaoSerie < 0 || pontuacaoSerie > 10) {
			System.out.println("Digite um valor válido.");
			menuCadastrar();
		}*/
		
		System.out.println("Qual é a Categoria da série?");
		System.out.println("1 - FANTASIA");
		System.out.println("2 - TERROR");
		System.out.println("3 - COMEDIA");
		entradaScan = scanner.nextInt();

		switch (entradaScan) {
		case 1:
			categoriaSerie = Categoria.FANTASIA;
			break;
		case 2:
			categoriaSerie = Categoria.TERROR;
			break;
		case 3:
			categoriaSerie = Categoria.COMEDIA;
			break;
		default:
			System.out.println("Digite uma opção válida.");
		}
		
		System.out.println("Qual o número da Temporada você deseja cadastrar?");
		System.out.println(">");
		temporadaSerie = scanner.nextInt();
	
		System.out.println("Quantos Episódios a Temporada informada tem?");
		System.out.println(">");
		episodioSerie = scanner.nextInt();

		Temporada temporada = new Temporada();
		temporada.setNumeroTemporada(temporadaSerie);
		temporada.setQuantidadeEpisodios(episodioSerie);

		Serie serie = new Serie(pontuacaoSerie, nomeSerie, categoriaSerie);
		serie.adicionarTemporada(temporada);

		biblioteca.adicionarSerie(serie);
		//biblioteca.programas.add(serie);
		
		System.out.println("Série cadastrada com sucesso!");
		System.out.println(".........");
		System.out.println("Deseja cadastrar uma Nova Série?");
		System.out.println("1 - Sim");
		System.out.println("2 - Voltar ao Menu de Cadastro");
		System.out.println("0 - Voltar ao Menu Principal");
		entradaScan = scanner.nextInt();
		
		switch(entradaScan) {
		case 1:
			cadastrarNovaSerie();
			break;
		case 2:
			menuCadastrar();
			break;
		case 0:
			chamaMenuPrincipal();
			break;
		}
		
		scanner.close();
		
	}
		
	private static void menuEditar() {
	
	}
	
	private static void mostraProgramas() {
		System.out.println("CATÁLAGO DE PROGRAMAS CADASTRADOS - FILMES e SÉRIES: ");
		System.out.println("==================================");
		
	    int i = 0;
	    for (Programa programa: biblioteca.programas) {
	    	System.out.println("CÓDIGO DO PROGRAMA: " + i + "\n" + programa + "\n");
	        i++;
	    }
	}
	
	private static void menuRemover() {
		
		System.out.println(" == MENU DE REMOÇÃO ==\n");
		System.out.printf("POR FAVOR, INFORME O CÓDIGO DO PROGRAMA QUE VOCÊ DESEJA REMOVER: \n");
		
		mostraProgramas();
		
	    Scanner scanner = new Scanner(System.in);
		
	    int codigoPrograma = scanner.nextInt();

	    try {
	      biblioteca.removerPrograma(codigoPrograma);
	      System.out.println("Programa Removido com Sucesso!\n\n");
	      mostraProgramas();
	    } catch (IndexOutOfBoundsException e) {
	        // exceÃ§Ã£o lanÃ§ada para indicar que um Ã­ndice (i)
	        // estÃ¡ fora do intervalo vÃ¡lido (de 0 atÃ© agenda.size()-1)
	        System.out.println("\nErro: Posição inválida: "+ e.getMessage());
	    }
	    
	    System.out.println("O que você deseja fazer agora?");
		System.out.println("0 - Voltar ao Menu Principal");
		System.out.println("4 - Remover outra opção");
		int entradaScan = scanner.nextInt();
		
		switch(entradaScan) {
		case 0:
			chamaMenuPrincipal();
			break;
		case 4:
			menuRemover();
			break;
		default:
			System.out.println("Digite uma opção válida.");
			menuRemover();
			break;
		}
		scanner.close();
	}
	
	private static void menuClassificar() {
	
		System.out.println("===== MENU DE CLASSIFICAÃ‡ÃƒO =====");
		System.out.println("Qual opção você deseja Classificar?");
		System.out.println("1 - Filmes");
		System.out.println("2 - Séries");
		scanner.nextInt();
		
		
		
	}
	
	private static void menuListar() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===== MENU DE OPÇÕES DE LISTAGEM =====");
		System.out.println("Qual opção você deseja Listar?");
		System.out.println("1 - Filmes");
		System.out.println("2 - Séries");
	
		int entradaScan = scanner.nextInt();
		
		switch(entradaScan) {
		case 1:
			menuListaFilme();
			break;
		case 2:
			menuListaSerie();
			break;
		default:
			System.out.println("Opção inválida.");
			menuListar();
			break;
		}
		
		scanner.close();
	}

	private static void menuListaFilme() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual Categoria de Filme você deseja visualizar?");
		System.out.println(" 1 - FANTASIA");
		System.out.println(" 2 - TERROR");
		System.out.println(" 3 - COMÉDIA");
		System.out.println("0 - Voltar ao Menu Principal");

		Categoria categoriaFilme = null;
		
		int entradaScan = scanner.nextInt();
		
		if (entradaScan == 1) {
			categoriaFilme = Categoria.FANTASIA;
			System.out.println("CATÁLADO DE FILMES DE FANTASIA CADASTRADOS: ");
			System.out.println("==================================");
			for (int i = 0; i < biblioteca.getProgramas().size() ; i++) {
				if (biblioteca.getProgramas().get(i) instanceof Filme) {
					Filme f = (Filme) biblioteca.getProgramas().get(i);
					if (f.categoria == categoriaFilme) {
						System.out.println(f.toString());
					}
				}
			}
			System.out.println("==================================");
		}

		if (entradaScan == 2) {
			categoriaFilme = Categoria.TERROR;
			System.out.println("CATÁLAGO DE FILMES DE TERROR CADASTRADOS: ");
			System.out.println("==================================");
			for (int i = 0; i < biblioteca.getProgramas().size() ; i++) {
				if (biblioteca.getProgramas().get(i) instanceof Filme) {
					Filme f = (Filme) biblioteca.getProgramas().get(i);
					if (f.categoria == categoriaFilme) {
						System.out.println(f.toString());
					}
				}
			}
			System.out.println("==================================");
		}
		
		if (entradaScan == 3) {
			categoriaFilme = Categoria.COMEDIA;
			System.out.println("CATÁLAGO DE FILMES DE COMÉDIA CADASTRADOS: ");
			System.out.println("==================================");
			for (int i = 0; i < biblioteca.getProgramas().size() ; i++) {
				if (biblioteca.getProgramas().get(i) instanceof Filme) {
					Filme f = (Filme) biblioteca.getProgramas().get(i);
					if (f.categoria == categoriaFilme) {
						System.out.println(f.toString());
					}
				}
			}
			System.out.println("==================================");
		}
		
		System.out.println("O que você deseja fazer agora?");
		System.out.println("0 - Voltar ao Menu Principal");
		System.out.println("4 - Listar outra opção");
		entradaScan = scanner.nextInt();
		
		switch(entradaScan) {
		case 0:
			chamaMenuPrincipal();
			break;
		case 4:
			menuListaFilme();
			break;
		default:
			System.out.println("Digite uma opção válida.");
			menuListaFilme();
			break;
		}
		scanner.close();
	}
	
	private static void menuListaSerie() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual Categoria de série você deseja visualizar?");
		System.out.println(" 1 - FANTASIA");
		System.out.println(" 2 - TERROR");
		System.out.println(" 3 - COMÉDIA");
		System.out.println(" 0 - Voltar ao Menu Principal");

		Categoria categoriaSerie = null;
		
		int entradaScan = scanner.nextInt();
		
		if (entradaScan == 1) {
			categoriaSerie = Categoria.FANTASIA;
			System.out.println("CATÁÇAGO DE SÉRIES DE FANTASIA CADASTRADAS: ");
			System.out.println("==================================");
			for (int i = 0; i < biblioteca.getProgramas().size() ; i++) {
				if (biblioteca.getProgramas().get(i) instanceof Serie) {
					Serie s = (Serie) biblioteca.getProgramas().get(i);
					if (s.categoria == categoriaSerie) {
						System.out.println(s.toString());
					}
				}
			}
			System.out.println("==================================");
		}

		if (entradaScan == 2) {
			categoriaSerie = Categoria.TERROR;
			System.out.println("CATÁLAGO DE SÉRIES DE TERROR CADASTRADAS: ");
			System.out.println("==================================");
			for (int i = 0; i < biblioteca.getProgramas().size() ; i++) {
				if (biblioteca.getProgramas().get(i) instanceof Serie) {
					Serie s = (Serie) biblioteca.getProgramas().get(i);
					if (s.categoria == categoriaSerie) {
						System.out.println(s.toString());
					}
				}
			}
			System.out.println("==================================");
		}
		
		if (entradaScan == 3) {
			categoriaSerie = Categoria.COMEDIA;
			System.out.println("CATÁLAGO DE SÉRIES DE COMÉDIA CADASTRADAS: ");
			System.out.println("==================================");
			for (int i = 0; i < biblioteca.getProgramas().size() ; i++) {
				if (biblioteca.getProgramas().get(i) instanceof Serie) {
					Serie s = (Serie) biblioteca.getProgramas().get(i);
					if (s.categoria == categoriaSerie) {
						System.out.println(s.toString());
					}
				}
			}
			System.out.println("==================================");
		}
		
		System.out.println("O que você deseja fazer agora?");
		System.out.println("0 - Voltar ao Menu Principal");
		System.out.println("4 - Listar outra opção");
		entradaScan = scanner.nextInt();
		
		switch(entradaScan) {
		case 0:
			chamaMenuPrincipal();
			break;
		case 4:
			menuListaSerie();
			break;
		default:
			System.out.println("Digite uma opção válida.");
			menuListaSerie();
			break;
		}
		
		scanner.close();
	}

}

	


	


