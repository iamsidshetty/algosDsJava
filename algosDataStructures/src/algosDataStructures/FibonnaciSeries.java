package algosDataStructures;

public class FibonnaciSeries {
	// to find the sum of even valued terms in the FS with max term < 4M
	public static void main(String[] args) {
		int prev = 0, cur = 1, total = 0, temp = 0;
		while (true) {
			temp = prev;
			prev = cur;
			cur = temp + cur;
			if (cur >= 4000000) {
				break;
			}
			if (cur % 2 == 0) {
				total += cur;
			}
		}
		System.out.println("Total Sum: " + total);
	}

}
