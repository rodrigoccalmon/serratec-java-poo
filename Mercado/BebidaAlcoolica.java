package Mercado;

public class BebidaAlcoolica extends Produto {
	private int teorAlc;

	public BebidaAlcoolica(String nome, double valor, int teorAlc) {
		super(nome, valor);
		this.teorAlc = teorAlc;
	}

	public int getTeorAlc() {
		return teorAlc;
	}

	public void setTeorAlc(int teorAlc) {
		this.teorAlc = teorAlc;
	}

	@Override
	public double Vender(int quantidadeDeitens) {
		System.out.print("Valor total da compra: ");
		return this.getValor() * 5;
		
	}

	@Override
	public String toString() {
		return "Nome do produto: " + this.getNome();
	}

}
