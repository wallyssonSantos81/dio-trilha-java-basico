package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2024-07-27");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-27T07:21:25");
		Instant d06 = Instant.parse("2024-07-27T07:21:45Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("R1: "+ r1);
		System.out.println("R2: " + r2);
		System.out.println("R3: " + r3);
		System.out.println("R4: " + r4);
		System.out.println("-----------------------------------------");
		System.out.println("D04 Dia: " + d04.getDayOfMonth());
		System.out.println("D04 Mês: " + d04.getMonthValue());
		System.out.println("D04 Ano: " + d04.getYear());
		System.out.println("-----------------------------------------");
		System.out.println("D05 Hora: " + d05.getHour());
		System.out.println("D05 Minutos: " + d05.getMinute());
		System.out.println("D05 Segundos: " + d05.getSecond());
		System.out.println("-----------------------------------------");

	}

}
