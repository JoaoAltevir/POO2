package tratamentExcecoes;

import java.util.InputMismatchException;

public class CalculadoraRef {
	
	public void dividir(Integer numerador, Integer denominador) {
		
		try {
			
			int resultado = numerador / denominador;
			
			System.out.println("Resultado = " + resultado);
			
		} catch(ArithmeticException e) {
			System.out.println("Denominador não pode ser 0!");
		} catch(InputMismatchException e) {
			System.out.println("Apenas números inteiros!");
		}
	}

}
