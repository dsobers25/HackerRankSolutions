package HackerRankSolutions.Easy.Java;

public class KangarooJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        // if kangaroo 1 is behind kangaroo 2 go into while loop[]
        while(x1 < x2) {
            // check if v1 is less than or equal to v2
            // if it is, then No will be the result because
            // kangaroo 1 will never be able to reach kanagroo 2
            if(v1 <=v2) {
                return "NO";
            } 
            // check if the distance between the kangaroos 
            // velocities (v2 - v1) is a factor of the space 
            // between them (x2-x1). If so return Yes
            if((x2-x1)%(v2-v1)==0) {
                return "YES";
            }
            // add the respecitve velocities
            // to each kangaroos positions
            x1=+v1;
            x2=+v2;
            }
            
            return "NO";
            
        } 

    public static void main(String[] args) {

        System.err.println(kangaroo(0, 3, 4, 2));
        
    }
    
}
