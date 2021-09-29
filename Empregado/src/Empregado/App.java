package Empregado;

public class App {

	public static void main(String[] args) {
		Empregado e1 = new Empregado("Manoel", "Herculano", 13.999);
		Empregado e2 = new Empregado("José", "Maria", 2500);
		
		e1.status();
		e2.status();
		
		//e1.calculaImpostoRenda();
		//e2.calculaImpostoRenda();
	}

}
