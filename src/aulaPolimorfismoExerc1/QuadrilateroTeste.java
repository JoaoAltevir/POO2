package aulaPolimorfismoExerc1;

public class QuadrilateroTeste {
	public static void main(String[] args) {
		
		int opcao = 1;
		
		Quadrilatero quadrilatero = null;
		
		switch(opcao) {
			case 1:
				quadrilatero = new Quadrado("vermelho", 2);
				break;
			case 2:
				quadrilatero = new Retangulo("verde", 15, 20);
				break;
			case 3:
				quadrilatero = new Losango("roxo", 5, 10);
				break;
			default:
				System.out.println("Opção inválida");
				break;
		}
		quadrilatero.calcularArea();
		
		quadrilatero.calcularPerimetro();
	}
}
