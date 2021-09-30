package Hera;

public class Medico extends Plano {
	protected String nome;
	private int crm;
	public Medico(String empresa, double valorPago, double valorIsso, String nome, int crm) {
		super(empresa, valorPago, valorIsso);
		this.nome = nome;
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public void calcularPagamento() {
		double valorNovo = this.getValorPago();
		valorNovo *= 0.10;
		double outroValor = valorNovo + this.getValorPago();
		System.out.println("Valor novo " + outroValor);		
		
	}
}
