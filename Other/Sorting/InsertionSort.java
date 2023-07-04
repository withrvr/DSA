// https://practice.geeksforgeeks.org/problems/insertion-sort/1

class Solution {
	// static void insert(int arr[], int i) {
	// // Your code here
	// }

	public void insertionSort(int arr[], int n) {
		for (int i = 1; i < n; ++i) {
			for (int j = i; j > 0; --j) {
				int l = j - 1; // left side ele to curr ele

				// loc found ... placed at proper position
				if (arr[l] <= arr[j])
					break;

				int temp = arr[l];
				arr[l] = arr[j];
				arr[j] = temp;
			}
		}
	}
}
