package HackerRankSolutions.Easy.Java;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        // Create new array list
        List<Integer> updatedGrades = new ArrayList<Integer>();
        // iterate through the grades list
        for(int i = 0; i < grades.size(); i++) {
        // check if current element is less than 38 add to list without rounding
        if (grades.get(i) < 38) {
            updatedGrades.add(grades.get(i));
        // check if current element +1 / by 5 has a remainder of 0, add to new list 
        }else if((grades.get(i)+1) %5 ==0){
            updatedGrades.add(grades.get(i)+1);
        // if current element +2 / by 5 has a remainder of 0, add to new list
        } else if((grades.get(i)+2) %5 ==0){
            updatedGrades.add(grades.get(i)+2);
        // if current element +1 or +2 / by 5 is not equal to 0, add to new list 
            }  else if (grades.get(i)+1%5!=0 || grades.get(i)+2%5!=0) {
                updatedGrades.add(grades.get(i));
            }
        }
        // return new list with updated values
        return updatedGrades;
        }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        
        System.out.println(gradingStudents(grades));        
    }
    
}
