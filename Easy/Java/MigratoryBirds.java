import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MigratoryBirds {
    
    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        // variable
        // hypothesis
        int birds = 1;
        // started forloop on 2nd bird type
        for(int i = 2; i<= 5; i++) {
            
            if(Collections.frequency(arr, i) > Collections.frequency(arr, birds)) {
                birds = i;
            }
            
        }
         
        return birds;
    }

    public static void main(String[] args) {

        // 1 2 3 4 5 4 3 2 1 3 4
        // Expected Output: 3
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);
        test.add(3);
        test.add(4);

        System.out.println(migratoryBirds(test));
        
        
    }
}
