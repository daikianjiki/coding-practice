package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class MatchingStrings {
    /**
     * For collection of input strings and a collection of query strings, 
     * determine how many times query string occurs int he list of input strings.
     * @Return an array of the results.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("4");
        strings.add("aba");
        strings.add("baba");
        strings.add("xzxb");
        strings.add("3");
        strings.add("aba");
        strings.add("xzxb");
        strings.add("ab");

        List<String> queries = new ArrayList<>();
        queries.add("aba");
        queries.add("ab");
        queries.add("abc");

        System.out.println(matchingStrings(strings, queries));
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    
        List<Integer> results = new ArrayList<>(queries.size());
        
        for (String query : queries) {
            int count = 0;
            for (String str : strings) {
                if (query.equals(str)) {
                    count++;
                }
            }
            results.add(count);
        }
        
        return results;
    }

}
