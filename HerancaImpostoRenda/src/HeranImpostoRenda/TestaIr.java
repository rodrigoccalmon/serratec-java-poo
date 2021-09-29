package HeranImpostoRenda;

public class TestaIr {

	public static void main(String[] args) {
		PessoaFisica fisica = new PessoaFisica("Rodrigo", 10.00, "12345", "123");
		PessoaJuridica juridica = new PessoaJuridica("Gop", 12.00, "12345", "123");
		
		fisica.calculoIr();
		juridica.calculoIr();
		
		System.out.println(fisica);
		System.out.println(juridica);
		
	}

}
