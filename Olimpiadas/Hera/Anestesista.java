package Hera;

public class Anestesista extends Medico {
	private String tipoAnestesia;

	public Anestesista(String empresa, double valorPago, double valorIsso, String nome, int crm, String tipoAnestesia) {
		super(empresa, valorPago, valorIsso, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}
	public void calcularPagamento() {
		double valorNovo = this.getValorPago();
		valorNovo *= 0.10;
		double outroValor = valorNovo + this.getValorPago() + 1000;
		System.out.println("Valor novo " + outroValor);		
		
	}
	
}
