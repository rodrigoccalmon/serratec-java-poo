package Empregado;

public class Empregado {
	public Empregado(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	public String nome;
	public String sobrenome;
	public double salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void status() {
		System.out.println("=============================");
		System.out.println("Funcionario: " +this.nome);
		System.out.println("Salário: R$ " +this.salario);
		calculaImpostoRenda();
	}
	
	public void calculaImpostoRenda() {
		if (salario > 4664.68) {
			salario = salario - (27.5 * 100) / 1000;
			System.out.println("Salário com desconto: R$ " +this.salario);
		} else if (salario < 4664.68) {
			salario = salario - (22.5 * 100) / 1000;
			System.out.println("Salário com desconto: R$ " +this.salario);
		}
	}
	
}
