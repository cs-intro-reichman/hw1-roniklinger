// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		int currentValue = Integer.parseInt(args[0]);
		int hundreds, ones , tens;
		
		hundreds = (currentValue / 100) % 10;
        tens = (currentValue / 10) % 10;
        ones = currentValue % 10;
		
		System.out.println(hundreds + " hundreds, " + tens + " tens, " + ones + " ones");
	}
}
