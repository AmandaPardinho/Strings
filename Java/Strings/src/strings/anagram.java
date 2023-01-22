package strings;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String word1 = "Celia";
        String word2 = "Alice";

        char[] anagram1 = word1.toCharArray();
        char[] anagram2 = word2.toCharArray();

        //Arrays.sort(anagram1);
        //Arrays.sort(anagram2);

        if(Arrays.equals(anagram1, anagram2)){
            System.out.println("It is an anagram");
        }else{
            System.out.println("It isn't an anagram");
        }
    }
}
