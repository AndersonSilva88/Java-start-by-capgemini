package annotations;

public class Annotations {
	void visualizar() {
		System.out.println("M�todo Visualizar");
	}
	
	@Deprecated
	void exibir() {
		System.out.println("Mostrando que o metodo exibir � deprecated");
	}
	
}
