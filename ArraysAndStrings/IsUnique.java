package ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    // Is Unique: Implement an algorithm to determine if a string has all unique 
    // characters. What if you cannot use additional data structures?
    public static void main(String[] args) {
        System.out.println("1st Method: " + isUnique("abcdefgg"));
        System.out.println("2nd Method: " + isUnique2("abcdefgg"));
        System.out.println("3rd Method: " + isUnique3("abcdefgg"));
    }

    // 1st method:
    // 2 for loops and if statement = O(n^3)
    public static boolean isUnique(String str) {
        for (int i = 0; i < str.length(); i++) { 
            for (int k = i + 1; k < str.length(); k++) { 
                System.out.println(str.charAt(i) + " is compared to " + str.charAt(k));
                if(str.charAt(i) == str.charAt(k)) {
                    return false;
                }
            }            
        }
        return true;
    } 
    
    // 2nd method:
    // Set does not allow duplicates.  If it cannot add an element (element already exists), it returns false.
    // The loop will represent O(n) the if statement is a constant of O(1) therefore overall would be O(n).
    public static boolean isUnique2(String str){
        Set<Character> set = new HashSet<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (!set.add(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // 3rd method:
    // Solution from book - time complexity is O(n), the space complexity is O(1).
    public static boolean isUnique3(String str) {
        if (str.length() > 128) return false; // Checking for all ASCII characters. 

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (char_set[ch]) { // Already found this char in string
                return false;
            }
            char_set[ch] = true;
        }
        return true; 
    }
}