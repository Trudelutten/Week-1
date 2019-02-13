import java.util.Scanner;
//nice to implement max size

public class rectangle {
    public static void main (String[] args) {
        int sideLength, sideWidth;
        Scanner input = new Scanner(System.in);

        //If not enough commandline arguments
        if (args.length < 2) {
            System.out.println( "You need to pass two sizes that the defines the rectangles size. \nPlease enter one now: " );
            sideLength = input.nextInt(); 
            System.out.println( "Great Job! Please enter another one: " );
            sideWidth = input.nextInt(); 
        }
        else {
            sideLength = Integer.parseInt(args[0]);
            sideWidth = Integer.parseInt(args[1]);
        }

        //If dimentions of the rectangle is to small
        if (sideLength <= 4 || sideWidth <= 4) {
            System.out.println("This program draws a rectangle inside a rectangle, that means that the dimensions need to exceed 4.");
            System.out.println("Please enter some number larger then 4 now: ");
            sideLength = input.nextInt(); 
            System.out.println( "Great Job! Please enter another one: " );
            sideWidth = input.nextInt(); 
            if (sideLength <= 4 && sideWidth <= 4) {
                System.out.println("Sorry, but one or both dimentions are still less then four. ");
            }
        }

        //Limit the size of the square to sides of 40 symbols
        if (sideLength > 40) {
            sideLength = 40;
            System.out.println( "The square will be limited to a sidelenght of 40. " ); 
        }
        if (sideWidth > 40) {
            sideWidth = 40;
            System.out.println( "The square will be limited to a sidewidth of 40. " ); 
        }

        //Draw the rectangle within a rectangle
        for (int j=0; j < sideLength; j++){
            System.out.println("");
            if (j == 0 || j == sideLength-1){
                for (int k = 0; k < sideWidth; k++){
                    System.out.print( "#" );
                }              
            }
            else if (j == 1 || j == sideLength-2) {
                for (int i=0; i < sideWidth; i++) {
                    if ( i==0 || i == sideWidth-1) {
                        System.out.print( "#" );
                    }
                    else {
                        System.out.print( " " );
                    }
                }
            }

            else if (j==2 || j==sideLength-3) {
                for (int m = 0; m < sideWidth; m++ ) {
                    if ( m==1 || m == sideWidth-2) {
                        System.out.print( " " );
                    }
                    else {
                        System.out.print( "#" );
                    }
                }

            }
            else {
                for (int l = 0; l < sideWidth; l++) {
                    if (l==0 || l == sideWidth-1 || l==2 || l == sideWidth-3) {
                        System.out.print( "#" );
                    }
                    else {
                        System.out.print( " " );
                    }
                }
            }
        }


    }
}


        