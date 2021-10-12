package TrabalhoFinalPOO;

public class Temporada {
	private int quantidadeEpisodios;
	private int numeroTemporada;
	
	public Temporada(int quantidadeEpisodios, int numeroTemporada) {
		super();
		this.quantidadeEpisodios = quantidadeEpisodios;
		this.numeroTemporada = numeroTemporada;
	}

	public Temporada() {
		
	}
	
	public int getQuantidadeEpisodios() {
		return quantidadeEpisodios;
	}
	
	public void setQuantidadeEpisodios(int quantidadeEpisodios) {
		this.quantidadeEpisodios = quantidadeEpisodios;
	}

	public int getNumeroTemporada() {
		return numeroTemporada;
	}

	public void setNumeroTemporada(int numeroTemporada) {
		this.numeroTemporada = numeroTemporada;
	}
	
	@Override
	public String toString() {
		return "Número da Temporada: " + numeroTemporada + "\nQuantidade de Episódios: " + quantidadeEpisodios + " ";
	}
	
	
}
