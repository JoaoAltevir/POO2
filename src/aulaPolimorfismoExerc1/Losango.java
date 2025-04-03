package aulaPolimorfismoExerc1;



public class Losango extends Quadrilatero{
	private double diagonalMenor;
	private double diagonalMaior;
	
	public Losango(String cor, double diagonalMenor, double diagonalMaior) {
		super(cor);
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}
	
	@Override
	public void calcularArea() {
		System.out.println("A área desse losango "+ super.cor +" é:" + this.diagonalMenor * this.diagonalMaior);
	}
	
	@Override
	public void calcularPerimetro() {
		System.out.println("O perimetro desse losango "+ super.cor +" é: " + Math.sqrt(Math.pow(this.diagonalMaior / 2, 2) + Math.pow(this.diagonalMenor / 2, 2)) * 4);
	}
	
	public void desenharQuadrilatero() {
		System.out.println("Desenhando Losango");
	}
	
}
