import java.util.*;

public class APCalendar{
    public static boolean isLeapYear(int year) {
      return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
   public static int numberOfLeapYears(int year1, int year2){
     int count = 0;
     for(int i = year1; i<=year2;i++){
       if(isLeapYear(i)==true) count++;
     }
     return count;
   }
    public static int dayOfWeek(int month, int day, int year) {
      return (dayOfYear(month, day , year) + firstDayOfYear(year) -1)%7;
    }

}
