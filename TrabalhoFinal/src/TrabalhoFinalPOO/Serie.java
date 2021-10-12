package TrabalhoFinalPOO;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Programa {
	List<Temporada> temporadas = new ArrayList<Temporada>();
	//public int quantidadeTemporadas;
	
	public Serie(int pontuacao, String nome, Categoria categoria) {
		super(pontuacao, nome, categoria);
		//this.quantidadeTemporadas = quantidadeTemporadas;
	}


	public List<Temporada> getTemporadas() {
		return temporadas;
	}


	public void setTemporadas(List<Temporada> temporadas) {
		this.temporadas = temporadas;
	}

	public void adicionarTemporada(Temporada temporada) {
		this.temporadas.add(temporada);
	}

	public void setTemporada(int numTemporada, int episodios) {
		this.temporadas.add(new Temporada(episodios, numTemporada));
	}

	public int getQuantidadeTemporadas() {
		return temporadas.size();
	}
	
	@Override
	public String toString() {
		return "Serie: " + nome + " " + "\nPontuação: " + pontuacao + " " + "\nCategoria: " + categoria + " " 
				+ "\n" + temporadas
				+ "\n" + "Total de Temporadas Cadastradas: " + this.getQuantidadeTemporadas();
	}

}
