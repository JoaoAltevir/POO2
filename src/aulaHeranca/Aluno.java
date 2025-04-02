package aulaHeranca;

public class Aluno extends Pessoa {
	private String curso;

	public Aluno(String nome, int idade, Endereco endereco) {
		super(nome, idade, endereco);
		
		this.curso = null;
	}
	
	
	public void realizarMatricula(String curso) {
		this.curso = curso;
		System.out.println("Aluno matriculado com sucesso!");
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		if(this.curso == null) {
			System.out.println("Aluno não matriculado!");
			System.out.println("=============================");
		}else {
			System.out.println("Aluno matriculado em " + this.curso);
			System.out.println("==============================");
		}
	}
	
	
}
