// sets
// make arr1 as set
// check which arr2 element in arr1
// ie. element which is common
// NOTE: remove that ele from set
// because if arr2 contain more same ele
// it will count it again ... but the intersection has been noted

// time : 2.15

import java.util.HashSet;

class Solution {
	public static int NumberofElementsInIntersection(int arr1[], int arr2[], int l1, int l2) {
		HashSet<Integer> set = new HashSet<Integer>();
		int count = 0;

		for (int ele : arr1)
			set.add(ele);

		for (int ele : arr2) {
			if (set.contains(ele)) {
				System.out.print(ele + ", ");

				count++;
				set.remove(ele);
			}
		}

		return count;

	}
};
