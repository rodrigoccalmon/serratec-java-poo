package TrabalhoFinalPOO;

public class ClassificacaoSerieInvalida extends NumberFormatException {

	public ClassificacaoSerieInvalida (String message) {
		super("Você deve classificar um filme de 0 até 5.");
	}

}
