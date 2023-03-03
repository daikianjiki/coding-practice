package HackerRank;

import java.util.ArrayList;
import java.util.List;

class PlusMinus {
    //Given an array of integers, calculate the ratios of its elements that are positive, 
    //negative, and zero. Print the decimal value of each fraction on a new line.
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-1);
        list.add(0);
        list.add(0);
        list.add(2);
        list.add(-2);
        System.out.println(plusMinus(list));
    }

    public static List<Double> plusMinus(List<Integer> arr) {
        List<Double> d = new ArrayList<>();
        int pos = 0;
        int neg = 0;
        int zer = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                pos++;
            }
            if (arr.get(i) < 0) {
                neg++;
            }
            if (arr.get(i) == 0) {
                zer++;
            }
        }
        d.add((double)pos/arr.size());
        d.add((double)neg/arr.size());
        d.add((double)zer/arr.size());

        return d;
    }
}