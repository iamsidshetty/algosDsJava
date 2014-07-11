package algosDataStructures;

public class Palindrome3Ds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// your code goes here
		int largest = 0, prod, first = 000, second = 000;

		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				prod = i * j;
				// System.out.println(prod);
				int rev = Integer.parseInt(new StringBuilder("" + prod)
						.reverse().toString());
				if (prod == rev) {
					if (largest < prod) {
						largest = prod;
						first = i;
						second = j;
					}
				}
			}
		}
		System.out.println("Largest Number is: " + largest
				+ "    Obtained by: " + first + "*" + second);
	}

}
