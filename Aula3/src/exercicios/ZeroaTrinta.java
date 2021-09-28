package exercicios;

public class ZeroaTrinta {

	public static void main(String[] args) {
		int par = 0;
		int impar = 0;
		
		for(int i = 0; i < 30; i++) {
			if(i % 2 == 0) {
				par = par + 1;
			} else {
				impar = impar + 1;
			}
		}
		System.out.println("Total de par: " +par);
		System.out.println("Total de impar: " +impar);
	}

}
