package tratamentExcecoes;

import java.util.Scanner;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		CalculadoraRef calculadora = new CalculadoraRef();
		
		
		System.out.println("Informe o numerador: ");
		int numerador = input.nextInt();
		
		System.out.println("Informe o denominador: ");
		int denominador = input.nextInt();
		
		calculadora.dividir(numerador, denominador);
		
		input.close();
		
	}
}
