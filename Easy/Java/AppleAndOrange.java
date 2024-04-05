
import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s - start of home = 7
     *  2. INTEGER t - end of home   = 11
     *  3. INTEGER a - position of apple tree  = 5
     *  4. INTEGER b - position of orange tree = 15
     *  5. INTEGER_ARRAY apples  [-2 2 1]
     *  6. INTEGER_ARRAY oranges [5 -6]
     */    

     // add the tree position to every element of the array which is the position of where the fruit fell
     public static List<Integer> addTreeToDroppedFruit(List<Integer> fallenFruit, int treePoistion) {
        List<Integer> fallenFruitV2 = new ArrayList<>();
        for(int i = 0; i< fallenFruit.size(); i++) {
             fallenFruitV2.add(i, fallenFruit.get(i)+treePoistion);
        }
        return fallenFruitV2;
    }
    
    // calculate the amount of fruit in the range of the home and return it as an int
    public static int fruitInRangeCounter(List<Integer> fruitList, int startRange, int endRange) {
           int fruitInRange = 0;
           for(int i =0; i<fruitList.size(); i++) {
               if(fruitList.get(i) >= startRange && fruitList.get(i) <= endRange) {
                   fruitInRange++;
               }
           }
           
           return fruitInRange;
        
    }

   public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
   // Write your code here
   // define needed variables
   int applesInRange = 0, orangesInRange = 0;
   //get apples array & add apple tree position to every element in array
   apples = addTreeToDroppedFruit(apples,a);
   //get orange array & add orange tree position to every element in array
   oranges = addTreeToDroppedFruit(oranges, b);
   // check which element is in the range of the home
   applesInRange = fruitInRangeCounter(apples, s,t);
   orangesInRange = fruitInRangeCounter(oranges, s,t);
   
   // print apples within range of home
   System.out.println(applesInRange);
   // print oranges within range of home
   System.out.println(orangesInRange);
   

   }

    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<Integer>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);
        List<Integer> oranges = new ArrayList<>();
        oranges.add(5);
        oranges.add(-6);
        countApplesAndOranges(7,11,5,15,apples, oranges);
        
    }
    
}
