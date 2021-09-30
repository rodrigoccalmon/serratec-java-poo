package noveB;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa pessoa;
	
	public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa pessoa) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = pagAtual;
		this.aberto = aberto;
		this.pessoa = pessoa;
	}
	public void detalhes() {
		System.out.println("Título do livro: " +this.getTitulo());
		System.out.println("Autor do livro: "+ this.getAutor());
		System.out.println("Total de páginas do livro: " +this.getPagAtual());
		System.out.println("Leitor: " + this.getPessoa());
		System.out.println("Está aberto? " + this.getAberto());
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void folhear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void avançarPag() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		
	}
}
