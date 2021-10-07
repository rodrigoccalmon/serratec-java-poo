package aula09;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	public Aluno(String nome, double nota1, double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double calcularMedia(double a, double b) throws IllegalArgumentException{
		a = this.nota1;
		b = this.nota2;
		double media = (a+b) / 2;
		if (b == 0 || a == 0) {
			throw new IllegalArgumentException("Argumento ilegal. número não pode ser 0.");
		}
		System.out.println("Média: "+media+ " do aluno: " +this.getNome());
		return media;	
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}
	
}
