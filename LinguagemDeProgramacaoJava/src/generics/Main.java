package generics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aeronaves<Integer> air = new Aeronaves<>();
		
		System.out.println("Informe numero de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		for (int i = 0; i < nrAeronaves; i++) {
			Integer nrVoo = sc.nextInt();
			air.addVoo(nrVoo);
			}
		air.primeiroVoo();
		Integer x = (Integer) air.primeiroVoo();
		System.out.println("O primeiro a decolar é o voo : " + x);

	}

}
