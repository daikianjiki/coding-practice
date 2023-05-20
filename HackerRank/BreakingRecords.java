package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {
    /**
     * Given the scores for a season, determine the number of times the player 
     * breaks their records for most and least points scored during the season.
     * 
     * Example:
     * scores = [10, 5, 20, 20, 4, 5, 2, 25, 1]
     * 
     * Return:
     * records = [2, 4]
     * Where records[0] is for breaking most points records, and 
     * records[1] is for breaking least points records.
     */

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
