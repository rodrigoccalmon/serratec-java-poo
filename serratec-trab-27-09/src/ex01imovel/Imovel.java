package ex01imovel;

public class Imovel {
	int codImovel;
	String bairroImovel;
	String tipoImovel;
	int valorImovel;
	
	public void calcReajuste() {
		if (this.tipoImovel == "Casa") {
			this.valorImovel *= 1.05;
		} else { 
			this.valorImovel *= 1.08;
		}
	}
	
		
	}
