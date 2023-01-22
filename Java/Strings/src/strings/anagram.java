package strings;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String word1 = "Celia";
        String word2 = "Alice";

        char[] anagram1 = word1.toCharArray();
        char[] anagram2 = word2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        
    }
}
