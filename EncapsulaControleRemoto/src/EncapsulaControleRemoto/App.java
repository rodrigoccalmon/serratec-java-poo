package EncapsulaControleRemoto;

public class App {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.maisvolume();
		c.play();
		//c.abirMenu();
		c.menosVolume();
		c.abrirMenu();
		
		
	}

}
