import java.time.LocalDate;
import java.time.DayOfWeek;
class Daysof{
	public static void main(String args[]){
		int num=756;
		int year=num/365;
		int remaining=num%365;
		int week=remaining/7;
		int days=remaining%7;
		System.out.println("The years: "+year+" week: "+week+" days: "+days);
		int years=2024;
		int months=7;
		int day= 9;
		LocalDate date= LocalDate.of(years,months,day);
		DayOfWeek dayofWeek=date.getDayOfWeek();
		String dayname= dayofWeek.name();
		System.out.println("The day is : "+dayname);
	}
}