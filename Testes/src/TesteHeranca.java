
public class TesteHeranca {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Luka");
				
		Pessoa trabalhador = new Trabalhador("Pedro");
		
		Trabalhador trabalhador2 = new Trabalhador("Armando");
				
		trabalhador.falarNome();
		//trabalhador.falarSalario();
		trabalhador2.falarSalario();
		
	}
	
}
