package trabemclasse;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public void lavarVeiculo() {
			valorCobrado = TipoServico.LAVAR.getValorServico();
	}

	@Override
	public void trocarOleo() {
			valorCobrado = TipoServico.OLEO.getValorServico();
	}		

	@Override
	public void revisao() {
			valorCobrado = TipoServico.REVISAO.getValorServico();
	}
	
}
