import java.util.Scanner;

public class square {
    public static void main (String[] args) {
        int sideLength;
        Scanner input = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println( "You need to pass a number on the commandline to define the squares size, \nPlease enter one now: " );
            sideLength = input.nextInt(); 
        }
        else {
            sideLength = Integer.parseInt(args[0]);
        }

        //Limit the size of the square to 20x20
        if (sideLength > 20) {
            sideLength = 20;
            System.out.println( "The square will be limited to a 20x20 size" ); 
        }    
        
        for (int i=0; i < sideLength; i++) {
            System.out.println( "" );
            for (int j = 0; j < sideLength; j++) {
                if (i == 0 || i == sideLength-1 || j==0 || j == sideLength-1) {
                    System.out.print( "#" );
                }
                else {
                    System.out.print( " " );
                }
            }
        }    
    }

}

