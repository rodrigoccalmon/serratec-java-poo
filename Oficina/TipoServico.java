package trabemclasse;

public enum TipoServico {
	OLEO(100),
	LAVAR(50),
	REVISAO(200);
	private double valorServico;
	
	private TipoServico(double valorServico) {
		this.valorServico = valorServico;
	}
	public double getValorServico() {
		return valorServico;
	}
	
}
