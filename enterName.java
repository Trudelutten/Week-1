import java.util.Scanner;

public class enterName {
    public static void main (String[] name) {
        
        Scanner input = new Scanner(System.in);
        String newName, prefix;
        char one;
        
        if (name.length == 0) {
            System.out.print( "You need to enter a name as a command line argument, please enter one now: " );
            newName = input.next();
        }
        else {
            newName = name[0];
        }
        
        newName = newName.substring(0,1).toUpperCase() + newName.substring(1).toLowerCase();

        prefix = "a";
        one = newName.charAt(0);
        if (one == 'A' || one == 'E' || one == 'I' || one == 'O' || one == 'U') {
            prefix = "an";
        }
        
        System.out.println( "Hello " + newName + ", your name is " + newName.length()  + " characters long and starts with " + prefix + " " + newName.charAt(0) + "." );
    }
}