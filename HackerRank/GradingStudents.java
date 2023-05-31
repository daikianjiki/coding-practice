package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    /**
     * Given the list of grades, write code to automate the rounding process.
     *  - if the difference between the grade and the nexxt multiple of 5 is less than 3,
     * round grade up to the next multiple of 5.
     *  - if the value of grade is less than 38, no rounding occurs.
     * 
     * Examples:
     * grade = 84 round to 85 (85 - 84 is less than 3)
     * grade = 29 do not round (result is less than 38)
     * grade = 57 do not round (60 -57 is 3 or higher
     */

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();

        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        System.out.println(gradingStudents(grades)); //output [75, 67, 40, 33]
        
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        
        List<Integer> result = new ArrayList<>();
        for (Integer grade : grades) {
            int temp = grade % 5;
            int rounded = 5 - temp;

            if (grade < 38 || temp < 3) {
                result.add(grade);
            } else {
                result.add(grade + rounded);
            }
        }
        return result;
    }
    
}
