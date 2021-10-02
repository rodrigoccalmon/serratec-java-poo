package trabemclasse;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	public Veiculo(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.valorCobrado = valorCobrado;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;				
	}
	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto
				+ ", proprietario=" + proprietario + "]";
	}
	public double getValorCobrado() {
		return valorCobrado;
	}

	
}

