// METHOD:: Dutch National Flag Algorithm for two “colors”
// b.java is better ... here unnecessary swapping happens

import java.util.Arrays;

public class c {
	public static void main(String[] args) {
		int[] a = { -12, -11, 13, 5, 6, 7, 5, -3, -6 };
		// int[] a = { 12, 3, -66 };
		int l = 0, h = a.length - 1, t; // left, right, temp

		System.out.println(String.format("STARTING :: l(%d) - h(%d) - %s", l, h, Arrays.toString(a)));

		while (l <= h) {

			if (a[l] < 0)
				l++;
			else {
				t = a[l];
				a[l] = a[h];
				a[h] = t;

				h--;
			}

			System.out.println(String.format("l(%d) - h(%d) - %s", l, h, Arrays.toString(a)));
		}

		System.out.println(String.format("FINISH :: l(%d) - h(%d) - %s", l, h, Arrays.toString(a)));

	}
}
