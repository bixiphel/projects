import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) throws Exception {

        try {
            // Instantiates a Scanner (if you want certain elements) and a PrintWriter to write to an output
            Scanner infile = new Scanner(new File("src\\\\input.txt"));
            PrintWriter outfile = new PrintWriter("src\\\\output.txt");

            // Iterates over a text input file
            while(infile.hasNextLine()) {
                // Parses the next integer from a text input file (formatted as 1 integer per line)
                int number = Integer.parseInt(infile.nextLine());

                // Creates a temporary string to hold the sequence of steps it takes to reduce to 1
                String pattern = "" + number;

                // Iteratively applies the collatz rule (half even numbers, multiply odd numbers by 3 and add 1)
                while(number != 1 && number != 0) {
                    if(number % 2 == 0) {
                        number = number / 2;
                    } else if(number == 1){
                        // Breaks the loop if the current number is 1 since this is the end of the sequence.
                        pattern = pattern + "1.";
                        break;
                    } else {
                        number = (3 * number) + 1;
                    }
                    // Adds the current number into the temp. string holding the sequence 
                    pattern = pattern + ", " + number;
                }

                // Writes the sequence out to the output file
                outfile.println(pattern);
            }

            // Closes the scanner and output file
            outfile.close();
            infile.close();

        } catch(IOException e) {
            System.out.println("Cannot open/find file");
        }

    }
}
