package Hera;

public class Clinica extends Plano{
	private String nome;
	private String cgc;
	public Clinica(String empresa, double valorPago, double valorIsso, String nome, String cgc) {
		super(empresa, valorPago, valorIsso);
		this.nome = nome;
		this.cgc = cgc;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCgc() {
		return cgc;
	}
	public void setCgc(String cgc) {
		this.cgc = cgc;
	}
	public void calcularPagamento() {
		double valorNovo = this.getValorPago();
		valorNovo *= 0.10;
		double outroValor = valorNovo + this.getValorPago();
		System.out.println("Valor novo " + outroValor);		
		
	}
}
