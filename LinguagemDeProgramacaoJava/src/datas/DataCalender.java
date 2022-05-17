package datas;

import java.util.Calendar;

public class DataCalender {

	public static void main(String[] args) {
		
		System.out.println("==> Recupera��o de data com a classe calender");
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Data e Hora autal: " + cal.getTime() + "\n");
		
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("Dia do m�s: " + cal.get(Calendar.DAY_OF_MONTH) + "\n");
		
		System.out.println("==> Alterando a data/hora com m�todo set");
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.DAY_OF_MONTH, 12);
		System.out.println("Data/Hora atual: " + cal.getTime());
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("Dia do M�s: " + cal.get(Calendar.DAY_OF_MONTH) + "\n");
		
		System.out.println("==>Recuperando a hora do dia ");
			Calendar cal1 = Calendar.getInstance();
			int hora = cal1.get(Calendar.HOUR_OF_DAY);
		System.out.println("Agora s�o: " + hora + "hrs");	
		if(hora > 6 && hora < 12) {
			System.out.println("bom dia");
		} else if (hora > 12 && hora < 18 ) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
	}
}
