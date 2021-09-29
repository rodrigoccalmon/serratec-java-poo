package ContaBanco;

public class App {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(11111);
		p1.setDono("Rodrigo");
		p1.abrirConta("CC");
		p1.depositar(1000);
		p1.sacar(200);
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Gi");
		p2.abrirConta("CP");
		p2.depositar(1000);
		p2.sacar(100);
		
		p1.estadoAtual();
		p2.estadoAtual();
		

	}

}
