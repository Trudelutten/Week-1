/*Build a Java application that allows me to do the following:
Open: opens a specified file (the file will be a small .txt file) 
(Use Args or scanner)
Display statistics for the file: 

*/

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class readFileStatics {
    public static void main (String[] args){
        String fileName, str1;
        Scanner input = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Please provide a filename for a .txt file. Please include the extention .txt ");
            fileName=input.next();
        } else {
            fileName = args[0];
        }

        if (! (fileName.contains(".txt")) ) {
            System.out.println("Please provide a filename which includes the extention .txt ");
            fileName=input.next();
        }

        //Search the file
        String searchWord; 
        System.out.println("Please provide a word you would like to search the file for. ");
        searchWord = input.next();

        System.out.println("This java application will process the file named: " + fileName);

        File file;
        Scanner inputFile;

        ArrayList<String> fileContentLines = new ArrayList<String>();
        ArrayList<String> fileContentWords = new ArrayList<String>();

        try {
            file = new File(fileName);
            inputFile = new Scanner(file);
        } catch (Exception e) {
            System.out.println("Cannot find file.");
            return;
        }
              
        int i=0;
        while (inputFile.hasNextLine()){
            i++;
            fileContentLines.add(inputFile.nextLine());
        }    

        inputFile.close();

        System.out.println("The size of the file is: " + file.length() + " bites.");

        System.out.println("Number of lines in the file is: " + i);


        //reInitiate the scanner        
        try {
            file = new File(fileName);
            inputFile = new Scanner(file);
        } catch (Exception e) {
            System.out.println("Cannot find file.");
            return;
        }

        while (inputFile.hasNext()) {            
            fileContentWords.add(inputFile.next()); 
        } 

        //Close the scanner
        inputFile.close();
        
        int fileLength = fileContentWords.size();

        i = 0;
        int j = 0;
        while (i<fileLength) {
            str1 = fileContentWords.get(i);
            i++;
            if ( str1.toLowerCase().contains(searchWord.toLowerCase()) ) {
                j++;
            }
        }

        System.out.println("Number of words in the file that match \"" + searchWord + "\" is: " + j);        
        

    }

}       