package Hera;

public class Plano {
	protected String empresa;
	protected double valorPago = 80;
	protected double valorIsso = 5;
	public Plano(String empresa, double valorPago, double valorIsso) {
		super();
		this.empresa = empresa;
		this.valorPago = valorPago;
		this.valorIsso = valorIsso;
	}
	public void calcularPagamento() {s
		double valorNovo = this.getValorPago();
		valorNovo *= 0.10;
		double outroValor = valorNovo + this.getValorPago();
		System.out.println("Valor novo " + outroValor);		
		
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
}
