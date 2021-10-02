package Mercado;

public class Eletrodomestico extends Produto {
	private int Voltagem;

	public Eletrodomestico(String nome, double valor, int voltagem) {
		super(nome, valor);
		this.Voltagem = voltagem;
	}

	public int getVoltagem() {
		return Voltagem;
	}

	public void setVoltagem(int voltagem) {
		Voltagem = voltagem;
	}

	@Override
	public double Vender(int quantidadeDeitens) {
		System.out.print("Valor total da compra: ");
		return this.getValor() * quantidadeDeitens;
		
	}

	@Override
	public String toString() {
		return "Nome do produto: " +this.getNome();
	}
	
}
