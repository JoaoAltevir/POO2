package aulaHeranca;

public class Professor extends Pessoa{
	private Titulacao titulacao;
	private double salarioBase;

	
	public Professor(String nome, int idade, double salarioBase, Titulacao titulacao) {
		super(nome, idade);
		this.salarioBase = salarioBase;
		this.titulacao = titulacao;
	}
	
	public double calcularSalario() {
		return this.salarioBase + titulacao.getSalario();
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Salário base: " + this.salarioBase);
		System.out.println("Salário titulação: " + titulacao.getSalario());
		System.out.println("Salário total: " + this.calcularSalario());
	}
	
	
	
}
