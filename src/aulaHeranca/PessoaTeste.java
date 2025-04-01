package aulaHeranca;

public class PessoaTeste {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Jorgin", 12, "Uvaranas", "Ponta Grossa", "PR");
		
		Professor professor1 = new Professor("Lucas", 32, 3250.00, Titulacao.DOUTOR);
		
		professor1.calcularSalario();
		
		professor1.imprimirDados();
		
	}
}
