package aulaPolimorfismoExerc1;

import java.util.ArrayList;
import java.util.List;

public class ObraArte {
	private String autor;
	private List<Quadrilatero> listaObras;
	
	public ObraArte(String autor) {
		super();
		this.autor = autor;
		this.listaObras = new ArrayList<Quadrilatero>();
	}
	
	public void desenhar(Quadrilatero quadrilatero) {
		
		listaObras.add(quadrilatero);
		
	}
	
	public void exibirObra() {
		
		for(Quadrilatero quadrilatero : listaObras) {
			quadrilatero.desenharQuadrilatero();
		}
	}
	
	
	
	
}
