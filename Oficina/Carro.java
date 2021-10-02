package trabemclasse;

import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;
	public Carro(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.categoria = categoria;
	}
	public String getCategoria() {
		return categoria;
	}
	@Override
	public void lavarVeiculo() {
		valorCobrado = valorCobrado + TipoServico.LAVAR.getValorServico();
		
	}
	@Override
	public void trocarOleo() {
		if (dataConserto.getDayOfWeek().name().equals("SATURDAY")) {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorServico() - 50;
				
		} else {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorServico();
		}
		
	}
		
	@Override
	public void revisao() {
		if(dataConserto.getMonth().name().equals("AUGUST")) {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorServico() * 0.90;
		} else {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorServico();
		}
		
	}
	
}
