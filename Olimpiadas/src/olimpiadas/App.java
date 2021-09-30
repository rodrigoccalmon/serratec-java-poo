package olimpiadas;

public class App {

	public static void main(String[] args) {
		Pais pais1 = new Pais("Jamaica");
		Pais pais2 = new Pais("Holanda");
		
		Atleta atleta1 = new Atleta("Bob Marley", 60.5, "Fumaça em círculo", 1);
		Atleta atleta2 = new Atleta("Micheal Phelps", 80.5, "Dedo amarelo", 1);
		Atleta atleta3 = new Atleta("Away", 79.99, "420", 1);
		
		atleta1.status();
		atleta2.status();
		atleta3.status();
		
		//atleta1.verificaSituacao();
		//atleta2.verificaSituacao();
		//atleta3.verificaSituacao();

	}

}
