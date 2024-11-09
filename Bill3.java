// Splits a restaurant bill evenly among three diners.


public class Bill3 {
	public static void main(String[] args) {
		
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		
		int price = Integer.parseInt(args[3]); 
		double new_price = price;
		String all_names = name1 + ", " + name2 + ", and" + name3 + ": ";
		System.out.println("Dear " + all_names + Math.ceil(new_price/3) + " Shekels each.");

	}
}
