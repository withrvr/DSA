// using left right pointer ... swap
// l++ if -ve
// r-- if +ve
// else swap .. ie. +ve in start ... -ve at end

import java.util.Arrays;

public class b {
	public static void main(String[] args) {
		int[] a = { -12, -11, 13, 5, 6, -7, 5, -3, -6 };
		// int[] a = { 12, 3, -66 };
		int l = 0, r = a.length - 1, t; // left, right, temp

		System.out.println("START:: " + l + " - " + r + " - " + Arrays.toString(a));

		while (l < r) { // no need of l<=r ... here
			if (a[l] < 0) // if -ve from starting no problem
				l++;
			else if (a[r] >= 0) // if +ve from ending no problem
				r--;
			else { // else swap .. ie. +ve front -ve back
				t = a[l];
				a[l] = a[r];
				a[r] = t;

				l++;
				r--;
			}
			System.out.println(l + " - " + r + " - " + Arrays.toString(a));
		}
		System.out.println("FINISH:: " + l + " - " + r + " - " + Arrays.toString(a));

	}
}
