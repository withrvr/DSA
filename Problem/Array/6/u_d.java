// same as u_b.java
// but using maps not sets

// time: 2.69

import java.util.HashMap;

class Solution {
	public static int doUnion(int arr1[], int l1, int arr2[], int l2) {
		HashMap<Integer, Integer> union = new HashMap<Integer, Integer>();

		int min = (l1 < l2) ? l1 : l2;

		for (int i = 0; i < min; i++) {
			union.put(arr1[i], null);
			union.put(arr2[i], null);
		}

		if (l1 > l2)
			for (int i = min; i < l1; i++)
				union.put(arr1[i], null);
		else
			for (int i = min; i < l2; i++)
				union.put(arr2[i], null);

		// System.out.println(union.toString());

		return union.size();
	}
}