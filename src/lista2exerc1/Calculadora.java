package lista2exerc1;


public class Calculadora {
	
	
	public int somar(int numA, int numB) {
		return numA + numB;
	}
	
	public int subtrair(int numA, int numB){
		return numA - numB;
	}
	
	public double multiplicar(double numA, double numB) {
		return numA * numB;
	}
	
	public double dividir(double numA, double numB) {
		return numA / numB;
	}
	
	public double potenciacao(double numA, double potencia) {
		return Math.pow(numA, potencia);
	}
	
	public double raizQuadrada(double num) {
		return Math.sqrt(num);
	}
	
	public double inversoReal(double num) {
		return 1.0 / num;
	}
	
	
}
