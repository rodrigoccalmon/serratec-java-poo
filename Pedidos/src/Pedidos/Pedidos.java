package Pedidos;

public class Pedidos {
	public Pedidos(int numero, String dataPedido, double quantidade, double valor, double total) {
		super();
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
		this.total = total;
	}
	public void status() {
		System.out.println("===================================");
		System.out.println("Número do pedido: " +this.numero);
		System.out.println("Data do pedido: "+this.dataPedido);
		System.out.println("Quantidade: "+this.quantidade);
		System.out.println("Valor do pedido: "+this.valor);
		System.out.println("Total do pedido: "+this.total);
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	private int numero;
	private String dataPedido;
	private double quantidade;
	private double valor;
	private double total;
	
}
