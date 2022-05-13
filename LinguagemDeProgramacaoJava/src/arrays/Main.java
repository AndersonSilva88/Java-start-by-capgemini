package arrays;

public class Main {

	public static void main(String[] args) {
		
		int [] numero = new int[4];
		
		numero[0] = 10;
		numero[1] = 20;
		numero[2] = 30;
		numero[3] = 40;
		/*
		for(int i = 0; i < numero.length; i++) {
			System.out.println("Posicoes "+i+ " array " + " = " + numero[i]);
		}
		**/
		for(int num: numero) {
			System.out.println(num);
		}

	}

}
