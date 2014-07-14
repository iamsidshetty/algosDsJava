package algosDataStructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HRFillingJarsImproved {

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		if ((N < 3) || (N > Math.pow(10, 7))) {
			System.exit(0);
		}
		int M = in.nextInt();
		if ((M < 1) || (M > Math.pow(10, 5))) {
			System.exit(0);
		}
		
		long total = 0;
		for (int i = 0; i < M; i++) {
			long a = in.nextLong();
			long b = in.nextLong();
			if ((a < 1) || (a > b) || (b > N)) {
				System.exit(0);
			}

			long k = in.nextLong();
			if ((k < 0) || (k > Math.pow(10, 6))) {
				System.exit(0);
			}
			
			total += (b - a + 1) * k;
			
		}

		System.out.println(total / N);
	}

}
