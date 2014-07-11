package algosDataStructures;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Euler's Problem #3
		long a = 600851475143L, b = 2, c;
		while (true) {
			if (a % b == 0) {
				a = a / b;
				c = b;
				b = 2;
				if (a == 1) {
					break;
				}
			} else {
				b++;
				if (b >= (a / 2)) {
					c = a;
					break;
				}
			}
		}
		System.out.println("Largest Prime Factor is: " + c);
	}

}
