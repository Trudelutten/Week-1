//container class
import java.util.Scanner;
import java.util.ArrayList;

public class search {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String searchString, str1;
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<String> nameFound = new ArrayList<String>();

        try {
            searchString = args[0];
        }
        catch (Exception e) {
            System.out.println( "Please provide a name or some letters contained within a name that you wish to search for: " );
            searchString = input.next();
        }

        nameList.add("Lou Tenant");
        nameList.add("Phil McCracken");
        nameList.add("April Pealot");
        nameList.add("Peter Wiener");
        nameList.add("Lotta Hare");

        for (int i=0; i<5; i++){
            str1 = nameList.get(i);
            if ( str1.toLowerCase().contains(searchString.toLowerCase()) ) {
                System.out.println( str1 );
                nameFound.add(str1);
            }
        }
        if (nameFound.size() == 0) {
            System.out.println( "Could not find any matches. " );
        }
    }
}