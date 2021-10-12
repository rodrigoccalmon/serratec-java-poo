package TrabalhoFinalPOO;

public class ClassificacaoForaDoRange extends NumberFormatException {
	public ClassificacaoForaDoRange (String message) {
		super("Você deve classificar um filme de 0 até 5.");
	}
}
