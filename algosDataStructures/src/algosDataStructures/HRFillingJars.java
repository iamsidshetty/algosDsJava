package algosDataStructures;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
//Alert!:In-effecient approach
public class HRFillingJars {

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

		HashMap<Long, Long> mp = new HashMap<Long, Long>();
		// initialize HashMap
		for (long i = 1; i <= N; i++) {
			mp.put(i, 0L);
		}

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

			for (long j = a; j <= b; j++) {
				Long key = j;
				mp.put(key, (mp.get(key) + k));
			}
		}

		long total = 0;
		Iterator<Long> ksIt = mp.keySet().iterator();

		while (ksIt.hasNext()) {
			Long key = ksIt.next();
			total += mp.get(key);
		}

		System.out.println(total / N);
	}
}