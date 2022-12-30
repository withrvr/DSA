// kadane's + sliding window

// To Code : 1 hr
// Execute : 0.8 ms

// Time complexity: O(n)
// Space complexity: O(1)

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	static ArrayList<Integer> subarraySum(int[] arr, int n, int result) {
		int sum = 0, start = 0, i = 0;

		while (i < n) {
			sum += arr[i];

			if (sum == result) {
				return new ArrayList<Integer>(Arrays.asList(start + 1, i + 1));
			} else if (sum > result) { // **** whole else if
				if (start != i)
					sum -= (arr[start] + arr[i--]);
				else
					sum = 0;

				start++;
			}

			i++;
		}

		return new ArrayList<Integer>(Arrays.asList(-1));
	}
}
