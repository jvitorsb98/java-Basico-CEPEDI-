package tipoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class TipoDate {
	

	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dft = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dft2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		dft2.setTimeZone(TimeZone.getTimeZone("GMT"));
		 
		Date d1 = dft.parse("12/07/1998");
		Date d2 = new Date(System.currentTimeMillis());
		Date d3 = new Date(0);
		Date d4 = Date.from((Instant.parse(("2018-07-12T12:15:20Z"))));
		
		Calendar  c = Calendar.getInstance();
		c.setTime(d4);
//		c.add(Calendar.HOUR_OF_DAY, 4);
//		d4 = c.getTime();
//		System.out.println(d4);
//		System.out.println(dft2.format(d4));
		int minutes = c.get(Calendar.MINUTE);
		System.out.println(minutes);
	}
	
	
}
