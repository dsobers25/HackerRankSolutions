import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here (example data: 2 2 1 3 2, d = 4, m = 2)
            // variables (count pairs equal to d) (sets range equal to m)
            int pairCounter = 0;
            // convert to array
            int[] arr = s.stream().mapToInt(Integer::intValue).toArray();
            
            // use a for loop to traverse array
                int sum = 0;
            
            // if we want the last range starting at the beginning
            // of the array we need to subract by m and add 1
            for(int i = 0; i < arr.length - m +1; i++) {
                for(int j = i; j<i+m; j++) {
                    sum += arr[j];
                    // if we are adding the last index and sum = day
                    if(j==(i+m)-1 && sum == d) {
                        pairCounter++;
                    }
                }
                sum = 0;
            }
            
            return pairCounter;
    
        }

    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(2);
        test.add(2);
        test.add(1);
        test.add(3);
        test.add(2);
        System.out.println(birthday(test, 4, 2));
        // Expected Output: 2
        
    }
}