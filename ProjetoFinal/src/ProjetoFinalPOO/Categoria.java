package ProjetoFinalPOO;

public enum Categoria {
	FANTASIA,
	TERROR,
	COMEDIA;

private int opcao = 0;
void OpcoesMenu(int valorOpcao) {
	System.out.println("[1] - Fantasia ");
	System.out.println("[2] - Terror ");
	System.out.println("[3] - Comédia ");
	opcao = valorOpcao;
}
public int getValor() {
	return opcao;
}
}
