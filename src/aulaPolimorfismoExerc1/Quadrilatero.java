package aulaPolimorfismoExerc1;

public abstract class Quadrilatero {
	protected String cor;
	
	public Quadrilatero(String cor) {
		super();
		this.cor = cor;
	}

	public abstract void calcularArea();
	
	public abstract void calcularPerimetro( );
	
	public abstract void desenharQuadrilatero();
}