package trabemclasse;

import java.time.LocalDate;

public class TesteOficina {
	

	public static void main(String[] args) {
		Proprietario p1 = new Proprietario("Rodrigo");
		Veiculo v1 = new Carro("AUDI", 10, LocalDate.of(2021, 10, 10), p1, "teste");
		
		v1.trocarOleo();
		v1.revisao();
		
		System.out.println("Proprietário: "+ p1.getNome());
		System.out.println("Veículo: " +v1.toString());
	}

}
