// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Random;

public class Ascend {
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int lim = Integer.parseInt(args[0]);
		int a = rand.nextInt(lim);
		int b = rand.nextInt(lim);
		int c = rand.nextInt(lim);
		System.out.println(a + ", " + b + ", " + c);
		
		int x = Math.min(a, b);
		int min = Math.min(x, c);
		int y = Math.max(a, b);
		int max = Math.max(y, c);
		int mid = a + b + c - min - max;
		System.out.println(min + ", " + mid + ", " + max);
	}
}
