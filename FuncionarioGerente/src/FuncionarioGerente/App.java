package FuncionarioGerente;

public class App {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Rodrigo");
		f1.setSalario(19.999);
		f1.status();
		
		Gerente g1 = new Gerente("Carlos", 25000);		
		g1.status();
		
		Assistente a1 = new Assistente();
		a1.setNome("Junin Vigia");
		a1.setSalario(3500.00);
		a1.status();
		
		
		
		
		
	}

}
