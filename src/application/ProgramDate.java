package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ProgramDate {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2021-09-22T07:25:05Z"));
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date e = new Date(System.currentTimeMillis());

		System.out.println("Date (+0:00): " + sdf.format(d));
		System.out.println("----------------------------------");
		System.out.println("Date (-3:00): " + sdf1.format(d));
		System.out.println("Date (-3:00): " + sdf1.format(e));
	}
}