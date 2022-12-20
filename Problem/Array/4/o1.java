
// using left right / tracking / swap (misses make it 0 and 1)
class Solution {
	void segregate0and1(int[] arr, int n) {
		int left = 0, right = n - 1;

		while (left < right) {
			// System.out.println(left + "-" + right + " :: " + Arrays.toString(arr));

			// for all left zeros
			if (arr[left] == 0)
				left++;
			else if (arr[right] == 1) // right 1's
				right--;
			else // if you see the 1
			{
				arr[left] = 0; // make left 0
				arr[right] = 1; // make right 1

				left++;
				right--;
			}
		}
	}
}