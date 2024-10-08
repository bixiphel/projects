import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) throws Exception {

        try {
            // Instantiates a Scanner (if you want certain elements) and a PrintWriter to write to an output
            Scanner infile = new Scanner(new File("src\\\\testSet.txt"));
            PrintWriter outfile = new PrintWriter("src\\\\output.txt");

            // Creates a stats object to get any stats for testing or data.
            Stats stats = new Stats();

            // Iterates over a text input file
            while(infile.hasNextLine()) {
                // Parses the next integer from a text input file (formatted as 1 integer per line)
                int number = Integer.parseInt(infile.nextLine());

                // Creates a temporary string to hold the sequence of steps it takes to reduce to 1
                String temp = "Number: " + number;
                String pattern = number + "";

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
                    pattern = pattern + " -> " + number;
                    stats.increment();
                }

                // Writes the sequence out to the output file with the number of steps it takes to reach 1.
                outfile.println(temp + " | Count: " + stats.getCount() + " | Sequence: " + pattern);

                // Resets the count back to zero before moving on to the next integer in the input file.
                stats.setCount(0);
            }

            // Closes the scanner and output file.
            outfile.close();
            infile.close();

        } catch(IOException e) {
            System.out.println("Cannot open/find file");
        }

    }
}
