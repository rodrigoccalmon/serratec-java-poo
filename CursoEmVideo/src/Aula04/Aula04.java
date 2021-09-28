package Aula04;

public class Aula04 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
		//c1.setModelo("Bic"); //usei o método acessor
		//c1.modelo = "BIC"; //acessei diretamente o atrb.
		
		//c1.setPonta(0.5f);
		//c1.ponta = 0.5f; //tem acesso privado em caneta.
		
		c1.status();

	}

}
