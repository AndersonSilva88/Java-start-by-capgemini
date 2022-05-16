package wrappers;

public class WrappersMain {

	public static void main(String[] args) {
		
		Boolean bolWrapper = true;
		System.out.println(bolWrapper.getClass());
		
		Character chWrapper = 'a';
		System.out.println(chWrapper.getClass());
		
		Byte byteWrapper = 1;
		System.out.println(byteWrapper.getClass());
		
		Short shoWrappe = 'B';
		System.out.println(shoWrappe.getClass());
		
		Integer intWrapper = 5215;
		System.out.println(intWrapper.getClass());
		
		Long longWrappe = 12589645896L;
		System.out.println(longWrappe.getClass());
		
		Float floatWrapper = 3.1459f;
		System.out.println(floatWrapper.getClass());
		
		Double doubWrapper = 3.1458965;
		System.out.println(doubWrapper.getClass());
		
		int numero = Integer.parseInt("1");
		numero = numero + 1;
		System.out.println(numero);

	}

}
