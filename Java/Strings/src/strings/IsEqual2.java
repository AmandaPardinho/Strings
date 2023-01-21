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
                \nThe equals method compares each of the given objects character by character. If both objects are 
                exactly the same i.e. have exactly the same characters in the same order, the method will show that 
                both are equal.
                """);

        //Case 2

        String word3 = "Amanda";
        String word4 = "amanda";

        if(word3.equals(word4)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are different");
        }

        System.out.println("""
                \nIn this second case, the words are still the same. However, the characters used to write them are 
                different. Java distinguishes between upper case and lower case letters. Since in this case we have the 
                first letter of the two strings different (upper case and lower case, respectively), the conditional 
                structure will return that they are different. If you want to ignore this case distinction, you can do 
                so using the equalsIgnoreCase method.
                """);

        //Case 3

        String word5 = "Amanda";
        String word6 = "amanda";

        if(word5.equalsIgnoreCase(word6)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are different");
        }

    }
}
