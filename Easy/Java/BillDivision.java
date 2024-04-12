import java.util.ArrayList;
import java.util.List;

public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        // variables
        int actual, charged = b, sum = 0;
        
        // sum the elements which Anna ate
        for(int i = 0; i<bill.size(); i++) {
        // use condition to omit k from sum
            if(i != k) {
                sum += bill.get(i);
            }
        }
        // divide sum in half to get actual
        actual = sum/2;
        // if actual == to sum, print Bon Appetit, else print difference 
        if (actual == charged) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(charged - actual);
        }
    
        }

    public static void main(String[] args) {
        
        /*
         * 4 1
         * 3 10 2 9
         * 12
         * Expected Output: 5
         */
        int k = 1; // the index which Anna didn't eat
        int b = 12; // how much Anna was charged
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        bonAppetit(bill,k,b);

    }
}