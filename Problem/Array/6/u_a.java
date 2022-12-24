// using hashset
// adding all element in hashset... off both array
// then return the size

// time : 2.31

import java.util.HashSet;

class Solution {
	public static int doUnion(int a[], int n, int b[], int m) {
		HashSet<Integer> union = new HashSet<>();

		for (int ele : a)
			union.add(ele);
		for (int ele : b)
			union.add(ele);

		// System.out.println(union.toString());

		return union.size();
	}
}