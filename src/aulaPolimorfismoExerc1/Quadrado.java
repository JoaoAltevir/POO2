package aulaPolimorfismoExerc1;

public class Quadrado extends Quadrilatero{
	private double lado;

	public Quadrado(String cor, double lado) {
		super(cor);
		this.lado = lado;
	}
	
	@Override
	public void calcularArea() {
		System.out.println("a area desse quadrado "+ super.cor +" é: " + lado * lado);
	}
	
	@Override
	public void calcularPerimetro() {
		System.out.println("O perímetro desse quadrado "+ super.cor + " é: " + lado * 4);
	}
	
	public void desenharQuadrilatero() {
		System.out.println("Desenhando quadrado");
	}
}
