import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
class Dateconversion{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int td=756;
        int yr=td/365;
        int rem=td%365;
        int wk= rem/365;
        int days=rem%365;
        System.out.println("years:"+yr);
        System.out.println("weeks:"+wk);
        System.out.println("days:"+days);
        // day of the week:
        System.out.println("enter the day month and year:");
        int day=s.nextInt();
        int month=s.nextInt();
        int year=s.nextInt();
        LocalDate date=LocalDate.of(year,month,day);
        DayOfWeek dayofweek=date.getDayOfWeek();
        String daystr= dayofweek.toString();
        System.out.println("Day of the week: " + daystr);

    }
}