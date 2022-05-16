package collections;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListMain {

	public static void main(String[] args) {
		
		ArrayList<String> carros = new ArrayList<>();
		
		carros.add("KOMBI");
		carros.add("JAGUAR");
		carros.add("BMW");
		carros.add("MERCEDES");
		carros.add("FUSCA");
		carros.add("VECTRA");
		
		System.out.println(carros);
		
		carros.set(1, "ASTRA");
		System.out.println(carros);
		
		carros.remove("VECTRA");
		System.out.println(carros);
		
		carros.add(JOptionPane.showInputDialog("Informe a modelo do carro"));
		System.out.println(carros);
		/*
		carros.clear();
		System.out.println(carros);
		
		if (carros.isEmpty()) {
			System.out.println("Array está vazio");
		}
		**/
		
		System.out.println(carros.size());
		if (carros.contains("BMW")) {
			for(int i = 0; i < carros.size(); i++) {
				if ("BMW".equals(carros.get(i))) {
					carros.set(i, "FERRARI");
					break;
				} 
			}
		}
		
		System.out.println(carros);
		

	}

}
