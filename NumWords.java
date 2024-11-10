// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		int currentValue = Integer.parseInt(args[0]);
		int hundreds, ones , tens;
		hundreds = currentValue / 100;
        tens = (currentValue / 10) % 10;
        ones = currentValue % 10;
		System.out.print(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
