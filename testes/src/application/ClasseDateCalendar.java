package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClasseDateCalendar {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		System.out.println(date);
		System.out.println("Milisegunds desde 01/01/1970: " + date.getTime());
		System.out.println("--------------------");
		//System.out.println(date.getDate()); //depreciado - usar Calendar
		
		Calendar cal = Calendar.getInstance(); // singleton
		System.out.println(cal); // toString do Calendar
		// para pegar o ano de hoje
		int ano = cal.get(Calendar.YEAR);
		System.out.println(ano);
		
		// para pegar o mês de hoje
		int mes = cal.get(Calendar.MONTH);
		System.out.println(mes + 1);

		System.out.println("--------------------");
		cal.add(Calendar.YEAR, 16); // add 16 anos no ano atual
		System.out.println(cal.get(Calendar.YEAR));
		
		System.out.println("--------------------");
		cal.add(Calendar.YEAR, -16); // removendo 16 anos no ano atual
		System.out.println(cal.get(Calendar.YEAR));
		
		// Gregorian Calendar
		
		System.out.println("--------------------");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc); // toString do Gregorian Calendar
		
		printer(gc);
		
		// Simple Date Format
		
		System.out.println("--------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar cal2 = Calendar.getInstance();
		System.out.println(sdf.format(cal2.getTime())); // SimpleDateFormat pra formatar a data
		// qnd new, o intelisense mostra SDF aceita um padrão
		// sdf.format() aceita como parametro um objeto do tipo Date
		// cal2 chama o formato do tipo Calendar e depois o getTime, retorna o tipo Date
		
		// ou com a classe Date
		Date d = new Date();
		System.out.println(sdf.format(d)); // ->> .format transforma Date em String
		// podendo ser
		String x = sdf.format(d);
		System.out.println(x);
		
		// String pra Date
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "31/01/1980"; // --> .parse transforma String em Date
		Date d2 = sdf2.parse(minhaData);
		System.out.println("--------------------");
		System.out.println(d2);
		
		
	}
	
	private static void printer(Calendar cal) {
		int dia = cal.get(Calendar.DATE);
		int mes = cal.get(Calendar.MONTH) + 1;
		int ano = cal.get(Calendar.YEAR);
		int hora = cal.get(Calendar.HOUR);
		int minuto = cal.get(Calendar.MINUTE);
		int segundo = cal.get(Calendar.SECOND);
		
		System.out.printf("Calendário: %02d/%02d/%02d %02d:%02d:%02d", dia, mes, ano, hora, minuto, segundo);
		System.out.println();

	}

}
