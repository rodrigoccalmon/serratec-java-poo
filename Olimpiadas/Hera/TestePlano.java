package Hera;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Amil", 80.0, 5.0, "Clínica de saúde", "CGC?");
		Medico medico = new Medico("Amil", 80.0, 5.0, "Dr.Bob", 1234);
		Anestesista anestesista = new Anestesista("Amil", 80.0, 5.0, "Ed", 123, "Geral");
		
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		clinica.calcularPagamento();
		

	}

}
