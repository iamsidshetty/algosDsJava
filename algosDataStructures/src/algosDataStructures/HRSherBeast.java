package algosDataStructures;

import java.util.Scanner;
//Check for a better solution
public class HRSherBeast {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		if ((T < 1) || (T > 20)) {
			System.exit(0);
		}

		for (int _t = 0; _t < T; _t++) {
			int N = in.nextInt();
			if ((N < 1) || (N > 100000)) {
				System.exit(0);
			}

			String s = "";
			// Decrease the N value by 1 and check if it is divisible by 3 and
			// increase the j value by 1 and check if it is divisible by 5
			for (int j = N; j >= 0; j--) {
				if ((j % 3 == 0) && (N - j) % 5 == 0) {
					for (int i = 0; i < j; i++) {
						s += '5';
					}
					for (int k = 0; k < (N - j); k++) {
						s += '3';
					}
				}
			}
			if (s == "") {
				System.out.println(-1);
			} else {
				System.out.println(s);
			}

		}

	}
}
