package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2024-07-27");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-27T07:21:25");
		Instant d06 = Instant.parse("2024-07-27T07:21:45Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		System.out.println("---------------------------------------");
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		System.out.println("---------------------------------------");
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		System.out.println("---------------------------------------");
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		System.out.println("T1 dias: " + t1.toDays());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("T2 dias: " + t2.toDays());
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("T3 dias: " + t3.toDays());
		Duration t4 = Duration.between(d06, pastWeekInstant);
		System.out.println("T04 dias: " + t4.toDays());
		System.out.println("---------------------------------------");


	}

}
