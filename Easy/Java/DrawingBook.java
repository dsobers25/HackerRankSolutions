public class DrawingBook {
    
    public static int pageCount(int n, int p) {
        // Write your code here
            // get pages
            // get page
            // int startFront
            // int startBack
            // calculate page turns from startFront vs startBack
            // if 0 or even, page is left, if odd page is right
            // create array and populate with values 0 - n
            int[] book = new int[n];
            int turns = 0;
            int frontTurns = 0;
            int backTurns = 0;
            
            // front check
            for(int i = 0; i<book.length; i++) {
                book[i] = i;
                System.out.println(" b4 " + i);
                if(p <= 1) {
                    System.out.println(i);
                    return 0;
                } else if (p %2 == 0){
                    // when even a page turn is added
                    System.out.println(" " + i);
                    frontTurns++;
                }
            }
            System.out.println("back");
            
            for(int i = book.length; i>0; i--){
                book[i] = i;
                if(i  >= book.length - 2) {
                    return 0;
                } else if (p %2 != 0){
                    // when even a page turn is added
                    backTurns++;
                }
            }
            
            if(backTurns > frontTurns) {
                System.out.println("front");
                turns = frontTurns;
                // System.out.println("front");
            } else {
                System.out.println("back");
                turns = backTurns;
            }
            return turns;
            // back check
            // loop through array until index is p
            // compare startFront vs startBack
            //return least value
            
        // return 1;
    
        }    
    public static void main(String[] args) {
        System.out.println(pageCount(6,2));
    }
}
