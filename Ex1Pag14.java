package ExceptionAula;

public class Ex1Pag14 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;
		int res = 0;
		try {
			res = n1/n2;
			System.out.println("Resultado da divisão: " + res);
		} catch (Exception e) {
			System.out.println("Não foi possível dividir. ");
			System.out.println("Erro: " + e.getMessage());
	}

 }
}
