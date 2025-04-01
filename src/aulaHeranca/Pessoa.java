package aulaHeranca;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected Endereco endereco;
	
	
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("ENDEREÇO: ");
		System.out.println("Rua: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("UF: " + this.endereco.getUf());
		System.out.println("PROFISSÃO: ");
	}
}
