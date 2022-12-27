// swap last element with first ... using temp
// swap all other elements from end ... which its -1 position

// To Code : 5m 0s
// Execute : 0.16 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Compute {
	public void rotate(int arr[], int n) {
		int temp = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = temp;
	}
}
