import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Newton1 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Newton1() {
    }

    /**
     * Computes estimate of square root of x to within relative error 0.01%.
     * 
     * @param x
     *            positive number to compute square root of
     * @return estimate of square root
     */
    private static double sqrt(double x) {
        // initial guess for x1/2 is r = x
    	double r = x;
    	double check = (r * r -x)/x;
    	if(r > 0) {
        	while(check > 0.0001) {
        		r = (r + x/r)/2;
        		check = (r * r -x)/x;
        	}
        }
    	return r;
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        /*
         * Put your main program code here; it may call myMethod as shown
         */
        double num;
        String words;
        
        out.println("Do you want to calculate the square root (y/n)? ");
        words = in.nextLine();
        // Check if the words entered is y/n
        if(!words.equals("y") || !words.equals("n") ) {
        	out.println("Cannot read the command, try again!");
        	out.println("Please enter y for Yes, n for No: ");
        	words = in.nextLine();
        }
        	
        while(words.equals("y")) {
        	out.println("Enter your Number here: ");
        	num = in.nextDouble();
        	out.println("The result is: " + sqrt(num) + ".");
        	out.println("Do you want to calculate the square root again(y/n)? ");
        	words = in.nextLine();
        }
        // if users enter n
        if(words.equals("n")) {
        	out.println("Thanks for use!");
        }
        


        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
