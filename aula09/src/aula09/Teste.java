package aula09;
import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Gabigol", 10, 10);
		Aluno a2 = new Aluno("BrunoHenrique", 10, 10);
		Aluno a3 = new Aluno("Arrascaeta", 8, 8);
		Aluno a4 = new Aluno("WilaRao", 9, 9);
		
		a1.calcularMedia(10,10);
		a2.calcularMedia(10, 10);
		a3.calcularMedia(8, 8);
		a4.calcularMedia(9,9);
		

		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		
		for (int i = 0; i < lista.size(); i++) {
			
			System.out.println(lista.get(i));
	}			

	}

}
