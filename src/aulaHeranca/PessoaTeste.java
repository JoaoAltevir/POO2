package aulaHeranca;

public class PessoaTeste {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Jorgin", 12, "Uvaranas", "Ponta Grossa", "PR");
		
		Professor professor1 = new Professor("Lucas", 32, 3250.00, Titulacao.DOUTOR, endereco1);
		
		professor1.calcularSalario();
		
		professor1.imprimirDados();
		
		Aluno aluno1 = new Aluno("João", 18, endereco1);
		
		aluno1.imprimirDados();
		
		aluno1.realizarMatricula("ADS");
		
		aluno1.imprimirDados();
		
	}
}
