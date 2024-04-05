import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    // counter for how many pairs are present
    int pairCounter = 0;
    
    // iterate through the list
    for(int i = 0; i<n; i++) {
        for(int j = 1; j<n; j++) {
            // check if i<j and if i+j is divisible by k 
            // if true add +1 to pairCounter
            if(i < j && (ar.get(i) + ar.get(j)) % k ==0) {
                pairCounter++;
            }
        }
    }
    
    return pairCounter;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(1);
        arr.add(2);

        int n = 6, k = 3;
        System.out.println(divisibleSumPairs(n,k,arr));
        // Expected Output: 5

    }
}
