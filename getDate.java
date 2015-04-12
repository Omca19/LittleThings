package LittleThings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class getDate {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat( "2.8.1995" );
		Date date = format.get2DigitYearStart();
		
		System.out.println(date);
	}

}
