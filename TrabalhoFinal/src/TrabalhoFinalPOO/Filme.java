package TrabalhoFinalPOO;

public class Filme extends Programa {
	private double duracao;

	public Filme(int pontuacao, String nome, Categoria categoria, double duracao) {
		super(pontuacao, nome, categoria);
		this.duracao = duracao;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Filme: " + nome + " " + "\nPontuação: " + pontuacao 
				+ "\nCategoria: " + categoria +  " " + "\nDuração: " + duracao + " horas\n";
	}

}
