//main
package person;
import java.util.Scanner;
import java.util.ArrayList;
import person.person;

public class program{
    public static void main (String[] args) {
        String searchString, str1, str2; 
        Scanner input = new Scanner(System.in);
        ArrayList<person> contactList = new ArrayList<person>(); 
        ArrayList<String> nameFound = new ArrayList<String>();

        contactList.add(new person("Lou",  "Tenant", "123 45 678", "Male"));
        contactList.add(new person("Phil",  "McCracken", "234 56 789", "Male"));
        contactList.add(new person("April",  "Pealot", "345 67 891", "Female"));
        contactList.add(new person("Peter",  " Wiener", "456 78 912", "Male"));
        contactList.add(new person("Lotta",  "Hare", "567 89 123", "Female"));

        //Check if there is no commanlineargument, if True; ask for them
        if (args.length == 0) {
            System.out.println( "Please provide a name or some letters or sequence of letters hopefully contained within a name that you wish to search for: " );
            searchString = input.next();            
        } else {
            searchString = args[0];
        }
                
        for (int i=0; i<5; i++){
            str1 = contactList.get(i).getFirstName();
            str2 = contactList.get(i).getLastName();
            if ( str1.toLowerCase().contains(searchString.toLowerCase()) ||  str2.toLowerCase().contains(searchString.toLowerCase()) ) {
                contactList.get(i).printing();                
                nameFound.add(str1);
            }
        }

        if (nameFound.size() == 0) {
            System.out.println( "Could not find any matches. " );
        }  
    }    

}