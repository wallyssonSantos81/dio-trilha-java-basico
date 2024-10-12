package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2024-07-28T19:50:10Z"));
		
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY,4);
		d = cal.getTime();
		int minutes = cal.get(Calendar.MINUTE);	
		int month = 1 + cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(sdf.format(d));
		System.out.println("Minutes: "+ minutes);
		System.out.println("Month: " + month);
		System.out.println("Day: " + day);
	}

}
