package forEach;

public class Main {

	public static void main(String[] args) {
		
		int [] vetorNumeros = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Vetor sem for each");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Nr: " + vetorNumeros[i]);
		}
		
		System.out.println();
		System.out.println("Vetor com For each");
		for (int lista : vetorNumeros) {
			System.out.println("Nr: " + lista );
		}

	}

}
