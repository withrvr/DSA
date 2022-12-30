// brute force
// checking for every possible sub array
// no recommend, just possible solution

// To Code : 13 min
// Execute : TLE ms

// Time complexity: O(n*log(n)*log(log(n)))
// Space complexity: O(min(i, j))

class Solution {
	long maxSubarraySum(int arr[], int n) {
		long max = Long.MIN_VALUE;

		for (int i = 0; i <= n - 1; i++) {
			for (int j = i; j <= n - 1; j++) {
				long sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}

				System.out.println(String.format("%s - %s : %s", i, j, sum));

				if (sum > max)
					max = sum;
			}

		}

		return max;
	}
}
