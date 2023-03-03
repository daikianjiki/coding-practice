package ArraysAndStrings;

import java.util.Arrays;

public class IsPermutation {

    // Check Permutation: Given two strings, write a method to decide if one 
    // is a permutation of the other.
    public static void main(String[] args) {
        // test one - true
        //System.out.println(isPerm("aac", "aca"));
        //System.out.println(isPerm2("aac", "aca"));

        // test two - false
        //System.out.println(isPerm("abc", "efg"));
        //System.out.println(isPerm2("abc", "efg"));

        // test three - false 
        //System.out.println(isPerm("abc", "bcaa"));
        //System.out.println(isPerm2("abc", "bcaa"));

        // test four - true
        //System.out.println(isPerm("abc", "abc"));
        //System.out.println(isPerm2("abc", "abc"));

        // test five - false 
        System.out.println(isPerm("abc", "ABC"));
        System.out.println(isPerm2("abc", "ABC"));
    }

    // First method(s):
    // Create two methods. First will sort a String. Second will compare the Strings.
    // Second method will also check to see if the length of each Strings matches.
    // Time efficiency is = O(n) + O(n) = O(2n) -> O(n).
    public static String sort(String str) { //O(n)
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    
    public static boolean isPerm(String a, String b) { //O(n) 
        if (a.length() != b.length()) return false; 
        return sort(a).equals(sort(b));
    }
    
    // Second method:
    // This method will also check for the length.
    // 1st for loop will increment 1 for each occurences of each letter in the first string.
    // Then 2nd for loops will decrement 1 for each occurences of each letter in the second string.
    // If it's 0, it is true. 
    // Time efficiency is = O(n) + O(n) = O(2n) -> drop the constant "2" and gives O(n)
    public static boolean isPerm2(String a, String b) { 
        if (a.length() != b.length()) return false; 
        
        int[] letters = new int[128]; //Assumption ASCII
        for (int i = 0; i < a.length(); i++) { //O(n)
            letters[a.charAt(i)]++;
        }
        
        for (int i = 0; i < b.length(); i++) { //O(n)
            letters [b.charAt(i)]--;
            if (letters[b.charAt(i)] < 0) {
                return false;
            }
        }
        return true;  //letters has no negative values, and therefore no positive values either.
    }
    
}
