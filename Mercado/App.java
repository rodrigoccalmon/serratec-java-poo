package Mercado;

public class App {

	public static void main(String[] args) {
		BebidaAlcoolica cerveja = new BebidaAlcoolica("Brahma", 12.0, 4);
		BebidaAlcoolica vinho = new BebidaAlcoolica("Casilero del Diablo", 150, 18);
		Eletrodomestico tv = new Eletrodomestico("SmarTV 70", 2000.0, 110);
		Eletrodomestico geladeira = new Eletrodomestico("Brastemp", 2352, 110);
		Eletrodomestico radio = new Eletrodomestico("Radio Retrô", 837.59, 110);
		
		System.out.println(cerveja.toString());
		System.out.println(cerveja.Vender(5));
		System.out.println("========================");
		System.out.println(vinho.toString());
		System.out.println(vinho.Vender(3));
		System.out.println("========================");
		System.out.println(tv.toString());
		System.out.println(tv.Vender(9));
		System.out.println("========================");
		System.out.println(geladeira.toString());
		System.out.println(geladeira.Vender(3));
		System.out.println("========================");
		System.out.println(radio.toString());
		System.out.println(radio.Vender(1));
		
		
	}

}
