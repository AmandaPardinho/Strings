package strings;

public class IsEqual {
    public static void main(String[] args) {
        System.out.println("""
                \nIf we have two strings and we want to compare their contents, determining if they are equal, what 
                would be the answer obtained in each of these cases?
                """);

        //Case 1
        String name1 = "Amanda";
        String nickname1 = "Amanda";

        if(name1 == nickname1){
            System.out.println("True: name1 and nickname1 are equal");
        }else{
            System.out.println("False: name1 and nickname1 are different");
        }

        //Case 2
        String name2 = new String("Amanda");
        String nickname2 = "Amanda";

        if(name2 == nickname2){
            System.out.println("\nTrue: name2 and nickname2 are equal");
        }else{
            System.out.println("\nFalse: name2 and nickname2 are different");
        }

        System.out.println("""
                Why does Case 1 have a different answer than Case 2?
                """);
    }
}
