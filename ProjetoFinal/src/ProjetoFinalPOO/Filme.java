package ProjetoFinalPOO;

public class Filme extends Programa {
	private double duracao;
	public Filme(int pontuacao, String nome, Categoria categoria) {
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
	@Override
	public int classificar(int classificacao) {
		
		return this.pontuacao;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
}
