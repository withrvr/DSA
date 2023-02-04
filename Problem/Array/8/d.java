// Kadane’s Algorithm
// hard to understand for me this solution

// here solved using, index = 1 .... which we can use in this solution
// also can use index 0
// where (max = Long.MIN_VALUE, sum = 0) or (max=arr[0], sum=0)

// To Code : 1hr 30 min
// Execute : 0.42 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	long maxSubarraySum(int arr[], int n) {
		long max = arr[0], sum = arr[0];
		// sum is current_sum

		for (int i = 1; i < n; i++) {
			sum = Math.max(arr[i], sum + arr[i]);
			max = Math.max(max, sum);
		}

		return max;
	}
}
