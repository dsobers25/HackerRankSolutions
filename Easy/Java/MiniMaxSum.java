
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    // create variables for totalSum, minSum, maxSum
        long totalSum = 0;
        
        // use collections api to initialize min and max values
        long min = Collections.min(arr);
        long max = Collections.max(arr);
        
        // sum the total
        for(int i = 0; i < arr.size(); i++) {
            totalSum+=arr.get(i);
        }
        
        
        // return the difference of the total - min or max values
        long minSum = totalSum - max;
        long maxSum = totalSum - min;
        System.out.println(minSum + " " + maxSum);
}

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(364801279);
        arr.add(819230764);
        arr.add(759641832);
        arr.add(573261094);
        arr.add(396285104);

        // sample input: 396285104 573261094 759641832 819230764 364801279

        // expected output: 2093989309 2548418794
        miniMaxSum(arr);

    }
}