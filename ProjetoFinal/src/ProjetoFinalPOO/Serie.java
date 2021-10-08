package ProjetoFinalPOO;

public class Serie extends Programa {

	public Serie(int pontuacao, String nome, Categoria categoria) {
		super(pontuacao, nome, categoria);
				
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	private Temporada temporada;
	
	@Override
	public int classificar(int classificacao) {
		
		return this.pontuacao;
	}

	public Temporada getTemporada() {
		return temporada;
	}
	
	

}
