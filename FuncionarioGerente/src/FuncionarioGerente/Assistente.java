package FuncionarioGerente;

public class Assistente {

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
	private double Adicional;
	
	public void status() {
		System.out.println("Gerente: " + this.nome);
		System.out.println("Salário: R$ " + this.salario);
		salario += 200;
		System.out.println("Salário com reajuste: R$ "+this.salario);
		System.out.println("===============================");
	}
	
	
}
