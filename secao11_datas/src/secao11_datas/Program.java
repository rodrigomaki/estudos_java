package secao11_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("05/01/2021");
		Date y2 = sdf2.parse("05/01/2021 19:04:43");
		
		Date x1 = new Date(); //instancia a data atual
		Date x2 = new Date(System.currentTimeMillis());
		
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println(sdf1.format(y2));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		
		Date z1 = Date.from(Instant.parse("2021-01-05T19:13:05Z"));
		
		System.out.println(sdf3.format(z1));
		
	}

}
