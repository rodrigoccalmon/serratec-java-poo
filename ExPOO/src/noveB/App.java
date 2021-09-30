package noveB;

public class App {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Rodrigo", 30, "Masculino");
		Livro l1 = new Livro("Harry Potter", "JK", 399, 20, true, p1);
		l1.detalhes();
		

	}

}
