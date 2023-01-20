package strings;

public class IsEqual2 {
    public static void main(String[] args) {
        System.out.println("""
                \nWhat is the difference from what was done before with respect to using the equals method? 
                What is the difference from what was done before with respect to using the equals method? The equals 
                method compares each of the given objects character by character. If both objects are exactly the same, 
                i.e. have exactly the same characters in the same order, the method will show that both are equal.
                """);

        String word1 = "Raul";
        String word2 = "Luar";

        if(word1.equals(word2)){
            System.out.println("They are equals");
        }else{
            System.out.println("They are differents");
        }
    }
}
