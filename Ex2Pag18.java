package ExceptionAula;

public class Ex2Pag18 {
	public static void main(String[] args) {
		String fraseUm = null;
		String fraseDois = null;		

		try {
			fraseUm = fraseDois.toUpperCase(null);
			System.out.println(fraseUm.toUpperCase());
		} catch (Exception e) {
			System.out.println("Não foi possível transformar em uppercase. ");
			System.out.println("Erro: " +e.getMessage());
		}
	}	
}
