package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {
    /**
     * Given an array of integers and an integer divisor (int k), 
     * detemine the number of pairs in the list array that are divisible by int k.
     */

    public static void main(String[] args) {
        // the length of array ar
        int n = 6;
        // the integer divisor
        int k = 3;
        //an array of integers
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);

        System.out.println(divisibleSumPairs(n, k, ar));
        
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    
}
