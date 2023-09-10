
public class Trabalhador extends Pessoa {
	public int salario = 1300;
	
	Trabalhador(String nome) {
		super(nome);
	}
	
	public void falarSalario() {
		System.out.println(this.salario);
	}
}
