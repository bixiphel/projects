import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) throws Exception {

        try {
            // Instantiates a Scanner (if you want certain elements) and a PrintWriter to write to an output
            Scanner infile = new Scanner(new File("src\\\\input.txt"));
            PrintWriter outfile = new PrintWriter("src\\\\output.txt");

            while(infile.hasNextLine()) {
                int number = Integer.parseInt(infile.nextLine());
                String pattern = "";

                while(number != 1) {
                    if(number % 2 == 0) {
                        number *= 2;
                    } else {
                        number = (3 * number) + 1;
                    }
                    pattern = number + ", ";
                }

                outfile.println(pattern);
            }

            outfile.println("hello :)");

            // Closes the scanner and output file
            outfile.close();
            infile.close();

        } catch(IOException e) {
            System.out.println("Cannot open/find file");
        }

    }
}
