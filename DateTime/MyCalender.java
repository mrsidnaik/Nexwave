package DateTime;

import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class MyCalender {

	public static void main(String[] args) {
		
		daysToDate("08-08-2020");

	}
	
	
	public static int daysToDate(String date) {
		int numDays=0;
		LocalDate today = LocalDate.now();
		int thisyear = today.getYear();
		int thismonth=today.getMonthValue();
		int thisday = today.getDayOfMonth();
		System.out.println(thisyear+":"+thismonth+":"+thisday);
		
		
		
		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate futureDate = LocalDate.from(dtf.parse(date));
		int futureYear = futureDate.getYear();
		int futureMonth = futureDate.getMonthValue();
		int futureDay= futureDate.getDayOfMonth();
		System.out.println(futureYear+":"+futureMonth+":"+futureDay);
		
		long daysBetween = ChronoUnit.DAYS.between(today, futureDate);
		System.out.println(daysBetween);
		return numDays;
	}

}
