// Kadane’s Algorithm
// improved version

// ***** NOTE: ... but
// don't work for list of all -ve no
// or starting with it, some cases

// To Code : 30 min
// Execute : ? ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	long maxSubarraySum(int arr[], int n) {
		long max = Long.MIN_VALUE, sum = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];

			if (sum < 0)
				sum = 0;
			else if (sum > max)
				max = sum;
		}
		return max;
	}
}
