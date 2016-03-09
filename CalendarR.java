//u10316052
import java.util.*;
//Inheritance
public class CalendarR extends PrintCalendar{
	static Calendar calendar = new GregorianCalendar();
		
	public void excute(){
		//printmonthtitle 
		printMonthTitle(calendar.get(Calendar.YEAR),(calendar.get(Calendar.MONTH)+1));
		//printmonthbody
		printMonthBody(calendar.get(Calendar.YEAR), (calendar.get(Calendar.MONTH)+1));
	}			
}
