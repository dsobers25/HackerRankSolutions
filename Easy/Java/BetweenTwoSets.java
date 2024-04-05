
import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets{

public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    // variables: counter, meetsReqs
    int counter = 0;
    // create a new list, all nums between list a and b
    List<Integer> numsBetweenList = new ArrayList<>();
    for(int i = a.get(a.size()-1); i<=b.get(0); i++) {
        numsBetweenList.add(i);
    }
    // check which elements in numsBetweenList are factors of a & b
    // use a double nested loop to iterate through all 3 list numsBetweenList, a, and b 
    for( int i : numsBetweenList) {
        boolean meetsReqs = true;
        
        // condition to check if new list elments are factors of both list a and b
        // if they aren't we will use break statement to skip that element
        // check if numsBetweenList element is a factor of List a
        for(int j=0; j<a.size(); j++){
            if(i % a.get(j) != 0) {
                meetsReqs = false;
                break;
            } else {
                meetsReqs = true;
                
            }
        }
        
        if(meetsReqs) {
        // check if numsBetweenList element is a factor of List b
        for(int k=0; k<b.size(); k++){
            if(b.get(k) % i != 0) {
                meetsReqs = false;
                break;
            }
        }
        if(meetsReqs) {
            counter++;
        }
        }
        
    }
    // once done iterating we return counter
    return counter;
    }

    public static void main(String[] args) {
        /*
         * Sample Input:
         *  2 3
         *  2 4
         *  16 32 96
        */

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        List<Integer> b = new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);

        System.out.println(getTotalX(a,b));
        // Expected Output: 3

    }
}