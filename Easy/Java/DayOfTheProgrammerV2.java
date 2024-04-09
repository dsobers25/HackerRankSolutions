import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfTheProgrammerV2 {

    // solution came from forum: https://www.hackerrank.com/challenges/day-of-the-programmer/forum
    // author: prudor_chose
    public static String dayOfProgrammerV2(int year) { // Write your code here int dayOfProg = 256;
        int dayOfProg = 256;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year); 
        
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");        
            if( year <= 1917 && year % 4 == 0 && year % 100 ==0 && year % 400 != 0){
                calendar.set(Calendar.DAY_OF_YEAR, dayOfProg - 1); 
            }else if(year == 1918){
                calendar.set(Calendar.DAY_OF_YEAR, dayOfProg + 13);
            }else{
                calendar.set(Calendar.DAY_OF_YEAR, dayOfProg);
            }
            
            Date date = calendar.getTime();
            
            return format.format(date);
}

/*
 * Author: Long Wind
 * Date: 4/9/2024
 */
public static String dayOfProgrammer(int year) {
        // Write your code here
            // variables
            // determine whether its a julian or gregorian
            // Gregorian calendar is if year is < 1918
            // if year == 1918, feb starts at 14
            boolean Gregorian  = year > 1918 ? true: false;
            boolean Julian = year <= 1918 ? true: false;
            boolean leapYear = false;
            
            // determine whether it leap yr or not
            if(Gregorian) {
                // Gregorian = leap yr if year is / by 400, 4 & not / by 100
                leapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )? true: false;
                
            } else if(Julian) {
                // Julian = if yr is / by 4 its a leap yr
                leapYear = year % 4 == 0 ? true: false;
            }
            int day = leapYear?12:13;
            
            // account for February starting on the 14th
            // therefore 13 days must be added to the day
            day = year == 1918?day+13:day;
            
            return day+".09."+year;
    
        }

    public static void main(String[] args) {

        // 1/61 test cases failed
        // need to solve testcase 59
        System.out.println(dayOfProgrammer(1918));
        System.out.println(dayOfProgrammerV2(1918));

        // Expected Output: 26.09.1918
    }
}