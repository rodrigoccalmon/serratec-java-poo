package FuncionarioGerente;

public class Funcionario {
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	protected String nome;
	protected double salario;
	protected String turno;
	
	public void status() {
		System.out.println("Funcionário: " + this.nome);		
		System.out.println("Salário: R$ " + this.salario);
		salario = salario * 1.01;
		System.out.println("Salário com reajuste: R$ " +this.salario);
		System.out.println("===============================");
	}
	
}


