package Pedidos;

public class App {

	public static void main(String[] args) {
		Pedidos p1 = new Pedidos(1, "29-09-2021", 2.0, 10.5, 20.10);
		p1.status();
		
		Pedidos p2 = new Pedidos(2, "29-09-2021", 3.0, 30.5, 60.10);
		p2.status();
		
		Pedidos p3 = new Pedidos(3, "29-09-2021", 4.0, 40.55, 60.99);
		p3.status();

	}

}
