package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {

    /**
     *  Given an array of integers, where all elements but one occur twice,
     * find the unique element.
     * 
     * EXAMPLE:
     * a = [1, 2, 3, 4, 3, 2, 1]
     * The unique element is 4.
     */

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);

        System.out.println(lonelyInteger(a)); //output 4
        
    }

    public static int lonelyInteger(List<Integer> a) {
        
        int unique = 0;
        
        for (int n : a) {
            unique ^= n;
        }
        
        return unique;
    }
    
}
