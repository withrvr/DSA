// more better than a.java
// using hashset
// adding all element in hashset... off both array
// but using min(wholes array len is small) ... add elements of both array to hashset at same time
// then remaining element .. who's size was greater
// time : 2.26

import java.util.HashSet;

class Solution {
	public static int doUnion(int arr1[], int l1, int arr2[], int l2) {
		HashSet<Integer> union = new HashSet<>();

		int min = (l1 < l2) ? l1 : l2;

		for (int i = 0; i < min; i++) {
			union.add(arr1[i]);
			union.add(arr2[i]);
		}

		if (l1 > l2)
			for (int i = min; i < l1; i++)
				union.add(arr1[i]);
		else
			for (int i = min; i < l2; i++)
				union.add(arr2[i]);

		// System.out.println(union.toString());

		return union.size();
	}
}