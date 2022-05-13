package arrays;

import javax.swing.JOptionPane;

public class PaisesArray {

	public static void main(String[] args) {
		
		String[] paises = new String[4];
		
		int[] numeros = new int[10];
		
		for(int i = 0; i < 4; i++) {
			paises[i] = JOptionPane.showInputDialog("Informe um pais: ");
		}
		
		for (String lista: paises) {
			System.out.println(lista);
		
		}
		
		for(int i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		}
		
		for (Integer listanumeros: numeros) {
			System.out.println(listanumeros);
		}
		

	}

}
