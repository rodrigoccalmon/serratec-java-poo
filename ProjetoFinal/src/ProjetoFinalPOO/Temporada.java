package ProjetoFinalPOO;

public class Temporada {
	private int quantidadeEpisodios;
	private int numeroTemporada;
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
	public Temporada(int quantidadeEpisodios, int numeroTemporada) {
		super();
		this.quantidadeEpisodios = quantidadeEpisodios;
		this.numeroTemporada = numeroTemporada;
	}
	
}
