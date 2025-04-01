package aulaHeranca;

public enum Titulacao {
	MESTRE(2000.00), 
	DOUTOR(3000.00);
	
	private double salario;
	
	private Titulacao(double salario) {
		this.salario = salario;
		
	}

	public double getSalario() {
		return salario;
	}
}
