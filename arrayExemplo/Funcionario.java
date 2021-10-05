package arrayExemplo;

public class Funcionario {
	public String nome;
	public String cargo;
	public double salario;
	

public double abonoSalario (double abono) {
	return this.salario += abono;
	}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}
}

