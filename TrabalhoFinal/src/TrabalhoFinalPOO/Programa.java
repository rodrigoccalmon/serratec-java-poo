package TrabalhoFinalPOO;

public abstract class Programa implements Classificar {
	protected int pontuacao;
	protected String nome;
	protected Categoria categoria;
	

	public Programa(int pontuacao, String nome, Categoria categoria) {
		super();
		this.pontuacao = pontuacao;
		this.nome = nome;
		this.categoria = categoria;
	}
	
	public Programa () {

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
	public void classificar(int classificacao) {
				
	}

	@Override
	public String toString() {
		return "\nNome: " + nome  + " Pontuacao: " + pontuacao + " Categoria: " + categoria;
	}


}
