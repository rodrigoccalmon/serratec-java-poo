package arrayExemplo;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func[] = new Funcionario[2];
		func[0] = new Funcionario();
		func[0].setNome("Rodrigo");
		func[0].setCargo("Desenvolvedor");
		func[0].setSalario(5999.99);
		
		func[1] = new Funcionario();
		func[1].setNome("Gisele");
		func[1].setCargo("UX/UI Design");
		func[1].setSalario(4.999);
		
		
		for (int i = 0; i < func.length; i++) {
			System.out.println(func[i].getNome() +" -- " +  func[i].getCargo());
			System.out.println(func[i].abonoSalario(100));
		}
		

	}

}
