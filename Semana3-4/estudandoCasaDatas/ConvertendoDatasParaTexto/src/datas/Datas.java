package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(1998, 07, 12);
		LocalDateTime d2 = LocalDateTime.parse("2023-07-11T15:40:10"); 
		Instant d3 = Instant.parse("2023-07-11T15:40:15Z");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter dtf4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter dtf5 = DateTimeFormatter.ISO_INSTANT;

		
		LocalDate d4 = LocalDate.parse("12/07/1998",dtf);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4.format(dtf));
		System.out.println(dtf.format(d4));
		System.out.println(d2.format(dtf2));
		System.out.println(dtf3.format(d3));
		

	}

}
