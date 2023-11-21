package calculos;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Caculos {
	

	
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(1998, 07, 12);
		LocalDateTime d2 = LocalDateTime.parse("2023-07-11T15:40:10"); 
		Instant d3 = Instant.parse("2023-07-11T15:40:15Z");
		
		LocalDate umaSemanaAntes = d1.minusDays(7);
		LocalDate umaSemanaDepois = d1.plusDays(7);
		
		LocalDateTime d5 = d2.plus(7,ChronoUnit.DAYS);
		
		Instant umaSemanaAntesInst = d3.minus(7,ChronoUnit.DAYS);
		Instant umaSemanaDepoisInst = d3.plus(7,ChronoUnit.DAYS);
		
		
		// Duração entre duas datas horas
		
		Duration t1 = Duration.between(d2, d5);
		Duration t2 = Duration.between(d1.atTime(0,0), umaSemanaDepois.atTime(0, 0));
		Duration t3 = Duration.between(d1.atStartOfDay(), umaSemanaDepois.atStartOfDay());
		Duration t4 = Duration.between(umaSemanaDepois.atStartOfDay(),d1.atStartOfDay());

		
		System.out.println(umaSemanaAntesInst);
		System.out.println(umaSemanaDepoisInst);
		System.out.println(t1.toDays());
		System.out.println(t2.toDays());
		System.out.println(t3.toDays());
		System.out.println(t4.toDays());

		
	}

}
