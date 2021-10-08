package ProjetoFinalPOO;

public class Biblioteca extends Programa {
	public Biblioteca(int pontuacao, String nome, Categoria categoria) {
		super(pontuacao, nome, categoria);
		
	}

	public Programa programa;
	

	public Programa getPrograma() {
		return programa;
	}
	
}