package HackerRankSolutions.Easy.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        return Collections.frequency(candles, Collections.max(candles));
    }

    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(5);
        candles.add(4);
        candles.add(5);
        candles.add(2);
        candles.add(1);
        candles.add(5);


        System.out.print(birthdayCakeCandles(candles));

    }
}