package HeranImpostoRenda;

public class PessoaJuridica extends ImpostoDeRenda {

	private String cnpj;
	private String inscricaoEstadual; 	

	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscricaoEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	@Override
	public void calculoIr()  {
		this.rendimentos = this.rendimentos - this.rendimentos * 0.15;
	}
	
	public String toString() {
		return String.format("Pessoa juridica - nome: %s , rendimentos: %.2f ",  nome, rendimentos);
	}
}
