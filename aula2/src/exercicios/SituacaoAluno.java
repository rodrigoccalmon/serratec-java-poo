package exercicios;

public class SituacaoAluno {

	public static void main(String[] args) {
		int nota1 = 10;
		int nota2 = 9;
		int media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
