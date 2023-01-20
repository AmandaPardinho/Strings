package strings;

public class IsEqual2 {
    public static void main(String[] args) {
        System.out.println("""
                \nWhat is the difference from what was done before with respect to using the equals method? 
                """);

        //Case 1

        String word1 = "Amanda";
        String word2 = "Amanda";

        if(word1.equals(word2)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are different");
        }

        System.out.println("""
                \nThe equals method compares each of the given objects character by character. If both objects are exactly
                the same i.e. have exactly the same characters in the same order, the method will show that both are 
                equal.
                """);
    }
}
