// same as u_a.java
// but using maps not sets

// time: 2.2

import java.util.HashMap;

class Solution {
	public static int doUnion(int arr1[], int l1, int arr2[], int l2) {
		HashMap<Integer, Integer> union = new HashMap<Integer, Integer>();

		for (int ele : arr1)
			union.put(ele, null);

		for (int ele : arr2)
			union.put(ele, null);

		// System.out.println(union.toString());

		return union.size();
	}
}