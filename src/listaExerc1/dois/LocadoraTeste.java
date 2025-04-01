package listaExerc1.dois;

public class LocadoraTeste {
	public static void main(String[] args) {
		
		
		Locadora locadora1 = new Locadora("UTF Games");
		Endereco endereco1 = new Endereco("gilbertinho ruas", 15, "Uvaranas", "8401632", "Ponta Grossa", "PR");
		
		locadora1.adicionarCliente("Gilberto", "15/09/2000", "129998187900", "4298888-4444", endereco1);
		
		
		
	}
}
