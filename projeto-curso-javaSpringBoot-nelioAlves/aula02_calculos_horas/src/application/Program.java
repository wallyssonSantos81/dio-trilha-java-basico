package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdt1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdt2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdt3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdt3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		try {
			Date x1 = new Date();
			Date x2 = new Date(System.currentTimeMillis());
			Date x3 = new Date(0L);
			Date x4 = new Date( 1000L * 60L * 60L * 5L);
			
			Date y1 = sdt1.parse("27/07/2024");
			Date y2 = sdt2.parse("27/07/2024 10:48:10");
			Date y3 = Date.from(Instant.parse("2024-07-27T10:48:10Z"));
			
			System.out.println("-----------------------------------------------");
			System.out.println("X1: " + x1);
			System.out.println("X2: " + x2);
			System.out.println("X3: " + x3);
			System.out.println("X4: " + x4);
			System.out.println("Y1: " + y1);
			System.out.println("Y2: " + y2);
			System.out.println("Y3: " + y3);
			System.out.println("-----------------------------------------------");
			System.out.println("X1: " + sdt2.format(x1));
			System.out.println("X2: " + sdt2.format(x2));
			System.out.println("X3: " + sdt2.format(x3));
			System.out.println("X4: " + sdt2.format(x4));
			System.out.println("Y1: " + sdt2.format(y1));
			System.out.println("Y2: " + sdt2.format(y2));
			System.out.println("Y3: " + sdt2.format(y3));
			System.out.println("-----------------------------------------------");
			System.out.println("X1: " + sdt3.format(x1));
			System.out.println("X2: " + sdt3.format(x2));
			System.out.println("X3: " + sdt3.format(x3));
			System.out.println("X4: " + sdt3.format(x4));
			System.out.println("Y1: " + sdt3.format(y1));
			System.out.println("Y2: " + sdt3.format(y2));
			System.out.println("Y3: " + sdt3.format(y3));
			System.out.println("-----------------------------------------------");
		

		}catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
