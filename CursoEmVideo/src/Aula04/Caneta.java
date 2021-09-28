package Aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String m, String c, float p) {//este é o met construtor, msm nome da classe. 
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.cor = "Azul";
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo (String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta; 
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	public void status() {
		System.out.println("SOBRE A CANETA: ");
		System.out.println("Modelo: " + this.modelo);
		//this.getModelo(); iria dar o msm resultado de cima.
		
		System.out.println("Ponta: " + this.ponta);
		//this.getPonta(); iria dar o mesmo resultado de cima. 
		System.out.println("Cor: "+ this.cor);
		System.out.println("Tampada: "+ this.tampada);
	}
}