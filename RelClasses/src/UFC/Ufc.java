package UFC;

public class Ufc {

	public static void main(String[] args) {
		Lutador L[] = new Lutador[6]; 
		
		L[0] = new Lutador("Rodrigo", "Brasil", 30, 1.86,
								119.20, 11, 2, 1);
		L[1] = new Lutador("Diego", "Brasil", 18, 1.75,
								68.90, 9, 2, 0);
		L[2] = new Lutador("Isinha", "Portugal", 20, 1.75,
								70.2, 9, 3, 1);
		L[3] = new Lutador("Gi", "Holanda", 32, 1.61,
								75.2, 18, 0, 0);
		L[4] = new Lutador("Nalla", "EUA", 23, 1.55,
								119.1, 0, 0, 0);
		L[5] = new Lutador("Manoel", "Itaipu", 65, 1.74,
								85.2, 3, 2, 1);
		
		Luta UFC01 = new Luta();
		UFC01.marcarLuta(L[0], L[4]);
		UFC01.Lutar();
	}

}
