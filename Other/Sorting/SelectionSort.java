// https://practice.geeksforgeeks.org/problems/selection-sort/1

class Solution {
	// int select(int arr[], int i) {
	// // code here such that selectionSort() sorts arr[]
	// }

	void selectionSort(int arr[], int n) {
		--n;
		for (int i = 0; i < n; ++i) {
			int min_index = i;

			// find min value
			for (int j = i + 1; j <= n; ++j)
				if (arr[j] < arr[min_index])
					min_index = j;

			// in case no min value there
			if (min_index == i)
				continue;

			// swap with the min value
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
	}
}
