package ex01imovel;

public class MainImovel {


public static void main(String[] args) {
	Imovel primeiroImovel = new Imovel();
	primeiroImovel.codImovel = 1;
	primeiroImovel.bairroImovel = "Centro";
	primeiroImovel.tipoImovel = "Apartamento";
	primeiroImovel.valorImovel = 25000; 
	System.out.println("===================================================");
	System.out.println("Código do imóvel: " + primeiroImovel.codImovel);
	System.out.println("Bairro do imóvel: " + primeiroImovel.bairroImovel);
	System.out.println("Tipo do imóvel: " + primeiroImovel.tipoImovel);
	System.out.println("Valor do imóvel sem reajuste: " +primeiroImovel.valorImovel);
	primeiroImovel.calcReajuste();
	System.out.println("Valor com reajuste: " +primeiroImovel.valorImovel);
	System.out.println("===================================================");
	
	
	
	
	Imovel segundoImovel = new Imovel();
	segundoImovel.codImovel = 2;
	segundoImovel.bairroImovel = "Quitandinha";
	segundoImovel.tipoImovel = "casa";
	segundoImovel.valorImovel = 98900;
	
	System.out.println("Código do imóvel: " + segundoImovel.codImovel);
	System.out.println("Bairro do imóvel: " + segundoImovel.bairroImovel);
	System.out.println("Tipo do imóvel: " + segundoImovel.tipoImovel);
	System.out.println("Valor do imóvel sem reajuste: " +segundoImovel.valorImovel);
	primeiroImovel.calcReajuste();
	System.out.println("Valor com reajuste: " +segundoImovel.valorImovel);
	System.out.println("===================================================");
}


}