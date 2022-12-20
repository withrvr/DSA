// swaping
// while tracking the last positions of the 0, 2
// and traversing using mid ... and sorting

class Solution {
	public static void sort012(int a[], int n) {
		int l = 0, m = 0, r = n - 1, t; // left, mid, right, temp

		while (m <= r) {
			switch (a[m]) {
				case 0:
					t = a[l];
					a[l] = a[m];
					a[m] = t;

					l++;
					m++;
					break;

				case 1:
					m++;
					break;

				case 2:
					t = a[r];
					a[r] = a[m];
					a[m] = t;

					r--;
					break;
			} // switch end
		} // while loop end
	}
}
