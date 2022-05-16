package collections;

import java.util.LinkedList;

public class LinkedListCarros {

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<>();
		
		cars.add("VOLVO");
		cars.add("BMW");
		cars.add("FORD");
		
		System.out.println(cars);
		
		cars.addFirst("FERRARI");
		System.out.println(cars);
		
		cars.addLast("GM");
		System.out.println(cars);
		
		String carro;
		
		carro = cars.get(3);
		System.out.println(carro);
		
		cars.removeFirst();
		System.out.println(cars);
		
		System.out.println(cars.getFirst());
		System.out.println(cars); 
		
		System.out.println(cars.getLast());
		System.out.println(cars);
		
		cars.removeLast();
		System.out.println(cars);

	}

}
