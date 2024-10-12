package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2024-07-26");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-26T05:45:25");
		Instant d06 = Instant.parse("2024-07-26T08:50:45Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;
		
		
		
		System.out.println("D04 = " + d04.toString());
		System.out.println("D04 = " +d04.format(fmt1));
		System.out.println("D04 = " + fmt1.format(d04));
		System.out.println("D04 = " +d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("------------------------------------------");
		System.out.println("D05 = " + d05.toString());
		System.out.println("D05 = " +d05.format(fmt2));
		System.out.println("D05 = " + fmt2.format(d05));
		System.out.println("D05 = " +d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println("-------------------------------------------");
		System.out.println("D06 = "+ fmt3.format(d06));
		System.out.println("-------------------------------------------");
		System.out.println("D06 = " + fmt4.format(d06));
		System.out.println("D06 = " + d06.toString());
		
		
		
	}
	

}
