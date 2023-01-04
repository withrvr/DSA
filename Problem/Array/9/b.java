// here we are finding diff only
// but we have to find
// diff or max and min value

// not just diff, of adj values, a b

import java.util.Arrays;

public class b {
	public static void main(String[] args) {
		Solution s = new Solution();
		// int arr[] = new int[] { 5, 2, 2, 2, 3, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10, 20 };
		int arr[] = new int[] { 4, 6, 6, 7, 10, 1, 10, 10, 3, 2 };
		int k = 4;
		System.out.println("ANS:- " + s.getMinDiff(arr, arr.length, k));
	}
}

class Solution {
	int getMinDiff(int[] arr, int n, int k) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// int min = arr[n - 1] - arr[0];
		int min = Integer.MAX_VALUE;

		int a, b, diff;

		for (int i = 0; i < n - 1; i++) {
			// since its sorted array
			// current ele is small
			// next ele is large
			a = arr[i] + k; // small + k
			b = arr[i + 1] - k; // large - k

			if (b < 0)
				continue;

			diff = a - b;
			min = Math.min(min, Math.abs(diff));

			System.out.println(String.format("(%d : %d) ==> (%d : %d) :: %d", arr[i], arr[i + 1], a, b, diff));
		}

		return min;
	}
}
