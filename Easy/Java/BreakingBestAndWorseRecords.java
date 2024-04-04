

import java.util.ArrayList;
import java.util.List;

public class BreakingBestAndWorseRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        // initialize best and worst record variables to index 0
        int best = scores.get(0);
        int bestCounter = 0;
        int worse = scores.get(0);
        int worseCounter = 0;
        List<Integer> results = new ArrayList<>();
        
        // loop through list
        for(int i: scores) {
        // check if elements are > or < best or worse score
            if(i > best) {
                best = i;
                // if greater ++
                bestCounter++;
            } else if(i< worse) {
                worse = i;
                // if less ++
                worseCounter++;
            }   
        }
        
        results.add(bestCounter);
        results.add(worseCounter);
        
        return results;
    }
    public static void main(String[] args) {
        /*
         * ut (stdin)
         * 9
         * 10 5 20 20 4 5 2 25 1
         */
        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(5);
        testList.add(20);
        testList.add(20);
        testList.add(4);
        testList.add(5);
        testList.add(2);
        testList.add(25);
        testList.add(1);

        // Expected Output: 2 4
        System.out.println(breakingRecords(testList));

    }
    
}
