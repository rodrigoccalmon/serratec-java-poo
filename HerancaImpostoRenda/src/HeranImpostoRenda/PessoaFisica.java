package HeranImpostoRenda;

public class PessoaFisica extends ImpostoDeRenda {
	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public void calculoIr() {
		this.rendimentos = this.rendimentos - this.rendimentos * 0.12;
	}
		public String toString() {
			return String.format("Pessoa fisica - nome: %s , rendimentos: %.2f ",  nome, rendimentos);
		}
}
	
	
