package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate ld = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		Instant i = Instant.now();
		
		LocalDate ld2 = LocalDate.parse("2023-07-12");
		LocalDateTime ldt2 = LocalDateTime.parse("2023-07-12T12:00:00");
		Instant i2 = Instant.parse("2023-12-07T12:05:23Z");
		Instant i3 = Instant.parse("2023-12-07T09:07:23-03:00");
		
		LocalDate ld3 = LocalDate.parse("12/07/2023" , DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime ldtf = LocalDateTime.parse("12/07/2023 11:10" , dtf2);
		
		LocalDate ld4 = LocalDate.of(1998, 07, 12);
		LocalDateTime ldt3 = LocalDateTime.of(1998, 07, 12, 12, 00, 05);

		
		System.out.println(ld);
		System.out.println(ldt);
		System.out.println(i);
		System.out.println(ld2);
		System.out.println(ldt2);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(ld3);
		System.out.println(ldtf);
		
		System.out.println(ld4);
		System.out.println(ldt3);
		

	}
			
			

}
