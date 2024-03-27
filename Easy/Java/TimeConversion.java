package HackerRankSolutions.Easy.Java;

public class TimeConversion {

public static String timeConversion(String s) {
    // Write your code here
    if (s.indexOf("A") == 8){
        // get first 2 characters
        String hr = s.substring(0, 2);
        // convert them to a number
        int amHr = Integer.parseInt(hr);
        // get minutes and seconds from input string
        String minSec = s.substring(2, s.length()-2);

        // if am hour is 12 change to 00
        if(amHr == 12) {
            hr = "00";
            return hr + minSec;
        } else {
            return hr + minSec;
        }
        
    } else {
        String hr = s.substring(0, 2);
        String minSec = s.substring(2, s.length()-2);
        // if hr is < 12 add 12
        int pmHr = Integer.parseInt(hr) < 12? Integer.parseInt(hr)+12: 12;
        // turn an integer into a string
        hr = String.valueOf(pmHr);
        return hr + minSec;
    }

    }
    public static void main(String[] args) {
        // enter a 12hr time in hh:mm:ss(AM or PM) format
        // Code will convert time to 24hr military version 
        System.out.print(timeConversion("00:40:22AM"));
    }
    
}
