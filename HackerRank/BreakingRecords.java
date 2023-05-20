package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {

    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);    

        System.out.println(breakingRecords(scores));
    }
    
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int countMin = 0;
        int countMax = 0;
        int min = scores.get(0);
        int max = scores.get(0);
        List<Integer> records = new ArrayList<Integer>();
        
        for (int score : scores ) {
            if (score < min) {
                countMin++;
                min = score;
            }
            if (score > max) {
                countMax++;
                max = score;
            }
        }
        records.add(countMax);
        records.add(countMin);
        return records;
    }
}
