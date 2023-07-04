// https://practice.geeksforgeeks.org/problems/bubble-sort/1

class Solution {
	public static void bubbleSort(int arr[], int n) {
		--n;
		for (int i = 0; i < n; ++i) {
			int end = n - i;
			boolean swap = false; // IMP ... new feature

			for (int j = 0; j < end; ++j) {
				int r = j + 1;
				if (arr[j] > arr[r]) {
					int temp = arr[r];
					arr[r] = arr[j];
					arr[j] = temp;
					swap = true;
				}
			}

			if (swap == false)
				break; // return;
		}
	}

	public static void notworking_bubbleSort(int arr[], int n) { // dont know y not working ... reverse loop
		--n;
		for (int i = 0; i < n; ++i) {
			for (int j = n - i; j > 0; --j) {
				int l = j - 1;
				if (arr[j] < arr[l]) {
					int temp = arr[l];
					arr[l] = arr[j];
					arr[j] = temp;
				}
				System.out.println(i + " : " + j);
			}
			System.out.println();
		}
	}

	public static void bad_bubbleSort(int arr[], int n) {
		--n;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				int r = j + 1;
				if (arr[j] > arr[r]) {
					int temp = arr[r];
					arr[r] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void NOT_bubbleSort(int arr[], int n) {
		--n;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
