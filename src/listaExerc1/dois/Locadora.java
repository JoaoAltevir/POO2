package listaExerc1.dois;

import java.util.List;
import java.util.ArrayList;

	
public class Locadora {
	private String nomeLocadora;
	private List<Cliente> listaClientes;
	
	public Locadora(String nomeLocadora) {
		super();
		
		this.nomeLocadora = nomeLocadora;
		this.listaClientes = new ArrayList<Cliente>();
	}
	
	
	public void adicionarCliente(String nome, String dataDeNascimento, String cpf, String telefone, Endereco endereco) {
		
		Cliente cliente = new Cliente(nome, dataDeNascimento, cpf, telefone, endereco);
		listaClientes.add(cliente);
		
		System.out.println("Cliente adicionado com sucesso!");
		
	}
	
	
	
	
	
	
}
