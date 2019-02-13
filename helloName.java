import java.util.Scanner;

public class helloName {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        String yourName, newName;

        if (args.length == 0) {
            System.out.print( "Greetings Master, please enter your name: " );
            yourName = input.next();   
        }
        else {
            yourName = args[0];
            System.out.println( "Greetings Master " + yourName );
        }

        yourName = yourName.substring(0,1).toUpperCase() + yourName.substring(1).toLowerCase();
        

        System.out.print( "Is your name really " + yourName + "?! I don't belive you, please enter your real name: ");
        newName = input.next();
        newName = newName.substring(0,1).toUpperCase() + newName.substring(1).toLowerCase();

        if ( yourName.equals(newName) ) {
            System.out.println( "Wow! OKAY, I guess I must belive you. Your name is actually " + yourName + "!!");
        }
        else {
            System.out.println( "I knew it! Your name was not " + yourName + ". It is " + newName + "!!" );
            yourName = newName;
        }

        System.out.println( "Well Master " + yourName + "! What a cool name." );
        System.out.println( "My name is Trude." );
    }
}