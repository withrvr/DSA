import java.util.Arrays;

public class o_c {
	public static void main(String[] args) {
		Solution s = new Solution();
		int arr[] = new int[] { -5, -2, -1, -1, 0, 1, 2, 3, 1, 5, 8 };
		int k = 2;

		// int arr[] = new int[] { 5, 5, 8, 6, 4, 10, 3, 8, 9, 10 };
		// int k = 5;

		System.out.println("\nANS:- " + s.getMinDiff(arr, arr.length, k));
	}
}

class Solution {
	int getMinDiff(int[] arr, int n, int k) {
		Arrays.sort(arr);

		// int res = Integer.MAX_VALUE;
		// else don't work
		int res = arr[n - 1] - arr[0];

		int max, min, a, b;

		int first_ele = arr[0] + k;
		int last_ele = arr[n - 1] - k;

		System.out.println(String.format(
				"%s\nfirst_ele: %d, last_ele: %d\n",
				Arrays.toString(arr), first_ele, last_ele));

		for (int i = 1; i < n; i++) {
			// no need
			// if (arr[i] < k)
			// continue;

			a = arr[i - 1] + k;
			b = arr[i] - k;

			max = Math.max(a, last_ele);
			min = Math.min(b, first_ele);

			res = Math.min(res, max - min);

			System.out.println(String.format(
					"i=%2d: (%2d,%2d) => (%2d,%2d)=%2d ~~~ (%2d-%2d)=%2d",
					i, arr[i - 1], arr[i], a, b, a - b, max, min, max - min));
		}

		return res;
	}
}
