package datas;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConversaoDatas {

	public static void main(String[] args) throws ParseException {
		
		Calendar  c = Calendar.getInstance();
		java.util.Date data = c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formarada: " + sdf.format(data));
		
		//converte objetos
		System.out.println("Data convertida: " + sdf.parse("02/08/1970"));
	}

}
