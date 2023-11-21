package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class Datas {
	
	public static void main(String[] args) {
		
		Instant i = Instant.parse("2022-07-12T01:00:00Z");
		
		for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		
		LocalDate r1 = LocalDate.ofInstant(i, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(i, ZoneId.of("Portugal"));

		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println(r1.getDayOfMonth());
		System.out.println(r1.getMonthValue());
		System.out.println(r1.getYear());
		
		
	}

}
