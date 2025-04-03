package aulaPolimorfismoExerc1;

public class Retangulo extends Quadrilatero{
	private double base;
	private double altura;
	
	
	public Retangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public void calcularArea() {
		System.out.println("A área desse retangulo "+ super.cor +"é: " + this.base * this.altura);
	}
	
	@Override
	public void calcularPerimetro() {
		System.out.println("O perimetro desse retangulo " + super.cor +" é: " + (this.base * 2) + (this.altura * 2));
	}
	
	public void desenharQuadrilatero() {
		System.out.println("Desenhando retangulo");
	}
	
	
	
}
