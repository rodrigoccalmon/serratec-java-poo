package exmedico;

public class Medico {
	int crm;
	String nome;
	int salario;
	int valorConsulta;
	
	public Medico (int crm, String nome, int salario, int valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
	}
	
	public void pagamentoDinheiro() {
		System.out.println("Pagamento feito em dinheiro. ");
		this.salario = 300;
		System.out.println("Valor do salário R$ " + this.salario);
		System.out.println("===================================");
	}
	public void pagamentoPlano() {
		System.out.println("Pagamento feito pelo plano de saúde.");
		System.out.println("Receberá 70% do valor da consulta. ");
		this.salario = (int) (300 * 0.70);
		System.out.println("Valor do salário R$ " + this.salario);
		System.out.println("====================================");
		
	}
	public void status() {
		System.out.println("Nome do médico: " + this.nome);
		System.out.println("Salário do médico: " +this.salario);
		System.out.println("Valor da consulta do médico R$: "+this.valorConsulta);
	}
}
