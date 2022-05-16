package annotations;

public class Annotations {
	void visualizar() {
		System.out.println("Método Visualizar");
	}
	
	@Deprecated
	void exibir() {
		System.out.println("Mostrando que o metodo exibir é deprecated");
	}
	
}
