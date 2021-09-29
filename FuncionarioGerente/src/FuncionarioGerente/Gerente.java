package FuncionarioGerente;

public class Gerente {
	public Gerente(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", salario=" + salario + "]";
	}
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
	private String nivel;
	
	public void status() {
		System.out.println("Assistente: " + this.nome);
		System.out.println("Salário: R$ " + this.salario);
		salario *= 1.01;
		System.out.println("Salário com reajuste: R$ "+this.salario);
		System.out.println("===============================");
	}
}
