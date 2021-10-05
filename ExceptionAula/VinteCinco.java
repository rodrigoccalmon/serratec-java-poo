package ExceptionAula;

public class VinteCinco {

	public static void main(String[] args) {
		int[] n1 = {1,2,3,4,5};
		int[] n2 = {3,0,2};
		
		for (int i = 0; i < n1.length; i++) {
			try {
				System.out.println("Número: " + n1[i] + " / " + n2[i] + " = " + (n1[i]/n2[i]));
			} catch (ArithmeticException e) {
				System.out.println("Erro na divisão.  ");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro ao acessar índice inexistente. ");
			}
			

	}
}

}