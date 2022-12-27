// swapping first element with last
// then 2 ... to last

// this method will make last ele to come 1st, 1st to last
// then 2nd iteration that 1st will become 2nd ... and 2nd will become last .... logically
// and so on

// not recommended .. a.java better

// To Code : 6m 30s
// Execute : 0.15 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Compute {
	public void rotate(int arr[], int n) {
		int temp, j = n - 1;

		for (int i = 0; i < j; i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
