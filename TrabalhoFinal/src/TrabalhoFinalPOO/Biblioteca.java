package TrabalhoFinalPOO;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
List<Programa> programas = new ArrayList<Programa>();
	
	public Biblioteca() {
		
	}

	public Biblioteca(List<Programa> programas) {
		super();
		this.programas = programas;
	}

	public List<Programa> getProgramas() {
		return programas;
	}

	public void setProgramas(List<Programa> programas) {
		this.programas = programas;
	}

	public void adicionarFilme(Filme filme) {
		this.programas.add(filme);
	}
	
	public void adicionarSerie(Serie serie) {
		this.programas.add(serie);
	}

	public Programa removerPrograma(int cod) {
		return this.programas.remove(cod);
	}
	
	@Override
	public String toString() {
		return "Adicionado a Biblioteca: " + programas + "\n";
	}

	
}
