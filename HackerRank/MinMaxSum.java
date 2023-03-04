package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(minMaxSum(list));
    }

    public static List<Long> minMaxSum(List<Integer> arr) {
        List<Long> l = new ArrayList<>();
        Collections.sort(arr);
        long min = (long)arr.get(0) + (long)arr.get(1) + (long)arr.get(2) + (long)arr.get(3);
        long max = (long)arr.get(1) + (long)arr.get(2) + (long)arr.get(3) + (long)arr.get(4);
        l.add(min);
        l.add(max);

        return l;
    }
}
