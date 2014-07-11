package algosDataStructures;

import java.util.HashSet;
import java.util.Scanner;

public class HRGemStones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Get the Number of Rocks
		int _N = in.nextInt();
		if ((_N < 1) || (_N > 100)) {
			System.out.println("N Out of Range!");
		}

		String rock_el = in.next();
		HashSet<String> fir_el = new HashSet<String>();

		for (Character i : rock_el.toCharArray()) {
			fir_el.add(i.toString().toLowerCase());
		}
		for (int j = 1; j < _N; j++) {
			rock_el = in.next();
			HashSet<String> gem_el = new HashSet<String>();
			for (String el : fir_el) {
				if (rock_el.contains(el)) {
					gem_el.add(el.toString());
				}
			}
			fir_el.clear();
			fir_el.addAll(gem_el);
		}
		System.out.println(fir_el.size());
	}
}
