package HackerRankSolutions.Easy.Java;



public class StaircaseSolution {


    public static void staircase(int n) {
            int spaces = n -1;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(j<spaces) {
                        System.out.print(" ");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println("");
                spaces--;
            }
    }


    public static void main(String[] args) {
        staircase(6);

    }
}