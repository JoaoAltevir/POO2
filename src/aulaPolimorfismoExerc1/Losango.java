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
		System.out.println("O perimetro desse losango "+ super.cor +" é: " + (this.diagonalMaior * 2) + (this.diagonalMaior * 2));
	}
	
}
