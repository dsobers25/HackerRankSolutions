/*
 * Author: Long Wind
 * Date: 4/9/2024
 */

public class DayOfTheProgrammer {

        public static String dayOfProgrammerV1(int year) {
            // Write your code here
                // variables
                // determine whether its a julian or gregorian
                // Gregorian calendar is if year is < 1918
                // if year == 1918, feb starts at 14
                boolean Gregorian  = year > 1918 ? true: false;
                boolean Julian = year <= 1918 ? true: false;
                boolean leapYear = false;
                int day = 0;
                int month = 1;
                int dayOfProgrammer = 256;
                
                // 0-Jan, 1-Feb 2-Mar, 3-Apr, 4-May, 5-Jun, 6-July, 7-Aug, 8-Sept
                // assuming its a leap year Feb has 29 days
                int[] calendar = {31,29,31,30,31,30,31,31,30};
                // determine whether it leap yr or not
                // leap year has 29 days. non-leap has 28
                if(Gregorian) {
                    // Gregorian = leap yr if year is / by 400, 4 & not / by 100
                    leapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )? true: false;
                    if(!leapYear){
                        calendar[1] = year == 1918? 16 : 28;
                    }
                } else if(Julian) {
                // Julian = if yr is / by 4 its a leap yr
                    leapYear = year % 4 == 0 ? true: false;
                    if(!leapYear){
                        calendar[1] = 28;
                    }
                    
                }
    
                for(int i = 0; i<calendar.length; i++) {
                    day+=calendar[i];
                    month++;
                    if(dayOfProgrammer - day < calendar[i]) {
                        day = dayOfProgrammer - day;
                        break;
                    }
                }
                    
                
                day = year == 1918?day+13:day;
                
                return day+".0"+month+"."+year;
        
            }

    public static void main(String[] args) {

        // All testcases are passing!
        System.out.println(dayOfProgrammerV1(1918));

        // Expected Output: 26.09.1918

    }
}