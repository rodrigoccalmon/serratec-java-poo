package ProjetoFinalPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Filme f1 = new Filme(10, "Harry Potter e Ordem da Fênix", Categoria.FANTASIA);
		Filme f2 = new Filme(9, "Senhor dos Anéis e a Sociedade do Anel", Categoria.FANTASIA);
		Filme f3 = new Filme(10, "Pineapple Express", Categoria.COMEDIA);		
		List<Filme> filmes = new ArrayList<>();
		filmes.add(f1);
		filmes.add(f2);
		filmes.add(f3);
		
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
		
		System.out.println("CATÁLAGO DE SÉRIES CADASTRADAS: ");
		System.out.println("==================================");
		for (int y = 0; y < series.size(); y++) {
			System.out.println("Nome da série: "+series.get(y).getNome());
			System.out.println("Nota: " +series.get(y).getPontuacao());
			System.out.println("Categoria: " +series.get(y).getCategoria());
			System.out.println("==================================");
		}

	}	
}
	



	

