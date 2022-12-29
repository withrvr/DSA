// Kadane’s Algorithm
// with start, end index

// can't use starting with index = 1 here

// To Code : 30 min
// Execute : 0.44 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	long maxSubarraySum(int arr[], int n) {
		long max = Long.MIN_VALUE, sum = 0; // sum = arr[0] .. don't work
		// int start = 0, end = 0, temp_s = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];

			if (sum > max) {
				max = sum;

				// start = temp_s;
				// end = i;
			}

			if (sum < 0) {
				sum = 0;

				// temp_s = i + 1;
			}
		}
		return max;
	}
}
